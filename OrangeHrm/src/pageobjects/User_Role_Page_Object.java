package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Role_Page_Object {

	@FindBy(id = "menu_admin_viewAdminModule")
	public static WebElement Admin;
	
	@FindBy(id = "menu_admin_UserManagement")
	public static WebElement userManagement;
	
	@FindBy(id = "menu_admin_viewSystemUsers")
	public static WebElement users;
	
	@FindBy(id = "searchSystemUser_userName")
	public static WebElement userName;
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement userRole;
	
	@FindBy(id="searchSystemUser_employeeName_empName")
	public static WebElement empName;
	
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement status;
	
	@FindBy(id="searchBtn")
	public static WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[3]")
	public static WebElement userRoleValue;
	
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[5]")
	public static WebElement userStatusValue;
}
