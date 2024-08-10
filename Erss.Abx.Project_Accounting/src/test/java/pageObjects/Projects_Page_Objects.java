package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Projects_Page_Objects {

private static  Projects_Page_Objects ProjectInstance;
	
	private  Projects_Page_Objects(){
	}
	public static Projects_Page_Objects getInstance() {
		
		if(ProjectInstance == null) {
			ProjectInstance = new Projects_Page_Objects();
		}
		return ProjectInstance;
}
	@FindBy (linkText = "Projects")
	public static WebElement ProjectsMenu;
	
	@FindBy (xpath = "/html/body/nav/div[2]/div[1]/ul/li[13]/ul/li[1]/a/span")
	public static WebElement Projects;
	
	@FindBy (xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[1]/a/span[1]")
	public static WebElement ListView;
	
	@FindBy (xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[2]/a/span[1]")
	public static WebElement BoardView;
	
	@FindBy (xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/a/button")
	public static WebElement AddProject ;
	
	@FindBy (xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[3]/a")
	public static WebElement Filter;
	
	@FindBy(xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[3]/div/form/div[1]/div[1]/span/span[1]/span")
	public static WebElement Filter_ProjectGroups_DropDown;
	
	@FindBy(xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[3]/div/form/div[1]/div[2]/span/span[1]/span")
	public static WebElement Filter_PartyName_DropDown;
	
	@FindBy(xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[3]/div/form/div[2]/div[1]/span/span[1]/span")
	public static WebElement Filter_Status_DropDown;
	
	@FindBy(id = "reportrange")
	public static WebElement Filters_DateFilter;
	
	@FindBy(id = "project_filter_submit")
	public static WebElement Filter_Submit;
	
	@FindBy(id = "project_filter_cancel")
	public static WebElement Filter_Cancel;
	
	@FindBy(id = "closeicon")
	public static WebElement Filter_CloseIcon;
	
	@FindBy(xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[4]")
	public static WebElement ManageGroups;
	
	@FindBy(xpath = "//*[@id=\"manage_list\"]/div/div/div[2]/div/div/ol/li[1]/div/span[2]/div")
	public static WebElement ManageGroup_EditIcon;
	
	@FindBy(id = "edit_groupname1")
	public static WebElement Edit_GroupName;
	
	@FindBy(id = "project_group_update")
	public static WebElement EditGroup_Save;
	
	@FindBy(id = "project_group_cancel")
	public static WebElement EditGroup_Cancel;
	
	@FindBy(id = "manage_list_cancel")
	public static WebElement ManageGroup_CloseButton;
	
	@FindBy(xpath = "//*[@id=\"manage_list\"]/div/div/div[1]/button")
	public static WebElement ManageGroup_CloseIcon;
	
	@FindBy(id = "manage_submit")
	public static WebElement ManageGroup_SaveButton;
	
	@FindBy(xpath = "//*[@id=\"manage_list\"]/div/div/div[1]/button")
	public static WebElement ManageGroup_cancelButton;

	@FindBy (xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[1]/ul/li[5]/a/span[1]")
	public static WebElement GroupBy;
	
	@FindBy(id = "project_groupby_cancel")
	public static WebElement GroupBy_PopUp_CancelIcon;
	
	@FindBy(id = "groupby_close_icon")
	public static WebElement GroupBy_CloseIcon;
	
	@FindBy (xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/ul/li/a/span")
	public static WebElement Columns;
	
	@FindBy (xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/a[1]")
	public static WebElement AddGroups;
	
	@FindBy (id = "new_groupname1")
	public static WebElement AddGroup_Input;

	@FindBy (id = "project_group_submit1")
	public static WebElement AddGroup_Submit;
	
	@FindBy (id = "employment_cancel1")
	public static WebElement AddGroup_Cancel;
	
	@FindBy (xpath = "/html/body/div[2]/div[5]/div/div[2]/div/div/div[1]/ul/li[2]/a[2]")
	public static WebElement AddProjects;
	
	@FindBy (id = "project_title")
	public static WebElement Addproject_title;
	
	@FindBy (id = "select2-project_group_name-container")
	public static WebElement AddProject_Group;
	

	@FindBy (id = "select2-project_group_name-result-23zt-addnew")
	public static WebElement AddProject_Group_AddNew;
	

	@FindBy (xpath = "/html/body/span/span/span[1]/input")
	public static WebElement AddProject_Group_Input;
	

	@FindBy (id = "project_group_submit_modal")
	public static WebElement AddProject_Group_Savebtn;
	

	@FindBy (className = "group_cancel_modal")
	public static WebElement AddProject_Group_Cancel_btn;
	

	@FindBy (id = "select2-status0-container")
	public static WebElement AddProject_Select_Status;
	
	@FindBy (xpath = "/html/body/span/span/span[1]/input")
	public static WebElement AddProject_Status_Input;
	
	@FindBy (xpath = "/html/body/div[2]/div[6]/div/div/div[5]/div[1]/div/div/div[2]/form/div[1]/div[1]/div[2]/div/div[6]/div/input")
	public static WebElement AddProject_Project_Quotesd_Value;
	
	@FindBy (xpath = "/html/body/div[2]/div[6]/div/div/div[5]/div[1]/div/div/div[2]/form/div[1]/div[1]/div[2]/div/div[7]/div/input")
	public static WebElement Addproject_Project_location;
	
	@FindBy (xpath = "/html/body/div[2]/div[6]/div/div/div[5]/div[1]/div/div/div[2]/form/div[1]/div[1]/div[2]/div/div[8]/div/input")
	public static WebElement Addproject_Project_code;
	
	@FindBy (id = "project_description")
	public static WebElement Addproject_Project_description;
	
	@FindBy (id = "select2-project_assignee-container")
	public static WebElement  AddProject_Assignee;
	
	@FindBy (xpath = "/html/body/span/span/span[1]/input")
	public static WebElement AddProject_Assignee_Input;
	
	@FindBy (xpath = "select2-project_assignee-result-mfgs-addnew")
	public static WebElement AddProject_Assignee_AddNew;
	
	@FindBy (id = "employee_details_cancel")
	public static WebElement Emp_CancelBtn;
	
	@FindBy (xpath = "//*[@id=\"project_form\"]/div[1]/div[2]/div[2]/div/div[4]/div/span/span[1]/span/ul/li/input")
	public static WebElement AddProject_Followers;
	
	@FindBy (id = "warehouse_add")
	public static WebElement Create_warehouse;
	
	@FindBy (id = "select2-plant_id-container")
	public static WebElement AddWarehouse_Plant;
	
	@FindBy (id = "select2-plant_id-results")
	public static WebElement  AddWarehouse_Plant_Addnew;
	
	@FindBy (id = "add_new_plant_details")
	public static WebElement add_new_plant;
	
	@FindBy (id = "plant_name")
	public static WebElement plant_name_Input;
	
	@FindBy (id = "select2-warehouse_id-container")
	public static WebElement SelectWareHouse;
	
	@FindBy (xpath = "/html/body/span/span/span[1]/input")
	public static WebElement SelectWareHouse_Input;
	
	@FindBy (id = "bin_code")
	public static WebElement bin_code;
	
	@FindBy (id = "bin_name")
	public static WebElement bin_name;
	
	@FindBy(id = "default_status")
	public static WebElement default_status_CheckBox;
	
	@FindBy (id = "plant_submit")
	public static WebElement plant_submit_btn;
	
	@FindBy (id = "cancel_plant_add_details")
	public static WebElement plant_Cancel_btn;
	
	@FindBy (id = "stock_select")
	public static WebElement StockTransferBasedInvoice;
	
	@FindBy (id = "select2-project_customer-container")
	public static WebElement Add_Project_Customer_Name;
	
	@FindBy (xpath = "/html/body/span/span/span[1]/input")
	public static WebElement Add_Project_CustomerName_Input;
	
	@FindBy (id = "customer_phone_no")
	public static WebElement Add_Project_Phone_Number_Input;
	
	@FindBy (id = "contact_no_one")
	public static WebElement Add_Project_CallerNo_Input;
	
	@FindBy (name = "customer_address")
	public static WebElement Add_Project_customer_address;
	
	@FindBy (id = "select2-party_country-container")
	public static WebElement Add_Project_Country;
	
	@FindBy (xpath = "/html/body/span/span/span[1]/input")
	public static WebElement Add_Project_Country_Input;
	
	@FindBy (id = "select2-party_state-container")
	public static WebElement Add_Project_State;
	
	@FindBy (xpath = "/html/body/span/span/span[1]/input")
	public static WebElement Add_Project_State_Input;
	
	@FindBy (id = "select2-party_city-container")
	public static WebElement Add_Project_City;
	
	@FindBy (xpath = "/html/body/span/span/span[1]/input")
	public static WebElement Add_Project_City_Input;
	
	@FindBy (id = "party_zipcode")
	public static WebElement Add_Project_Pincode;
	
	@FindBy (id = "project_clear")
	public static WebElement Add_Project_Clear_Btn;
	
	@FindBy (id = "project_submit")
	public static WebElement Add_Project_Save_Btn;
	
	@FindBy (id = "add_sales_close")
	public static WebElement Add_Project_Close_Icon;
	
}
