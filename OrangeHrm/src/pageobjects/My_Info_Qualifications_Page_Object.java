package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Info_Qualifications_Page_Object {

	@FindBy(xpath = "//*[@id=\"menu_pim_viewMyDetails\"]/b")
	public static WebElement Myinfo;
	
	@FindBy(xpath = "//*[@id=\"sidenav\"]/li[10]/a")
	public static WebElement Qualifications;
	
	@FindBy(id="addWorkExperience")
	public static WebElement WorkExperienceAddBtn;

	@FindBy(id = "experience_employer")
	public static WebElement Company;

	@FindBy(id="experience_jobtitle")
	public static WebElement JobTitle;

	@FindBy(id="experience_from_date")
	public static WebElement experianceFromDate;
	
	@FindBy(id = "experience_to_date")
	public static WebElement ExperianceToDate;

	@FindBy(id="experience_comments")
	public static WebElement WorkExperianceComments;

	@FindBy(id="btnWorkExpSave")
	public static WebElement WorkExperianceSaveBtn;

	@FindBy(id="addEducation")
	public static WebElement AddEducation;

	@FindBy(id="education_code")
	public static WebElement EducationLevel;

	@FindBy(id="education_institute")
	public static WebElement EducationInstitute;

	@FindBy(id="education_major")
	public static WebElement EducationMajor;

	@FindBy(id="education_year")
	public static WebElement EducationYear;

	@FindBy(id="education_gpa")
	public static WebElement GpaScore;
	
	@FindBy(id = "education_start_date")
	public static WebElement EducationStartData;
	
	@FindBy(id = "education_end_date")
	public static WebElement EducationEndDate;
	
	@FindBy(id = "btnEducationSave")
	public static WebElement EduactionSaveBtn;
	
	@FindBy(id = "addSkill")
	public static WebElement AddSkillBtn;
	
	@FindBy(id = "skill_code")
	public static WebElement Skill;

	
	@FindBy(id = "skill_years_of_exp")
	public static WebElement SkillExperiance;

	
	@FindBy(id = "skill_comments")
	public static WebElement SkillComments;

	
	@FindBy(id = "btnSkillSave")
	public static WebElement SkillSaveBtn;

	
	@FindBy(id = "addLanguage")
	public static WebElement AddLanguage;

	
	@FindBy(id = "language_code")
	public static WebElement Language;

	
	@FindBy(id = "language_lang_type")
	public static WebElement LanguageFluence;

	@FindBy(id = "language_competency")
	public static WebElement LanguageCompatency;
	
	@FindBy(id = "language_comments")
	public static WebElement LanguageComments;
	
	@FindBy(id = "btnLanguageSave")
	public static WebElement LanguageSaveBtn;
	
	@FindBy(id = "addLicense")
	public static WebElement AddLicence;
	
	@FindBy(id = "license_code")
	public static WebElement LicenceType;
	
	@FindBy(id = "license_license_no")
	public static WebElement LicenceNo;
	
	@FindBy(id = "license_date")
	public static WebElement LicenceIssueDate;
	
	@FindBy(id = "license_renewal_date")
	public static WebElement LicenceExpiryData;
	
	@FindBy(id = "btnLicenseSave")
	public static WebElement LiceneSaveBtn;
	
	@FindBy(id = "btnAddAttachment")
	public static WebElement AddAttachements;
	
	@FindBy(id = "ufile")
	public static WebElement FileChoose;
	
	@FindBy(id = "txtAttDesc")
	public static WebElement AddAttachmentComments;
	
	@FindBy(id = "btnSaveAttachment")
	public static WebElement AddAttachementuploadbtn;
}
