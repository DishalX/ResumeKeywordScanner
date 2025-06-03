import java.util.*;
import java.io.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ResumeKeywordScanner {

    private static final Set<String> STOP_WORDS = new HashSet<>(Arrays.asList(
        "a", "an", "the", "and", "or", "with", "in", "on", "for", "to", "of", "by", "is", "are", "was", "were",
        "as", "at", "be", "this", "that", "from", "you", "your", "will", "we", "our"
    ));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nType 'exit' at any time to quit.");

            String jobText = promptForInput(scanner, "job description");
            if (jobText.equals("exit")) break;

            String resumeText = promptForInput(scanner, "resume");
            if (resumeText.equals("exit")) break;

            Set<String> jobKeywords = extractKeywords(jobText);
            Set<String> resumeWords = extractKeywords(resumeText);

            Set<String> matched = new HashSet<>(resumeWords);
            matched.retainAll(jobKeywords);

            Set<String> missing = new HashSet<>(jobKeywords);
            missing.removeAll(resumeWords);

            System.out.println("\n--- Match Results ---");
            System.out.printf("Matched: %d / %d keywords\n", matched.size(), jobKeywords.size());

            System.out.print("\u001B[32m✔ Matched: ");
            if (matched.isEmpty()) {
                System.out.print("None");
            } else {
                System.out.print(String.join(", ", matched));
            }
            System.out.println("\u001B[0m");

            System.out.print("\u001B[31m✘ Missing: ");
            if (missing.isEmpty()) {
                System.out.print("None");
            } else {
                System.out.print(String.join(", ", missing));
            }
            System.out.println("\u001B[0m");
        }

        System.out.println("Goodbye.");
        scanner.close();
    }

    private static String promptForInput(Scanner scanner, String type) {
        System.out.printf("\nWould you like to (1) paste your %s or (2) upload a PDF? Enter 1 or 2: ", type);
        String choice = scanner.nextLine().trim();

        if (choice.equals("exit")) return "exit";

        if (choice.equals("1")) {
            System.out.printf("Paste your %s below:\n", type);
            return scanner.useDelimiter("\\A").next().toLowerCase();
        } else if (choice.equals("2")) {
            System.out.printf("Enter the path to your %s PDF file:\n", type);
            String path = scanner.nextLine().trim();
            try {
                return extractTextFromPDF(path).toLowerCase();
            } catch (Exception e) {
                System.out.println("Error reading PDF: " + e.getMessage());
                return "";
            }
        } else {
            System.out.println("Invalid option. Try again.");
            return promptForInput(scanner, type);
        }
    }

    private static String extractTextFromPDF(String filePath) throws IOException {
        File file = new File(filePath);
        PDDocument document = PDDocument.load(file);
        PDFTextStripper stripper = new PDFTextStripper();
        String text = stripper.getText(document);
        document.close();
        return text;
    }

    private static Set<String> extractKeywords(String text) {
        String[] words = text.replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
        Set<String> keywords = new HashSet<>();

        for (String word : words) {
            if (!STOP_WORDS.contains(word) && word.length() > 1) {
                keywords.add(word);
            }
        }

        return keywords;
    }
}

        return keywords;
    }
}
