package com.Report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports {

	public WebDriver driver;

	public Reports(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement ClickReportsModule;

	public WebElement getClickReportsModule() {
		return ClickReportsModule;
	}

	@FindBy(xpath = "(//a[normalize-space()='Reports'])[1]")
	private WebElement ClickReportmod;

	public WebElement getClickReportmod() {
		return ClickReportmod;
	}

	@FindBy(xpath = "(//a[normalize-space()='Patient Report'])[1]")
	private WebElement Clickpatientrep;

	public WebElement getClickpatientrep() {

		return Clickpatientrep;
	}

             ////////BILLING SUMMARY////////

	@FindBy(xpath = "(//a[normalize-space()='Billing Summary'])[1]")
	private WebElement billsu;

	public WebElement getbillsu() {

		return billsu;
	}

	@FindBy(xpath = "(//span[normalize-space()='Month'])[1]")
	private WebElement climo;

	public WebElement getclimo() {

		return climo;
	}

	@FindBy(xpath = "(//span[normalize-space()='Quarter'])[1]")
	private WebElement cliqu;

	public WebElement getcliqu() {

		return cliqu;
	}

	@FindBy(xpath = "(//span[normalize-space()='Year'])[1]")
	private WebElement cliyea;

	public WebElement getcliyea() {

		return cliyea;
	}

	    /////// //// ////////// payment analysis    /////////////
	
	@FindBy(xpath = "(//a[@id='rpt_nav-lnk_pymnt'])[1]")
	private WebElement payana;

	public WebElement getpayana() {

		return payana;
	}

	@FindBy(xpath = "(//input[@id='rpt_pay-srch_pt'])[1]")
	private WebElement payanasea;

	public WebElement getpayanasea() {

		return payanasea;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement selepa;

	public WebElement getselepa() {

		return selepa;
	}

	@FindBy(xpath = "(//select[@id='rpt_pay-srch_ofc'])[1]")
	private WebElement seleoff;

	public WebElement getseleoff() {

		return seleoff;
	}

	@FindBy(xpath = "//option[@value='3']")
	private WebElement seleoff1;

	public WebElement getseleoff1() {

		return seleoff1;
	}

	@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
	private WebElement starda;

	public WebElement getstarda() {

		return starda;
	}

	@FindBy(xpath = "(//input[@placeholder='End date'])[1]")
	private WebElement enda;

	public WebElement getenda() {

		return enda;
	}

	@FindBy(xpath = "//option[@value='PosDate']")
	private WebElement posdat;

	public WebElement getposdat() {

		return posdat;
	}

	@FindBy(xpath = "(//option[@id='rpt_pay-opt_podt'])[1]")
	private WebElement posdat1;

	public WebElement getposdat1() {

		return posdat1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement cliupp;

	public WebElement getcliupp() {

		return cliupp;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-2'])[1]")
	private WebElement clicre;

	public WebElement getclicre() {

		return clicre;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-4'])[1]")
	private WebElement clich;

	public WebElement getclich() {

		return clich;
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-0-tab-3'])[1]")
	private WebElement clipatpay;

	public WebElement getclipatpay() {

		return clipatpay;
	}

            /////////////PRODUCT PROCEDURE ////////////////

	@FindBy(xpath = "(//input[@placeholder='Code (CPT/HCPSCS/Custom)'])[1]")
	private WebElement cptco;

	public WebElement getcptco() {

		return cptco;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement selecpt;

	public WebElement getselecpt() {

		return selecpt;
	}

	@FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
	private WebElement fromda;

	public WebElement getfromda() {

		return fromda;
	}
	
	@FindBy(xpath = "(//input[@placeholder='From Date'])[1]")
	private WebElement fromda1;

	public WebElement getfromda1() {

		return fromda1;
	}

	@FindBy(xpath = "(//div[normalize-space()='22'])[1]")
	private WebElement selfromda;

	public WebElement getselfromda() {

		return selfromda;
	}

	@FindBy(xpath = "(//input[@placeholder='To Date'])[1]")
	private WebElement seltoda;

	public WebElement getseltoda() {

		return seltoda;
	}

	@FindBy(xpath = "(//input[@placeholder='To Date'])[1]")
	private WebElement seltoda1;

	public WebElement getseltoda1() {

		return seltoda1;
	}
	@FindBy(xpath = "(//div[contains(text(),'22')])[2]")
	private WebElement seltodats;

	public WebElement getseltodats() {

		return seltodats;
	}

	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement clupd;

	public WebElement getclupd() {

		return clupd;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Update'])[1]")
	private WebElement clupd1;

	public WebElement getclupd1() {

		return clupd1;
	}
	
	@FindBy(xpath = "(//table/tbody/tr/td/div/a)[1]")
	private WebElement seleco;

	public WebElement getseleco() {

		return seleco;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Payer Name'])[1]")
	private WebElement payna;

	public WebElement getpayna() {

		return payna;
	}
	
	
	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement selpa;

	public WebElement getselpa() {

		return selpa;
	}

                  //////////////////////  Remittance Report  ///////////////////////

	@FindBy(xpath = "(//a[@id='rpt_nav-lnk_rmtnce'])[1]")
	private WebElement ClickRemittence;

	public WebElement getClickRemittence() {

		return ClickRemittence;
	}

	@FindBy(xpath = "(//input[@id='rpt_rmt-inp_tce'])[1]")
	private WebElement EnterTrace;

	public WebElement getEnterTrace() {

		return EnterTrace;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement SelectTrace;

	public WebElement getSelectTrace() {

		return SelectTrace;
	}

	@FindBy(xpath = "//input[@placeholder='From Date']")
	private WebElement ClickFromDate;

	public WebElement getClickFromDate() {

		return ClickFromDate;
	}

	@FindBy(xpath = "//td[contains(@title,'2022-08-31')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='31']")
	private WebElement SelectFromDate;

	public WebElement getSelectFromDate() {

		return SelectFromDate;
	}

	@FindBy(xpath = "//input[@placeholder='To Date']")
	private WebElement ClickToDate;

	public WebElement getClickToDate() {

		return ClickToDate;
	}

	@FindBy(xpath = "//td[contains(@class,'ant-picker-cell ant-picker-cell-start ant-picker-cell-in-view ant-picker-cell-today')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='1']")
	private WebElement SelectToDate;

	public WebElement getSelectToDate() {

		return SelectToDate;
	}

	@FindBy(xpath = "(//input[@id='rpt_rmtr-srch_pat'])[1]")
	private WebElement EnterPatient;

	public WebElement getEnterPatient() {

		return EnterPatient;
	}

	@FindBy(xpath = "(//input[@id='rpt_rmtr-srch_insu'])[1]")
	private WebElement EnterInsurance;

	public WebElement getEnterInsurance() {

		return EnterInsurance;
	}

	@FindBy(xpath = "//div[contains(text(),'Optum Maryland')]")
	private WebElement SelectOptumMaryland;

	public WebElement getSelectOptumMaryland() {

		return SelectOptumMaryland;
	}

	@FindBy(xpath = "(//button[@id='rpt_rmtr-btn_srch'])[1]")
	private WebElement ClickSearch;

	public WebElement getClickSearch() {

		return ClickSearch;
	}

	@FindBy(xpath = "//button[@id='rpt_rmtr-btn_adEob']")
	private WebElement ClickExportToCSV;

	public WebElement getClickExportToCSV() {

		return ClickExportToCSV;
	}

	@FindBy(xpath = "//button[normalize-space()='Print']")
	private WebElement ClickPrint;

	public WebElement getClickPrint() {

		return ClickPrint;
	}

	@FindBy(xpath = "")
	private WebElement ClickCancel1;

	public WebElement getClickCancel1() {

		return ClickCancel1;
	}

            //////////////////APPOINTMENT REPORT
	
	@FindBy(id = "normal_login_username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "normal_login_password")

	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//button[@type='submit']")

	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath = "(//a[@id='rpt_nav-lnk_anch'])[1]")
	private WebElement ClickReport;

	public WebElement getClickReport() {
		return ClickReport;
	}

	@FindBy(xpath = "(//a[@id='rpt_nav-lnk_apmt'])[1]")
	private WebElement ClickAppointmentReport;

	public WebElement getClickAppointmentReport() {
		return ClickAppointmentReport;
	}

	@FindBy(xpath = "(//button[text()='Check All'])[2]")
	private WebElement ClickCheckAll1;

	public WebElement getClickCheckAll() {
		return ClickCheckAll1;
	}

	@FindBy(xpath = "//button[text()='UncheckAll']")
	private WebElement ClickUnCheckAll1;

	public WebElement getClickUnCheckAll() {
		return ClickUnCheckAll1;
	}

	@FindBy(xpath = "(//button[text()='Check All'])[1]")
	private WebElement ClickCheckAll;

	public WebElement getClickCheckAll1() {
		return ClickCheckAll;
	}

	@FindBy(xpath = "(//button[text()='Uncheck All'])[1]")
	private WebElement ClickUnCheckAll;

	public WebElement getClickUnCheckAll1() {
		return ClickUnCheckAll;
	}

	@FindBy(xpath = "//input[@placeholder='Patient']")
	private WebElement SearchPatientName;

	public WebElement getSearchPatientName() {
		return SearchPatientName;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement selectNmae;

	public WebElement getselectNmae() {
		return selectNmae;
	}

	@FindBy(xpath = "(//select[@id='rpt_aptrpt-sel_ofc'])[1]")
	private WebElement ClickAllOffice;

	public WebElement getClickAllOffice() {
		return ClickAllOffice;
	}

	@FindBy(xpath = "//option[@value='3']")
	private WebElement Selectoemr;

	public WebElement getSelectoemr() {
		return Selectoemr;
	}

	@FindBy(xpath = "(//input[@id='rpt_aptrpt-dt_frm'])[1]")
	private WebElement clickFromdate;

	public WebElement getclickFromdate() {
		return clickFromdate;
	}

	@FindBy(xpath = "//input[@value=\"2022-05-12\"]")
	private WebElement selectdate8;

	public WebElement getselectdatenumber8() {
		return selectdate8;
	}

	@FindBy(xpath = "(//input[@id='rpt_aptrpt-dt_todt'])[1]")
	private WebElement clickEndDate;

	public WebElement getclickEndDate() {
		return clickEndDate;
	}

	@FindBy(xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[3]/div[1]")
	private WebElement selectdate15;

	public WebElement getselectdate15() {
		return selectdate15;
	}

	@FindBy(xpath = "//button[contains(text(),'Update')]")
	private WebElement clickupdatebutton;

	public WebElement getclickupdatebutton() {
		return clickupdatebutton;
	}

	@FindBy(xpath = "(//input[@id='rpt_aptrpt-inp_icd9'])[1]")
	private WebElement clickRadioButton;

	public WebElement getclickRadioButton() {
		return clickRadioButton;
	}

               //////REMAINDER REPORT ///////

	@FindBy(xpath = "(//a[normalize-space()='Reminder Report'])[1]")
	private WebElement remre;

	public WebElement getremre() {

		return remre;
	}
	
	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement selpat;

	public WebElement getselpat() {

		return selpat;
	}

	@FindBy(xpath = "(//input[@id='patid'])[1]")
	private WebElement remresep;

	public WebElement getremresep() {

		return remresep;
	}

	@FindBy(xpath = "(//input[@id='rpt_rmdr-inp_frdt'])[1]")
	private WebElement remrefrom;

	public WebElement getremrefrom() {

		return remrefrom;
	}

	@FindBy(xpath = "(//input[@id='rpt_rmdr-inp_todt'])[1]")
	private WebElement remreselto;

	public WebElement getremreselto() {

		return remreselto;
	}

	@FindBy(xpath = "(//span[@id='rpt_rmdr-btn_day'])[1]")
	private WebElement remreday;

	public WebElement getremreday() {

		return remreday;
	}

	@FindBy(xpath = "(//span[@id='rpt_rmdr-btn_wek'])[1]")
	private WebElement remreweek;

	public WebElement getremreweek() {

		return remreweek;
	}

	@FindBy(xpath = "(//span[@id='rpt_rmdr-btn_mnth'])[1]")
	private WebElement remremon;

	public WebElement getremremon() {

		return remremon;
	}

	@FindBy(xpath = "(//span[@id='rpt_rmdr-btn_yr'])[1]")
	private WebElement remreye;

	public WebElement getremreye() {

		return remreye;
	}

	@FindBy(xpath = "(//button[@id='rpt_rmdr-btn_upt'])[1]")
	private WebElement cliup;

	public WebElement getcliup() {

		return cliup;
	}

	@FindBy(xpath = "(//a[@id='rpt_nav-lnk_prod'])[1]")
	private WebElement proproc;

	public WebElement getproproc() {

		return proproc;
	}
                /////////// PATIENT REPORT////////////

	@FindBy(xpath = "(//input[@id='rpt_ptRpt-inp_frdt'])[1]")
	private WebElement fromcalenderpr;

	public WebElement getfromcalenderpr() {

		return fromcalenderpr;
	}

	@FindBy(xpath = "//td[@title='2022-03-01']//div[@class='ant-picker-cell-inner'][normalize-space()='1']")
	private WebElement clfromcalenderpr;

	public WebElement getclfromcalenderpr() {

		return clfromcalenderpr;
	}

	@FindBy(xpath = "(//input[@id='rpt_ptRpt-inp_todt'])[1]")
	private WebElement tocalenderpr;

	public WebElement gettocalenderpr() {

		return tocalenderpr;
	}

	@FindBy(linkText = "Today")
	private WebElement cltocalenderpr;

	public WebElement getcltocalenderpr() {

		return cltocalenderpr;
	}

	@FindBy(xpath = "(//input[@id='rpt_ptRpt-inp_ag'])[1]")
	private WebElement seleage;

	public WebElement getseleage() {

		return seleage;
	}

	@FindBy(xpath = "(//select[@id='rpt_ptRpt-sel_gen'])[1]")
	private WebElement selectsex;

	public WebElement getselectsex() {

		return selectsex;
	}

	@FindBy(xpath = "//div[contains(text(),'Male')]")
	private WebElement selesex;

	public WebElement getselesex() {

		return selesex;
	}

	@FindBy(xpath = "(//select[@id='rpt_ptRpt-sel_rce'])[1]")
	private WebElement selerace;

	public WebElement getselerace() {

		return selerace;
	}

	@FindBy(xpath = "(//div[contains(text(),'American Indian or Alaska Native')])[1]")
	private WebElement selectrace;

	public WebElement getselectrace() {

		return selectrace;
	}

	@FindBy(xpath = "(//select[@id='rpt_ptRpt-sel_enty'])[1]")
	private WebElement selectethn;

	public WebElement getselectethn() {

		return selectethn;
	}

	@FindBy(xpath = "//div[contains(text(),'Hispanic or Latino')]")
	private WebElement clickethn;

	public WebElement getclickethn() {

		return clickethn;
	}

	@FindBy(xpath = "(//input[@id='searchmedication'])[1]")
	private WebElement searchmedi;

	public WebElement getsearchmedi() {

		return searchmedi;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement selemedi;

	public WebElement getselemedi() {

		return selemedi;
	}

	@FindBy(xpath = "(//input[@id='rpt_ptRpt-inp_agy'])[1]")
	private WebElement searchallergy;

	public WebElement getsearchallergy() {

		return searchallergy;
	}

	@FindBy(xpath = "//*[@id='demographics']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div")
	private WebElement selealler;

	public WebElement getselealler() {

		return selealler;
	}

	@FindBy(xpath = "(//input[@id='rpt_ptRpt-inp_pbm'])[1]")
	private WebElement searchproblem;

	public WebElement getsearchproblem() {

		return searchproblem;
	}

	@FindBy(xpath = "//*[@id='demographics']/div/div/div[2]/div[2]/div[3]/div/div[2]/div[1]/div/div")
	private WebElement selepro;

	public WebElement getselepro() {

		return selepro;
	}

	@FindBy(xpath = "(//button[normalize-space()='Search'])[1]")
	private WebElement clicksearch;

	public WebElement getclicksearch() {

		return clicksearch;
	}

	@FindBy(xpath = "(//a[normalize-space()='Product Procedures'])[1]")
	private WebElement procor;

	public WebElement getprocor() {

		return procor;
	}

            ///////////TeleHealth Report

	@FindBy(xpath = "//a[contains(text(),'Telehealth Report')]")
	private WebElement clickTeleHealthReport;

	public WebElement getclickTeleHealthReport() {
		return clickTeleHealthReport;
	}

	@FindBy(xpath = "(//button[@id='rpt_thr-btn_chkAl'])[1]")
	private WebElement clickCheckAll;

	public WebElement getclickCheckAll() {
		return clickCheckAll;
	}

	@FindBy(xpath = "(//button[@id='rpt_thr-btn_uchkAl'])[1]")
	private WebElement clickUnCheckAll;

	public WebElement getclickUnCheckAll() {
		return clickUnCheckAll;
	}

	@FindBy(xpath = "(//input[@id='rpt_thr-rdo_ocr'])[1]")
	private WebElement clickOccuredRadioButton;

	public WebElement getclickOccuredRadioButton() {
		return clickOccuredRadioButton;
	}

	@FindBy(xpath = "(//input[@id='rpt_thr-rdo_dnocr'])[1]")
	private WebElement clickDidnotOccuredRadioButton;

	public WebElement getclickDidnotOccuredRadioButton() {
		return clickDidnotOccuredRadioButton;
	}

	@FindBy(xpath = "(//input[@placeholder='Patient Search'])[2]")
	private WebElement SearchThePatientName;

	public WebElement getSearchThePatientName1() {
		return SearchThePatientName;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement selectPatientname;

	public WebElement getselectPatientname() {
		return selectPatientname;
	}

	@FindBy(xpath = "(//select[@id='rpt_thr-sel_ofc'])[1]")
	private WebElement ClickOfficeOption;

	public WebElement getClickOfficeOption() {
		return ClickOfficeOption;
	}

	@FindBy(xpath = "(//input[@placeholder='Start date'])[1]")
	private WebElement SelectclickTestFacilityPhar;

	public WebElement getSelectclickTestFacilityPhar() {
		return SelectclickTestFacilityPhar;
	}

	@FindBy(xpath = "//input[@placeholder='Start date']")
	private WebElement clickStartDate;

	public WebElement getclickStartDate() {
		return clickStartDate;
	}

	@FindBy(xpath = "(//input[@placeholder='End date'])[1]")
	private WebElement SelectStartDate16;

	public WebElement getSelectStartDate16() {
		return SelectStartDate16;
	}

	@FindBy(xpath = "//td[@title='2022-06-14']//div[@class='ant-picker-cell-inner'][normalize-space()='14']")
	private WebElement clickEndDateq;

	public WebElement getclickEndDateq() {
		return clickEndDateq;
	}

	@FindBy(xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[5]/div[1]")
	private WebElement SelectEndDate16;

	public WebElement getSelectEndDateq() {
		return SelectStartDate16;
	}

	@FindBy(xpath = "(//button[@id='rpt_thr-btn_ptSrch'])[1]")
	private WebElement clickUpdateFilterOption;

	public WebElement getclickUpdateFilterOption() {
		return clickUpdateFilterOption;
	}

	@FindBy(xpath = "//button[contains(text(),'Export To File')]")
	private WebElement ClickExportToFile;

	public WebElement getClickExportToFile() {
		return ClickExportToFile;
	}

	@FindBy(xpath = "//button[contains(text(),'Load more...')]")
	private WebElement ClickLoadmore;

	public WebElement getClickLoadmore() {
		return ClickLoadmore;
	}

        ///////////////////// Productivity Report ///////////////

	@FindBy(xpath = "//a[@id='rpt_nav-lnk_prRpt']")
	private WebElement ClickProductivityReport;

	public WebElement getClickProductivityReport() {
		return ClickProductivityReport;
	}

	@FindBy(xpath = "//input[@placeholder='Start date']")
	private WebElement ClickTheFromDate;

	public WebElement getClickTheFromDate() {
		return ClickTheFromDate;
	}

	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='16'])[1]")
	private WebElement SelectTheFromDate16;

	public WebElement getSelectTheFromDate16() {
		return SelectTheFromDate16;
	}

	@FindBy(xpath = "//input[@placeholder='End date']")
	private WebElement clickTheEndDate;

	public WebElement getclickTheEndDate() {
		return clickTheEndDate;
	}

	@FindBy(xpath = "(//div[contains(text(),'31')])[2]")
	private WebElement selectTheEndDate31;

	public WebElement getselectTheEndDate31() {
		return selectTheEndDate31;
	}

	@FindBy(xpath = "//select[@id='b-l-34']")
	private WebElement ClickProvider;

	public WebElement getClickProvider() {
		return ClickProvider;
	}

	@FindBy(xpath = "//option[@value='1']")
	private WebElement SelectProvider;

	public WebElement getSelectProvider() {
		return SelectProvider;
	}

	@FindBy(xpath = "(//input[@id='rpt_prdc-inp_canApt'])[1]")
	private WebElement ClickCheckBox;

	public WebElement getClickCheckBox() {
		return ClickCheckBox;
	}

	@FindBy(xpath = "//button[@id='rpt_prdc-btn_upt']")
	private WebElement ClickUpdateButton;

	public WebElement getClickUpdateButton() {
		return ClickUpdateButton;
	}

	@FindBy(xpath = "//button[@id='load-data']")
	private WebElement ClickLoadMore;

	public WebElement getClickLoadMore() {
		return ClickLoadMore;
	}

       //////////////Outgoing Prescription   ///////////////////////  

	@FindBy(xpath = "//a[normalize-space()='Outgoing Prescriptions']")
	private WebElement ClickOutgoingPrescription;

	public WebElement getClickOutgoingPrescription() {
		return ClickOutgoingPrescription;
	}

	@FindBy(xpath = "(//input[@id='rpt_otPrsc-inp_srPat'])[1]")
	private WebElement EnterPatientName;

	public WebElement getEnterPatientName() {
		return EnterPatientName;
	}

	@FindBy(xpath = "//div[@class='title']")
	private WebElement SelectPatientName;

	public WebElement getSelectPatientName() {
		return SelectPatientName;
	}

	@FindBy(xpath = "//input[@id='rpt_otPrsc-inp_srDes']")
	private WebElement EnterDescription;

	public WebElement getEnterDescription() {
		return EnterDescription;
	}

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement SelectDescription;

	public WebElement getSelectDescription() {
		return SelectDescription;
	}

	@FindBy(xpath = "(//input[@id='rpt_otPrsc-inp_phm'])[1]")
	private WebElement EnterPharmacy;

	public WebElement getEnterPharmacy() {
		return EnterPharmacy;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement SlectPharmacy;

	public WebElement getSlectPharmacy() {
		return SlectPharmacy;
	}

	@FindBy(xpath = "//input[@placeholder='From Date']")
	private WebElement ClickStartDate;

	public WebElement getClickStartDate() {
		return ClickStartDate;
	}

	@FindBy(xpath = "(//div[contains(text(),'24')])[2]")
	private WebElement SelectStartDate;

	public WebElement getSelectStartDate() {
		return SelectStartDate;
	}

	@FindBy(xpath = "(//input[@placeholder='To Date'])[1]")
	private WebElement ClickEndtDate;

	public WebElement getClickEndtDate() {
		return ClickEndtDate;
	}

	@FindBy(xpath = "(//div[contains(text(),'31')])[2]")
	private WebElement SelectEndtDate;

	public WebElement getSelectEndtDate() {
		return SelectEndtDate;
	}

	@FindBy(xpath = "//button[normalize-space()='Update Filter']")
	private WebElement ClickFilter;

	public WebElement getClickFilter() {
		return ClickFilter;
	}

	////////////////////// User Report  /////////////////////////
	
	@FindBy(xpath = "//a[normalize-space()='User Report']")
	private WebElement ClickUserreport;

	public WebElement getClickUserreport() {
		return ClickUserreport;
	}

	@FindBy(xpath = "//input[@id='DocSearchID']")
	private WebElement EnterSearchUsername;

	public WebElement getEnterSearchUsername() {
		return EnterSearchUsername;
	}

	@FindBy(xpath = "//div[@class='title']")
	private WebElement SelectSearchUsername;

	public WebElement getSelectSearchUsername() {
		return SelectSearchUsername;
	}

	@FindBy(xpath = "//input[@id='inactivedoctor']")
	private WebElement clickInactiveRadioButton;

	public WebElement getclickInactiveRadioButton() {
		return clickInactiveRadioButton;
	}

	@FindBy(xpath = "(//button[text()='Search'])[1]")
	private WebElement clickSearchButton;

	public WebElement getclickSearchButton() {
		return clickSearchButton;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]")
	private WebElement clickStaffButton;

	public WebElement getclickStaffButton() {
		return clickStaffButton;
	}

	@FindBy(xpath = "//input[@id='StaffSearchID']")
	private WebElement EnterUserName;

	public WebElement getEnterUserName() {
		return EnterUserName;
	}

	@FindBy(xpath = "//input[@id='inactivestaff']")
	private WebElement ClickInactive;

	public WebElement getClickInactive() {
		return ClickInactive;
	}

	@FindBy(xpath = "(//button[text()='Search'])[2]")
	private WebElement clickSearchButton1;

	public WebElement getclickSearchButton1() {
		return clickSearchButton1;
	}

             /////////////  Invoices  /////////////////

	@FindBy(xpath = "//a[normalize-space()='Invoices']")
	private WebElement ClickInvoices;

	public WebElement getClickInvoices() {
		return ClickInvoices;
	}

	@FindBy(xpath = "//input[@placeholder='Search Patient']")
	private WebElement EnterPatientName1;

	public WebElement getEnterPatientName1() {
		return EnterPatientName1;
	}

	@FindBy(xpath = "//div[@class='title']")
	private WebElement SelectPatientName1;

	public WebElement getSelectPatientName1() {
		return SelectPatientName1;
	}

	@FindBy(xpath = "//*[@id='demographics']/div/div/div[2]/div/div/div[2]/select")
	private WebElement ClickInvoicesStatus;

	public WebElement getClickInvoicesStatus() {
		return ClickInvoicesStatus;
	}

	@FindBy(xpath = "//option[@value='Paid']")
	private WebElement selectPaid;

	public WebElement getselectPaid() {
		return selectPaid;
	}

	@FindBy(xpath = "//input[@placeholder='Search InvoiceId']")
	private WebElement EnterInvoiceid;

	public WebElement getEnterInvoiceid() {
		return EnterInvoiceid;
	}

	@FindBy(xpath = "(//div[@class='title'])[1]")
	private WebElement selectInvoiceId;

	public WebElement getselectInvoiceId() {
		return selectInvoiceId;
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Start date')]")
	private WebElement EnterStartdate;

	public WebElement getEnterStartdate() {
		return EnterStartdate;
	}
	@FindBy(xpath = "//body/div/div/div[contains(@class,'ant-picker-dropdown ant-picker-dropdown-range ant-picker-dropdown-placement-bottomLeft')]/div[@class='ant-picker-range-wrapper ant-picker-date-range-wrapper']/div[@class='ant-picker-panel-container']/div[@class='ant-picker-panels']/div[1]/div[1]/div[1]/button[1]")
	private WebElement ClickFrv;

	public WebElement getClickFrv() {
		return ClickFrv;
	}

	@FindBy(xpath = "(//input[@placeholder='End date'])[1]")
	private WebElement EnterEnddate;

	public WebElement getEnterEnddate() {
		return EnterEnddate;
	}
	@FindBy(xpath = "//td[contains(@title,'2022-10-11')]//div[contains(@class,'ant-picker-cell-inner')][normalize-space()='11']")
	private WebElement EnterEnddate1;

	public WebElement getEnterEnddate1() {
		return EnterEnddate1;
	}


	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement clickSearch;

	public WebElement getclickSearch() {
		return clickSearch;
	}
	
	

}