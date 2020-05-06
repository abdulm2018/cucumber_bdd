package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import frameworkUtils.DriverScript;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase {
	
	@Before
	public void beforeScenario(Scenario scenario) {
		DriverScript.launchBrowser();
	}
	
	@After(order=0)
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshots = ((TakesScreenshot)DriverScript.driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshots, "image/png");		
		}
	}
	

}
