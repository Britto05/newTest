package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Info_Page_Object {

	@FindBy(id = "menu_pim_viewMyDetails")
	public static WebElement Myinfo;

	@FindBy(id = "btnSave")
	public static WebElement EditBtn;

	@FindBy(id = "personal_txtEmpFirstName")
	public static WebElement FirstName;

	@FindBy(id = "personal_txtEmpMiddleName")
	public static WebElement MiddleName;

	@FindBy(id = "personal_txtEmpLastName")
	public static WebElement LastName;

	@FindBy(id = "personal_txtEmployeeId")
	public static WebElement EmpId;

	@FindBy(id = "personal_txtOtherID")
	public static WebElement OtherId;

	@FindBy(id = "personal_txtLicenNo")
	public static WebElement LicenseNo;


	@FindBy(id = "personal_txtLicExpDate")
	public static WebElement LicenseExpData;


	@FindBy(id = "personal_txtNICNo")
	public static WebElement SSNno;

	@FindBy(id = "personal_txtSINNo")
	public static WebElement SinNo;

	@FindBy(id = "personal_optGender_1")
	public static WebElement Gender;

	@FindBy(id = "personal_cmbMarital")
	public static WebElement MaritelStatus;

	@FindBy(id = "personal_cmbNation")
	public static WebElement Nationality;

	@FindBy(id = "personal_DOB")
	public static WebElement DOB;

	@FindBy(id = "personal_txtEmpNickName")
	public static WebElement NikeName;

	@FindBy(id = "personal_chkSmokeFlag")
	public static WebElement SmokerCheckBox;

	@FindBy(id = "personal_txtMilitarySer")
	public static WebElement MilitaryService;

	@FindBy(id = "btnSave")
	public static WebElement Savebtn;
	
	//blood Type:
	
	@FindBy(id = "btnEditCustom")
	public static WebElement bloodeditBtn;
	
	@FindBy(name = "custom1")
	public static WebElement bloodType;
	
	@FindBy(id = "btnEditCustom")
	public static WebElement bloodSaveBtn;
	
	
	//Attachments:
	@FindBy(id = "btnAddAttachment")
	public static WebElement AttachAddbtn;
	
	@FindBy(id = "ufile")
	public static WebElement Atachchoosefile;
	
	@FindBy(id = "txtAttDesc")
	public static WebElement AttachDescription;
	
	@FindBy(id = "btnSaveAttachment")
	public static WebElement AttachUploadBtn;
}
