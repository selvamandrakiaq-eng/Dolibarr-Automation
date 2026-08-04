package com.PomClass;

import java.security.PublicKey;

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

@FindBy(xpath = "(//*[text()='List'])[1]")
public WebElement Listservice;

@FindBy(xpath = "//*[@name='search_ref']")
public WebElement productrefsearch;

@FindBy(xpath = "//*[@class='fas fa-concierge-bell paddingright']")
public WebElement namesearch;

@FindBy(xpath = "(//*[text()='No'])[2]")
public WebElement No;

@FindBy(xpath = "//*[@id='action-clone']")
public WebElement clone;

@FindBy(xpath = "//*[text()='Delete']")
public WebElement delete;

@FindBy(xpath = "(//*[@class='ui-button-icon ui-icon ui-icon-closethick'])[2]")
public WebElement NObutton;

@FindBy(xpath = "//*[text()='Variant attributes']")
public WebElement variantattributes;

@FindBy(xpath = "(//*[@class='fas fa-cube paddingright classfortooltip'])[1]")
public WebElement millesime;

@FindBy(xpath = "//*[text()='Modify']")
public WebElement Modifyinattribute;

@FindBy(xpath ="//*[@name='save']")
public WebElement saveinattribute;

@FindBy(xpath = "//*[@id='line_ref']")
public WebElement lineref;

@FindBy(xpath = "//*[@id='line_value']")
public WebElement value;

@FindBy(xpath = "//*[@id='addline']")
public WebElement Addline;

@FindBy(xpath ="(//*[text()='Statistics'])[1]")
public WebElement statistics;

@FindBy(xpath = "//*[@id='search_id']")
public WebElement productorservice;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
public WebElement tagsservice;

@FindBy(xpath = "//*[@type='search']")
public WebElement searchtags;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[5]")
public WebElement thirdpartyname;

@FindBy(xpath = "//*[@class='button small']")
public WebElement refresh;

@FindBy(xpath = "//*[text()='Services by popularity']")
public WebElement servicepopularity;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement listofservice;

@FindBy(xpath = "//*[@name='refresh']")
public WebElement refreshservice;

@FindBy(xpath ="//*[@type='search']")
public WebElement searchlistofservice;

@FindBy(xpath ="//*[@name='refresh']")
public WebElement Refreshlistofservice;

@FindBy(xpath = "//*[text()='New reception']")
public WebElement newreception;

@FindBy(xpath = "(//*[text()='List'])[2]")
public WebElement Listreception;

@FindBy(xpath = "//*[@name='search_company']")
public WebElement searchcompany;

@FindBy(xpath = "//*[@class='fas fa-times']")
public WebElement cancelbuuton;

@FindBy(xpath = "(//*[text()='Draft'])[1]")
public WebElement Draft;

@FindBy(xpath = "(//*[text()='Validated'])[1]")
public WebElement Validated;

@FindBy(xpath = "(//*[text()='Processed'])[1]")
public WebElement processed;

@FindBy(xpath = "//*[text()='No record found']")
public WebElement textgettext;

@FindBy(xpath ="(//*[text()='Statistics'])[2]")
public WebElement statisticsReception;

@FindBy(xpath ="(//*[@class='select2-selection__arrow'])[2]")
public WebElement partydropdwon;

@FindBy(xpath ="(//*[@class='select2-selection__arrow'])[1]")
public WebElement partydropdwon1;

@FindBy(xpath ="(//*[@class='select2-selection__arrow'])[3]")
public WebElement createdby;

@FindBy(xpath ="(//*[@class='select2-selection__arrow'])[4]")
public WebElement year;

@FindBy(xpath = "//*[@type='submit']")
public WebElement submitbutton;

@FindBy(xpath = "//*[text()='Projects']")
public WebElement projects;

@FindBy(xpath = "//*[text()='New lead or project']")
public WebElement newlead;

@FindBy(xpath = "//*[@class='width500 maxwidth150onsmartphone']")
public WebElement labelproject;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement thirdpartyproject;

@FindBy(xpath = "(//*[@type='search'])[2]")
public WebElement searchthird;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
public WebElement leadstatus;

@FindBy(xpath = "//*[@name='opp_amount']")
public WebElement leadamount;

@FindBy(xpath = "//*[@name='budget_amount']")
public WebElement budgetamt;

@FindBy(xpath = "//*[@name='projectend']")
public WebElement Date;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[4]")
public WebElement visibility;
 
@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[5]")
public WebElement contactassign;

@FindBy(xpath = "(//*[@type='search'])[1]")
public WebElement taggssearch;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[6]")
public WebElement priority;

@FindBy(xpath = "(//*[@type='search'])[2]")
public WebElement prioritysearch;

@FindBy(xpath = "//*[@name='save']")
public WebElement savedraft;

@FindBy(xpath = "//*[@type='search']")
public WebElement thrdsearch;

@FindBy(xpath = "//*[@class='quatrevingtpercent']")
public WebElement labelprojert;

@FindBy(xpath="//span[text()='Send email']")
public WebElement sendemailclick;

@FindBy(xpath="//a[text()='Back to list']")
public WebElement backtolistproject; 

@FindBy(xpath = "(//*[@class='classforajaxtooltip'])[1]")
public WebElement relevantleadclick;

@FindBy(xpath = "//*[@name='search_label']")
public WebElement namesearchproject;

@FindBy(xpath = "//*[@name='submit']")
public WebElement Refresh;

@FindBy(xpath = "//*[text()='New task']")
public WebElement newtask;

@FindBy(xpath = "//*[@name='label']")
public WebElement labelnewtask;

@FindBy(xpath = "//*[@id='date_end']")
public WebElement enddate;

@FindBy(xpath = "//*[@name='budget_amount']")
public WebElement budgetamtt;

@FindBy(xpath = "//*[@name='add']")
public WebElement addnewtask;

@FindBy(xpath = "//*[@class='select2-search__field']")
public WebElement Searchemail;

@FindBy(xpath = "(//*[@type='search'])[2]")
public WebElement Searchemail2;

@FindBy(xpath = "(//*[@type='submit'])[2]")
public WebElement Applybutton;


@FindBy(xpath = "//*[@id='sendto']")
public WebElement toemail;

@FindBy(xpath = "//*[@id='sendtocc']")
public WebElement copyto;

@FindBy(xpath = "//*[@id='sendmail']")
public WebElement senemailb;

@FindBy(xpath = "(//*[text()='List'])[2]")
public WebElement tasklist;

@FindBy(xpath = "//*[@name='search_task_label']")
public WebElement tasknamesearch;


@FindBy(xpath = "(//*[@class='classforajaxtooltip nowraponall'])[1]")
public WebElement relevanttaskclick;

@FindBy(xpath = "(//*[text()='Statistics'])[2]")
public WebElement statisticstaskactivities;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement statisticsdropdwon;

@FindBy(xpath = "//*[@type='search']")
public WebElement searchstatistics;

@FindBy(xpath = "//*[@type='submit']")
public WebElement refreshtaskactivities;

@FindBy(xpath = "(//*[@title='Modify'])[1]")
public WebElement Modifytimetracking;

@FindBy(xpath = "//*[@name='save']")
public WebElement savetimetacking;

@FindBy(xpath = "(//*[@class='classforajaxtooltip refurl valignmiddle'])[1]")
public WebElement clicktimetracking;

@FindBy(xpath = "//*[text()='Commerce']")
public WebElement commerce;

@FindBy(xpath = "//*[text()='New proposal']")
public WebElement newproposal;

@FindBy(xpath = "//*[@name='ref_client']")
public WebElement refcustomerproposal;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement customerproposal;

@FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
public WebElement customerproposal1;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
public WebElement paymentterms;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[4]")
public WebElement paymentmethod;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[5]")
public WebElement sourcecommercial;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[6]")
public WebElement availabilitydelay;

@FindBy(xpath = "//*[@id='date_livraison']")
public WebElement Deliverydate;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[7]")
public WebElement project;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[8]")
public WebElement tagscommercial;

@FindBy(xpath = "//*[@id='note_public']")
public WebElement notepublic;

@FindBy(xpath = "//*[@id='note_private']")
public WebElement noteprivate;

@FindBy(xpath = "//*[@name='save']")
public WebElement savecommercial;

@FindBy(xpath = "(//*[@class='valignmiddle'])[1]")
public WebElement successmessage;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[8]")
public WebElement tagsserach;

@FindBy(xpath = "(//*[text()='New order'])[1]")
public WebElement Neworder;

@FindBy(xpath = "//*[@id='options_custom1']")
public WebElement customfield;

@FindBy(xpath = "//*[@id='liv_']")
public WebElement planneddelivery;

@FindBy(xpath = "(//*[@class='fas fa-download valignmiddle'])[1]")
public WebElement clickdownloadbutton;

@FindBy(xpath = "(//*[@class='pictopreview nowrap'])[1]")
public WebElement downloadpdf;

@FindBy(xpath = "(//*[@class='documentpreview'])[1]")
public WebElement documentpreview;

@FindBy(xpath = "(//*[@class='ui-button-icon ui-icon ui-icon-closethick'])[2]")
public WebElement closewindow;

@FindBy(xpath = "(//*[text()='List'])[1]")
public WebElement Listcommercial;

@FindBy(xpath = "//*[@name='search_refcustomer']")
public WebElement refcustomer;

@FindBy(xpath = "(//*[@class='classforajaxtooltip'])[1]")
public WebElement relevantnameclick;

@FindBy(xpath = "//*[text()='Drafts']")
public WebElement drafts;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[1]")
public WebElement Commercialproposal;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[2]")
public WebElement Contactaddress;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[3]")
public WebElement Notesdraft;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[4]")
public WebElement LinkedFiles;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[5]")
public WebElement Eventsagenta;

@FindBy(xpath = "(//*[@type='submit'])[1]")
public WebElement addcontactdraft;

@FindBy(xpath = "(//*[@class='fa fa-plus-circle valignmiddle btnTitle-icon'])[1]")
public WebElement plusbutton;

@FindBy(xpath = "(//*[@class='fa fa-plus-circle valignmiddle btnTitle-icon'])[1]")
public WebElement plusbuttonsales;


@FindBy(xpath="//input[@name='userfile[]']")
public WebElement choosefile;

@FindBy(xpath="//input[@name='userfile[]']")
public WebElement choosefilesales;


@FindBy(xpath="//input[@name='sendit']")
public WebElement upload;

@FindBy(xpath="//input[@name='sendit']")
public WebElement uploadsales;

@FindBy(xpath = "(//*[@title='Delete'])[1]")
public WebElement delete1;

@FindBy(xpath = "(//*[@title='Delete'])[1]")
public WebElement delete1sales;


@FindBy(xpath = "//*[text()='Yes']")
public WebElement yes;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement thirdpartydrop;

@FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
public WebElement thirdpartysearch;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
public WebElement thirdpartybox;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
public WebElement thirdpartytype;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[3]")
public WebElement thirdpartytypebox;


@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[4]")
public WebElement customercategorydrop;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[4]")
public WebElement customercategorydropbox;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[5]")
public WebElement createddropbox;


@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[5]")
public WebElement createdbydrop;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[6]")
public WebElement createdbydropbox;

@FindBy(xpath = "//*[text()='Edit website properties']")
public WebElement editwebsite;

@FindBy(xpath = "//*[text()='Edit page/container properties']")
public WebElement editpagecontainer;


@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[6]")
public WebElement statusdrop;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[7]")
public WebElement statusdropbox;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[7]")
public WebElement yeardrop;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[8]")
public WebElement yeardropbox;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[9]")
public WebElement bankcode;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[10]")
public WebElement journal;;

@FindBy(xpath = "//*[@name='submit']")
public WebElement refreshstatistics;

@FindBy(xpath = "(//*[text()='New order'])[2]")
public WebElement neworderpurchase;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement vendorthirdparty;

@FindBy(xpath = "(//*[@type='search'])[2]")
public WebElement searchpurchase;

@FindBy(xpath = "(//*[@type='text'])[2]")
public WebElement refvendor;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement paymenttermsdrop;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
public WebElement paymentmethoddrop;

@FindBy(xpath = "(//*[@type='text'])[3]")
public WebElement planneddate;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[4]")
public WebElement projectdropdwon;

@FindBy(xpath = "//*[@name='account_address']")
public WebElement bankaddress;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[5]")
public WebElement currencydropdwon;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement thirdpartydropsales;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement vendorthirddrop;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement purchasethirdpartydrop;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement vendorthirdpartydrop;



@FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
public WebElement thirdpartysearchsales;

@FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
public WebElement vendorsthirdpartysearch;


@FindBy(xpath = "(//*[@class='select2-search__field'])[3]")
public WebElement purchasethirdpartysearch;

@FindBy(xpath = "(//*[@class='select2-search__field'])[3]")
public WebElement vendorthirdpartysearch;


@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
public WebElement salesorderthirdtype;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
public WebElement vendorthirdtype;


@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[3]")
public WebElement purchasethirdtype;


@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[4]")
public WebElement salescustomerdrop;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[4]")
public WebElement purchasecustomerdrop;


@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[5]")
public WebElement salescreatedby;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[5]")
public WebElement purchasecreatedby;


@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[6]")
public WebElement salesstatusdrop;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[7]")
public WebElement salesyeardrop;

@FindBy(xpath ="(//*[text()='Statistics'])[2]")
public WebElement salesstatistics;

@FindBy(xpath = "(//*[text()='List'])[2]")
public WebElement listsales;

@FindBy(xpath = "//*[@name='search_ref_customer']")
public WebElement refcustomersales;

@FindBy(xpath = "(//*[@class='classforajaxtooltip'])[1]")
public WebElement relevantsalesnameclick;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[1]")
public WebElement salesorderlist1;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[2]")
public WebElement salesContactaddress;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[3]")
public WebElement salesNotes;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[4]")
public WebElement SalesLinkedFiles;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[5]")
public WebElement SalesEventsagenta;

@FindBy(xpath = "(//*[@type='submit'])[1]")
public WebElement addcontactsales;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[3]")
public WebElement Notessales;

@FindBy(xpath ="(//*[text()='Statistics'])[4]")
public WebElement purchasestatistics;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[6]")
public WebElement purchaseyear;


@FindBy(xpath = "(//li[@class='select2-search select2-search--inline'])[2]")
public WebElement purchasestatus;

@FindBy(xpath = "(//*[@class='select2-search__field'])[2]")
public WebElement statuspurchase;

@FindBy(xpath = "//*[text()='New price request']")
public WebElement newvendorcreation;


@FindBy(xpath = "//*[@id='liv_']")
public WebElement planneddeliveryvendor;

@FindBy(xpath = "(//*[text()='Statistics'])[3]")
public WebElement statisticsvendor;

@FindBy(xpath = "//*[text()='New contract or subscription']")
public WebElement Newcontract;

@FindBy(xpath = "//*[@id='ref_customer']")
public WebElement customercontract;

@FindBy(xpath = "//*[@id='ref_supplier']")
public WebElement vendorcontract;

@FindBy(xpath = "(//*[@type='text'])[4]")
public WebElement datecontract;

@FindBy(xpath = "(//*[@title='List'])[3]")
public WebElement listvendor;

@FindBy(xpath = "//*[@name='search_company']")
public WebElement searchvendor;

@FindBy(xpath = "//*[@class='classforajaxtooltip refurl valignmiddle']")
public WebElement nameclickvendor;

@FindBy(xpath = "//*[text()='New intervention']")
public WebElement newintervention;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[2]")
public WebElement thirdintervention;

@FindBy(xpath = "//*[@name='description']")
public WebElement description;

@FindBy(xpath = "//*[@id='mainmenua_billing']")
public WebElement billing;

@FindBy(xpath = "(//*[text()='New invoice'])[1]")
public WebElement newinvoics;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[8]")
public WebElement currencyinvoice;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[9]")
public WebElement doctemplate;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[10]")
public WebElement currencytemplate;

@FindBy(xpath = "(//*[text()='List'])[1]")
public WebElement listinvoice;

@FindBy(xpath = "//*[@name='search_project_ref']")
public WebElement searchprjectref;

@FindBy(xpath = "(//*[@class='nobordernopadding nowraponall'])[1]")
public WebElement namesearchlist;

@FindBy(xpath = "//*[text()='Other invoices']")
public WebElement otherinvoice;

@FindBy(xpath = "(//*[text()='Payments'])[1]")
public WebElement payments;

@FindBy(xpath = "(//*[@class= 'classfortooltip'])[4]")
public WebElement nameclickpayment;

@FindBy(xpath = "(//*[@class='select2-search__field'])[3]")
public WebElement searchinvoics;

@FindBy(xpath = "(//*[text()='New invoice'])[2]")
public WebElement newvendorinvoice;

@FindBy(xpath = "//*[@name='ref_supplier']")
public WebElement refsupplier;

@FindBy(xpath = "//*[@name='re']")
public WebElement invoicedate;

@FindBy(xpath = "//*[@id='ech']")
public WebElement dueon;

@FindBy(xpath = "(//*[text()='List'])[2]")
public WebElement listvendorcreation;

@FindBy(xpath = "(//*[@class='classforajaxtooltip'])[1]")
public WebElement nameclickk;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[1]")
public WebElement vendorinvoicee;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[2]")
public WebElement contactaddrss;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[3]")
public WebElement credittransfer;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[4]")
public WebElement notesvendor;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[5]")
public WebElement Linkedfilesvendor;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[6]")
public WebElement Log;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[7]")
public WebElement eventaagenta;

@FindBy(xpath = "(//*[text()='Payments'])[2]")
public WebElement paymentvendor;

@FindBy(xpath = "(//*[@class='classfortooltip'])[4]")
public WebElement clickvendorpayment;

@FindBy(xpath = "(//*[text()='Statistics'])[2]")
public WebElement statistics2;

@FindBy(xpath = "(//span[contains(@class,'select2-selection--single')])[2]")
public WebElement selectedspan1;

@FindBy(xpath = "(//span[contains(@class,'select2-selection--single')])[3]")
public WebElement selectedspan2;

@FindBy(xpath = "(//span[contains(@class,'select2-selection--single')])[4]")
public WebElement selectedspan3;


@FindBy(xpath = "(//span[contains(@class,'select2-selection--single')])[5]")
public WebElement selectedspan4;

@FindBy(xpath = "(//span[contains(@class,'select2-selection--single')])[6]")
public WebElement selectedspan5;

@FindBy(xpath = "//*[text()='Social/fiscal taxes']")
public WebElement sociatax;

@FindBy(xpath = "(//*[text()='New social/fiscal tax'])[1]")
public WebElement newsocial;

@FindBy(xpath = "//*[@class='flat minwidth300']")
public WebElement label;

@FindBy(xpath = "//*[@id='ech']")
public WebElement date;

@FindBy(xpath = "//*[@id='period']")
public WebElement endofdate;

@FindBy(xpath = "//*[@name='amount']")
public WebElement amount;

@FindBy(xpath = "//*[@id='select2-userid-container']")
public WebElement employeebox;

@FindBy(xpath = "//*[text()='IGST']")
public WebElement igst;

@FindBy(xpath = "//*[text()='New']")
public WebElement newigst;

@FindBy(xpath = "//*[@id='label']")
public WebElement labeligst;

@FindBy(xpath = "//*[@id='datev']")
public WebElement enddateperiod;

@FindBy(xpath = "//*[@name='amount']")
public WebElement amountigst;

@FindBy(xpath = "//*[@id='datep']")
public WebElement datesalestax;

@FindBy(xpath = "//*[@name='num_payment']")
public WebElement numberpayment;

@FindBy(xpath = "//*[@name='note']")
public WebElement comments;

@FindBy(xpath = "//*[text()='CGST']")
public WebElement CGST;

@FindBy(xpath = "//*[text()='New']")
public WebElement newcgst;

@FindBy(xpath = "//*[@id='datep']")
public WebElement dateof;

@FindBy(xpath = "//*[text()='SGST']")
public WebElement SGST;

@FindBy(xpath = "//*[text()='New']")
public WebElement newsgst;

@FindBy(xpath = "//*[@title='Loans']")
public WebElement loans;

@FindBy(xpath = "//*[text()='New Loan']")
public WebElement newloan;


@FindBy(xpath = "//*[@id='start']")
public WebElement startdate;

@FindBy(xpath = "//*[@id='end']")
public WebElement Enddate;

@FindBy(xpath = "//*[@name='nbterm']")
public WebElement noofterms;

@FindBy(xpath = "//*[@name='rate']")
public WebElement rate;

@FindBy(xpath = "//*[@name='insurance_amount']")
public WebElement insurance;


@FindBy(xpath = "//*[@name='capital']")
public WebElement capital;

@FindBy(xpath = "//*[@title='Miscellaneous payments']")
public WebElement mispaymnet;

@FindBy(xpath = "//*[@id='fieldchqemetteur']")
public WebElement senderpayment;

@FindBy(xpath = "//*[@id='chqbank']")
public WebElement bank;

@FindBy(xpath = "//*[@name='subledger_account']")
public WebElement subledger;

@FindBy(xpath = "(//*[text()='Banks | Cash'])[1]")
public WebElement Banks;

@FindBy(xpath = "//*[text()='New financial account']")
public WebElement newfinancial;

@FindBy(xpath = "//*[@name='ref']")
public WebElement refno;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[8]")
public WebElement code;

@FindBy(xpath = "(//*[@class='select2-selection__arrow'])[9]")
public WebElement codejournal;

@FindBy(xpath = "//*[@name='url']")
public WebElement weburl;

@FindBy(xpath = "//*[@name='solde']")
public WebElement initialbalance;

@FindBy(xpath = "//*[@name='account_min_allowed']")
public WebElement minbalance;

@FindBy(xpath = "//*[@name='account_min_desired']")
public WebElement mindesired;

@FindBy(xpath = "//*[@name='bank']")
public WebElement bankname;

@FindBy(xpath = "//*[@name='iban']")
public WebElement IFSC;

@FindBy(xpath = "//*[@name='bic']")
public WebElement swift;

@FindBy(xpath = "//*[@name='number']")
public WebElement accnum;

@FindBy(xpath = "//*[@name='proprio']")
public WebElement ownername;

@FindBy(xpath = "//*[@name='owner_address']")
public WebElement owneraddress;

@FindBy(xpath = "//*[@name='owner_zip']")
public WebElement ownerzip;

@FindBy(xpath = "//*[@name='owner_town']")
public WebElement ownertown;

@FindBy(xpath = "//*[text()='List']")
public WebElement listbank;

@FindBy(xpath = "//*[@name='search_label']")
public WebElement searchlabel;

@FindBy(xpath = "(//*[@class='classforajaxtooltip'])[1]")
public WebElement relevantaccount;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[1]")
public WebElement bankaccount;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[2]")
public WebElement bankentries;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[3]")
public WebElement reconcile;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[4]")
public WebElement accountstatement;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[5]")
public WebElement Linkedfiles;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[6]")
public WebElement reports;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[7]")
public WebElement upcomingentries;

@FindBy(xpath = "//*[@name='confirm_reconcile']")
public WebElement confirmrecomcile;

@FindBy(xpath = "//*[@name='confirm_savestatement']")
public WebElement confirmsavesatement;

@FindBy(xpath = "//*[@title='Graphs']")
public WebElement graphs;

@FindBy(xpath = "//*[text()='HRM']")
public WebElement HRM;

@FindBy(xpath = "(//*[text()='New'])[1]")
public WebElement newleave;

@FindBy(xpath = "//*[@id='date_debut']")
public WebElement debutdate;

@FindBy(xpath = "//*[@id='date_fin']")
public WebElement datebin;

@FindBy(xpath = "(//*[text()='New collective leave'])[1]")
public WebElement newcollective;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
public WebElement groups;

@FindBy(xpath = "(//*[@class='select2-search__field'])[1]")
public WebElement searchgroup;

@FindBy(xpath = "//*[@id='autoValidation']")
public WebElement validation;

@FindBy(xpath = "(//*[@type='search'])[3]")
public WebElement searchcollective;

@FindBy(xpath = "(//*[text()='New'])[2]")
public WebElement newexpense;

@FindBy(xpath = "//*[@type='search']")
public WebElement searchexpense;

@FindBy(xpath = "//*[text()='New job positions']")
public WebElement newjob;

@FindBy(xpath = "//*[@id='qty']")
public WebElement noofempl;

@FindBy(xpath = "//*[@id='email_recruiter']")
public WebElement emailr;

@FindBy(xpath = "//*[@id='date_planned']")
public WebElement expecteddate;

@FindBy(xpath = "//*[@id='remuneration_suggested']")
public WebElement salary;

@FindBy(xpath = "//*[text()='Accounting']")
public WebElement Accounting;

@FindBy(xpath = "//*[text()='Customer invoice binding']")
public WebElement customerinvoice;

@FindBy(xpath = "//*[@class='inline-block valignmiddle']")
public WebElement customerbinding;

@FindBy(xpath = "//*[@title='Bind Automatically']")
public WebElement blind;

@FindBy(xpath = "//*[text()='Lines to bind']")
public WebElement linestobind;

@FindBy(xpath = "//*[text()='Vendor invoice binding']")
public WebElement vendorinvoice;

@FindBy(xpath = "//*[text()='Expense report binding']")
public WebElement expensereport;

@FindBy(xpath = "(//*[@class='vsmenu'])[5]")
public WebElement miscellaneous;

@FindBy(xpath = "(//*[@class='vsmenu'])[6]")
public WebElement salesjournal;

@FindBy(xpath = "(//*[@class='vsmenu'])[7]")
public WebElement purcaahsejournal;

@FindBy(xpath = "(//*[@class='vsmenu'])[8]")
public WebElement Bankjournal;

@FindBy(xpath = "(//*[@class='vsmenu'])[9]")
public WebElement expensereports;

@FindBy(xpath = "(//*[@class='vsmenu'])[10]")
public WebElement exportsouce;

@FindBy(xpath = "//*[@name='writebookkeeping']")
public WebElement recordtransaction;

@FindBy(xpath = "//*[text()='Ledger']")
public WebElement ledger;

@FindBy(xpath = "(//*[@class='vsmenu'])[12]")
public WebElement journalsaccounting;

@FindBy(xpath = "(//*[@class='vsmenu'])[13]")
public WebElement Accountbalance;


@FindBy(xpath = "(//*[@class='vsmenu'])[14]")
public WebElement exportaccountancy;

@FindBy(xpath = "//*[@id='mainmenua_ecm']")
public WebElement Documents;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[1]")
public WebElement manualdirectories;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[2]")
public WebElement objectdirectories;

@FindBy(xpath = "(//*[@class='tab inline-block valignmiddle'])[3]")
public WebElement publicdirectories;

@FindBy(xpath = "//*[@class='fas fa-folder-plus size15x marginrightonly']")
public WebElement plusmanual;

@FindBy(xpath = "//*[@name='create']")
public WebElement createdocument;

@FindBy(xpath = "//*[@id='mainmenua_agenda']")
public WebElement agendaheader;

@FindBy(xpath = "//*[text()='New event']")
public WebElement newevent;

@FindBy(xpath = "//*[@id='ap']")
public WebElement startdateagenda;

@FindBy(xpath = "//*[@id='p2']")
public WebElement end;

@FindBy(xpath = "//*[@name='location']")
public WebElement Location;

@FindBy(xpath = "//*[text()='New resource']")
public WebElement newresource;


@FindBy(xpath = "//*[@name='address']")
public WebElement Addressagenda;

@FindBy(xpath = "//*[@id='max_users']")
public WebElement minusers;

@FindBy(xpath = "//*[@id='url']")
public WebElement urlres;

@FindBy(xpath = "//*[@id='mainmenua_ticket']")
public WebElement tickets;

@FindBy(xpath = "//*[text()='New article']")
public WebElement newarticle;

@FindBy(xpath = "//*[@id='question']")
public WebElement question;

@FindBy(xpath = "//*[text()='New Ticket']")
public WebElement newticket;

@FindBy(xpath = "//*[@name='subject']")
public WebElement subject;

@FindBy(xpath = "//*[@id='mainmenua_tools']")
public WebElement Tools;

@FindBy(xpath = "//*[@title='Tags/categories']")
public WebElement tagscaregories;

@FindBy(xpath = "//*[@title='Email templates']")
public WebElement emailtemplate;

@FindBy(xpath = "//*[@title='Mass EMails']")
public WebElement massemail;

@FindBy(xpath = "//*[@title='New mass Email']")
public WebElement newmass;

@FindBy(xpath = "//*[@id='title']")
public WebElement title;

@FindBy(xpath = "//*[@name='from']")
public WebElement from;

@FindBy(xpath = "//*[@name='errorsto']")
public WebElement errorsto;

@FindBy(xpath = "//*[@name='replyto']")
public WebElement replyto;

@FindBy(xpath = "//*[text()='Websites']")
public WebElement websites;

@FindBy(xpath = "//*[@name='cancel']")
public WebElement cancel;

@FindBy(xpath = "//*[@title='Regenerate web site cache files']")
public WebElement regenerate;

@FindBy(xpath = "//*[@title='Generate website sitemap.xml file']")
public WebElement generate;

@FindBy(xpath = "//*[text()='No']")
public WebElement nobutton;



@FindBy(xpath="//span[@id=\"select2-website-container\"]")
public WebElement mywebsitedrop;

@FindBy(xpath="//ul[@id=\"select2-website-results\"]//li[text()=\"template-stellar\"]")
public WebElement mywebsitedropdown;

@FindBy(xpath = "(//*[@class='select2-selection__rendered'])[1]")
public WebElement websiteweb;
}
