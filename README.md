# ResumeKeywordScanner (Java Console App)

A simple Java console app that compares your resume against a job description to find missing keywords. Built to help job seekers tailor their resumes for better alignment with applicant tracking systems (ATS) and employer expectations.

## Features

- Accepts pasted resume and job description inputs
- Option to paste text or upload PDF for both resume and job description
- Filters out common stop words (e.g. "and", "the", "in")
- Identifies important keywords from the job description
- Compares with your resume and reports matches and gaps

## Technologies Used

- Java (String processing)
- Scanner for user input
- HashSet for fast keyword comparison

## Sample Output

```
Would you like to (1) paste your job description or (2) upload a PDF? 1
[User pastes job description]

Would you like to (1) paste your resume or (2) upload a PDF? 2
Enter path to resume PDF: resume.pdf

--- Match Results ---
Matched keywords: Java, testing
Missing keywords: Agile, CI/CD, deployment
```


## Project Structure

```
ResumeKeywordScanner/
├── ResumeKeywordScanner.java  
├── pdfbox-2.0.34.jar  
├── fontbox-2.0.34.jar  
├── commons-logging-1.3.5.jar
```

## Required Libraries (JARs)


This project requires the following external libraries to compile and run:

1. [pdfbox-2.0.34.jar](https://downloads.apache.org/pdfbox/2.0.34/pdfbox-2.0.34.jar)  
2. [fontbox-2.0.34.jar](https://downloads.apache.org/pdfbox/2.0.34/fontbox-2.0.34.jar)  
3. [commons-logging-1.3.5.jar](https://commons.apache.org/proper/commons-logging/download_logging.cgi)  - – download from the binaries section and extract the .jar file


Download these files and place them in the same directory as `ResumeKeywordScanner.java`.

## How to Run in Terminal


1. Make sure you have the required `.jar` files in the same folder.
2. Open your terminal and `cd` into the project folder.
3. Compile using the `javac` command shown below.
4. Run using the `java` command.

Type `exit` to quit the program.

## How to Run on Windows


1. Place all required `.jar` files and the Java file in the same folder.
2. Open Command Prompt and navigate to that folder.
3. Compile the Java file using the `javac` command with the `.jar` files in the classpath.
4. Run the program using the `java` command.
5. Type `exit` at any time to quit the program.


## Author

Dishal Xavier  
CSU Northridge – Computer Science Major  
[GitHub Profile](https://github.com/DishalX)

