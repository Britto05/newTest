package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Details_Page_Object {

	@FindBy(id="menu_pim_viewMyDetails")
	public static WebElement MyInfo;


	@FindBy(xpath="//*[@id=\"sidenav\"]/li[2]/a")
	public static WebElement ContactDetails;

	@FindBy(id = "btnSave")
	public static WebElement editbtn;

	@FindBy(id="contact_street1")
	public static WebElement Address1;

	@FindBy(id="contact_street2")
	public static WebElement Address2;

	@FindBy(id="contact_city")
	public static WebElement City;

	@FindBy(id="contact_province")
	public static WebElement State;

	@FindBy(id="contact_emp_zipcode")
	public static WebElement ZipCode;

	@FindBy(id="contact_country")
	public static WebElement Country;

	@FindBy(id="contact_emp_hm_telephone")
	public static WebElement TelePhone;

	@FindBy(id="contact_emp_mobile")
	public static WebElement Mobile;

	@FindBy(id="contact_emp_work_telephone")
	public static WebElement WorkTelePhn;

	@FindBy(id="contact_emp_work_email")
	public static WebElement WorkEmail;

	@FindBy(id="contact_emp_oth_email")
	public static WebElement OtherEmail;

	@FindBy(id="btnSave")
	public static WebElement BtnSave;
	
	@FindBy(id = "btnAddAttachment")
	public static WebElement Addbtn;
	
	@FindBy(xpath = "//*[@id=\'ufile\']")
	public static WebElement uploadfile;
	
	@FindBy(id = "txtAttDesc")
	public static WebElement comments;
	
	@FindBy(id = "btnSaveAttachment")
	public static WebElement uploadbtn;
}
