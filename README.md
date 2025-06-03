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
Enter job description:
Looking for a Java developer with Agile, CI/CD, and testing experience.

Enter your resume:
Skilled in Java, GitHub, and web development.

--- Match Results ---
Matched keywords: Java
Missing keywords: Agile, CI/CD, testing
```


## Project Structure

```
ResumeKeywordScanner/
├── ResumeKeywordScanner.java  
├── pdfbox-2.0.34.jar  
├── fontbox-2.0.34.jar  
├── commons-logging-1.3.5.jar  
```

## Author

Dishal Xavier  
CSU Northridge – Computer Science Major  
[GitHub Profile](https://github.com/DishalX)

