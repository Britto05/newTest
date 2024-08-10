package stepDefinitions;

import java.awt.AWTException;

import io.cucumber.java.en.Given;
import pageObjects.AllMenuLinks_pageObjects;
import pageObjects.Reports_PageObjects;
import webDriverManager.DriverManager;

public class ReportsLinks {

	@Given("Report Menu Link Verified")
	public void report_menu_link_verified() {
		//AllMenuLinks_pageObjects.DashboardMenu.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	//Account Reports

	@Given("Balance Sheet Link Verified")
	public void balance_sheet_link_verified() {
		Reports_PageObjects.Balance_Sheet.click();
		//String visibleText = DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div[5]/div[1]/div[2]/div[1]/div/div/h2")).getText();
		 //Assert.assertTrue(visibleText.contains("John"));
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Profit and Loss Link Verified")
	public void profit_and_loss_link_verified() {
		Reports_PageObjects.ProfitAndLoss.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Trial Balance Link Verified")
	public void trial_balance_link_verified() {
		Reports_PageObjects.Trial_Balance.click();
		AllMenuLinks_pageObjects.Report.click();
		
	}
	@Given("Journal Report Link Verified")
	public void journal_report_link_verified() throws InterruptedException {
		Reports_PageObjects.Journal_Report.click();
		Thread.sleep(1500);
		//DriverManager.getDriver().navigate().back();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Daybook Link Verified")
	public void daybook_link_verified() {
		Reports_PageObjects.Daybook.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Daybook Lite Link Verified")
	public void daybook_lite_link_verified() {
		Reports_PageObjects.DaybookLite.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Customer Balance Link Verified")
	public void customer_balance_link_verified() {
		Reports_PageObjects.Customer_Balance.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Account Receivables Link Verified")
	public void account_receivables_link_verified() {
	    Reports_PageObjects.AccountReceivables.click();
	    AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Account Receivables Aging Summary Report Link Verified")
	public void account_receivables_aging_summary_report_link_verified() {
	   Reports_PageObjects.ARAgingSummaryReport.click();
	   AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Account Receivables Aging Details Report Link Verified")
	public void account_receivables_aging_details_report_link_verified() {
	   Reports_PageObjects.AccountReceivablesAgingDetailsReport.click();
	   AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Vendor Balance Link Verified")
	public void vendor_balance_link_verified() {
		Reports_PageObjects.Vendor_Balance.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Account Payable Link Verified")
	public void account_payable_link_verified() {
	   Reports_PageObjects.AccountPayables.click();
	   AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Account Payable Aging Summary Report Link Verified")
	public void account_payable_aging_summary_report_link_verified() {
	    Reports_PageObjects.APAgingSummaryReport.click();
	    AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Account Payables Aging Details Report Link Verified")
	public void account_payables_aging_details_report_link_verified() {
	   Reports_PageObjects.AccountPayablesAgingDetailsReport.click();
	   AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Customer Details Report Link Verified")
	public void customer_details_report_link_verified() {
		Reports_PageObjects.CustomerDetailsReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Owner Equity Report Link Verified")
	public void owner_equity_report_link_verified() {
		Reports_PageObjects.Owner_Equity.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	//SALES REPORTS	
	@Given("Sales Invoice Link Verified")
	public void sales_invoice_link_verified() {
		Reports_PageObjects.SalesInvoiceReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Invoice - Cancelled Link Verified")
	public void sales_invoice_cancelled_link_verified() {
		Reports_PageObjects.SalesInvoiceCancelled.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Invoice - Details Link Verified")
	public void sales_invoice_details_link_verified() {
		Reports_PageObjects.SalesInvoiceDetails.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Quotes Bills Link Verified")
	public void estimate_bills_link_verified() {
		Reports_PageObjects.QuotesBills.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Invoice Overdue Link Verified")
	public void sales_invoice_overdue_link_verified() {
		Reports_PageObjects.SalesInvoiceOverdue.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Invoice Report - Referral Link Verified")
	public void sales_invoice_report_referral_link_verified() {
		Reports_PageObjects.SalesInvoiceReportReferral.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Invoice Report - SalesPerson Link Verified")
	public void sales_invoice_report_sales_person_link_verified() {
		Reports_PageObjects.SalesInvoiceReportSalesPerson.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Quantity Report - SalesPerson link verified")
	public void sales_quantity_report_sales_person_link_verified() {
		Reports_PageObjects.SalesQuantityReportSalesPerson.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Reward Points Link Verified")
	public void reward_points_link_verified() {
		Reports_PageObjects.RewardPoints.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Agent Collections Link Verified")
	public void agent_collections_link_verified() {
		Reports_PageObjects.AgentCollections.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Orders Link Verified")
	public void sales_orders_link_verified() {
		Reports_PageObjects.SalesOrders.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Credit Note Report Link Verified")
	public void credit_note_report_link_verified() {
		Reports_PageObjects.CreditNoteReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Estimate to Sales Order Comparision Link Verified")
	public void estimate_to_sales_order_comparision_link_verified() {
		Reports_PageObjects.QuotestoSalesOrderComparison.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Order to Sales Invoice Comparision Link Verified")
	public void sales_order_to_sales_invoice_comparision_link_verified() {
		Reports_PageObjects.SalesOrdertoSalesInvoiceComparison.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Amc Lmc Report Link Verified")
	public void amc_lmc_report_link_verified() throws InterruptedException {
		Reports_PageObjects.AmcLmcReport.click();
		Thread.sleep(1000);
		AllMenuLinks_pageObjects.Report.click();
		Thread.sleep(3000);
	}
	@Given("Coupon Based Sales Report Verified")
	public void coupon_based_sales_report_verified() {
		Reports_PageObjects.CouponBasedSalesReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Receipt - Sales Person Report Link Verified")
	public void sales_receipt_sales_person_report_link_verified() {
		Reports_PageObjects.SalesReceiptSalesPersonReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Receipt - Cheque Bounce Report Link Verified")
	public void sales_receipt_cheque_bounce_report_link_verified() {
	   Reports_PageObjects.SalesReceiptChequeBounceReport.click();
	   AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Invoice Warranty Report Link Verified")
	public void sales_invoice_warranty_report_link_verified() {
		Reports_PageObjects.SalesInvoiceWarrantyReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Invoice Extended Warranty Report Link Verified")
	public void sales_invoice_extended_warranty_report_link_verified() {
		Reports_PageObjects.SalesInvoiceExtendedWarrantyReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Products Service Reports Link Verified")
	public void products_service_reports_link_verified() throws InterruptedException {
	   Reports_PageObjects.ProductsServiceReports.click();
	   AllMenuLinks_pageObjects.Report.click();
	   Thread.sleep(2000);
	}


	//Products Reports:	
	@Given("Inventory Valuation Summary Link Verified")
	public void inventory_valuation_summary_link_verified() throws InterruptedException {
		Reports_PageObjects.InventoryValuationSummary.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Stock Report Link Verified")
	public void stock_report_link_verified() {
		Reports_PageObjects.StockReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Stock Report Multi Uoms Link Verified")
	public void stock_report_multi_uoms_link_verified() {
	    Reports_PageObjects.StockReportMultiUoms.click();
	    AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Stock Report details view Link Verified")
	public void stock_report_details_view_link_verified() {
		Reports_PageObjects.StockReportdetailsview.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Stock History Report Link Verified")
	public void stock_history_report_link_verified() {
		Reports_PageObjects.StockHistoryReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Stock Transfer Report Link Verified")
	public void stock_transfer_report_link_verified() {
		Reports_PageObjects.StockTransferReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Global Search Link Verified")
	public void global_search_link_verified() {
		Reports_PageObjects.GlobalSearch.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Less Stock Notifications Link Verified")
	public void less_stock_notifications_link_verified() {
		Reports_PageObjects.LessStockNotifications.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Minimum Purchase Requirement Report Verified")
	public void minimum_purchase_requirement_report_verified() {
		Reports_PageObjects.MinimumPurchaseRequirementReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Sales Summary Link Verified")
	public void sales_summary_link_verified() {
		Reports_PageObjects.SalesSummary.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Product Based Stock Link Verified")
	public void product_based_stock_link_verified() {
		Reports_PageObjects.ProductBasedStock.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Stock Checking Link Verified")
	public void stock_checking_link_verified() {
		Reports_PageObjects.StockChecking.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Stock Check Report Link Verified")
	public void stock_check_report_link_verified() {
		Reports_PageObjects.StockCheckReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("HSN\\/SAC Summary Link Verified")
	public void hsn_sac_summary_link_verified() {
		Reports_PageObjects.HSNSACSummary.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Product Based On Sale Type Report Verified")
	public void product_based_on_sale_type_report_verified() {
		Reports_PageObjects.ProductBasedOnSaleTypeReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Product Based Profit Report Link Verified")
	public void product_based_profit_report_link_verified() {
	    Reports_PageObjects.ProductBasedProfit.click();
	    AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("BOM Report Link Verified")
	public void bom_report_link_verified() {
	    Reports_PageObjects.BOMReport.click();
	    AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Product Batch Based Report Link Verified")
	public void product_batch_based_report_link_verified() {
	    Reports_PageObjects.ProductBatchBasedReport.click();
	    AllMenuLinks_pageObjects.Report.click();
	}

	//PURCHASE REPORTS:	
	@Given("Purchase Order Link Verified")
	public void purchase_order_link_verified() {
		Reports_PageObjects.PurchaseOrder.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Purchase Invoice Link Verified")
	public void purchase_invoice_link_verified() {
		Reports_PageObjects.PurchaseInvoice.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Purchase Overdue Link Verified")
	public void purchase_overdue_link_verified() {
		Reports_PageObjects.PurchaseOverdue.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Purchase Order Details Report Link Verified")
	public void purchase_order_details_report_link_verified() {
		Reports_PageObjects.PurchaseOrderDetails.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Purchase Invoice Details Report Link Verified")
	public void purchase_invoice_details_report_link_verified() {
		Reports_PageObjects.PurchaseInvoiceDetails.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Debit Note Report Link Verified")
	public void debit_note_report_link_verified() {
		Reports_PageObjects.DebitNoteReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Pay Bill - Cheque Bounce Report Link Verified")
	public void pay_bill_cheque_bounce_report_link_verified() {
	   Reports_PageObjects.PayBillChequeBounceReport.click();
	   AllMenuLinks_pageObjects.Report.click();
	}

	//GSTR REPORTS:	
	@Given("GSTR1 SalesInvoice Link Verified")
	public void gstr1_sales_invoice_link_verified() throws InterruptedException {
		Thread.sleep(5000);
		Reports_PageObjects.GSTR1SalesInvoice.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("GSTR1 Detailed Link Verified")
	public void gstr1_detailed_link_verified() {
	    Reports_PageObjects.GSTR1Detailed.click();
	    AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("GSTR2 PurchaseInvoice Link Verified")
	public void gstr2_purchase_invoice_link_verified() {
		Reports_PageObjects.GSTR2PurchaseInvoice.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("GSTR3B Link Verified")
	public void gstr3b_link_verified() {
		Reports_PageObjects.GSTR3B.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	//PURCHASE & SALES HISTORY:

	@Given("Sales and Purchase Comparison Link Verified")
	public void sales_and_purchase_comparison_link_verified() {
		Reports_PageObjects.SalesPurchaseComparison.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Purchase and Sales Month Based Link Verified")
	public void purchase_and_sales_month_based_link_verified() {
		Reports_PageObjects.PurchaseSalesMonthBased.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Date Based Purchase and Sales Link Verified")
	public void date_based_purchase_and_sales_link_verified() {
		Reports_PageObjects.DateBasedPurchaseSales.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Per Day Based Stock")
	public void per_day_based_stock() {
	   Reports_PageObjects.PerDayBasedStock.click();
	   AllMenuLinks_pageObjects.Report.click();
	}


	//EXPENSE REPORTS:

	@Given("Expense Bill Details Link Verified")
	public void expense_bill_details_link_verified() {
	   Reports_PageObjects.ExpenseBillDetails.click();
	   AllMenuLinks_pageObjects.Report.click();
	}
	
	
	@Given("Expense Payment Report Link Verified")
	public void expense_payment_report_link_verified() {
		Reports_PageObjects.ExpenseReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Expense Summary Link Verified")
	public void indirect_expense_account_summary_link_verified() {
		Reports_PageObjects.ExpenseSummary.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	//AUDIT LOGS:

	@Given("Sales Receipts Logs Link Verified")
	public void sales_receipts_logs_link_verified() {
		Reports_PageObjects.SalesReceiptsLogs.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Activity Logs & Audit Trail Link Verified")
	public void activity_logs_audit_trail_link_verified() {
	    Reports_PageObjects.ActivityLogsAuditTrail.click();
	    AllMenuLinks_pageObjects.Report.click();
	}

	//MESSAGES:	
	@Given("Message History Link Verified")
	public void message_history_link_verified() {
		Reports_PageObjects.MessageHistory.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	//EMPLOYEE REPORT:

	@Given("Employee Profile Link Verified")
	public void employee_profile_link_verified() {
		Reports_PageObjects.EmployeeProfile.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Employee Salary Report Link Verified")
	public void employee_salary_report_link_verified() {
		Reports_PageObjects.EmployeeSalaryReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	@Given("Daily Wage Report Link Verified")
	public void daily_wage_report_link_verified() {
	    Reports_PageObjects.DailyWageReport.click();
	    AllMenuLinks_pageObjects.Report.click();
	}

	
	//PARTIES REPORT:

	@Given("Parties Profiles Link Verified")
	public void parties_profiles_link_verified() throws AWTException {
		//AllMenuLinks_pageObjects.Report.click();
		Reports_PageObjects.PartiesProfiles.click();
		AllMenuLinks_pageObjects.Report.click();
			
	}
	
	@Given("Parties Profiles Report Details Link Verified")
	public void partiesProfilesReportDetailsLinkVerified() {
	    Reports_PageObjects.PartiesProfilesReportDetails.click();
	    AllMenuLinks_pageObjects.Report.click();
	}


	//ATTENDANCE REPORT:

	@Given("Daily Attendance Link Verified")
	public void daily_attendance_link_verified() {
		Reports_PageObjects.DailyAttendance.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Monthly Attendance Link Verified")
	public void monthly_attendance_link_verified() {
		Reports_PageObjects.MonthlyAttendance.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Periodic Attendance Link Verified")
	public void periodic_attendance_link_verified() {
		Reports_PageObjects.PeriodicAttendance.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Daily In-Out Details Link Verified")
	public void daily_in_out_details_link_verified() throws InterruptedException {
	   Reports_PageObjects.DailyIn_OutDetails.click();
	   //DriverManager.getDriver().navigate().back();
	   Thread.sleep(3000);
	   AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Month In-Out Details Link Verified")
	public void month_in_out_details_link_verified() {
	    Reports_PageObjects.MonthInOutDetails.click();
	    AllMenuLinks_pageObjects.Report.click();
	    
	}

	//SUMMARY REPORTS:

	@Given("Expense Payable Report Link Verified")
	public void expense_payable_report_link_verified() {
		AllMenuLinks_pageObjects.Report.click();
		Reports_PageObjects.ExpensePayable.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	@Given("Cost of Sales Report Link Verified")
	public void cost_of_sales_report_link_verified() {
		Reports_PageObjects.CostofSales.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Inventory Assets Link Verified")
	public void inventory_assets_link_verified() {
		Reports_PageObjects.InventoryAssets.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Input Tax Link Verified")
	public void input_tax_link_verified() {
		Reports_PageObjects.InputTax.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Output Tax Link Verified")
	public void output_tax_link_verified() {
		Reports_PageObjects.OutputTax.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Tax paid Expense Link Verified")
	public void tax_paid_expense_link_verified() {
		Reports_PageObjects.TaxpaidExpense.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("TDS Payable Report Link Verified")
	public void tds_payable_report_link_verified() {
		Reports_PageObjects.TDSPayableReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	@Given("TCS Payable Report Link Verified")
	public void tcs_payable_report_link_verified() {
		Reports_PageObjects.TCSPayableReport.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	//TDS/TCS LEDGER	
	@Given("TDS Report Link Verified")
	public void tds_report_link_verified() {
		Reports_PageObjects.TDSReports.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	//BULK UPDATE
	@Given("Bulk Price Update Link Verified")
	public void bulk_price_update_link_verified() {
		Reports_PageObjects.BulkPriceUpdate.click();
		AllMenuLinks_pageObjects.Report.click();
	}

	@Given("Bulk Customer Opening Balance Update link verified")
	public void bulk_customer_opening_balance_update_link_verified() {
	   Reports_PageObjects.BulkCustomerOpeningBalanceUpdate.click();
	   AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Bulk Vendor Opening Balance Update Link Verified")
	public void bulk_vendor_opening_balance_update_link_verified() {
		Reports_PageObjects.BulkVendorOpeningBalanceUpdate.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Bulk Product Opening Balance Update Link Verified")
	public void bulk_product_opening_balance_update_link_verified() {
		Reports_PageObjects.BulkProductOpeningBalanceUpdate.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	
	//TIMESHEETS
	@Given("Timesheet Link Verified")
	public void timesheet_link_verified() {
		Reports_PageObjects.TimesheetReport.click();
	    AllMenuLinks_pageObjects.Report.click();
	}
	//PROJECT REPORTS
	@Given("Bank and Cash Reports Link Verified")
	public void bank_and_cash_reports_link_verified() {
		Reports_PageObjects.BankandCashReports.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	@Given("Projects Reports Link Verified")
	public void projects_reports_link_verified() {
		Reports_PageObjects.ProjectsReports.click();
		AllMenuLinks_pageObjects.Report.click();
	}
	
	@Given("Projects Balance Link Verified")
	public void projects_balance_link_verified() throws InterruptedException {
		Reports_PageObjects.ProjectsBalance.click();
	   // DriverManager.getDriver().navigate().back();
	    Thread.sleep(3000);
		AllMenuLinks_pageObjects.Report.click();
	}

	//Service Job Report
	@Given("Service Jobs Reports Link Verified")
	public void service_jobs_reports_link_verified() {
	   AllMenuLinks_pageObjects.Report.click();
	   Reports_PageObjects.ServiceJobsReports.click();
	   AllMenuLinks_pageObjects.Report.click();
	}
}
