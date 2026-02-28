package com.practice.hooks;

import com.practice.context.TestContext;
import com.practice.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;

public class MyHooks {
    private  WebDriver driver;
    private final TestContext context;
     public MyHooks(TestContext context){
         this.context=context;
     }
    @Before
    public void before(Scenario scenario){
//         context.scenarioName=scenario.getName();
//        System.out.println("Context scenario name --------->SCENARIOS NAME: "+context.scenarioName);
        System.out.println("Before thread ,THREAD ID: "+Thread.currentThread().threadId());
        System.out.println("SCENARIOS NAME: "+scenario.getName());
        driver= DriverFactory.initializeDriver(System.getProperty("browser","chrome"));
        context.driver=driver;
    }

    @After
    public void after(Scenario scenario){
//        System.out.println("After thread ,THREAD ID: "+Thread.currentThread().threadId());
        System.out.println("After SCENARIOS NAME: "+scenario.getName());
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);


            Allure.addAttachment("Failure Screenshot",
                    new ByteArrayInputStream(screenshot));
        }
        driver.quit();
    }
}
