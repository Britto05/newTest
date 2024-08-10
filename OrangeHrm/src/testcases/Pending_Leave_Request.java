package testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
 
import pageobjects.Dashboard_Page_Object;
import pageobjects.Login_Page_Object;

public class Pending_Leave_Request extends CommonFunctions {

 	String actualMessage=null;
 	static Logger logger= Logger.getLogger(Pending_Leave_Request.class);
	
	public void login() {
	 	logger.info("Logging in to the Application");
		PageFactory.initElements(driver, Login_Page_Object.class);
		Login_Page_Object.username.sendKeys(properties.getProperty("username"));
		Login_Page_Object.password.sendKeys(properties.getProperty("password"));
		Login_Page_Object.loginButton.click();

	}

	public void getPendingLeaveRequest() {

		PageFactory.initElements(driver, Dashboard_Page_Object.class);
		actualMessage=Dashboard_Page_Object.pendingLeaveRequest.getText();

	}
	@Test
	public void verifyPendingLeaveRequest() {

		login();
		 logger.info("Getting the Pending Leave Request Details");
		getPendingLeaveRequest();
		 logger.info("Verification");
	 	Assert.assertEquals(actualMessage, "No Records are Available");
		 logger.info("End Of Pending_Leave_Request test case");
	}
}
