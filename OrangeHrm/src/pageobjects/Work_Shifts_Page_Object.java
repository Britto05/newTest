package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Work_Shifts_Page_Object {

	@FindBy(id = "menu_admin_viewAdminModule")
	public static WebElement Admin;
	

	@FindBy(id="menu_admin_Job")
	public static WebElement job;
	
	@FindBy(id="menu_admin_workShift")
	public static WebElement WordShifts;
	
	@FindBy(id="btnAdd")
	public static WebElement addbtn  ;
	
	@FindBy(id="workShift_name")
	public static WebElement ShiftName;
	
	@FindBy(id="workShift_workHours_from")
	public static WebElement hoursFrom;
	
	@FindBy(id="workShift_workHours_to")
	public static WebElement hoursTo;
	
	@FindBy(id="workShift_availableEmp")
	public static WebElement availablemp;
	
	@FindBy(id="btnAssignEmployee")
	public static WebElement Addemp;
	
	@FindBy(id="workShift_assignedEmp")
	public static WebElement emplist;
	
	@FindBy(id="btnRemoveEmployee")
	public static WebElement removemp;
	
	@FindBy(id="btnSave")
	public static WebElement savebtn;
}
