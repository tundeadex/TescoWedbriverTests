package com.company.stepdefs;

import com.company.pageObjects.TescoGroceryPage;
import com.company.pageObjects.TescoHomePage;
import com.company.pageObjects.TescoLoginPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Babatunde on 28/03/2015.
 */
public class LoginStepDefs {

//    WebDriver myHpp = new FirefoxDriver();
    URL url;

    RemoteWebDriver myHpp;
    WebDriverWait wait;

    TescoHomePage homePage;
    TescoLoginPage loginPage;
    TescoGroceryPage groceryPage;

    @Before
    public void setup() throws MalformedURLException {
        url = new URL("http://prayback:6127ade8-72b3-4df4-828d-7959c4502f04@ondemand.saucelabs.com:80/wd/hub");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("platform", Platform.MAC);

        myHpp = new RemoteWebDriver(url, capabilities);

        wait = new WebDriverWait(myHpp, 30);

        homePage = new TescoHomePage(myHpp);
        loginPage = new TescoLoginPage(myHpp);
        groceryPage = new TescoGroceryPage(myHpp);
    }

    @After
    public void tearDown(){
        myHpp.quit();
    }

    @Given("^I am on the Tesco website$")
    public void i_am_on_the_Tesco_website(){

        homePage.openTescoHomePage();

        Assert.assertTrue(homePage.amIOnTheHomePage());
    }

    @When("^I login with valid credentials$")
    public void i_login_with_valid_credentials(){

        homePage.goToLoginPage();

        wait.until(ExpectedConditions.visibilityOf(myHpp.findElement(By.cssSelector("input#loginID.ip"))));

        loginPage.fillLoginForm("", "");

    }

    @Then("^I am logged in$")
    public void i_am_logged_in(){
        wait.until(ExpectedConditions.visibilityOf(myHpp.findElement(By.cssSelector("a.SignOut"))));
        Assert.assertTrue(groceryPage.amILoggedIn());

    }
}
