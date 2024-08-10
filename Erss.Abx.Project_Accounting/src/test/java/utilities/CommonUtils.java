package utilities;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import pageObjects.LoginPageObjects;
import pageObjects.Projects_Page_Objects;
import webDriverManager.DriverManager;

public class CommonUtils {

	public void loadProperties() {

		Properties properties = new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    Constants.Url=properties.getProperty("Url");
		Constants.Browser=properties.getProperty("Browser");
		Constants.UserName=properties.getProperty("UserName");
		Constants.Password=properties.getProperty("Password");
	}
	
	public void initElements() {
		PageFactory.initElements(DriverManager.getDriver(), LoginPageObjects.getInstance());
		PageFactory.initElements(DriverManager.getDriver(), Projects_Page_Objects.getInstance());
	}
}
