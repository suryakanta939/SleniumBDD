package com.practice.stepdefinations;

import com.practice.constants.EndPoints;
import com.practice.context.TestContext;
import com.practice.domainobjects.BillingDetails;
import com.practice.pages.CartPage;
import com.practice.pages.CheckOutPage;
import com.practice.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutStepDefinations {
    private final WebDriver driver;
    private TestContext context;
    public CheckoutStepDefinations(TestContext context) {
        this.context=context;
        driver=context.driver;
    }

//    @Given("I have a product in the cart page")
//    public void i_have_a_product_in_the_cart_page() {
//        new StorePage(driver).addTocart("Blue Shoes");
//    }
    @Given("I am on the checkout page")
    public void i_am_on_the_checkout_page() {
//        new CartPage(driver).checkout();
        new CartPage(driver).load(EndPoints.CHECKOUT.url);
    }
    @When("I provide billing details")
//    public void i_provide_billing_details(List<Map<String,String>> billingdeatils) {
    public void i_provide_billing_details() {

        /**
         *
         * |firstname|lastname|country|Address_line1|city|state|zip|email
         *     |  demo| user|United States(Us)|6300Spring Creek|Plano|texas|754024|askomdch@gmail.com
         * */
//         System.out.println("The emails is *********"+billingdeatils.get(0).get("email"));
//        By firstName=By.id("billing_first_name");
//        By billing_last_name=By.id("billing_last_name");
//        By billing_address_1=By.id("billing_address_1");
//        By billing_city=By.id("billing_city");
//        By billing_state=By.id("billing_state");
//        By billing_postcode=By.id("billing_postcode");
//        By billing_email=By.id("billing_email");
//       driver.findElement(firstName).sendKeys(billingdeatils.get(0).get("firstname"));
//        driver.findElement(billing_last_name).sendKeys(billingdeatils.get(0).get("lastname"));
//        driver.findElement(billing_address_1).sendKeys(billingdeatils.get(0).get("Address_line1"));
//        driver.findElement(billing_city).sendKeys(billingdeatils.get(0).get("city"));
//        Select select=new Select(driver.findElement(billing_state));
//        select.selectByVisibleText(billingdeatils.get(0).get("state"));
//        driver.findElement(billing_postcode).sendKeys(billingdeatils.get(0).get("zip"));
//        driver.findElement(billing_email).sendKeys(billingdeatils.get(0).get("email"));

        new CheckOutPage(driver).fillBillingDetails(context.billingDetails);

    }
    @When("I place an order")
    public void i_place_an_order() {
        new CheckOutPage(driver).placeOrder();
    }
    @Then("the order should placed successfuly")
    public void the_order_should_placed_successfuly() {
        String msg=new CheckOutPage(driver).getNotice();
        Assert.assertEquals(msg,"Thank you. Your order has been received.");
    }

}
