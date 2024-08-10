package testcases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageobjects.Pay_Grades_Page_Object;

public class Add_Pay_Grades extends CommonFunctions {

	@Test
	public void paygrades() throws InterruptedException {

		PageFactory.initElements(driver, Pay_Grades_Page_Object.class);

		Actions actions = new Actions(driver);
		actions.moveToElement(Pay_Grades_Page_Object.Admin);
		actions.moveToElement(Pay_Grades_Page_Object.job);
		actions.moveToElement(Pay_Grades_Page_Object.paygrades);
		actions.click().build().perform();

		Pay_Grades_Page_Object.Addbtn.click();
		Thread.sleep(500);
		Pay_Grades_Page_Object.paygradename.sendKeys("Deees");
		Thread.sleep(500);
		Pay_Grades_Page_Object.btnsave.click();
		Thread.sleep(500);
		Pay_Grades_Page_Object.Addcurrancy.click();
		Thread.sleep(500);
		Pay_Grades_Page_Object.currancyName.sendKeys("All");
		Thread.sleep(500);
		Pay_Grades_Page_Object.currancylist.click();
		Thread.sleep(500);
		Pay_Grades_Page_Object.minimumSalary.sendKeys("1500");
		Thread.sleep(500);
		Pay_Grades_Page_Object.maximumSalary.sendKeys("1700");
		Thread.sleep(500);
		Pay_Grades_Page_Object.Addcurrancysave.click();
		Thread.sleep(500);
	}

}
