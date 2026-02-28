package com.practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage{
    @FindBy(xpath = "//a[@title='View cart']")
    private WebElement viewcartLink;


    public StorePage(WebDriver driver) {
        super(driver);
    }

    public void addTocart(String productName){
        By addtoCartButton= By.xpath("//a[@aria-label='Add “"+productName+"” to your cart']");
        wait.until(ExpectedConditions.elementToBeClickable(addtoCartButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(viewcartLink)).click();
    }

}
