package com.practice.stepdefinations;

import com.practice.context.TestContext;
import com.practice.domainobjects.Product;
import com.practice.pages.CartPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CartStepDefinations {
    private final WebDriver driver;
    public CartStepDefinations(TestContext context) {
        driver=context.driver;
    }
    @Then("I should see {int} {product} in the cart")
    public void i_should_see_in_the_cart(Integer int1, Product product) {
        CartPage cartPage=new CartPage(driver);
        String actualProductName=cartPage.getProductName();
        String actualQuanity=cartPage.getProductQTY();
//        Assert.assertEquals(actualQuanity,"1");
//        Assert.assertEquals(actualProductName,product.getName());
        Assert.assertEquals(actualQuanity,"1");
        Assert.assertEquals(actualProductName,product.getName());
    }
}
