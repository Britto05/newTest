package stepDefinitions;

import java.util.concurrent.TimeUnit;

import constants.Constants;
import io.cucumber.java.Before;
import pageObjects.LoginPageObjects;
import utilities.CommonUtils;
import webDriverManager.DriverManager;

public class CommonSteps {

	@Before
	public void beforeScenario() {
		try {
			CommonUtils commonUtils = new CommonUtils();
			commonUtils.loadProperties();  
			if(DriverManager.getDriver()==null) { 
				DriverManager.launchBrowser();
				commonUtils.initElements();
				Login();
				DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}

	private void Login() {
		// TODO Auto-generated method stub
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().navigate().to(Constants.Url);
		LoginPageObjects.getInstance();
		LoginPageObjects.getInstance().enterUserName(Constants.UserName);
		LoginPageObjects.getInstance().enterPassword(Constants.Password);
		LoginPageObjects.getInstance().clickLoginButton();
	}
}
