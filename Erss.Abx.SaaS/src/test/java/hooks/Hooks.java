package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import webDriverManager.DriverManager;

public class Hooks {

	@After
	public static void tearDown(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	             byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	            DriverManager.getDriver().navigate().back();
	        } 
	}
}
