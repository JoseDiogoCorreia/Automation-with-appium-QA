package pages;

import org.openqa.selenium.By;

import java.time.Duration;

public class MainPage extends BasePage {
    By createAccountBtn = By.id("com.hostelworld.qacodechallenge:id/btnCreateAccount");
    By loginBtn = By.id("com.hostelworld.qacodechallenge:id/btnLogin");

    public void tapCreateAccount() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(createAccountBtn).click();
    }

    public void tapLogin() {
        driver.findElement(loginBtn).click();
    }

    public boolean isMainScreenVisible() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(createAccountBtn).isDisplayed();
    }
}