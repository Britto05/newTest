package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Job_Titles_Page_Object {

	@FindBy(id = "menu_admin_viewAdminModule")
	public static WebElement Admin;
	
	
	@FindBy(id="menu_admin_Job")
	public static WebElement job;
	
	
	@FindBy(id="menu_admin_viewJobTitleList")
	public static WebElement jobTitles;
	
	@FindBy(id="btnAdd")
	public static WebElement add;
	
	@FindBy(id="jobTitle_jobTitle")
	public static WebElement jobTitle;
	
	@FindBy(id="jobTitle_jobDescription")
	public static WebElement jobDescribtion;
	
	
	@FindBy(id="btnSave")
	public static WebElement save;
	
	
	@FindBy(id="ohrmList_chkSelectRecord_26")
	public static WebElement selectable;
	
	@FindBy(id="btnDelete")
	public static WebElement delete;
	
	@FindBy(id="dialogDeleteBtn")
	public static WebElement diologebox;
}
