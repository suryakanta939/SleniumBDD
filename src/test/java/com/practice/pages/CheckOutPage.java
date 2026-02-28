package com.practice.pages;

import com.practice.domainobjects.BillingDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class CheckOutPage extends BasePage{
    @FindBy(id="billing_first_name")
    private WebElement billing_first_name;
    @FindBy(id="billing_last_name")
    private WebElement billing_last_name;
    @FindBy(id="billing_address_1")
    private WebElement billing_address_1;
    @FindBy(id="billing_city")
    private WebElement billing_city;
    @FindBy(id="billing_state")
    private WebElement billing_state;
    @FindBy(id="billing_postcode")
    private WebElement billing_postcode;
    @FindBy(id="billing_email")
    private WebElement billing_email;
    @FindBy(id="place_order")
    private WebElement placeOrderBtn;

    @FindBy(xpath="//p[contains(text(),'Thank you')]")
    private WebElement successMsg;

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public CheckOutPage enterFistName(String fisrtName){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(billing_first_name));
        element.clear();
        element.sendKeys(fisrtName);
        return this;
    }

    public CheckOutPage enterlastName(String lastName){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(billing_last_name));
        element.clear();
        element.sendKeys(lastName);
        return this;
    }

    public CheckOutPage enterBillingAddress(String address){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(billing_address_1));
        element.clear();
        element.sendKeys(address);
        return this;
    }

    public CheckOutPage enterCity(String city){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(billing_city));
        element.clear();
        element.sendKeys(city);
        return this;
    }

    public CheckOutPage enterSate(String state){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(billing_state));
        Select select=new Select(element);
        select.selectByVisibleText(state);
        return this;
    }

    public CheckOutPage enterPostCode(String postCode){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(billing_postcode));
        element.clear();
        element.sendKeys(postCode);
        return this;
    }

    public CheckOutPage enterEmail(String email){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(billing_email));
        element.clear();
        element.sendKeys(email);
        return this;
    }

    public void fillBillingDetails(BillingDetails billingDetails){
          enterFistName(billingDetails.getBillingfirstName()).
                  enterlastName(billingDetails.getBillingLastName()).
                  enterBillingAddress(billingDetails.getBillingAdDress()).
                  enterCity(billingDetails.getBillingCity()).
                  enterSate(billingDetails.getBillingState()).
                  enterPostCode(billingDetails.getBillingZip()).
                  enterEmail(billingDetails.getBillingEmail());


    }

    public void placeOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
    }

    public String getNotice(){
        return wait.until(ExpectedConditions.visibilityOf(successMsg)).getText();
    }


}

