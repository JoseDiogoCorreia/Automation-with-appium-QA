package pages;

import org.openqa.selenium.By;

public class UserLoggedInPage extends BasePage {
    By logoutBtn = By.id("com.hostelworld.qacodechallenge:id/logoutBtn");

    public boolean isUserLoggedIn() {
        return driver.findElement(logoutBtn).isDisplayed();
    }
}