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

or

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

```
This project requires the following external libraries to compile and run:

1. [pdfbox-2.0.34.jar](https://downloads.apache.org/pdfbox/2.0.34/pdfbox-2.0.34.jar)  
2. [fontbox-2.0.34.jar](https://downloads.apache.org/pdfbox/2.0.34/fontbox-2.0.34.jar)  
3. [commons-logging-1.3.5.jar](https://commons.apache.org/proper/commons-logging/download_logging.cgi)
```

Download these files and place them in the same directory as `ResumeKeywordScanner.java`.

## Author

Dishal Xavier  
CSU Northridge – Computer Science Major  
[GitHub Profile](https://github.com/DishalX)

