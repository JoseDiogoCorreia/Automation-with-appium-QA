
# Appium + Java + Cucumber - Mobile Automation Framework

## Requirements
- Java 11
- Maven
- Appium 2.x (install with npm)
- Android emulator or device

## Setup & Run

1. **Start Appium server:**

```bash
appium
```

2. **Run tests:**

```bash
mvn test
```

## Project Structure

```
src
 ├─ main
 │   └─ java
 │       ├─ driver
 │       │   └─ DriverManager.java         
 │       └─ pages
 │           ├─ BasePage.java              
 │           ├─ MainPage.java              
 │           ├─ CreateAccountPage.java     
 │           ├─ LoginPage.java             
 │           └─ UserLoggedInPage.java      
 │
 └─ test
     ├─ java
     │   ├─ runners
     │   │   └─ TestRunner.java            
     │   └─ stepdefinitions
     │       ├─ Hooks.java                 
     │       └─ StepDefinitions.java      
     │
     └─ resources
         └─ features
             └─ account.feature            
```

## Reporting

After running tests, Cucumber generates reports in:

- **Basic HTML Report:** Open `target/cucumber-report.html`
- **Detailed Dashboard (if configured):** Open `target/cucumber-report-html/feature-overview.html`

## Notes

Ensure that the Android emulator/device is correctly configured and available (`adb devices`) before running tests.
