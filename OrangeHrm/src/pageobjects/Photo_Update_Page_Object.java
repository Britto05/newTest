package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Photo_Update_Page_Object {

	@FindBy(id = "menu_pim_viewMyDetails")
	public static WebElement Myinfo;

	@FindBy(id = "profile-pic")
	public static WebElement ProfilePhoto;
	
	@FindBy(id = "photofile")
	public static WebElement selectfile;
	
	@FindBy(id = "btnSave")
	public static WebElement updatedbtn;
}
