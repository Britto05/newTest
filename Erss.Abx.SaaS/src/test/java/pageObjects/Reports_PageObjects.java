package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Reports_PageObjects {

	private static Reports_PageObjects ReportLinkInstance;
	private Reports_PageObjects() {
	}
	public static Reports_PageObjects getInstnce() {
		if(ReportLinkInstance==null) {
			ReportLinkInstance = new Reports_PageObjects();
		}
		
		return ReportLinkInstance;
		
	}

	//ACCOUNT REPORTS
	
			@FindBy(linkText = "Balance Sheet")
			public static WebElement  Balance_Sheet;
			
			@FindBy(linkText = "Profit & Loss")
			public static WebElement  ProfitAndLoss;
			
			@FindBy(linkText = "Trial Balance")
			public static WebElement  Trial_Balance;
			
			@FindBy(linkText = "Journal Report")
			public static WebElement Journal_Report;
			
			@FindBy(linkText = "Daybook")
			public static WebElement Daybook;
			
			@FindBy(linkText = "Daybook Lite")
			public static WebElement DaybookLite;
			
			@FindBy(linkText = "Customer Balance")
			public static WebElement Customer_Balance;
			
			@FindBy(linkText = "Account Receivables")
			public static WebElement  AccountReceivables;
			
			@FindBy(linkText = "AR Aging Summary Report")
			public static WebElement ARAgingSummaryReport;
			
			@FindBy(linkText = "AR Aging Details Report")
			public static WebElement AccountReceivablesAgingDetailsReport;
			
			@FindBy(linkText = "Vendor Balance")
			public static WebElement Vendor_Balance;
			
			@FindBy(linkText = "Account Payables")
			public static WebElement AccountPayables;
			
			@FindBy(linkText = "AP Aging Summary Report")
			public static WebElement APAgingSummaryReport;
			
			@FindBy(linkText = "AP Aging Details Report")
			public static WebElement AccountPayablesAgingDetailsReport;
			
			@FindBy(linkText = "Customer Details Report")
			public static WebElement CustomerDetailsReport;
			
			@FindBy(linkText = "Owner Equity")
			public static WebElement Owner_Equity;
			
		//SALES REPORTS:
			
			@FindBy(linkText = "Sales Invoice")
			public static WebElement SalesInvoiceReport;

			@FindBy(linkText = "Sales Invoice - Cancelled")
			public static WebElement SalesInvoiceCancelled;
			
			@FindBy(linkText = "Sales Invoice - Details")
			public static WebElement SalesInvoiceDetails;
			
			@FindBy(linkText = "Quotes Bills")
			public static WebElement QuotesBills;
			
			@FindBy(linkText = "Sales Invoice Overdue")
			public static WebElement SalesInvoiceOverdue;
			
			@FindBy(linkText = "Sales Invoice Report - Referral")
			public static WebElement SalesInvoiceReportReferral;
			
			@FindBy(linkText = "Sales Invoice Report - SalesPerson")
			public static WebElement SalesInvoiceReportSalesPerson;
			
			@FindBy(linkText = "Sales Quantity Report - SalesPerson")
			public static WebElement SalesQuantityReportSalesPerson;
			
			@FindBy(linkText = "Reward Points")
			public static WebElement RewardPoints;
			
			@FindBy(linkText = "Agent Collections")
			public static WebElement AgentCollections;
			
			@FindBy(linkText = "Sales Orders")
			public static WebElement SalesOrders;
			
			@FindBy(linkText = "Credit Note Report")
			public static WebElement CreditNoteReport;
			
			@FindBy(linkText = "Quotes to Sales Order Comparison")
			public static WebElement QuotestoSalesOrderComparison;
			
			@FindBy(linkText = "Sales Order to Sales Invoice Comparison")
			public static WebElement SalesOrdertoSalesInvoiceComparison;
			
			@FindBy(linkText = "Amc Lmc Report")
			public static WebElement AmcLmcReport;
			
			@FindBy(linkText = "Coupon Based Sales Report")
			public static WebElement CouponBasedSalesReport;
			
			@FindBy(linkText = "Sales Receipt - Sales Person Report")
			public static WebElement SalesReceiptSalesPersonReport;
			
			@FindBy(linkText = "Sales Receipt - Cheque Bounce Report")
			public static WebElement SalesReceiptChequeBounceReport;
			
			@FindBy(linkText = "Sales Invoice Warranty Report")
			public static WebElement SalesInvoiceWarrantyReport;
			
			@FindBy(linkText = "Sales Invoice Extended Warranty Report")
			public static WebElement SalesInvoiceExtendedWarrantyReport;
			
			@FindBy(linkText = "Products Service Reports")
			public static WebElement ProductsServiceReports;
			
		//PRODUCTS REPORTS
			
			@FindBy(linkText = "Inventory Valuation Summary")
			public static WebElement InventoryValuationSummary;
			
			@FindBy(linkText = "Stock Report")
			public static WebElement StockReport;
			
			@FindBy(linkText = "Stock Report Multi Uoms")
			public static WebElement StockReportMultiUoms;
			
			@FindBy(linkText = "Stock Report details view")
			public static WebElement StockReportdetailsview;
			
			@FindBy(linkText = "Stock History Report")
			public static WebElement StockHistoryReport;
			
			@FindBy(linkText = "Stock Transfer Report")
			public static WebElement StockTransferReport;
			
			@FindBy(linkText = "Global Search")
			public static WebElement GlobalSearch;
			
			@FindBy(linkText = "Less Stock Notifications")
			public static WebElement LessStockNotifications;
			
			@FindBy(linkText = "Minimum Purchase Requirement Report")
			public static WebElement MinimumPurchaseRequirementReport;
			
			@FindBy(linkText = "Sales Summary")
			public static WebElement SalesSummary;
			
			@FindBy(linkText = "Product Based Stock")
			public static WebElement ProductBasedStock;
			
			@FindBy(linkText = "Stock Checking")
			public static WebElement StockChecking;
			
			@FindBy(linkText = "Stock Check Report")
			public static WebElement StockCheckReport;
			
			@FindBy(linkText = "HSN/SAC Summary")
			public static WebElement HSNSACSummary;
			
			@FindBy(linkText = "Product Based On Sale Type Report")
			public static WebElement ProductBasedOnSaleTypeReport;
			
			@FindBy(linkText = "Product Batch Based Report")
			public static WebElement ProductBatchBasedReport;
			
			@FindBy(linkText = "Product Based Profit")
			public static WebElement ProductBasedProfit;
			
			@FindBy(linkText = "BOM Report")
			public static WebElement BOMReport;
			
			
		//PURCHASE REPORTS:
			
			@FindBy(linkText = "Purchase Order")
			public static WebElement PurchaseOrder;
			
			@FindBy(linkText = "Purchase Invoice")
			public static WebElement PurchaseInvoice;
			
			@FindBy(linkText = "Purchase Overdue")
			public static WebElement PurchaseOverdue;
			
			@FindBy(linkText = "Purchase Order - Details")
			public static WebElement PurchaseOrderDetails;
			
			@FindBy(linkText = "Purchase Invoice - Details")
			public static WebElement PurchaseInvoiceDetails;
			
			@FindBy(linkText = "Debit Note Report")
			public static WebElement DebitNoteReport;
			
			@FindBy(linkText = "Pay Bill - Cheque Bounce Report")
			public static WebElement PayBillChequeBounceReport;
			
		//GSTR REPORTS:
			
			@FindBy(linkText = "GSTR1 - SalesInvoice")
			public static WebElement GSTR1SalesInvoice;
			
			@FindBy(linkText = "GSTR1 - Detailed")
			public static WebElement GSTR1Detailed;
			
			@FindBy(linkText = "GSTR2B - PurchaseInvoice")
			public static WebElement GSTR2PurchaseInvoice;
			
			@FindBy(linkText = "GSTR3B")
			public static WebElement GSTR3B;
			
		//PURCHASE & SALES HISTORY:
			
			@FindBy(linkText = "Sales & Purchase Comparison")
			public static WebElement SalesPurchaseComparison;
			
			@FindBy(linkText = "Purchase & Sales Month Based")
			public static WebElement PurchaseSalesMonthBased;
			
			@FindBy(linkText = "Date Based Purchase & Sales")
			public static WebElement DateBasedPurchaseSales;
			
			@FindBy(linkText = "Per Day Based Stock")
			public static WebElement PerDayBasedStock;
			
		//EXPENSE REPORTS:
			@FindBy(linkText = "Expense Bill - Details")
			public static WebElement ExpenseBillDetails;
			
			@FindBy(linkText = "Expense Payments Report")
			public static WebElement ExpenseReport;
			
			@FindBy(linkText = "Expense Summary")
			public static WebElement ExpenseSummary;
			
		//AUDIT LOGS:	
			
			@FindBy(linkText = "Sales Receipts Logs")
			public static WebElement SalesReceiptsLogs;
			
			@FindBy(linkText = "Activity Logs & Audit Trail")
			public static WebElement ActivityLogsAuditTrail;
			
		//MESSAGES:
			
			@FindBy(linkText = "Message History")
			public static WebElement MessageHistory;
			
		//EMPLOYEE REPORT:
			
			@FindBy(linkText = "Employee Profile")
			public static WebElement EmployeeProfile;
			
			@FindBy(linkText = "Employee Salary Report")
			public static WebElement EmployeeSalaryReport;
			
			@FindBy(linkText = "Daily Wage Report")
			public static WebElement DailyWageReport;
			
		//PARTIES REPORT:
			
			@FindBy(linkText = "Parties Profiles")
			public static WebElement PartiesProfiles;
			
			@FindBy(linkText = "Parties Profiles Report - Details")
			public static WebElement PartiesProfilesReportDetails;
		//ATTENDANCE REPORT:	
			
			@FindBy(linkText = "Daily Attendance")
			public static WebElement DailyAttendance;
			
			@FindBy(linkText = "Monthly Attendance")
			public static WebElement MonthlyAttendance;
			
			@FindBy(linkText = "Periodic Attendance")
			public static WebElement PeriodicAttendance;
			
			@FindBy(linkText = "Daily In-Out Details")
			public static WebElement DailyIn_OutDetails;
			
			@FindBy(linkText = "Month In-Out Details")
			public static WebElement MonthInOutDetails;
			
		//SUMMARY REPORTS:
			
			@FindBy(linkText = "Expense Payable")
			public static WebElement ExpensePayable;
			
			@FindBy(linkText = "Cost of Sales")
			public static WebElement CostofSales;
			
			@FindBy(linkText = "Inventory Assets")
			public static WebElement InventoryAssets;
			
			@FindBy(linkText = "Input Tax")
			public static WebElement InputTax;
			
			@FindBy(linkText = "Output Tax")
			public static WebElement OutputTax;
			
			@FindBy(linkText = "Tax paid Expense")
			public static WebElement TaxpaidExpense;
			
			@FindBy(linkText = "TDS Payable Report")
			public static WebElement TDSPayableReport;
			
			@FindBy(linkText = "TCS Payable Report")
			public static WebElement TCSPayableReport;
			
	//TDS/TCS LEDGER:	
			@FindBy(linkText = "TDS Reports")
			public static WebElement TDSReports;
			
	//BULK UPDATE
			@FindBy(linkText = "Bulk Price Update")
			public static WebElement BulkPriceUpdate;
			
			@FindBy(linkText = "Bulk Customer Opening Balance Update")
			public static WebElement BulkCustomerOpeningBalanceUpdate;
			
			@FindBy(linkText = "Bulk Vendor Opening Balance Update")
			public static WebElement BulkVendorOpeningBalanceUpdate;
			
			@FindBy(linkText = "Bulk Product Opening Balance Update")
			public static WebElement BulkProductOpeningBalanceUpdate;
			
	//TIMESHEETS
			@FindBy(linkText = "Timesheet Report")
			public static WebElement TimesheetReport;
   
	//PROJECT REPORTS
			@FindBy(linkText = "Bank and Cash Reports")
			public static WebElement BankandCashReports;
			
			@FindBy(linkText = "Projects Balance")
			public static WebElement ProjectsBalance;
			
			@FindBy(linkText = "Projects Report")
			public static WebElement ProjectsReports;
			
	//Service Job Report
			@FindBy(linkText = "Services Reports")
			public static WebElement ServiceJobsReports;
}
