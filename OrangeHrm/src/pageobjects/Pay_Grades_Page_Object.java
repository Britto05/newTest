package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pay_Grades_Page_Object {

	@FindBy(id = "menu_admin_viewAdminModule")
	public static WebElement Admin;
	

	@FindBy(id="menu_admin_Job")
	public static WebElement job;
	
	@FindBy(id="menu_admin_viewPayGrades")
	public static WebElement paygrades;
	
	@FindBy(id="btnAdd")
	public static WebElement Addbtn;
	
	@FindBy(id="payGrade_name")
	public static WebElement paygradename;

	@FindBy(id="btnSave")
	public static WebElement btnsave;
	
	
	@FindBy(id="btnAddCurrency")
	public static WebElement Addcurrancy;
	
	@FindBy(id="payGradeCurrency_currencyName")
	public static WebElement currancyName;
	
	@FindBy(xpath = "/html/body/div[4]/ul/li")
	public static WebElement currancylist;
	
	@FindBy(id="payGradeCurrency_minSalary")
	public static WebElement minimumSalary;
	
	@FindBy(id="payGradeCurrency_maxSalary")
	public static WebElement maximumSalary;
	
	@FindBy(id="btnSaveCurrency")
	public static WebElement Addcurrancysave;
}
