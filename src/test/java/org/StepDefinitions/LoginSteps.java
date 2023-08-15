package org.StepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.swaglabs.pages.LoginPage;

import java.util.concurrent.TimeUnit;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;

public class LoginSteps {

    public static WebDriver driver = new ChromeDriver();
    public LoginPage loginPage = new LoginPage(driver);

    @Before
    public void beforeTests(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Before Test Run!!");
    }

    @AfterAll
    public void AfterAll(){
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
    @When("user fills in password textbox with secret_sauce")
    public void user_fills_in_password_textbox_with_secret_sauce() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterPassword("secret_sauce");
        //throw new io.cucumber.java.PendingException();
    }
    @When("user clicks login-button")
    public void user_clicks_login_button() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.clickLoginButton();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("user should see Products title")
    public void user_should_see_products_title() {
        Assert.assertEquals("Products", driver.findElement(By.xpath("//div[@id='header_container']/div[2]/span"))
                .getText());
    }

    @When("user fills in user-name textbox with not_standard_user")
    public void user_fills_in_user_name_textbox_with_not_standard_user() {
        // Write code here that turns the phrase above into concrete actions
        loginPage.enterUsername("not_standard_user");
    }
    @Then("user should see error message Epic sadface: Username and password do not match any user in this service text")
    public void user_should_see_error_message_epic_sadface_username_and_password_do_not_match_any_user_in_this_service_text() {
        // Write code here that turns the phrase above into concrete actions
       Assert.assertTrue(driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed());
    }

}
