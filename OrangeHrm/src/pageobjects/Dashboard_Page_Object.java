package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Page_Object {

	@FindBy(xpath = "//*[@id=\"task-list-group-panel-menu_holder\"]/table/tbody/tr/td")
	public static WebElement pendingLeaveRequest;
}
