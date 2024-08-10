package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllMenuLinks_pageObjects {

private static AllMenuLinks_pageObjects AllMenuLinksInstance;
	
	private AllMenuLinks_pageObjects(){
	}
	public static AllMenuLinks_pageObjects getInstance() {
		
		if(AllMenuLinksInstance==null) {
			AllMenuLinksInstance = new AllMenuLinks_pageObjects();
		}
		return AllMenuLinksInstance;
	}
	
//Dash board:
	@FindBy(linkText = "Dashboard")
	public static WebElement DashboardMenu;
	
	@FindBy(linkText = "Shortcut Menu")
	public static WebElement ShortcutMenu;
	
	@FindBy(xpath = "/html/body/nav/div[2]/div[1]/ul/li[1]/ul/li[2]/a/span")
	public static WebElement Dashboard;
	
//CRM:
	
	@FindBy(linkText = "CRM")
	public static WebElement CRM;
	
//PMS:
	
	@FindBy(linkText = "PMS")
	public static WebElement PMS;
	
//Reminders:
	
	@FindBy(linkText = "Reminders")
	public static WebElement Reminders;
	
	@FindBy(xpath = "/html/body/nav/div[2]/div[1]/ul/li[4]/ul/li[1]/a/span")
	public static WebElement RemindersDashboard;
	
	@FindBy(linkText = "General Reminders")
	public static WebElement GeneralReminders;
	
//Purchase:	
	@FindBy(linkText = "Purchases")
	public static WebElement Purchase;
	
	@FindBy(linkText = "Vendors")
	public static WebElement Vendors;
	
	@FindBy(linkText = "Multi Vendor PO")
	public static WebElement MultiVendorPO;
	
	@FindBy(linkText = "Purchase Orders")
	public static WebElement PurchaseOrders;
	
	@FindBy(linkText = "Purchase Bills")
	public static WebElement PurchaseBill;
	
	@FindBy(linkText = "Barcode (Bills)")
	public static WebElement BarcodeBills;
	
	@FindBy(linkText = "Barcode (Products)")
	public static WebElement BarcodeProducts;
	
	@FindBy(linkText = "Pay Bills")
	public static WebElement PayBills;
	
	@FindBy(linkText = "Debit Notes")
	public static WebElement  DebitNotes;
	
//Sales:
	
	@FindBy(linkText = "Sales")
	public static WebElement Sales;
	
	@FindBy(linkText = "Customers")
	public static WebElement Customers;
	
	@FindBy(linkText = "Estimates")
	public static WebElement Estimates;
	
	@FindBy(linkText = "Sales Orders")
	public static WebElement SalesOrder;
	
	@FindBy(linkText = "Sales Invoices")
	public static WebElement SalesInvoice;
	
	@FindBy(linkText = "Sales Receipts")
	public static WebElement SalesReceipts;
	
	@FindBy(linkText = "Credit Notes")
	public static WebElement CreditNotes;
	
	@FindBy(linkText = "Agent Collections")
	public static WebElement AgentCollections;
	
	@FindBy(linkText = "My Collections")
	public static WebElement MyCollections;
	
//Subscription:
	@FindBy(linkText = "Subscription")
	public static WebElement Subscription;
	
	@FindBy(linkText = "Subscription Products")
	public static WebElement SubscriptionProducts;
	
	@FindBy(linkText = "Subscriptions")
	public static WebElement Subscriptions;
	
	@FindBy(linkText = "Invoices")
	public static WebElement Invoices;
	
	
//Services:
	@FindBy(linkText = "Services")
	public static WebElement Services;
			
	@FindBy(linkText = "AMC & LMC")
	public static WebElement AMCLMC;
	
//Products:	
	
	@FindBy(linkText = "Products")
	public static WebElement ProductsMenu;
	
	@FindBy(xpath = "//*[@id=\"mainMenu\"]/li[9]/ul/li[1]/a/span")
	public static WebElement Products;
	
	@FindBy(linkText = "Make Orders")
	public static WebElement MakeOrders;
	
	@FindBy(linkText = "Operation Template")
	public static WebElement OperationTemplate;
	
	
//Expenses:	
	@FindBy(linkText = "Expenses")
	public static WebElement Expenses;
	
	@FindBy(linkText = "Expense Bills")
	public static WebElement ExpenseBill;
	
	@FindBy(linkText = "Pay Expenses")
	public static WebElement ExpensePayments;
	
	@FindBy(linkText = "Recurring Expense")
	public static WebElement RecurringExpense;
	
//Jobs:
	
	@FindBy(linkText = "Jobs")
	public static WebElement JobsMenu;
	
	@FindBy(linkText = "Projects")
	public static WebElement Projects;
	
	@FindBy(xpath = "/html/body/nav/div[2]/div[1]/ul/li[11]/ul/li[2]")
	public static WebElement SJ;
	
	@FindBy(linkText = "Service Jobs")
	public static WebElement ServiceJobs;
	
//DeliveryChallan:
	
	@FindBy(linkText = "Delivery Challans")
	public static WebElement DeliveryChallan;
	
//Banking:
	@FindBy(linkText = "Banking")
	public static WebElement BankingMenu;
	
	@FindBy(linkText = "Bank & Cash")
	public static WebElement BankandCash;
	
	@FindBy(linkText = "Transfer(Contra)")
	public static WebElement TransferContra;
	
	@FindBy(linkText = "Owner Equity")
	public static WebElement OwnerEquity;
	
//Accounts:
	@FindBy(linkText = "Accounts")
	public static WebElement Accounts;
	
	@FindBy(linkText = "Chart of Accounts")
	public static WebElement ChartofAccounts;
	
	@FindBy(linkText = "Account Journals")
	public static WebElement AccountJournals;
	
	@FindBy(linkText = "Manual Journals")
	public static WebElement ManualJournals;
	
//Stocks:	
	@FindBy(linkText = "Stocks")
	public static WebElement Stocks;
	
	@FindBy(linkText = "Stock Transfer")
	public static WebElement StockTransfer;
	
	@FindBy(linkText = "Opening Stock")
	public static WebElement OpeningStock;
	
//Timesheets:
	
	@FindBy(linkText = "Timesheets")
	public static WebElement Timesheets;

//Report:
	@FindBy(linkText = "Reports")
	public static WebElement Report;
	
//Employee:	
	@FindBy(xpath = "/html/body/nav/div[2]/div[1]/ul/li[18]/a")
	public static WebElement EmployeeMenu;
	
	@FindBy(xpath = "/html/body/nav/div[2]/div[1]/ul/li[18]/ul/li[1]/a/span")
	public static WebElement Employee; 
	
	@FindBy(linkText = "Employee Salaries")
	public static WebElement EmployeeSalaries;
	
	@FindBy(linkText = "Employee Shift")
	public static WebElement EmployeeShift;
	
	@FindBy(linkText = "Labour Wages")
	public static WebElement LabourWages;
	
	@FindBy(xpath = "/html/body/nav/div[2]/div[1]/ul/li[17]/ul/li[5]/a/span")
	public static WebElement EmpManualJournal;

// TCS | TDS 	
	@FindBy(linkText = "TCS | TDS")
	public static WebElement TCSTDS;
	
	@FindBy(linkText = "TDS Payment")
	public static WebElement TDSPayment;
	
	@FindBy(linkText = "TCS Payment")
	public static WebElement TCSPayment;
	
//GSTR Filling	
	@FindBy(linkText = "GSTR Filling")
	public static WebElement GSTRFilling;
	
	@FindBy(linkText = "Settings")
	public static WebElement Settings;
	
//PinMenuIcon
	@FindBy(id = "slidebtn")
	public static WebElement PinmenuIcon;

}
