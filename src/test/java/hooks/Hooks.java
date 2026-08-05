package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import java.io.ByteArrayInputStream;

import com.BaseClass.baseclass;

public class Hooks {

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				// local path
				String savedPath = baseclass.captureScreenshot(scenario.getName());

				byte[] screenshotBytes = ((TakesScreenshot) baseclass.driver).getScreenshotAs(OutputType.BYTES);
				
				//extent report
				ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(savedPath);
				
				//  Cucumber HTML/JSON report  
				scenario.attach(screenshotBytes, "image/png", scenario.getName());

				//  Allure report
				Allure.addAttachment(scenario.getName() + " - failure screenshot",
						new ByteArrayInputStream(screenshotBytes));

				if (savedPath != null) {
					System.out.println("FAILED scenario '" + scenario.getName() + "' - screenshot: " + savedPath);
				}
			} catch (Exception e) {
				System.out.println("Could not capture screenshot for failed scenario: " + e.getMessage());
			}
		}
	}
}
