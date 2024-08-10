package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageobjects.Work_Shifts_Page_Object;

public class Work_Shifts extends CommonFunctions{

	@Test
	public void workshifts() throws InterruptedException {

		PageFactory.initElements(driver, Work_Shifts_Page_Object.class);

		Actions actions = new Actions(driver);
		actions.moveToElement(Work_Shifts_Page_Object.Admin);
		actions.moveToElement(Work_Shifts_Page_Object.job);
		actions.moveToElement(Work_Shifts_Page_Object.WordShifts);
		actions.click().build().perform();

		Work_Shifts_Page_Object.addbtn.click();
	 Thread.sleep(500);
		Work_Shifts_Page_Object.ShiftName.sendKeys("Geral and OT");
		 Thread.sleep(500);
		Work_Shifts_Page_Object.hoursFrom.click();
		 Thread.sleep(500);
		Select fromselect = new Select(Work_Shifts_Page_Object.hoursFrom);
		fromselect.selectByIndex(20);
		
		//actions.click().build().perform();
		Work_Shifts_Page_Object.hoursTo.click();
		Select toselects = new Select(Work_Shifts_Page_Object.hoursTo);
		toselects.selectByIndex(30);
		actions.click().build().perform();
	
		Select availemp=new Select(Work_Shifts_Page_Object.availablemp);
		//availemp.selectByValue("5");
		actions.keyDown(Keys.CONTROL);
		availemp.selectByIndex(1);
		availemp.selectByIndex(2);
		availemp.selectByIndex(3);
		availemp.selectByIndex(4);
		availemp.selectByIndex(5);
		//Thread.sleep(500);
		Work_Shifts_Page_Object.Addemp.click();
		 Thread.sleep(500);
		//Select removemp= new Select(Work_Shifts_Page_Object.emplist);
		//actions.keyDown(Keys.CONTROL);
		//removemp.selectByIndex(0);
		//Work_Shifts_Page_Object.removemp.click();
		Work_Shifts_Page_Object.savebtn.click();
		Thread.sleep(1000);
	}
}
