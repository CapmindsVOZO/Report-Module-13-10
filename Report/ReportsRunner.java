package com.Report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportsRunner extends Base_class {

	public static WebDriver driver = getbrowser("opera");

	public static Pom_Class pom = new Pom_Class(driver);

//	public static void main(String[] args) throws InterruptedException {
	@Test(priority = 0)

	public void Login() throws InterruptedException {
		// Step1: Set up physical report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/ReportsModuleExtendReport.html");

		// to keep the report history
		reporter.setAppendExisting(true);

		// Step2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		System.out.println("CAPMINDS");
		// Step3: attach the data with physical file
		extent.attachReporter(reporter);

		// Step4: Create a test cases and assign test details
		// testName //testDescription

		ExtentTest test = extent.createTest("capminds", "patient with mandatory information");

		test.assignCategory("smoke");
		test.assignAuthor("capminds");

		System.out.println("Browser Launched Successfully");

		test.pass("Browser Launched Successfully");

		// Driver Maximize and Url Launch
		geturl("https://ehr1.vozo.xyz:444/");

		System.out.println("URL Launched Succsessfully");

		test.pass("URL Launched Successfully");

		// Enter Username
		sendkeys(pom.getReports().getUsername(), "Admin3");

		// Enter Password
		sendkeys(pom.getReports().getPassword(), "Admin@123");

		// Click Signin Button '
		Clickonelement(pom.getReports().getSigninbtn());

		System.out.println("SignIn Succsessfully");

		test.pass("SignIn Successfully");

	}

	@Test(priority = 1)

	public void BillingSummary() throws InterruptedException {

		// Click On Month Option
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		Clickonelement(pom.getReports().getClickReport());

		System.out.println("Reports Module Navigated  Succsessfully");

		// test.pass("Reports Module Navigated Succsessfully");

		///////////////// BILLIG SUMMAARY //////////////////

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// Clickonelement(pom.getReports().getClickReportmod());

		Thread.sleep(4000);

		// Clickonelement(pom.getReports().getbillsu());

		// cli mon

		Clickonelement(pom.getReports().getclimo());

		// cli mon

		Clickonelement(pom.getReports().getcliqu());

		// cli mon

		Clickonelement(pom.getReports().getcliyea());

		// cli mon

		Clickonelement(pom.getReports().getcliyea());

		System.out.println("Billing Summary Verified Succsessfully");

		// test.pass("Billing Summary Verified Succsessfully");

		//////// payment analysis/////////////
	}

	@Test(priority = 2)

	public void Paymentanalysis() throws InterruptedException {
		// cli pay

		Thread.sleep(2000);
		Clickonelement(pom.getReports().getpayana());

		// cli pay

		Clickonelement(pom.getReports().getpayanasea());

		// cli pay

		sendkeys(pom.getReports().getpayanasea(), "Martin");

		// cli pay

		Clickonelement(pom.getReports().getselepa());

		// cli pay

		selecttwo(pom.getReports().getseleoff(), "4");

		// Clickonelement(pom.getReports().getseleoff1());

		// stat da

		sendkeys(pom.getReports().getstarda(), "05/09/2022");

		// stat da

		sendkeys(pom.getReports().getenda(), "05/10/2022");

		// sele pos
		Clickonelement(pom.getReports().getposdat());

		Clickonelement(pom.getReports().getposdat1());

		// cli upd

		Clickonelement(pom.getReports().getcliupp());

		// cli crea

		Clickonelement(pom.getReports().getclicre());

		// cli crea

		Clickonelement(pom.getReports().getclipatpay());

		// cli crea

		Clickonelement(pom.getReports().getclich());

		System.out.println("Payment analysis Verified Succsessfully");

		// test.pass("Payment analysis Verified Succsessfully");

	}

	@Test(priority = 3)

	public void Productandprocedure() throws InterruptedException {
		////////////////// PRODUCT PROCEDURE ////////////////

		Thread.sleep(6000);

		Clickonelement(pom.getReports().getproproc());

		// proce or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getprocor());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getcptco(), "a");

		// sele code

		Thread.sleep(3000);
		Clickonelement(pom.getReports().getselecpt());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getfromda(), "2022-05-10");

		// code or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getselfromda());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getseltoda(), "2022-05-20");

		// code or
//		Thread.sleep(2000);
//
//		Clickonelement(pom.getReports().getseltodats());
		// code or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getclupd());

		// sele code

		Thread.sleep(3000);

		Clickonelement(pom.getReports().getseleco());

		// ser pay
		sendkeys(pom.getReports().getpayna(), "a");

		Clickonelement(pom.getReports().getselpa());

		// s da
		Thread.sleep(2000);

		sendkeys(pom.getReports().getfromda1(), "2022-05-10");

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getseltoda1(), "2022-05-20");

		// code or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getclupd1());

		System.out.println("Product Procedure Verified Succsessfully");

		// test.pass("Product Procedure Verified Succsessfully");
	}

	@Test(priority = 4)

	public void RemittanceReport() throws InterruptedException {
		//////////////// Remittence Report /////////////////

		Thread.sleep(5000);

		// Click Remittence Report
		Clickonelement(pom.getReports().getClickRemittence());

		// Enter Username
		sendkeys(pom.getReports().getEnterTrace(), "50212068");

		// Slect Trace
		Clickonelement(pom.getReports().getSelectTrace());

		// Click From Date
		sendkeys(pom.getReports().getClickFromDate(), "2022-05-10");

		Thread.sleep(3000);

		// Select From Date
		// Clickonelement(pom.getReports().getSelectFromDate());

		// Click To Dates
		sendkeys(pom.getReports().getClickToDate(), "2022-05-10");
//		
//		Thread.sleep(2000);
//				
//		// Select To Date
//		Clickonelement(pom.getReports().getSelectToDate()); 
//		
		// Enter Username
		sendkeys(pom.getReports().getEnterPatient(), "VIVEK");

		// Enter Username
		sendkeys(pom.getReports().getEnterInsurance(), "Optum Maryland");

		// select Optum Maryland
		Clickonelement(pom.getReports().getSelectOptumMaryland());

		// Click Search button
		Clickonelement(pom.getReports().getClickSearch());

		// Click ExportToCSV
		Clickonelement(pom.getReports().getClickExportToCSV());

		// Click Print
		// Clickonelement(pom.getReports().getClickPrint());

		// Click cancel
		// Clickonelement(pom.getReports().getClickCancel());

		System.out.println("Remittence Report Verified Succsessfully");

		// test.pass("Remittence Report Verified Succsessfully");

	}

	@Test(priority = 5)

	public void AppointmentReport() throws InterruptedException {

		/////////////// APPOINTMENT REPORT /////////////////

		Thread.sleep(8000);

		// click Appointment Rerport
		Clickonelement(pom.getReports().getClickAppointmentReport());

		// click CheckAll
		Clickonelement(pom.getReports().getClickCheckAll());

		// click UnCheckAll
		Clickonelement(pom.getReports().getClickUnCheckAll());

		// click CheckAll
		Clickonelement(pom.getReports().getClickCheckAll1());

		// click UnCheckAll
		Clickonelement(pom.getReports().getClickUnCheckAll1());

		// Search Patient Name
		sendkeys(pom.getReports().getSearchPatientName(), "Martin");

		Clickonelement(pom.getReports().getselectNmae());

		// click All Office
		Selectone(pom.getReports().getClickAllOffice(), "John's Hospital");

		// Select Test Facility Phar
		// Clickonelement(pom.getReports().getSelectoemr());

		// click From Date
		sendkeys(pom.getReports().getclickFromdate(), "09/22/2022");

		// select date number 8
		// Clickonelement(pom.getReports().getselectdatenumber8());

		// click End Date
		sendkeys(pom.getReports().getclickEndDate(), "09/28/2022");

		// select date number 15
		// Clickonelement(pom.getReports().getselectdate15());

		// click Update Button
		Clickonelement(pom.getReports().getclickupdatebutton());

		// select Radio Button
		Clickonelement(pom.getReports().getclickRadioButton());

		System.out.println("Appointment Report Verified Succsessfully");

		// test.pass("Appointment Report Verified Succsessfully");

	}

	@Test(priority = 6)

	public void RemainderReport() throws InterruptedException {

		// code or
		Thread.sleep(8000);

		Clickonelement(pom.getReports().getremre());

		// code or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getremresep(), "a");

		Thread.sleep(2000);
		Clickonelement(pom.getReports().getselpat());

		// from or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getremrefrom(), "05/10/2022");

		// from or
		Thread.sleep(2000);

		sendkeys(pom.getReports().getremreselto(), "05/30/2022");

		// from or
		Thread.sleep(2000);

		// Clickonelement(pom.getReports().getremreselto());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getremreday());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getremreweek());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getremremon());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getremreye());

		// from or
		Thread.sleep(2000);

		Clickonelement(pom.getReports().getcliup());

		System.out.println("REMAINDER REPORT  Verified Succsessfully");

		// test.pass("REMAINDER REPORT Verified Succsessfully");

	}

	@Test(priority = 7)

	public void PatientReport() throws InterruptedException {

		/////////// PATIENT REPORT////////////

		// click patient report
		Thread.sleep(8000);

		Clickonelement(pom.getReports().getClickpatientrep());

		// select from date

		sendkeys(pom.getReports().getfromcalenderpr(), "05/10/2022");

		// Clickonelement(pom.getReports().getclfromcalenderpr());

		// select to date

		sendkeys(pom.getReports().gettocalenderpr(), "05/20/2022");

		// Clickonelement(pom.getReports().gettocalenderpr());

		// Clickonelement(pom.getReports().getcltocalenderpr());
		// select age
		Thread.sleep(2000);

		sendkeys(pom.getReports().getseleage(), "20");

		// select sex
		Thread.sleep(2000);

		// sendkeys(pom.getReports().getselectsex(), "Male");

		Selectone(pom.getReports().getselectsex(), "Male");

		// select sex

		Thread.sleep(2000);

		// Clickonelement(pom.getReports().getselesex());

		// click race

		Thread.sleep(2000);

		Selectone(pom.getReports().getselerace(), "American Indian");

		// sendkeys(pom.getReports().getselerace(), "American Indian or Alaska
		// Native");

		// Clickonelement(pom.getReports().getselectrace());

		// click ethn
		Thread.sleep(2000);

		Selectone(pom.getReports().getselectethn(), "Hispanic or Latino");

		// sendkeys(pom.getReports().getselectethn(), "");

		// search medi

		sendkeys(pom.getReports().getsearchmedi(), "a");

		Clickonelement(pom.getReports().getselemedi());

		// search allergy

		sendkeys(pom.getReports().getsearchallergy(), "a");

		Thread.sleep(5000);

		Clickonelement(pom.getReports().getselealler());

		// search problem

		sendkeys(pom.getReports().getsearchproblem(), "a");

		Thread.sleep(5000);

		Clickonelement(pom.getReports().getselepro());

		// click search

		Clickonelement(pom.getReports().getclicksearch());

		System.out.println("PATIENT REPORT Verified Succsessfully");

		// test.pass("PATIENT REPORT Verified Succsessfully");

	}

	@Test(priority = 8)

	public void Telehealthreport() throws InterruptedException {

		///////////// TELE HEALTH REPORT ////////////

		Thread.sleep(5000);

		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		WebElement fla3 = wait4
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Telehealth Report')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla3);

		// click the Tele Health Report
		// Clickonelement(pom.getReports().getclickTeleHealthReport());

		// click checkAll Radio button
		Clickonelement(pom.getReports().getclickCheckAll());

		// click checkAll Radio button
		Clickonelement(pom.getReports().getclickUnCheckAll());

		// click Occured Radio Button
		Clickonelement(pom.getReports().getclickOccuredRadioButton());

		// click Did notOccured Radio Button
		Clickonelement(pom.getReports().getclickDidnotOccuredRadioButton());

		// search the Patient Name
		sendkeys(pom.getReports().getSearchThePatientName1(), "Martin");

		Thread.sleep(6000);

		Clickonelement(pom.getReports().getselectPatientname());

		// click Select office Option
		Selectone(pom.getReports().getClickOfficeOption(), "John's Hospital");

		// click Select office Option
		Clickonelement(pom.getReports().getSelectclickTestFacilityPhar());

		// click Start date Option
		sendkeys(pom.getReports().getclickStartDate(), "2022-09-28");

		// Select Start date 16
		sendkeys(pom.getReports().getSelectStartDate16(), "2022-09-30");

		// click End date Option
		// Clickonelement(pom.getReports().getclickEndDateq());
//
//		// Select End date 31
		// Clickonelement(pom.getReports().getSelectEndDateq());

		Thread.sleep(2000);
//
//		// Click Update Filter Option
		Clickonelement(pom.getReports().getclickUpdateFilterOption());
//
//		// Click Update Export to file
//		 Clickonelement(pom.getReports().getClickExportToFile());
//
//		// Click Update Export to file
//		 Clickonelement(pom.getReports().getClickLoadmore());

		System.out.println("TELE HEALTH REPORT Verified Succsessfully");

		// test.pass("TELE HEALTH REPORT Verified Succsessfully");

	}

	@Test(priority = 9)

	public void ProductivityReport() throws InterruptedException {

//		// Click On Month Option
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//
//		Clickonelement(pom.getReports().getClickReport());

		////////// Productivity Report //////////////////

		Thread.sleep(8000);

		// Click Productivity Report
		Clickonelement(pom.getReports().getClickProductivityReport());

		// Click From Date
		Clickonelement(pom.getReports().getClickTheFromDate());

		sendkeys(pom.getReports().getClickTheFromDate(), "10/01/2022");

		// Select From Date 16
		// Clickonelement(pom.getReports().getSelectTheFromDate16());

		// Click End Date
		sendkeys(pom.getReports().getclickTheEndDate(), "10/08/2022");

		// Select From Date 31
		// Clickonelement(pom.getReports().getselectTheEndDate31());

		// Click The Provider option
		Selectone(pom.getReports().getClickProvider(), "Provider");

		// Select Provider
		// Clickonelement(pom.getReports().getSelectProvider());

		// Click the Include Cancelled and NoShow Appointments
		Clickonelement(pom.getReports().getClickCheckBox());

		// click update button
		Clickonelement(pom.getReports().getClickUpdateButton());

		// click load more
		// Clickonelement(pom.getReports().getClickLoadMore());

		System.out.println("PRODUCTIVITY REPORT Verified Succsessfully");

		// test.pass("PRODUCTIVITY REPORT Verified Succsessfully");
	}

	@Test(priority = 10)

	public void OutgoingPrescriptions() throws InterruptedException {
		//////////// Outgoing Prescription ////////////////////

		Thread.sleep(7000);
		// click Outgoing Prescription

		WebDriverWait wait90 = new WebDriverWait(driver, 10);
		WebElement fla90 = wait90
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='rpt_nav-lnk_otgPrsc']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla90);

		// Clickonelement(pom.getReports().getClickOutgoingPrescription());

		// EnterPatientName
		Clickonelement(pom.getReports().getEnterPatientName());

		// SelectPatientName
		// Clickonelement(pom.getReports().getSelectPatientName());

		// EnterDescription
		sendkeys(pom.getReports().getEnterDescription(), "ZOCOR");

		// SelectDescription
//		Clickonelement(pom.getReports().getSelectDescription());

		// EnterPharmacy
		sendkeys(pom.getReports().getEnterPharmacy(), "BJS WHOLESALE CLUB IN");

		// SlectPharmacy

		Thread.sleep(6000);
		Clickonelement(pom.getReports().getSlectPharmacy());

		// ClickStartDate
		Clickonelement(pom.getReports().getClickStartDate());

		sendkeys(pom.getReports().getClickStartDate(), "2022-10-01");
//		// EnterPharmacy
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// SlectPharmacy
//		Clickonelement(pom.getReports().getSlectPharmacy());

		// ClickEndtDate
		Clickonelement(pom.getReports().getClickEndtDate());

		// SelectEndtDate
		sendkeys(pom.getReports().getClickEndtDate(), "2022-10-01");

//		// ClickStartDate
//		Clickonelement(pom.getReports().getClickStartDate());
//
//		// SelectStartDate
//		Clickonelement(pom.getReports().getSelectStartDate());
//
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// EnterPharmacy
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// SlectPharmacy
//		Clickonelement(pom.getReports().getSlectPharmacy());
//
//		// ClickStartDate
//		Clickonelement(pom.getReports().getClickStartDate());
//
//		// SelectStartDate
//		Clickonelement(pom.getReports().getSelectStartDate());
//
//		// EnterPharmacy
//		Clickonelement(pom.getReports().getEnterPharmacy());
//
//		// SlectPharmacy
//		Clickonelement(pom.getReports().getSlectPharmacy());
//
//		// ClickStartDate
//		Clickonelement(pom.getReports().getClickStartDate());
//
//		// SelectStartDate
//		Clickonelement(pom.getReports().getSelectStartDate());
//
//		// ClickEndtDate
//		Clickonelement(pom.getReports().getClickEndtDate());
//
//		// SelectEndtDate
//		Clickonelement(pom.getReports().getSelectEndtDate());

		// ClickFilter
		// Clickonelement(pom.getReports().getClickFilter());

		System.out.println("Outgoing Prescription Verified Succsessfully");
		// test.pass("Outgoing Prescription Verified Succsessfully");

	}

	@Test(priority = 11)

	public void UserReport() throws InterruptedException {

		///////// User Report //////////////////

		Thread.sleep(4000);

		WebDriverWait wait91 = new WebDriverWait(driver, 10);
		WebElement fla91 = wait91
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='User Report']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", fla91);
		// click User Report
		// Clickonelement(pom.getReports().getClickUserreport());

		// Enter Search Username
		sendkeys(pom.getReports().getEnterSearchUsername(), "Martin");

		Thread.sleep(2000);

		Clickonelement(pom.getReports().getSelectSearchUsername());

		// click Inactive
		// Clickonelement(pom.getReports().getclickInactiveRadioButton());

		// click Search Button
		Clickonelement(pom.getReports().getclickSearchButton());

		// click Staff Button

		Thread.sleep(4000);
		Clickonelement(pom.getReports().getclickStaffButton());

		// Enter Search Username
		sendkeys(pom.getReports().getEnterUserName(), "martin");

		// click Inactive
		Clickonelement(pom.getReports().getClickInactive());

		// click Search Button
		Clickonelement(pom.getReports().getclickSearchButton1());

		System.out.println("User Report Verified Succsessfully");

		// test.pass("User Report Verified Succsessfully");

	}

	@Test(priority = 12)

	public void Invoice() throws InterruptedException {

		////////////////// Invoice ////////////////////

		Thread.sleep(6000);

		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Invoices']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element2);

		// click Invoices
		// Clickonelement(pom.getReports().getClickInvoices());

		// getEnterPatientName1
		sendkeys(pom.getReports().getEnterPatientName1(), "Martin");

		// Clickonelement(pom.getReports().getEnterPatientName1());

		// SelectPatientName1
		Clickonelement(pom.getReports().getSelectPatientName1());

		// Click Invoices Status
		Selectone(pom.getReports().getClickInvoicesStatus(), "Paid");

		// EnterPharmacy
		// Clickonelement(pom.getReports().getselectPaid());

		// Enter Invoiceid
		sendkeys(pom.getReports().getEnterInvoiceid(), "vozoinv#1");

		// Clickonelement(pom.getReports().getEnterInvoiceid());

		try {
			// selectInvoiceId
			Clickonelement(pom.getReports().getselectInvoiceId());
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}

		// ClickStartDate
		Clickonelement(pom.getReports().getEnterStartdate());

		sendkeys(pom.getReports().getEnterStartdate(), "2022-10-01");

		// Clickonelement(pom.getReports().getClickFrv());

		// SelectEndtDate
		sendkeys(pom.getReports().getEnterEnddate(), "2022-10-10");

		// SelectEndtDate
		// Clickonelement(pom.getReports().getEnterEnddate1());

		// clickSearch
		Clickonelement(pom.getReports().getclickSearch());

		System.out.println("Invoice Verified Succsessfully");

		// test.pass("Invoice Verified Succsessfully");

		// Final Report

		System.out.println("Reports Module Verified Succsessfully");

		driver.close();

		// test.pass("Reports ModuleVerified Succsessfully");

		// step6: Mandatory step
		// extent.flush();

	}

}
