package testcases;

 
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageobjects.User_Role_Page_Object;

public class User_Role extends CommonFunctions{

Logger logger = Logger.getLogger(User_Role.class);
	
		
	
	
	public void moveToUserPage() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(User_Role_Page_Object.Admin);
		 Thread.sleep(500);
		actions.moveToElement(User_Role_Page_Object.userManagement);
		 Thread.sleep(500);
		actions.moveToElement(User_Role_Page_Object.users);
		actions.click().build().perform();
	}
	
	public void selectUserRole() throws InterruptedException {
		
		Select selectUserRol = new Select(User_Role_Page_Object.userRole);
		selectUserRol.selectByIndex(1);
		 Thread.sleep(500);
		User_Role_Page_Object.empName.sendKeys("John");
		
	}
	
	public void selectStatus() {
		
		Select selectStatus=new Select(User_Role_Page_Object.status);
		selectStatus.selectByIndex(1);
		
	}
@Test
	public void checkUserRole() throws InterruptedException {
		
		PageFactory.initElements(driver, User_Role_Page_Object.class);
		logger.info("Navigating to Users Page");
		moveToUserPage();
		logger.info("Selecting the User Role");
		selectUserRole();
		logger.info("Selecting the Status");
		selectStatus();
		User_Role_Page_Object.searchButton.click();
		String actualRole=User_Role_Page_Object.userRoleValue.getText();
		String actualStatus=User_Role_Page_Object.userStatusValue.getText();
		logger.info("Verifying the results");
		Assert.assertEquals(actualRole, "Admin");
		Assert.assertEquals(actualStatus, "Enabled");
		logger.info("End of User_Role test case");
		
		
	}
}
