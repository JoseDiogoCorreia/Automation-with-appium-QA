package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
protected static AppiumDriver driver;

    public static void setDriver(AppiumDriver appiumDriver) {
        driver = appiumDriver;
    }
}