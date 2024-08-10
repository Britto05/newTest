package utilities;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import pageObjects.AllMenuLinks_pageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.Reports_PageObjects;
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
		
	  PageFactory.initElements(DriverManager.getDriver(), LoginPageObjects.getInstance()); //here create after going on commonsteps
	  PageFactory.initElements(DriverManager.getDriver(), AllMenuLinks_pageObjects.getInstance());
	  PageFactory.initElements(DriverManager.getDriver(), Reports_PageObjects.getInstnce());
	  //PageFactory.initElements(DriverManager.getDriver(), Vendors_Page_Objects.getInstance());
	  //PageFactory.initElements(DriverManager.getDriver(), MultiVendorP_O.getInstance());
	 // PageFactory.initElements(DriverManager.getDriver(), BankingPage_Objects.getInstance());
	//  PageFactory.initElements(DriverManager.getDriver(), AccountsPage_Objects.getInstance());
	 // PageFactory.initElements(DriverManager.getDriver(), StocksPage_objects.getInstance());
	 // PageFactory.initElements(DriverManager.getDriver(), EmployeePage_Objects.getInstance());
	//  PageFactory.initElements(DriverManager.getDriver(), TCSTDSPage_Objects.getInstance());
	//  PageFactory.initElements(DriverManager.getDriver(), GSTRFillingPage_Object.getInstance());
	 // PageFactory.initElements(DriverManager.getDriver(), ReportPage_Objects.getInstance());
	//  PageFactory.initElements(DriverManager.getDriver(), Setting_PageObjects.getInstance());
	 // PageFactory.initElements(DriverManager.getDriver(), Edit_Cancel_PageObjects.getinstance());
	 // PageFactory.initElements(DriverManager.getDriver(), AddVendorPageObject.getinstance());
	}
	
public void selectFromDropDown(WebElement dropDown, String howTo, String value) {
		
		Select select = new Select(dropDown);
		switch (howTo) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;

		case "value":
			select.selectByValue(value);
			break;
			
		case "text":
			select.selectByVisibleText(value);
			break;
			
		default:
			System.out.println("Please provide a valid selection in the feature file. valid selections are: text,value,visibleText");
			break;
		}
	}
}
