package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

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

	private void Login() throws InterruptedException {
		// TODO Auto-generated method stub
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().navigate().to(Constants.Url);
		LoginPageObjects.getInstance();
		LoginPageObjects.getInstance().enterUserName(Constants.UserName);
		LoginPageObjects.getInstance().ClickNextButton();
		Thread.sleep(3000);
		LoginPageObjects.getInstance().enterPassword(Constants.Password);
		//Thread.sleep(3000);
		DriverManager.getDriver().switchTo().frame(0);
		//Thread.sleep(3000);
		DriverManager.getDriver().findElement(By.id("recaptcha-anchor")).click();
		//LoginPageObjects.getInstance().ClickCaptcha();
		Thread.sleep(30000);
		DriverManager.getDriver().switchTo().defaultContent();
		Thread.sleep(3000);
		LoginPageObjects.getInstance().clickLoginButton();
		
		
	}
}
