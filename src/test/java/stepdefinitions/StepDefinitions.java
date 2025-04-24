package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import io.cucumber.java.en.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class StepDefinitions {
    static AppiumDriver driver;
    MainPage main;
    CreateAccountPage create;
    LoginPage login;
    UserLoggedInPage user;

    @Given("the app is launched")
    public void app_is_launched()  {
        main = new MainPage();
        create = new CreateAccountPage();
        login = new LoginPage();
        user = new UserLoggedInPage();
    }

    @When("the user navigates to create account")
    public void navigate_create() {
        main.tapCreateAccount();
    }

    @When("the user enters {string}, {string}, {string}, {string}")
    public void enter_account_info(String fn, String ln, String email, String pw) {
        create.enterFirstName(fn);
        create.enterLastName(ln);
        create.enterEmail(email);
        create.enterPassword(pw);
    }

    @When("the user submits the account creation form")
    public void submit_account() {
        create.tapCreateAccountButton();
    }

    @Then("the user is redirected to the main screen")
    public void redirected_main() {
        assertTrue(main.isMainScreenVisible());
    }

    @When("the user navigates to login")
    public void navigate_login() {
        main.tapLogin();
    }

    @When("the user enters login credentials {string} and {string}")
    public void login_credentials(String email, String pass) {
        login.enterEmail(email);
        login.enterPassword(pass);
    }

    @When("the user submits the login form")
    public void submit_login() {
        login.tapLoginButton();
    }

    @Then("the user should be logged in")
    public void user_logged_in()  {
        assertTrue(user.isUserLoggedIn());
    }
}