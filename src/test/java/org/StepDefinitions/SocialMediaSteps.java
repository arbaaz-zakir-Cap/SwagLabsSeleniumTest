package org.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.swaglabs.pages.LoginPage;

public class SocialMediaSteps {

    WebDriver driver = new ChromeDriver();

    LoginPage loginPage = new LoginPage(driver);
    @Given("Logged in")
    public void loggedIn() {
        Assert.assertEquals("Products", driver.findElement(By.xpath("//div[@id='header_container']/div[2]/span"))
                .getText());    }

    @When("user clicks on twitter icon")
    public void userClicksOnTwitterIcon() {

    }

    @Then("user should go to twitter")
    public void userShouldGoToTwitter() {
    }
}
