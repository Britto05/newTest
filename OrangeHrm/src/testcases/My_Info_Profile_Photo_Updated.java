package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import commonfunctions.CommonFunctions;
import pageobjects.Photo_Update_Page_Object;

public class My_Info_Profile_Photo_Updated extends CommonFunctions{

	@Test
	public void profilepotoupdated() throws AWTException, InterruptedException {
		PageFactory.initElements(driver, Photo_Update_Page_Object.class);

		Photo_Update_Page_Object.Myinfo.click();
		Thread.sleep(500);
		Photo_Update_Page_Object.ProfilePhoto.click();
		Thread.sleep(500);
		Actions actions=new Actions(driver);
		actions.moveToElement(Photo_Update_Page_Object.selectfile);
		actions.click().build().perform();
		//Thread.sleep(300);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Photo_Update_Page_Object.selectfile.click();
		Robot robot = new Robot();
		String file="C:\\New folder\\Downloads files\\puppy.jpg";
		StringSelection str = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(300);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER); 
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		actions.moveToElement(Photo_Update_Page_Object.updatedbtn);
		actions.click().build().perform();
		Thread.sleep(500);
	}

}
