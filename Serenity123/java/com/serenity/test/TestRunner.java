package com.serenity.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt", 
				"html:target/cucumber/cucumber-html-report.html",
				"json:target/cucumber/cucumber.json"
				}
		,features= {"features"}
		,glue = {"com.serenity.stepDefinations"}
		//,dryRun = true
		,tags="@BookingFlight_RoundTrip"
		)
public class TestRunner {

}
