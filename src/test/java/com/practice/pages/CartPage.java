package com.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{
    @FindBy(xpath = "//a[normalize-space()='Blue Shoes']")
    private WebElement productname;
    @FindBy(xpath = "//input[@type='number']")
    private WebElement productQTY;

    @FindBy(xpath = "//a[normalize-space()='Proceed to checkout']" )
    private WebElement proceedbtn;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){
        return wait.until(ExpectedConditions.visibilityOf(productname)).getText();
    }

    public String getProductQTY(){
        return wait.until(ExpectedConditions.visibilityOf(productQTY)).getAttribute("value");
    }

    public void checkout(){
        wait.until(ExpectedConditions.elementToBeClickable(proceedbtn)).click();
    }

}
