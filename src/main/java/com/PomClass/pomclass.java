package com.PomClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.baseclass;
import com.PomClass.pomclass;

public class pomclass extends baseclass{

	public static WebDriver driver;

	public pomclass(WebDriver driver) {
		pomclass.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath= "//span[text()='Test online']")
public WebElement Testonline;

@FindBy(xpath = "(//*[@class ='']")
public WebElement create;

@FindBy(xpath = "//*[@id='username']")
public WebElement email;

@FindBy(xpath = "//*[@id='orgName']")
public WebElement companyname;

@FindBy(xpath = "//*[@id='phone']")
public WebElement phone;

@FindBy(xpath = "//*[@id='password']")
public WebElement password;

@FindBy(xpath= "//*[@id='password']")
public WebElement repeatpassword;

@FindBy(xpath= "//*[@id='optinmessages']")
public WebElement checkbox;

@FindBy(xpath = "//*[@type='submit']")
public WebElement Signup;

@FindBy(xpath = "(//*[text()='Features'])[1]")
public WebElement features;

@FindBy(xpath = "//*[@href='/presentation-prospect-and-customers.php']")
public WebElement customers;

@FindBy(xpath = "//*[@href='/presentation-opportunities.php']")
public WebElement opportunites;

@FindBy(xpath = "//div[@class='inner_skew_doc']")
public WebElement pagetitle;

@FindBy(xpath = "//*[@href='/presentation-quotes-proposals.php']")
public WebElement proposals;

@FindBy(xpath= "//*[text()='Create your Quote or Commercial Proposal']")
public WebElement textvalidation;

@FindBy(xpath ="//*[@href='/presentation-orders.php']")
public WebElement sales;

@FindBy(xpath = "//*[@href='/presentation-contracts-subscriptions.php']")
public WebElement contracts;

@FindBy(xpath = "//*[@href='/presentation-tickets.php']")
public WebElement helpdesk;

@FindBy(xpath ="//*[@href='/presentation-knowledge.php']")
public WebElement knowledge;

@FindBy(xpath = "//*[@class='inner_skew_doc']")
public WebElement knowledgegettext;

@FindBy(xpath = "//*[@href='/presentation-users-employees.php']")
public WebElement Employees;

@FindBy(xpath = "//*[@href='/presentation-expense-reports.php']")
public WebElement Expensereports;

@FindBy(xpath = "//*[@href='/presentation-leave-requests.php']")
public WebElement Leaverequest;

@FindBy(xpath = "//*[@href='/presentation-timesheets.php']")
public WebElement Timesheet;

@FindBy(xpath= "//span[contains(text(),'Timesheets')]")
public WebElement pagetexttimesheet;

@FindBy(xpath = "//*[@href='/presentation-recruitments.php']")
public WebElement Recruitment;

@FindBy(xpath = "//h1[contains(text(),'Define your job positions, publish them, track applications')]")
public WebElement pagetextrecruitment;

@FindBy(xpath = "//*[@href='/presentation-membership-management.php']")
public WebElement Membership;

@FindBy(xpath = "//*[@href='/presentation-cms-website.php']")
public WebElement CMS;

@FindBy(xpath = "//*[@href='/presentation-point-of-sale-pos.php']")
public WebElement POS;

@FindBy(xpath = "(//div[@class='inner_skew_doc'])[1]")
public WebElement pagetextPOS;

@FindBy(xpath = "//*[@href='/presentation-products-services.php']")
public WebElement productservice;

@FindBy(xpath = "//*[@href='/presentation-stock-management.php']")
public WebElement Stock;

@FindBy(xpath = "//*[@href='/presentation-purchase-approvisionning.php']")
public WebElement Purchaseapprovising;

@FindBy(xpath = "//*[@href='/presentation-shipments.php']")
public WebElement Shipments;

@FindBy(xpath = "//*[@class='inner_skew_doc']")
public WebElement pagetextshipment;

@FindBy(xpath = "//*[@href='/presentation-production-mrp.php']")
public WebElement Manufacturing;

@FindBy(xpath = "(//*[@class='inner_skew_doc'])[1] ")
public WebElement pagetextManufactoring;

@FindBy(xpath = "//*[@class='fa fa-file-invoice-dollar fa2x']")
public WebElement Billing;

@FindBy(xpath = "//*[@href='/presentation-bank-reconciliation.php']")
public WebElement Bankreconciliation;

@FindBy(xpath = "//*[@href='/presentation-double-entry-accounting.php']")
public WebElement Doubleentrycounting;

@FindBy(xpath = "//*[@href='/presentation-emailing.php']")
public WebElement Emailing;

@FindBy(xpath = "//span[contains(text(),'Mass Emailing')]")
public WebElement pagetextemailing;

@FindBy(xpath = "//*[@href='/presentation-surveys-polls.php']")
public WebElement Surveys;

@FindBy(xpath = "//*[@href='/presentation-projects-tasks.php']")
public WebElement Project;

@FindBy(xpath = "//*[@href='/presentation-interventions.php']")
public WebElement Interventions;

@FindBy(xpath = "//*[@class='inner_skew_doc']")
public WebElement pagetextintervention;

@FindBy(xpath = "//*[@href='/presentation-agenda.php']")
public WebElement Agenda;

@FindBy(xpath = "//*[@href='/presentation-api.php']")
public WebElement API;

@FindBy(xpath = "//*[@href='/presentation-connectivity.php']")
public WebElement Connectivity;

@FindBy(xpath = "//*[@class='inner_skew_doc']")
public WebElement pagetextconnectivity;

@FindBy(xpath = "//*[@href='/presentation-imports-exports.php']")
public WebElement importexport;

@FindBy(xpath = "//*[@href='/presentation-development-ide.php']")
public WebElement Modulebuilder;

@FindBy(xpath = "//span[@class='fa fa-home']")
public WebElement Home;

@FindBy(xpath = "//*[contains(text(),'Click to test')]")
public WebElement solution2;

@FindBy(xpath = "//div[text()='Company or freelance selling service only']")
public WebElement freelaunce;

@FindBy(xpath = "//div[@class='hideonsmartphone']")
public WebElement pagetextsolution2;

@FindBy(xpath = "//*[@id='username']")
public WebElement username;

@FindBy(xpath = "//*[@id='password']")
public WebElement password1;

@FindBy(xpath = "//div[@id='login-submit-wrapper']")
public WebElement Login;

@FindBy(xpath = "//*[text()='My Dashboard']")
public WebElement Loginpagetext;

@FindBy(xpath = "//div[@class='jnotify-message']")
public WebElement Loginvalidation;

@FindBy(xpath = "//*[@id='mainmenua_companies']")
public WebElement Thirdparty;

@FindBy(xpath = "(//*[@class='vsmenu'])[4]")
public WebElement Newprosperty;

@FindBy(xpath = "//*[@id='name']")
public WebElement Thirdpartyname;

@FindBy(xpath = "(//*[@class='minwidth300'])[2]")
public WebElement commercialname;

@FindBy(xpath = "//*[@id='prospectinput']")
public WebElement prospect;

@FindBy(xpath = "//*[@id='address']")
public WebElement Address;

@FindBy(xpath = "//*[@name='zipcode']")
public WebElement Zipcode;

@FindBy(xpath = "//*[@name='town']")
public WebElement City;

@FindBy(xpath = "//*[@id='select2-state_id-container']")
public WebElement clickstate;

@FindBy(xpath = "(//*[@class='select2-search__field'])[4]")
public WebElement searchstate;

@FindBy(xpath = "//*[@id='phone']")
public WebElement Phonenumber;

@FindBy(xpath = "//*[@id='phone_mobile']")
public WebElement Mobile;

@FindBy(xpath = "//*[@id='fax']")
public WebElement fax;

@FindBy(xpath ="//*[@id='url']")
public WebElement Web;

@FindBy(xpath ="//*[@id='email']")
public WebElement Emailid;

@FindBy(xpath ="//*[@id='idprof1']")
public WebElement profId1;

@FindBy(xpath ="//*[@id='idprof2']")
public WebElement profId2;

@FindBy(xpath ="//*[@id='idprof3']")
public WebElement profId3;

@FindBy(xpath ="//*[@id='idprof4']")
public WebElement profId4;

@FindBy(xpath ="//*[@id='idprof5']")
public WebElement profId5;

@FindBy(xpath = "//*[@id='intra_vat']")
public WebElement Vatid;

@FindBy(xpath = "//*[@name='save']")
public WebElement Create;

@FindBy(xpath = "//div[@class='jnotify-message']")
public WebElement creationvalidation;

@FindBy(xpath = "(//*[@class='vsmenu'])[3]")
public WebElement Prospects;

@FindBy(xpath = "(//*[@class='flat searchstring maxwidth75imp'])[1]")
public WebElement searchbox;

@FindBy(xpath = "//*[@class='fas fa-search']")
public WebElement clicksearch;

@FindBy(xpath = "(//*[@class='classforajaxtooltip refurl valignmiddle'])[1]")
public WebElement nameclick;

@FindBy(xpath = "(//*[@class='vsmenu'])[6]")
public WebElement customercreation;

@FindBy(xpath ="(//*[@class='vsmenu'])[9]")
public WebElement contactcreation;

@FindBy(xpath = "//*[@id='lastname']")
public WebElement lastname;

@FindBy(xpath = "//*[@id='firstname']")
public WebElement Firstname;

@FindBy(xpath ="//*[@id='title']")
public WebElement jobposition;

@FindBy(xpath = "//*[@id='address']")
public WebElement address;

@FindBy(xpath = "//*[@id='zipcode']")
public WebElement zipcode;

@FindBy(xpath = "//*[@id='town']")
public WebElement town;

@FindBy(xpath = "//*[@id='phone_pro']")
public WebElement Busphone;

@FindBy(xpath = "//*[@id='phone_perso']")
public WebElement Persphone;

@FindBy(xpath = "//*[@id='phone_mobile']")
public WebElement Mobile1;

@FindBy(xpath = "//*[@id='fax']")
public WebElement Fax;

@FindBy(xpath = "//*[@id='email']")
public WebElement Emailcontact;

@FindBy(xpath = "//*[@name='add']")
public WebElement ADD;

@FindBy(xpath = "(//*[@class='vsmenu'])[10]")
public WebElement List;

@FindBy(xpath ="(//*[@class='vsmenu'])[11]")
public WebElement prospects;

@FindBy(xpath ="(//*[@class='vsmenu'])[12]")
public WebElement customer1;

@FindBy(xpath ="(//*[@class='vsmenu'])[13]")
public WebElement vendors;

@FindBy(xpath ="(//*[@class='vsmenu'])[14]")
public WebElement other;

@FindBy(xpath = "(//*[@class='vsmenu'])[8]")
public WebElement newvendor;

@FindBy(xpath ="//*[@name='search_lastname']")
public WebElement Lastnamesearch;

@FindBy(xpath ="(//span[@class='valignmiddle'])[1]")
public WebElement relevantname;

@FindBy(xpath ="//*[text()='Back to list']")
public WebElement backtolist;

@FindBy(xpath ="//*[text()='Send email']")
public WebElement sendemail;

@FindBy(xpath = "//*[@name='sendto']")
public WebElement emailto;

@FindBy(xpath ="//*[text()='Modify']")
public WebElement Modify;

@FindBy(xpath ="//*[@name='save']")
public WebElement Save;

@FindBy(xpath ="//*[text()='Disable']")
public WebElement disable;

@FindBy(xpath ="//*[text()='Reactivate']")
public WebElement reactivate;

@FindBy(xpath ="//*[text()='Delete']")
public WebElement Delete;

@FindBy(xpath ="(//*[text()='No'])[2]")
public WebElement deleteno;

@FindBy(xpath = "//*[text()='Services']")
public WebElement services;

@FindBy(xpath = "//*[text()='New service']")
public WebElement Newservice;

@FindBy(xpath = "//input[@id='ref']")
public WebElement Productref;

@FindBy(xpath = "//input[@id='label']")
public WebElement Label;

@FindBy(xpath ="//iframe[contains(@class,'cke_wysiwyg_frame')]")
public WebElement Descriptionclick;

@FindBy(xpath ="//body[@contenteditable='true']")
public WebElement Description;

@FindBy(xpath = "//*[@class='quatrevingtpercent']")
public WebElement publicurl;

@FindBy(xpath = "//*[@name='duration_value']")
public WebElement Duration;

@FindBy(xpath = "//*[@id='note_private']")
public WebElement Notes;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[5]")
public WebElement Tags;

@FindBy(xpath = "//*[@title='01-MASTIC']")
public WebElement tagsmastic;

@FindBy(xpath = "//*[@name='price']")
public WebElement sellingprice;

@FindBy(xpath = "//*[@name='price_min']")
public WebElement Minsellingprice;

@FindBy(xpath = "(//*[@id='select2-accountancy_code_sell-container'])[1]")
public WebElement Accountingsale;

@FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='searchbox']")
public WebElement searchaccountingsale;

@FindBy(xpath = "//span[@id='select2-accountancy_code_sell_export-container']")
public WebElement salesimport;

@FindBy(xpath = "//span[@id='select2-accountancy_code_buy-container']/ancestor::span[contains(@class,'select2-selection')]")
public WebElement purchased;

@FindBy(xpath = "//span[@id='select2-accountancy_code_buy_export-container']")
public WebElement purchaseimport;

@FindBy(xpath ="//*[@name='add']")
public WebElement createservice;




}
