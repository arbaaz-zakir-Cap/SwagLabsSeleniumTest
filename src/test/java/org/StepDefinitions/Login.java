package org.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.swaglabs.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Login {

    public static WebDriver driver = new ChromeDriver();
    public LoginPage loginPage = new LoginPage(driver);
    @BeforeTest
    public void beforeTests(){
        LoginPage loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }

    @Given("user is on the website saucedemo")
    public void user_is_on_the_website_saucedemo() {
        driver.get("https://www.saucedemo.com/");
    }
    @When("user fills in user-name textbox with standard_user")
    public void user_fills_in_user_name_textbox_with_standard_user() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterUsername("standard_user");
        //throw new io.cucumber.java.PendingException();
    }
    @And("user fills in password textbox with secret_sauce")
    public void user_fills_in_password_textbox_with_secret_sauce() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterPassword("secret_sauce");
        //throw new io.cucumber.java.PendingException();
    }
    @And("user clicks login-button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickLoginButton();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user should see Products title")
    public void user_should_see_products_title() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Products", driver.getTitle());
        //throw new io.cucumber.java.PendingException();
    }

}
