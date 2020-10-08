package com.co.retochoucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src\\test\\resources\\features\\pages.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.retochoucair.stepdefinitions",
        tags = "")
public class PagesRunner {
}
