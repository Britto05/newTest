package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import pageobjects.My_Info_Page_Object;

public class My_Info_Personal_Details extends CommonFunctions{

	public void myInfo() throws InterruptedException {

		PageFactory.initElements(driver, My_Info_Page_Object.class);

		My_Info_Page_Object.Myinfo.click();
		Thread.sleep(500);
		My_Info_Page_Object.EditBtn.click();
		Thread.sleep(500);
		My_Info_Page_Object.FirstName.clear();
		My_Info_Page_Object.FirstName.sendKeys("John");
		Thread.sleep(500);
		My_Info_Page_Object.MiddleName.clear();
		My_Info_Page_Object.MiddleName.sendKeys("Britto");
		Thread.sleep(500);
		My_Info_Page_Object.LastName.clear();
		My_Info_Page_Object.LastName.sendKeys("S");
		Thread.sleep(500);
		My_Info_Page_Object.EmpId.clear();
		My_Info_Page_Object.EmpId.sendKeys("2305");
		Thread.sleep(500);
		My_Info_Page_Object.OtherId.clear();
		My_Info_Page_Object.OtherId.sendKeys("96");
		Thread.sleep(500);
		My_Info_Page_Object.LicenseNo.clear();
		My_Info_Page_Object.LicenseNo.sendKeys("9876543210");
		Thread.sleep(500);
		My_Info_Page_Object.LicenseExpData.clear();
		My_Info_Page_Object.LicenseExpData.sendKeys("2045-03-15"+Keys.ENTER);
		Thread.sleep(500);
		My_Info_Page_Object.SSNno.clear();
		My_Info_Page_Object.SSNno.sendKeys("000000");
		Thread.sleep(500);
		My_Info_Page_Object.SinNo.clear();
		My_Info_Page_Object.SinNo.sendKeys("1111");
		Thread.sleep(500);
		My_Info_Page_Object.Gender.click();
		Thread.sleep(500);
		Select maritalStatus = new Select(My_Info_Page_Object.MaritelStatus);
		maritalStatus.selectByIndex(1);
		Thread.sleep(500);
		Select nationality = new Select(My_Info_Page_Object.Nationality);
		nationality.selectByIndex(82);
		Thread.sleep(500);
		My_Info_Page_Object.DOB.clear();
		My_Info_Page_Object.DOB.sendKeys("1998-08-18"+Keys.ENTER);
		Thread.sleep(500);
		My_Info_Page_Object.NikeName.clear();
		My_Info_Page_Object.NikeName.sendKeys("ducky");
		Thread.sleep(500);
		My_Info_Page_Object.SmokerCheckBox.click();

		My_Info_Page_Object.MilitaryService.clear();

		My_Info_Page_Object.MilitaryService.sendKeys("A Grade");
		My_Info_Page_Object.Savebtn.click();
		Thread.sleep(500);
	}
	public void bloodType() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(200);
		My_Info_Page_Object.bloodeditBtn.click();
		Select bloodType = new Select(My_Info_Page_Object.bloodType);
		bloodType.selectByValue("B+");
		My_Info_Page_Object.bloodSaveBtn.click();
		Thread.sleep(500);
	}
	@Test
	public void Attachfile() throws  InterruptedException, AWTException {
		myInfo();
		bloodType();
		My_Info_Page_Object.AttachAddbtn.click();
		Thread.sleep(500);
		Actions chossefile=new Actions(driver);
		chossefile.moveToElement(My_Info_Page_Object.Atachchoosefile);
		chossefile.click().build().perform();
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
		robot.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(500);
		My_Info_Page_Object.AttachDescription.sendKeys("This is Puppy");
		chossefile.moveToElement(My_Info_Page_Object.AttachUploadBtn);
		chossefile.click().build().perform();

		Thread.sleep(500);

	}


}
