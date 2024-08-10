package testcases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunctions.CommonFunctions;
import pageobjects.Add_Job_Titles_Page_Object;

public class Add_Job_Titles extends CommonFunctions{

	@Test
	public void job() throws InterruptedException {

		PageFactory.initElements(driver, Add_Job_Titles_Page_Object.class);

		Actions actions = new Actions(driver);
		actions.moveToElement(Add_Job_Titles_Page_Object.Admin);
		Thread.sleep(500);
		actions.moveToElement(Add_Job_Titles_Page_Object.job);
		Thread.sleep(500);
		actions.moveToElement(Add_Job_Titles_Page_Object.jobTitles);
		actions.click().build().perform();

		//Add:

		Add_Job_Titles_Page_Object.add.click();
		Thread.sleep(500);
		Add_Job_Titles_Page_Object.jobTitle.sendKeys("Tester");
		Thread.sleep(500);
		Add_Job_Titles_Page_Object.jobDescribtion.sendKeys("JavaTester");
		Thread.sleep(500);
		Add_Job_Titles_Page_Object.save.click();

		//Delete:

		//Add_Job_Titles_Page_Object.selectable.click();
		//Add_Job_Titles_Page_Object.delete.click();
		//Add_Job_Titles_Page_Object.diologebox.click();

	}
}
