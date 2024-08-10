package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.Projects_Page_Objects;
import webDriverManager.DriverManager;

public class IndexMenu {
	
	@Given("Browser is launch for test the Projects module")
	public void browserIsLaunchForTestTheProjectsModule() {
	}

	@Given("the aside project main menu clicked")
	public void theAsideProjectMainMenuClicked() throws InterruptedException {
	   Projects_Page_Objects.ProjectsMenu.click();
	   //Thread.sleep(3000);
	}
	@And("now clicked the Project sub menu")
	public void nowClickedTheProjectSubMenu() {
	  Projects_Page_Objects.Projects.click();
	 String visibleText = DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div > div.container-fluid.px-3 > div > div > div.bg-white.w-100.project_account_top_header > div.row.m-0.p-1.project_account_heading > h4")).getText();
	  Assert.assertTrue(visibleText.contains("john"));
	  System.out.println("Visible Text is " + visibleText);
	}
	@Then("Verified the list view is selected")
	public void verifiedTheListViewIsSelected() {
	String List = DriverManager.getDriver().findElement(By.cssSelector("#commontab > li.p_list_menu > a > span.ml-2.tab-text")).getText();
	Assert.assertTrue(List.contains("List"));
	System.out.println("Currently selected view is "+ List);
	 
	}
	@Then("clicked the Board View")
	public void clickedTheBoardView() throws InterruptedException {
	Projects_Page_Objects.BoardView.click();
	String Board =   DriverManager.getDriver().findElement(By.xpath("//*[@id=\"commontab\"]/li[2]/a/span[1]")).getText();
	Assert.assertTrue(Board.contains("Board"));
	System.out.println("Selected view is " + Board);
	Thread.sleep(1500);
	WebElement Board_ListView = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[2]/div[3]/ul/li[2]/ul/li[1]/a/i"));
	Board_ListView.click();
	WebElement NotStarted = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div[1]/h5/a"));
    NotStarted.click();
    Thread.sleep(3000);
    WebElement InProgress = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[2]/div[1]/h5/a"));
    InProgress.click();
    Thread.sleep(3000);
    WebElement Pause = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[3]/div[1]/h5/a"));
	Pause.click();
	Thread.sleep(3000);
	WebElement completed = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[4]/div[1]/h5/a"));
	completed.click();
	Projects_Page_Objects.ListView.click();
	
	Projects_Page_Objects.Filter.click();
	Projects_Page_Objects.Filter_ProjectGroups_DropDown.click();
	DriverManager.getDriver().findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("CRM" + Keys.ENTER);
	Thread.sleep(1500);
	Projects_Page_Objects.Filter_PartyName_DropDown.click();
	DriverManager.getDriver().findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Rex" + Keys.ENTER);
	Projects_Page_Objects.Filter_Status_DropDown.click();
	DriverManager.getDriver().findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("not" + Keys.ENTER);
	Projects_Page_Objects.Filter_Submit.click();
	WebElement FilteredClose = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[3]/a/span[2]/i"));
	FilteredClose.click();
	Projects_Page_Objects.Filter.click();
	Projects_Page_Objects.Filter_Cancel.click();
	
	Projects_Page_Objects.ManageGroups.click();
	Thread.sleep(1500);
    WebElement ManageGroupEditIcon = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[4]/div[1]/div/div/div[2]/div/div/ol/li[1]/div/span[2]/div"));
    ManageGroupEditIcon.click();
    Thread.sleep(1500);
    WebElement groupName = DriverManager.getDriver().findElement(By.id("edit_groupname1"));
    groupName.clear();
    groupName.sendKeys("New Editedd CRM Group");
    WebElement groupcolor = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[4]/div[2]/div[2]"));
    groupcolor.click();
    Thread.sleep(1500);
    WebElement savebtn = DriverManager.getDriver().findElement(By.id("project_group_update"));
    savebtn.click();
    Thread.sleep(1500);
    Projects_Page_Objects.ManageGroups.click();
    Thread.sleep(1500);
    Projects_Page_Objects.ManageGroup_CloseButton.click();
    Thread.sleep(1500);
    Projects_Page_Objects.ManageGroups.click();
    Thread.sleep(1500);
    Projects_Page_Objects.ManageGroup_CloseIcon.click();
    Thread.sleep(1500);
    Projects_Page_Objects.GroupBy.click();
    WebElement Assignee = DriverManager.getDriver().findElement(By.linkText("Assignee"));
    Assignee.click();
    String Assigne = DriverManager.getDriver().findElement(By.id("groupByCategory")).getText();
    Assert.assertTrue(Assigne.contains("Assignee"));
    System.out.println("Selected Group by is" + Assigne);
    Projects_Page_Objects.GroupBy.click();
    Projects_Page_Objects.GroupBy_PopUp_CancelIcon.click();
    Projects_Page_Objects.GroupBy_CloseIcon.click();
    Projects_Page_Objects.Columns.click();
	WebElement Columns_ProjectNo = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[1]/div/div[2]"));
	Columns_ProjectNo.click();
	WebElement Columns_PartyName = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[2]/div/div[2]"));
	Columns_PartyName.click();
	WebElement Columns_ProjectName = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[3]/div/div[2]"));
	Columns_ProjectName.click();
	WebElement Columns_ProjectValue = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[4]/div/div[2]"));
	 Columns_ProjectValue.click();
	 WebElement Columns_ProjectLocation = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[5]/div/div[2]"));
	 Columns_ProjectLocation.click();
	 WebElement Columns_Status = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[6]/div/div[2]"));
	 Columns_Status.click();
	 WebElement Columns_Date = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[7]/div/div[2]"));
	 Columns_Date.click();
	 WebElement Columns_Assignee = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[8]/div/div[2]"));
	 Columns_Assignee.click();
	 WebElement Columns_Followers = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/ul/li[9]/div/div[2]"));
	 Columns_Followers.click();
	 Thread.sleep(2000);
	 WebElement Columns_Restore = DriverManager.getDriver().findElement(By.id("project_accounting_table_restore"));
	 Columns_Restore.click();
	 Thread.sleep(3000);
	 Projects_Page_Objects.Columns.click();
	 
	 //AddGroup:
	 Projects_Page_Objects.AddGroups.click();
	 Projects_Page_Objects.AddGroup_Submit.click();
	 String Errormsg = DriverManager.getDriver().findElement(By.id("project_group_name_error1")).getText();
	 Assert.assertTrue(Errormsg.contains("Required"));
	 System.out.println("Required Message is " +Errormsg);
	 Thread.sleep(2000);
	 Projects_Page_Objects.AddGroup_Cancel.click();
	 Projects_Page_Objects.AddGroups.click();
	 Projects_Page_Objects.AddGroup_Input.sendKeys("New Automated Group");
	 Projects_Page_Objects.AddGroup_Submit.click();
	 
	 Thread.sleep(2000);
	 
	 //Add Project:
	 Projects_Page_Objects.AddProject.click();
	 Thread.sleep(1500);
	 Projects_Page_Objects.Addproject_title.sendKeys("Automated Project");
	 Projects_Page_Objects.AddProject_Group.click();
	 Thread.sleep(2000);
	 Projects_Page_Objects.AddProject_Group_Input.sendKeys("Automated" + Keys.ARROW_DOWN +Keys.ENTER);
	 Projects_Page_Objects.AddProject_Select_Status.click();
	 Projects_Page_Objects.AddProject_Status_Input.sendKeys("In" +Keys.ENTER + Keys.TAB);
	 Thread.sleep(1500);
	 Projects_Page_Objects.AddProject_Project_Quotesd_Value.sendKeys("25000");
	 Projects_Page_Objects.Addproject_Project_location.sendKeys("Manaparai");
	 Projects_Page_Objects.Addproject_Project_code.sendKeys("MPA1001");
	 Projects_Page_Objects.Addproject_Project_description.sendKeys("This is Automated Description for the project");
	 Projects_Page_Objects.AddProject_Assignee.click();
	 Projects_Page_Objects.AddProject_Assignee_Input.sendKeys("john" +Keys.ENTER);
	 Projects_Page_Objects.AddProject_Followers.sendKeys("john" +Keys.ENTER);
	 Projects_Page_Objects.Add_Project_Customer_Name.click();
	 Projects_Page_Objects.Add_Project_CustomerName_Input.sendKeys("john" +Keys.ENTER);
	 Projects_Page_Objects.Add_Project_Save_Btn.click();
	 
	 
	 
	 
	
	}
	
}
