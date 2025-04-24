package pages;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccountPage extends BasePage {
    By firstName = By.id("com.hostelworld.qacodechallenge:id/firstNameEt");
    By lastName = By.id("com.hostelworld.qacodechallenge:id/lastNameEt");
    By email = By.id("com.hostelworld.qacodechallenge:id/emailEt");
    By password = By.id("com.hostelworld.qacodechallenge:id/passwordEt");
    By createBtn = By.id("com.hostelworld.qacodechallenge:id/btnCreateAccount");

    public void enterFirstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void enterLastName(String name) {
        driver.findElement(lastName).sendKeys(name);
    }

    public void enterEmail(String emailStr) {
        driver.findElement(email).sendKeys(emailStr);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void tapCreateAccountButton() {
        driver.findElement(createBtn).click();
    }
}