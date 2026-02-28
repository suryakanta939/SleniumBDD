package com.practice.stepdefinations;

import com.practice.constants.EndPoints;
import com.practice.context.TestContext;
import com.practice.domainobjects.BillingDetails;
import com.practice.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CustomerStepDefinations {
    private final WebDriver driver;
    private TestContext context;
    public CustomerStepDefinations(TestContext context) {
        this.context=context;
        driver=context.driver;
    }
    @Given("I am a guest customer")
    public void i_am_a_guest_customer() {
//        driver= DriverFactory.getDriver();
        new StorePage(driver).load(EndPoints.STORE.url);
    }
    @And("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails=billingDetails;
//        billingfirstName=billingdeatils.get(0).get("firstname");
//        billingLastName=billingdeatils.get(0).get("lastname");
//        billingAdDress= billingdeatils.get(0).get("Address_line1");
//        billingCity=billingdeatils.get(0).get("city");
//        billingState=billingdeatils.get(0).get("state");
//        billingZip=billingdeatils.get(0).get("zip");
//        billingEmail=billingdeatils.get(0).get("email");
    }
}
