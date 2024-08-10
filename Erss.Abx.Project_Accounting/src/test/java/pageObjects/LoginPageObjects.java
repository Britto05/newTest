package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

private static LoginPageObjects loginInstance;
	
	private LoginPageObjects() {
		
	}
	public static LoginPageObjects getInstance() {
		
		if(loginInstance == null) {
			loginInstance = new LoginPageObjects();
		}
		return loginInstance;
	}
	
	@FindBy(name = "email")
	public static WebElement UserName;
	
	@FindBy(name = "password")
	public static WebElement Password;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/form/div[3]/div[2]/button")
	public static WebElement SIGIN_BUTTON;
	
	@FindBy(linkText = "Britto Pvt Ltd.")
	public static WebElement Company;
	
	//write actions in same page object class:
	
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		SIGIN_BUTTON.click();
	}
	
	public void SelectCompany() {
		Company.click();
	}
	
}

