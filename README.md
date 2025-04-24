# Appium + Java + Cucumber - Mobile Automation Framework

## Requirements
- Java 11
- Maven
- Appium 2.x (install with npm)
- Android emulator or device
- **App under test must be installed on the device/emulator** (no APK install step is performed by tests)

## Setup & Run

1. **Start Appium server:**

   ```bash
   appium
   ```

2. **Ensure the app is already installed** on your emulator or device (e.g. via Android Studio or `adb install`).

3. **Run all tests:**

   ```bash
   mvn test
   ```

4. **Run a specific feature file** directly:

   ```bash
   mvn test -Dcucumber.options="src/test/resources/features/account.feature"
   ```

 
.

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


## Notes

- Verify your emulator/device is visible via `adb devices`.  
- The test suite does **not** install the APK; it must already be present on the device.  
- Use the `-Dcucumber.options` parameter to target individual feature files or tags.  
