package com.practice.stepdefinations;

import com.practice.apis.CartAPI;
import com.practice.context.TestContext;
import com.practice.domainobjects.Product;
import com.practice.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreDefinations {
    private final WebDriver driver;
    private TestContext context;
    public StoreDefinations(TestContext context) {
        this.context=context;
        driver=context.driver;
    }

    @Given("I am on the store page")
    public void i_am_on_the_store_page() {
//        driver= DriverFactory.getDriver();
        new StorePage(driver).load("");

    }
    @When("I add a {product} to cart")
    public void i_add_a_to_cart(Product product) {
        new StorePage(driver).addTocart(product.getName());
    }

    @Given("I have a product in the cart page")
    public void i_have_a_product_in_the_cart_page() {
//        new StorePage(driver).addTocart("Blue Shoes");
        CartAPI cartAPI=new CartAPI(context.cookies.getCookies());
        cartAPI.addToCart(1215,1);
        context.cookies.setCookies(cartAPI.getCookies());
        context.cookies.injectCookiesTobrowser(context.driver);
    }
}
