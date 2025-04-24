package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import driver.DriverManager;
import pages.BasePage;

public class Hooks {

    @Before
    public void setUp() {
        BasePage.setDriver(DriverManager.getDriver());
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}