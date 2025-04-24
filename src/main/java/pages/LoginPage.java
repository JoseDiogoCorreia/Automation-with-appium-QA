package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    By email = By.id("com.hostelworld.qacodechallenge:id/usernameEt");
    By password = By.id("com.hostelworld.qacodechallenge:id/passwordEt");
    By loginBtn = By.id("com.hostelworld.qacodechallenge:id/btnLogin");

    public void enterEmail(String emailStr) {
        driver.findElement(email).sendKeys(emailStr);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void tapLoginButton() {
        driver.findElement(loginBtn).click();
    }
}