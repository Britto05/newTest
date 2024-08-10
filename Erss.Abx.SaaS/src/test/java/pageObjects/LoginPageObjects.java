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
	
	@FindBy(id = "login_username")
	public static WebElement UserName;
	
	@FindBy(xpath = "//*[@id=\"loginValidation\"]/div[1]/div[2]/div/button")
	public static WebElement nextbtn;
	
	@FindBy(id = "login_password")
	public static WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"feedback-recaptcha\"]/div/div/iframe")
	public static WebElement captcha;
	
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/form[2]/div[2]/div[5]/div/button")
	public static WebElement SIGIN_BUTTON;
	
	@FindBy(linkText = "Britto Pvt Ltd.")
	public static WebElement Company;
	
	//write actions in same page object class:
	
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
	}
	
	public void ClickNextButton() {
		nextbtn.click();
	}
	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void ClickCaptcha() {
		captcha.click();
	}
	public void clickLoginButton() {
		SIGIN_BUTTON.click();
	}
	
	public void SelectCompany() {
		Company.click();
	}
	
}
