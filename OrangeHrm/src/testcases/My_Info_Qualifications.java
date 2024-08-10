package testcases;

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
import pageobjects.My_Info_Qualifications_Page_Object;

public class My_Info_Qualifications extends CommonFunctions{

	@Test
	public void Qualifications() throws InterruptedException, AWTException  {

		PageFactory.initElements(driver, My_Info_Qualifications_Page_Object.class);

		My_Info_Qualifications_Page_Object.Myinfo.click();
		My_Info_Qualifications_Page_Object.Qualifications.click();


		My_Info_Qualifications_Page_Object.WorkExperienceAddBtn.click();
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.Company.sendKeys("Elroi Software Solutions");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.JobTitle.sendKeys("QA");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.experianceFromDate.clear();
		My_Info_Qualifications_Page_Object.experianceFromDate.sendKeys("2021-03-03");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.ExperianceToDate.clear();
		My_Info_Qualifications_Page_Object.ExperianceToDate.sendKeys("2022-04-20");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.WorkExperianceComments.sendKeys("abcdeddfgdf");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.WorkExperianceSaveBtn.click();
		 Thread.sleep(500);


		My_Info_Qualifications_Page_Object.AddEducation.click();
		 Thread.sleep(500);
		Select educationlevel = new Select(My_Info_Qualifications_Page_Object.EducationLevel);
		educationlevel.selectByValue("3");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.EducationInstitute.sendKeys("JMC");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.EducationMajor.sendKeys("MCA");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.EducationYear.sendKeys("2020");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.GpaScore.sendKeys("75");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.EducationStartData.clear();
		My_Info_Qualifications_Page_Object.EducationStartData.sendKeys("2018-04-10");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.EducationEndDate.clear();
		My_Info_Qualifications_Page_Object.EducationEndDate.sendKeys("2020-04-08");
	 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.EduactionSaveBtn.click();
		 Thread.sleep(500);


		My_Info_Qualifications_Page_Object.AddSkillBtn.click();
		 Thread.sleep(500);
		Select skill = new Select(My_Info_Qualifications_Page_Object.Skill);
		skill.selectByValue("2");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.SkillExperiance.sendKeys("2");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.SkillComments.sendKeys("asdasfsdgfdg");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.SkillSaveBtn.click();
		 Thread.sleep(500);


		My_Info_Qualifications_Page_Object.AddLanguage.click();
		 Thread.sleep(500);
		Select language = new Select(My_Info_Qualifications_Page_Object.Language);
		language.selectByValue("2");
		 Thread.sleep(500);
		Select fluency = new Select(My_Info_Qualifications_Page_Object.LanguageFluence);
		fluency.selectByValue("2");
		 Thread.sleep(500);
		Select competency = new Select(My_Info_Qualifications_Page_Object.LanguageCompatency);
		competency.selectByValue("2");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.LanguageComments.sendKeys("asdfsdfsf");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.LanguageSaveBtn.click();
		 Thread.sleep(500);


		My_Info_Qualifications_Page_Object.AddLicence.click();
		 Thread.sleep(500);
		Select licenceType = new Select(My_Info_Qualifications_Page_Object.LicenceType);
		licenceType.selectByValue("2");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.LicenceNo.sendKeys("1234654654");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.LicenceIssueDate.clear();
		My_Info_Qualifications_Page_Object.LicenceIssueDate.sendKeys("2013-04-17");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.LicenceExpiryData.clear();
		My_Info_Qualifications_Page_Object.LicenceExpiryData.sendKeys("2055-07-09");
		 Thread.sleep(500);
		My_Info_Qualifications_Page_Object.LiceneSaveBtn.click();
		 Thread.sleep(500);


		My_Info_Qualifications_Page_Object.AddAttachements.click();
		 Thread.sleep(500);
		Actions chosefile = new Actions(driver);
		chosefile.moveToElement(My_Info_Qualifications_Page_Object.FileChoose);
		chosefile.click().build().perform();
		Thread.sleep(300);
		StringSelection string = new StringSelection("C:\\New folder\\Downloads files\\puppy.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(300);
		My_Info_Qualifications_Page_Object.AddAttachmentComments.sendKeys("sdfgsdfg");
		 Thread.sleep(500);
		Actions upload = new Actions(driver);
		upload.moveToElement(My_Info_Qualifications_Page_Object.AddAttachementuploadbtn);
		upload.click().build().perform();
		Thread.sleep(500);

	}
}
