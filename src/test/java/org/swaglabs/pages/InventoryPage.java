package org.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class InventoryPage {

    WebDriver driver;

    //backpack text, add to cart, picture
    By backpackImg = By.xpath("//img[@alt=\"Sauce Labs Backpack\"]");
    By backpackTxt = RelativeLocator.with(By.tagName("div")).toRightOf(backpackImg);
    By backpackAddtoCart = By.id("add-to-cart-sauce-labs-backpack");

    //bike light
    By bikeLightImg = By.xpath("//img[@alt=\"Sauce Labs Bike Light\"]");
    By bikeLightTxt = RelativeLocator.with(By.tagName("div")).toRightOf(bikeLightImg);
    By bikeLightAddToCart = By.id("add-to-cart-sauce-labs-bike-light");

    //T-shirt
    By tshirtImg = By.xpath("//img[@alt=\"Sauce Labs Bolt T-Shirt\"]");
    By tshirtTxt = RelativeLocator.with(By.tagName("div")).toRightOf(tshirtImg);
    By tshirtAddToCart = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    //fleece jacket
    By fleeceImg = By.xpath("//img[@alt=\"Sauce Labs Fleece Jacket\"]");
    By fleeceTxt = RelativeLocator.with(By.tagName("div")).toRightOf(fleeceImg);
    By fleeceAddToCart = By.id("add-to-cart-sauce-labs-fleece-jacket");

    //onesie
    By onsieImg = By.xpath("//img[@alt=\"Sauce Labs Onesie\"]");
    By onsieTxt = RelativeLocator.with(By.tagName("div0")).toRightOf(onsieImg);
    By onsieAddToCart = By.id("add-to-cart-sauce-labs-onesie");

    //test.allthings() T-shirt
    By redShirtImg = By.xpath("//img[@alt=\"Test.allTheThings() T-Shirt (Red)\"]");
    By redShirtTxt = RelativeLocator.with(By.tagName("div")).toRightOf(redShirtImg);
    By redShirtAddToCart = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");

    //Burger menu
    By burgerMenuButton = By.id("react-burger-menu-btn");

    //cart link
    By cartLink = By.className("shopping_cart_link");

    //filter button
    By filterButton = RelativeLocator.with(By.tagName("select"))
            .below(cartLink);
    By filterAtoZ = By.xpath("//option[@value=\"az\"]");
    By filterZtoA = By.xpath("//option[@value=\"za\"]");
    By filterLowToHigh = By.xpath("//option[@value=\"lohi\"]");
    By filterHighToLow = By.xpath("//option[@value=\"hilo\"]");

    //twitter
    By twitterLogo = By.xpath("//a[@href=\"https://twitter.com/saucelabs\"]");
    By facebookLogo = By.xpath("//a[@href=\"https://www.facebook.com/saucelabs\"]");
    By linkedinLogo = By.xpath("//a[@href=\"https://www.linkedin.com/company/sauce-labs/\"]");

    public InventoryPage(WebDriver driver){

        this.driver = driver;
    }

    public void clickOnBackpackImg(){
        driver.findElement(backpackImg)
                .click();
    }

    public void clickOnBackpackTxt(){
        driver.findElement(backpackTxt)
                .click();
    }

    public void addBackpackToCart(){
        driver.findElement(backpackAddtoCart)
                .click();
    }
////////////////////////////////////////////////////////////////////
    public void clickOnBikeLightImg(){
        driver.findElement(bikeLightImg)
                .click();
    }

    public void clickOnBikeLightTxt(){
        driver.findElement(bikeLightTxt)
                .click();
    }

    public void addBikeLightoCart(){
        driver.findElement(bikeLightAddToCart)
                .click();
    }
/////////////////////////////////////////////////////////////////////////

    public void clickOnTshirtImg(){
        driver.findElement(tshirtImg)
                .click();
    }

    public void clickOnTshirtTxt(){
        driver.findElement(tshirtTxt)
                .click();
    }

    public void addTshirtToCart(){
        driver.findElement(tshirtAddToCart)
                .click();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    public void clickOnFleeceImg(){
        driver.findElement(fleeceImg)
                .click();
    }

    public void clickOnFleeceTxt(){
        driver.findElement(fleeceTxt)
                .click();
    }

    public void addFleeceToCart(){
        driver.findElement(fleeceAddToCart)
                .click();
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    public void clickOnOnsieImg(){
        driver.findElement(onsieImg)
                .click();
    }

    public void clickOnOnsieTxt(){
        driver.findElement(onsieTxt)
                .click();
    }

    public void addOnsieToCart(){
        driver.findElement(onsieAddToCart)
                .click();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    public void clickOnRedShirtImg(){
        driver.findElement(redShirtImg)
                .click();
    }

    public void clickOnRedShirtTxt(){
        driver.findElement(redShirtTxt)
                .click();
    }

    public void addRedShirtToCart(){
        driver.findElement(redShirtAddToCart)
                .click();
    }
    //////////////////////////////////////////////////////////
    public void clickCart(){
        driver.findElement(cartLink)
                .click();
    }

    private void clickFilterButton(){
        driver.findElement(filterButton).click();
    }

    public void FilterAtoZ(){
        clickFilterButton();
        driver.findElement(filterAtoZ)
                .click();
    }
    public void FilterZtoA(){
        clickFilterButton();
        driver.findElement(filterZtoA)
                .click();
    }
    public void FilterLowToHigh(){
        clickFilterButton();
        driver.findElement(filterLowToHigh)
                .click();
    }
    public void FilterHighToLow(){
        clickFilterButton();
        driver.findElement(filterHighToLow)
                .click();
    }
}
