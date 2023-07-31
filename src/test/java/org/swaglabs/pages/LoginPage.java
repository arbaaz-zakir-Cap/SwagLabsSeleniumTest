package org.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LoginPage {

    WebDriver driver;

    By username = By.id("user-name");

    By password = By.id("password");

    By loginButton = RelativeLocator.with(By.tagName("input"))
            .below(password);

    public LoginPage(WebDriver driver){

        this.driver = driver;

    }

    public void Login(String username, String password){
        driver.findElement(this.username).sendKeys(username);
        driver.findElement(this.password).sendKeys((password));

        //this.clickLoginButton();
    }

    public void enterUsername(String username){
        driver.findElement(this.username).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(this.password).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton)
                .click();
    }

}
