package com.practice.runners;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = { "pretty", "html:target/cucumber-reports.html" },
        plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/cucumber.json" },

        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
//                           dryRun=true,
//                            monochrome=true,
//                             tags = "@smoke or @regression",
        glue="com.practice",
        features = "src/test/resources/com.practice"
)

public class MyrunnerTest {

}
