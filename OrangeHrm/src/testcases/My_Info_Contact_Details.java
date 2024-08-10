package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import commonfunctions.CommonFunctions;
import pageobjects.Contact_Details_Page_Object;

public class My_Info_Contact_Details extends CommonFunctions{

	@Test
	public void ContactDetails() throws AWTException, InterruptedException {

		PageFactory.initElements(driver, Contact_Details_Page_Object.class);	

		Contact_Details_Page_Object.MyInfo.click();
		Contact_Details_Page_Object.ContactDetails.click();

		Contact_Details_Page_Object.editbtn.click();
		Thread.sleep(500);
		Contact_Details_Page_Object.Address1.sendKeys("Street");
		Thread.sleep(500);
		Contact_Details_Page_Object.Address2.sendKeys("Address2");
		Thread.sleep(500);
		Contact_Details_Page_Object.City.sendKeys("Chennai");
		Thread.sleep(500);
		Contact_Details_Page_Object.State.sendKeys("Tamilnadu");
		Thread.sleep(500);
		Contact_Details_Page_Object.ZipCode.sendKeys("123456");
		Thread.sleep(500);
		Contact_Details_Page_Object.Country.click(); Select country = new
				Select(Contact_Details_Page_Object.Country); country.selectByValue("IN");
				Thread.sleep(500);
				Contact_Details_Page_Object.TelePhone.sendKeys("987654321");
				Thread.sleep(500);
				Contact_Details_Page_Object.Mobile.sendKeys("1234567789");
				Thread.sleep(500);
				Contact_Details_Page_Object.WorkTelePhn.clear();
				Contact_Details_Page_Object.WorkTelePhn.sendKeys("0123");
				Thread.sleep(500);
				Contact_Details_Page_Object.WorkEmail.clear();
				Contact_Details_Page_Object.WorkEmail.sendKeys("abc@gmail.com");
				Thread.sleep(500);
				Contact_Details_Page_Object.OtherEmail.sendKeys("123@gmail.com");
				Contact_Details_Page_Object.BtnSave.click();
				Thread.sleep(500);

				Contact_Details_Page_Object.Addbtn.click();
				Thread.sleep(500);
				Actions actions=new Actions(driver);
				actions.moveToElement(Contact_Details_Page_Object.uploadfile);
				actions.click().build().perform();
				//Thread.sleep(300);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Robot robot = new Robot();
				StringSelection str = new StringSelection("C:\\New folder\\Downloads files\\puppy.jpg");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
				Thread.sleep(300);
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V); 
				robot.keyRelease(KeyEvent.VK_V);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_ENTER); 
				robot.keyRelease(KeyEvent.VK_ALT);
				
				Thread.sleep(500);
				actions.moveToElement(Contact_Details_Page_Object.uploadbtn);
				actions.click().build().perform();
				Thread.sleep(500);
	}
}
