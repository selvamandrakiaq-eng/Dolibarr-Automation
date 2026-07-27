package com.TestRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.BaseClass.baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com.Featurefile/file.feature",
		dryRun=false,
		glue = "com.StepDefinition",
		plugin = {"pretty","summary","html:target/cucumber-reports/reports.html"},
		tags="@Selva"


		)




public class testrunner extends baseclass {



	@BeforeClass
	public static void setup() {
		driver=baseclass.launchBrowser();
	}
	@AfterClass
	public static void closeBrowser() {
		
	}


}
