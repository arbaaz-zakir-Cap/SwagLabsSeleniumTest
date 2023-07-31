package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.swaglabs.pages.InventoryPage;
import org.swaglabs.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Backpack {
    public static WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void BeofreTest(){
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.Login("standard_user", "secret_sauce");

    }
    @Test
    public void Backpack(){
        InventoryPage inventoryPage = new InventoryPage(driver);
       // inventoryPage.addBackpackToCart();
       // inventoryPage.addRedShirtToCart();
        //inventoryPage.clickCart();
        //inventoryPage.addBackpackToCart();

    }

    @AfterTest
    public void AfterTest(){
        //driver.quit();
    }
}
