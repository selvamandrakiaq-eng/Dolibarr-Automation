package com.StepDefinition;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.baseclass;
import com.PomClass.pomclass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends baseclass{

	pomclass d1 = new pomclass(driver);

	@Given("user launch browser")
	public void userLaunchBrowser() {
		
	}
	
	@Given("user click the Test online in Homepage")
	public void user_click_the_test_online_in_homepage()throws Exception {
		click(d1.Testonline);
		Assert.assertTrue("User is not click the Testonline",CurrentURL().contains("onlinedemo.php"));
	    
	}
	@When("user click the create my instance")
	public void user_click_the_create_my_instance()throws Exception {
	   click(d1.create); 
	   String actualURL = driver.getCurrentUrl();
	   String expectedURL = "https://www.dolibarr.org/onlinedemo.php";
	   Assert.assertEquals(actualURL, expectedURL);
	}
  
	@When("user enter the email id {string}")
	public void user_enter_the_email_id(String string) throws Exception{
	   sendkeys(d1.email, string);
	}
	@When("user enter the companyname {string}")
	public void user_enter_the_companyname(String string)throws Exception {
	    sendkeys(d1.companyname, string);
	}


	@When("user enter the phone number {string}")
	public void user_enter_the_phone_number(String string)throws Exception {
	   sendkeys(d1.phone, string); 
	}
	@When("user enter the password {string}")
	public void user_enter_the_password(String string)throws Exception {
	    sendkeys(d1.password, string);
	}
	@When("user enter the repeatpassword {string}")
	public void user_enter_the_repeatpassword(String string)throws Exception {
	    sendkeys(d1.repeatpassword, string);   
	}


      @When("user enter the phonenumber {string}")
     public void user_enter_the_phonenumber(String string)throws Exception {
      sendkeys(d1.phone, string);
}

       @Then("user click the checkbox in signup page")
       public void user_click_the_checkbox_in_signup_page()throws Exception {
       sendkeys(d1.checkbox, getParentWindow());
}

      @Then("user click the signup button")
    public void user_click_the_signup_button() {
      click(d1.Signup);
      	}
    
      @Given("user click the features in dashborad page")
      public void user_click_the_features_in_dashborad_page()throws Exception {
    	  click(d1.features);
    	  String actualURL = driver.getCurrentUrl();
   	   String expectedURL = "https://www.dolibarr.org/#features";
   	   Assert.assertEquals(actualURL, expectedURL);
      }
    	 
        @Given("user click the crm sales customers in features")
      public void user_click_the_crm_sales_customers_in_features() throws Exception {
    	  click(d1.customers);
          Assert.assertTrue("User is not click the crm sales customer",CurrentURL().contains("presentation-prospect-and-customers.php")); 
          driver.navigate().back(); 
          
      }
        
      @When("user click the opportunites in features dashboard page")
      public void user_click_the_opportunites_in_features_dashboard_page()throws Exception {
         click(d1.opportunites);
         Assert.assertTrue("user moved to opportunites page", isdisplayed(d1.pagetitle));
         driver.navigate().back();

      }
      
      @When("user click the proposals in features dashboard page")
      public void user_click_the_proposals_in_features_dashboard_page()throws Exception {
         click(d1.proposals);
      Assert.assertTrue("user moved to proposal page", isdisplayed(d1.textvalidation));
      driver.navigate().back();
         
      }
      @Then("user click the sales and order in the dasboard page")
      public void user_click_the_sales_and_order_in_the_dasboard_page()throws Exception {
         click(d1.sales);
         Assert.assertTrue("User is not click the sales and order",CurrentURL().contains("presentation-orders.php"));
         driver.navigate().back(); 
      }
      @Then("user click the contracts in the features dashboard page")
      public void user_click_the_contracts_in_the_features_dashboard_page()throws Exception {
         click(d1.contracts);
         String actualURL = driver.getCurrentUrl();
     	   String expectedURL = "https://www.dolibarr.org/presentation-contracts-subscriptions.php";
     	   Assert.assertEquals(actualURL, expectedURL);
     	  driver.navigate().back();
         
      }
      @Then("user click the Helpdesk in the crm and sales dashboard page")
      public void user_click_the_helpdesk_in_the_crm_and_sales_dashboard_page()throws Exception {
           click(d1.helpdesk);
           Assert.assertTrue("User is not click the helpdesk",CurrentURL().contains("presentation-tickets.php"));
           driver.navigate().back();
      }
      @Then("user click the Knowledge in the crm and sales dashboard page")
      public void user_click_the_knowledge_in_the_crm_and_sales_dashboard_page()throws Exception {
         click(d1.knowledge);
         Assert.assertTrue("user moved to knowledge page", isdisplayed(d1.knowledgegettext));
         driver.navigate().back();
      }


      @Given("user click the employees in the HR management")
      public void user_click_the_employees_in_the_hr_management() throws Exception{
          click(d1.Employees);
          String actualURL = driver.getCurrentUrl();
    	   String expectedURL = "https://www.dolibarr.org/presentation-users-employees.php";
    	   Assert.assertEquals(actualURL, expectedURL);
    	  driver.navigate().back();
      }
      @When("user click the Expense reports in the HR Management")
      public void user_click_the_expense_reports_in_the_hr_management()throws Exception {
       click(d1.Expensereports); 
       Assert.assertTrue("User is not click the expense report",CurrentURL().contains("presentation-expense-reports.php"));
       driver.navigate().back();
      }
      @When("user click the leave request in the HR Management")
      public void user_click_the_leave_request_in_the_hr_management()throws Exception {
          click(d1.Leaverequest);
          Assert.assertTrue("User is not click the leave request in HR Management",CurrentURL().contains("presentation-leave-requests.php"));
          driver.navigate().back();
      }
      @When("user click the timesheets in the HR Management")
      public void user_click_the_timesheets_in_the_hr_management()throws Exception {
          click(d1.Timesheet);
          System.out.println(gettext(d1.pagetexttimesheet));
          driver.navigate().back();
      }
      @When("user click the recuirement in the HR Management")
      public void user_click_the_recuirement_in_the_hr_management()throws Exception {
          click(d1.Recruitment);
          Assert.assertTrue("user moved to recuirement page", isdisplayed(d1.pagetextrecruitment));
          driver.navigate().back();
      }
      @Then("user click the membership in the HR management")
      public void user_click_the_membership_in_the_hr_management() throws Exception{
          click(d1.Membership);
          String actualURL = driver.getCurrentUrl();
   	   String expectedURL = "https://www.dolibarr.org/presentation-membership-management.php";
   	   Assert.assertEquals(actualURL, expectedURL);
   	    driver.navigate().back();
      }

      @Given("user click the cms and website in Features")
      public void user_click_the_cms_and_website_in_features()throws Exception {
         click(d1.CMS);
         Assert.assertTrue("User is not click the CMS in HR Management",CurrentURL().contains("presentation-cms-website.php"));
         driver.navigate().back();
      }

      @Then("user click the point of sale in the Features")
      public void user_click_the_point_of_sale_in_the_features()throws Exception {
          click(d1.POS);
          Assert.assertTrue("user moved to point of sale page", isdisplayed(d1.pagetextPOS));
          driver.navigate().back();
      }

      @Given("user click the product service page in the Features")
      public void user_click_the_product_service_page_in_the_features()throws Exception {
          click(d1.productservice);
          String actualURL = driver.getCurrentUrl();
      	   String expectedURL = "https://www.dolibarr.org/presentation-products-services.php";
      	   Assert.assertEquals(actualURL, expectedURL);
            driver.navigate().back();
      }

      @When("user click the stock page in the feature")
      public void user_click_the_stock_page_in_the_feature()throws Exception {
             click(d1.Stock);
       Assert.assertTrue("User is not click the stock page in product stock",CurrentURL().contains("presentation-stock-management.php"));
             driver.navigate().back();
      }

      @When("user click the purchase approvising in feature")
      public void user_click_the_purchase_approvising_in_feature()throws Exception {
        click(d1.Purchaseapprovising); 
        Assert.assertTrue("User is not click the purchase page in product stock",CurrentURL().contains("presentation-purchase-approvisionning.php"));
       driver.navigate().back();
      }

      @When("user click the shipments in the Feature")
      public void user_click_the_shipments_in_the_feature()throws Exception {
          click(d1.Shipments);
        Assert.assertTrue("user moved to shipments page", isdisplayed(d1.pagetextshipment));
          driver.navigate().back();
      }

      @Then("user click the Manufacturing in the Feature")
      public void user_click_the_manufacturing_in_the_feature()throws Exception {
          click(d1.Manufacturing);
       Assert.assertTrue("user moved to Manufactoring page", isdisplayed(d1.pagetextManufactoring));
          driver.navigate().back();
      }

      @Given("user click the Bills and payment in Finance")
      public void user_click_the_bills_and_payment_in_finance()throws Exception {
    	  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	  wait.until(ExpectedConditions.elementToBeClickable(d1.Billing));
           click(d1.Billing); 
       Assert.assertTrue("User is not click the Bills payment page",CurrentURL().contains("presentation-billing-invoicing.php"));    
           driver.navigate().back();
      }

      @When("user click the Bank reconciliation in Finance")
      public void user_click_the_bank_reconciliation_in_finance()throws Exception {
          click(d1.Bankreconciliation);
          String actualURL = driver.getCurrentUrl();
     	   String expectedURL = "https://www.dolibarr.org/presentation-bank-reconciliation.php";
     	   Assert.assertEquals(actualURL, expectedURL);
          driver.navigate().back();
      }

      @Then("user click the Double entry accounting in finance")
      public void user_click_the_double_entry_accounting_in_finance()throws Exception {
         click(d1.Doubleentrycounting);
         Assert.assertTrue("User is not click the double entry page",CurrentURL().contains("presentation-double-entry-accounting.php"));
         driver.navigate().back();
      }

      @Given("user click the Emailing in the Marketing")
      public void user_click_the_emailing_in_the_marketing()throws Exception {
         click(d1.Emailing);
         Assert.assertTrue("User is not click the Emailing page in Marketing",CurrentURL().contains("presentation-emailing.php"));
         driver.navigate().back();
      }

      @Then("user click the surveys in the Marketing")
      public void user_click_the_surveys_in_the_marketing()throws Exception {
          click(d1.Surveys);
          Assert.assertTrue("User is not click the Surveys page in Marketing",CurrentURL().contains("presentation-surveys-polls.php"));
          driver.navigate().back();
      }

      @Given("user click the project and tasks in the productivity")
      public void user_click_the_project_and_tasks_in_the_productivity()throws Exception{
          click(d1.Project); 
          String actualURL = driver.getCurrentUrl();
    	   String expectedURL = "https://www.dolibarr.org/presentation-projects-tasks.php";
    	   Assert.assertEquals(actualURL, expectedURL);
          driver.navigate().back();
      }

      @When("user click the Interventions in the productivity")
      public void user_click_the_interventions_in_the_productivity()throws Exception {
         click(d1.Interventions);
         Assert.assertTrue("user moved to Interventions page", isdisplayed(d1.pagetextintervention));
         driver.navigate().back();
      }

      @Then("user click the agenda in the productivity")
      public void user_click_the_agenda_in_the_productivity()throws Exception {
          click(d1.Agenda);
          Assert.assertTrue("User is not click the Agenta page in productivity",CurrentURL().contains("presentation-agenda.php")); 
          driver.navigate().back();
      }

      @Given("user click the API Integration page in feature")
      public void user_click_the_api_integration_page_in_feature()throws Exception {
          click(d1.API);
          String actualURL = driver.getCurrentUrl();
   	   String expectedURL = "https://www.dolibarr.org/presentation-api.php";
   	   Assert.assertEquals(actualURL, expectedURL);
        driver.navigate().back();
      }

      @When("user click the connectivity with external tools in feature")
      public void user_click_the_connectivity_with_external_tools_in_feature() throws Exception {
         click(d1.Connectivity);
         Assert.assertTrue("user moved to connectivity page", isdisplayed(d1.pagetextconnectivity)); 
         driver.navigate().back();
    }

      @When("user click the export import in feature")
      public void user_click_the_export_import_in_feature()throws Exception {
        click(d1.importexport); 
       Assert.assertTrue("User is not click the export page",CurrentURL().contains("presentation-imports-exports.php")); 
        driver.navigate().back();
      }

      @Then("user click the Module Builder for developers")
      public void user_click_the_module_builder_for_developers()throws Exception {
          click(d1.Modulebuilder);
          Assert.assertTrue("User is not click the module buider page",CurrentURL().contains("presentation-development-ide.php"));  
          driver.navigate().back();
      }

      @Given("user click the Home icon")
      public void user_click_the_home_icon()throws Exception {
         click(d1.Home);
          
      }
      @When("user click the Test online in dashboard page")
      public void user_click_the_test_online_in_dashboard_page()throws Exception {
          click(d1.Testonline);
          String actualURL = driver.getCurrentUrl();
      	   String expectedURL = "https://www.dolibarr.org/onlinedemo.php";
      	   Assert.assertEquals(actualURL, expectedURL);
      }
      @When("user click the solution2 option")
      public void user_click_the_solution2_option() throws Exception {
    	  scrolldown(d1.solution2);
         click(d1.solution2);
      }
      @When("user click the Freelance selling service only")
      public void user_click_the_freelance_selling_service_only() throws Exception{
    	  switchToNewWindow();
    	  scrolldown(d1.freelaunce);
          click(d1.freelaunce);
      }
      
      @When("user enter the username {string}")
      public void user_enter_the_username(String string)throws Exception {
          sendkeys(d1.username, string);
      }
      @When("user enter the password1 {string}")
      public void user_enter_the_password1(String string)throws Exception {
          sendkeys(d1.password1, string);
      }

       @Then("user click the Login if entered credentials are valid {string}")
      public void user_click_the_login_if_entered_credentials_are_valid(String status) throws Exception{
         click(d1.Login);
         if (status.equalsIgnoreCase("valid")) 
       Assert.assertTrue("user is loggedin successfully", isdisplayed(d1.Loginpagetext));
 		
       else {
		System.out.println(gettext(d1.Loginvalidation));
       }
            
 	}
//       @Given("user accept the alert popup message")
//       public void user_accept_the_alert_popup_message()throws Exception {
//          acceptalert();
//          waitimplicit();
//       }

       @Given("user click the third party in the Header")
       public void user_click_the_third_party_in_the_header() throws Exception{
           click(d1.Thirdparty);
           String actualURL = driver.getCurrentUrl();
      	   String expectedURL = "https://demo.dolibarr.org/societe/index.php?mainmenu=companies&leftmenu=";
      	   Assert.assertEquals(actualURL, expectedURL);
 
       }

       @When("user click the new prospect creation")
       public void user_click_the_new_prospect_creation()throws Exception {
           click(d1.Newprosperty);
           String actualURL = driver.getCurrentUrl();
      	   String expectedURL = "https://demo.dolibarr.org/societe/card.php?leftmenu=prospects&action=create&type=p&mainmenu=companies";
      	   Assert.assertEquals(actualURL, expectedURL);

          
       }

       @When("user enter the Third party name in the input field {string}")
       public void user_enter_the_third_party_name_in_the_input_field(String string)throws Exception {
          sendkeys(d1.Thirdpartyname, string);
       }

       @When("user enter the Third party Alias name {string}")
       public void user_enter_the_third_party_alias_name(String string)throws Exception {
           sendkeys(d1.commercialname, string);
       }

//       @When("user click the prospect checkbox")
//       public void user_click_the_prospect_checkbox()throws Exception {
//          click(d1.checkbox); 
//          waitimplicit();
//       }

       @When("user enter the Address in the input field {string}")
       public void user_enter_the_address_in_the_input_field(String string)throws Exception {
          sendkeys(d1.Address, string);
       }

       @When("user enter the Zipcode in the input field {string}")
       public void user_enter_the_zipcode_in_the_input_field(String string) throws Exception{
           sendkeys(d1.Zipcode, string);
       }

       @When("user enter the City in the input field {string}")
       public void user_enter_the_city_in_the_input_field(String string)throws Exception {
          sendkeys(d1.City, string);
       }

       @When("user click the State in the input field")
       public void user_click_the_state_in_the_input_field()throws Exception {
       click(d1.clickstate);          
       }

       @When("user select the state from the dropdwon list {string}")
       public void user_select_the_state_from_the_dropdwon_list(String string)throws Exception {
        sendkeys(d1.searchstate, string);
        pressEnter(d1.searchstate);
       }

	   @When("user enter the phone number in the field {string}")
       public void user_enter_the_phone_number_in_the_field(String string)throws Exception {
        sendkeys(d1.Phonenumber, string);   
	   }

       @When("user enter Mobile number in the input field {string}")
       public void user_enter_mobile_number_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Mobile, string);
       }

       @When("user enter the fax in the input field {string}")
       public void user_enter_the_fax_in_the_input_field(String string) throws Exception{
          sendkeys(d1.fax, string);
       }

       @When("user enter Web in the input field {string}")
       public void user_enter_web_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Web, string);
       }

       @When("user enter email in the input field {string}")
       public void user_enter_email_in_the_input_field(String string)throws Exception {
        sendkeys(d1.Emailid, string);  
       }

       @When("user enter the profid1 in the field {string}")
       public void user_enter_the_profid1_in_the_field(String string)throws Exception {
           sendkeys(d1.profId1, string);
       }

       @When("user enter the profid2 in the field {string}")
       public void user_enter_the_profid2_in_the_field(String string)throws Exception {
           sendkeys(d1.profId2, string);
       }

       @When("user enter the profid3 in the field {string}")
       public void user_enter_the_profid3_in_the_field(String string)throws Exception {
           sendkeys(d1.profId3, string);
       }

       @When("user enter the profid4 in the field {string}")
       public void user_enter_the_profid4_in_the_field(String string) throws Exception{
           sendkeys(d1.profId4, string);
       }

       @When("user enter the profid5 in the field {string}")
       public void user_enter_the_profid5_in_the_field(String string)throws Exception {
          sendkeys(d1.profId5, string);
       }

       @When("user enter VATID in the input field {string}")
       public void user_enter_vatid_in_the_input_field(String string)throws Exception {
          sendkeys(d1.Vatid, string);
       }

       @Then("user click the create third party if entered credentials are valid {string}")
       public void user_click_the_create_third_party_if_entered_credentials_are_valid(String status)throws Exception {
           click(d1.Create);
           if (status.equalsIgnoreCase("valid")) 
               Assert.assertTrue("user created new prospect successfully", isdisplayed(d1.Newprosperty));
         		
               else {
        		System.out.println(gettext(d1.creationvalidation));
               }
       }
       
       @Given("user click the Prospects list")
       public void user_click_the_prospects_list()throws Exception {
          click(d1.Prospects);
          Assert.assertTrue("User is not click the prospects page",CurrentURL().contains("societe/list.php?type=p&leftmenu=prospects&mainmenu=companies"));
         
       }

       @When("user search the newly created prospect name {string}")
       public void user_search_the_newly_created_prospect_name(String string) throws Exception {
           sendkeys(d1.searchbox, string);
             
       }
       @When("user click the search button")
       public void user_click_the_search_button() {
       click(d1.clicksearch);
       String actualURL = driver.getCurrentUrl();
  	   String expectedURL = "https://demo.dolibarr.org/societe/list.php";
  	   Assert.assertEquals(actualURL, expectedURL);

       }
       
       @Then("user click the relevant name is displayed")
       public void user_click_the_relevant_name_is_displayed() {
           click(d1.nameclick);
          Assert.assertTrue("Newly created prospect is shown", isdisplayed(d1.Newprosperty));
       }

       @Then("user sees the newly created is displayed or not")
       public void user_sees_the_newly_created_is_displayed_or_not() {
    	   String actualUrl = driver.getCurrentUrl();
           if(actualUrl.contains(actualUrl)) {
          	 System.out.println("Newly created prospect is displayed");
           }else {
          	 System.out.println("Navigation failed");
          	 Assert.fail("User is not navigated to newly craeted prospect page");
           }
           
       }
        
       @When("user click the new customer creation")
       public void user_click_the_new_customer_creation()throws Exception {
           click(d1.customercreation);
           Assert.assertTrue("Newly created customer is shown", isdisplayed(d1.Newprosperty));
       }
       
       @When("user enter the New customer name in the input field {string}")
       public void user_enter_the_new_customer_name_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Thirdpartyname, string);
          
       }

       @When("user enter the alias name in the input field {string}")
       public void user_enter_the_alias_name_in_the_input_field(String string)throws Exception {
           sendkeys(d1.commercialname, string);
         
       }

       @When("user enter the address in the field {string}")
       public void user_enter_the_address_in_the_field(String string)throws Exception {
           sendkeys(d1.Address, string);
           
       }

       @When("user enter the Zip code {string}")
       public void user_enter_the_zip_code(String string)throws Exception {
    	   sendkeys(d1.Zipcode, string);
    	   
                  }

       @When("user enter the new city in the field {string}")
       public void user_enter_the_new_city_in_the_field(String string)throws Exception {
           sendkeys(d1.City, string);
           
       }

       @When("user click the state in the field")
       public void user_click_the_state_in_the_field()throws Exception {
            click(d1.clickstate);
            
       }

       @When("user enter the State in the Dropdown list {string}")
       public void user_enter_the_state_in_the_dropdown_list(String string)throws Exception {
           sendkeys(d1.searchstate, string);
           pressEnter(d1.searchstate);
          
       }

       @When("user enter the mobilenumber in the input field {string}")
       public void user_enter_the_mobilenumber_in_the_input_field(String string)throws Exception {
            sendkeys(d1.Mobile, string);
            
       }

       @When("user enter the Fax in the field {string}")
       public void user_enter_the_fax_in_the_field(String string) throws Exception{
           sendkeys(d1.fax, string);
           
       }

       @When("user enter web in the field {string}")
       public void user_enter_web_in_the_field(String string)throws Exception {
          sendkeys(d1.Web, string);
                 }

       @When("user enter Email in the inputfield {string}")
       public void user_enter_email_in_the_inputfield(String string)throws Exception {
           sendkeys(d1.Emailid, string);
           
       }

       @When("user enter the prof id1 {string}")
       public void user_enter_the_prof_id1(String string)throws Exception {
          sendkeys(d1.profId1, string);
          
       }

       @When("user enter the prof id2 {string}")
       public void user_enter_the_prof_id2(String string)throws Exception {
           sendkeys(d1.profId2, string);
          
       }

       @When("user enter the prof id3 {string}")
       public void user_enter_the_prof_id3(String string) throws Exception {
          sendkeys(d1.profId3, string);
          
       }

       @When("user enter the prof id4 {string}")
       public void user_enter_the_prof_id4(String string) throws Exception {
           sendkeys(d1.profId4, string );
           
       }
       @When("user enter the prof id5 {string}")
       public void user_enter_the_prof_id5(String string) throws Exception{
          sendkeys(d1.profId5, string);
          
       }
       @When("user enter the vatid {string}")
       public void user_enter_the_vatid(String string) throws Exception {
         sendkeys(d1.Vatid, string);
        
       }

       @Then("user click the create customer if entered credentials are valid {string}")
       public void user_click_the_create_customer_if_entered_credentials_are_valid(String status)throws Exception {
           click(d1.Create);
           if (status.equalsIgnoreCase("valid")) 
               Assert.assertTrue("user created new customer successfully", isdisplayed(d1.customercreation));
           else {
        		System.out.println(gettext(d1.creationvalidation));
               }
       }
       
       @Given("user click the new contact in the third party page")
       public void user_click_the_new_contact_in_the_third_party_page()throws Exception {
           click(d1.contactcreation);
           String actualURL = driver.getCurrentUrl();
      	   String expectedURL = "https://demo.dolibarr.org/contact/card.php?leftmenu=contacts&action=create";
      	   Assert.assertEquals(actualURL, expectedURL);
        
       }

       @When("user enter the Lastname in the input field {string}")
       public void user_enter_the_lastname_in_the_input_field(String string)throws Exception {
          sendkeys(d1.lastname, string);
       }

       @When("user enter the Firstname in the input field {string}")
       public void user_enter_the_firstname_in_the_input_field(String string)throws Exception {
             sendkeys(d1.Firstname, string);   
       }

       @When("user enter the job position in the input field  {string}")
       public void user_enter_the_job_position_in_the_input_field(String string)throws Exception {
           sendkeys(d1.jobposition, string);
       }

       @When("user enter the address {string}")
       public void user_enter_the_address(String string) throws Exception{
         sendkeys(d1.address, string);         
       }

       @When("user enter the code in the field {string}")
       public void user_enter_the_code_in_the_field(String string)throws Exception {
           sendkeys(d1.zipcode, string);
       }

       @When("user enter the City {string}")
       public void user_enter_the_city(String string)throws Exception {
           sendkeys(d1.town, string);
       }

       @When("user enter the busphone in the field {string}")
       public void user_enter_the_busphone_in_the_field(String string) throws Exception{
          sendkeys(d1.Busphone, string);
       }

       @When("user enter the persphone in the field {string}")
       public void user_enter_the_persphone_in_the_field(String string) throws Exception{
          sendkeys(d1.Persphone, string);    
       }

       @When("user enter the Mobile1 in the field {string}")
       public void user_enter_the_mobile1_in_the_field(String string)throws Exception {
           sendkeys(d1.Mobile1, string);
       }

       @When("user enter the faxnumber in the field {string}")
       public void user_enter_the_faxnumber_in_the_field(String string)throws Exception {
           sendkeys(d1.Fax, string);
       }

       @When("user enter the emailid in the field {string}")
       public void user_enter_the_emailid_in_the_field(String string) throws Exception{
           sendkeys(d1.Emailcontact, string);
       }

       @Then("user click the add button if entered credentials are valid {string}")
       public void user_click_the_add_button_if_entered_credentials_are_valid(String status)throws Exception {
           click(d1.ADD);
           if (status.equalsIgnoreCase("valid")) 
               Assert.assertTrue("user created new contact successfully", isdisplayed(d1.customercreation));
           else {
        		System.out.println(gettext(d1.creationvalidation));
               }
           
       }
       
       @Given("user click the new vendor cration in the Third party list")
       public void user_click_the_new_vendor_cration_in_the_third_party_list()throws Exception {
          click(d1.newvendor);
          String actualURL = driver.getCurrentUrl();
     	   String expectedURL = "https://demo.dolibarr.org/societe/card.php?leftmenu=suppliers&action=create&type=f";
     	   Assert.assertEquals(actualURL, expectedURL);
       
       }
       @When("user enter the partyname in the input field {string}")
       public void user_enter_the_partyname_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Thirdpartyname, string);
       }
       @When("user enter the aliasname in the input field {string}")
       public void user_enter_the_aliasname_in_the_input_field(String string)throws Exception {
           sendkeys(d1.commercialname, string);
       }
       @When("user enter the mainaddress in the input field {string}")
       public void user_enter_the_mainaddress_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Address, string);
       }
       @When("user enter the zipnumber in the field {string}")
       public void user_enter_the_zipnumber_in_the_field(String string)throws Exception {
          sendkeys(d1.Zipcode, string);
       }
       @When("user enter the cityname in the input field {string}")
       public void user_enter_the_cityname_in_the_input_field(String string) throws Exception{
           sendkeys(d1.City, string);
       }
       @When("user click the province")
       public void user_click_the_province()throws Exception {
           click(d1.clickstate);
       }
       @When("user search the province {string}")
       public void user_search_the_province(String string)throws Exception {
           sendkeys(d1.searchstate, string);
       }
       @When("user enter the phnumber in the input field {string}")
       public void user_enter_the_phnumber_in_the_input_field(String string)throws Exception {
         sendkeys(d1.Phonenumber, string);    
       }
       @When("user enter the Mobnumber in the input field {string}")
       public void user_enter_the_mobnumber_in_the_input_field(String string)throws Exception {
          sendkeys(d1.Mobile, string);
       }
       @When("user enter the fax1 in the field {string}")
       public void user_enter_the_fax1_in_the_field(String string)throws Exception {
           sendkeys(d1.fax, string);
       }
       @When("user enter the weburl in the input field {string}")
       public void user_enter_the_weburl_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Web, string);
       }
       @When("user enter the email2 in the field {string}")
       public void user_enter_the_email2_in_the_field(String string) throws Exception{
          sendkeys(d1.Emailid, string);
       }
       @When("user enter the proof ID1 {string}")
       public void user_enter_the_proof_id1(String string) throws Exception{
           sendkeys(d1.profId1, string);
       }
       @When("user enter the proof ID2 {string}")
       public void user_enter_the_proof_id2(String string)throws Exception {
           sendkeys(d1.profId2, string);
       }
       @When("user enter the proof ID3 {string}")
       public void user_enter_the_proof_id3(String string) throws Exception{
           sendkeys(d1.profId3, string);
       }
       @When("user enter the proof ID4 {string}")
       public void user_enter_the_proof_id4(String string) throws Exception{
           sendkeys(d1.profId4, string);
       }
       @When("user enter the proof ID5 {string}")
       public void user_enter_the_proof_id5(String string)throws Exception {
           sendkeys(d1.profId5, string);
       }
       @When("user enter the idvat {string}")
       public void user_enter_the_idvat(String string)throws Exception {
          sendkeys(d1.Vatid, string); 
       }
       @Then("user click the vendor create button if entered entered credentials are valid {string}")
       public void user_click_the_vendor_create_button_if_entered_entered_credentials_are_valid(String status) throws Exception{
          click(d1.Create);
          if (status.equalsIgnoreCase("valid")) 
              Assert.assertTrue("user created new vendor successfully", isdisplayed(d1.newvendor));
          else {
       		System.out.println(gettext(d1.creationvalidation));
              }
          
       }

       @Given("user click the list view in the contact")
       public void user_click_the_list_view_in_the_contact()throws Exception {
          click(d1.List); 
          String actualURL = driver.getCurrentUrl();
    	   String expectedURL = "https://demo.dolibarr.org/contact/list.php?leftmenu=contacts";
    	   Assert.assertEquals(actualURL, expectedURL);
       }

       @When("user search the created name {string}")
       public void user_search_the_created_name(String string)throws Exception {
           sendkeys(d1.Lastnamesearch, string);
       }

       @When("user click the search button in the list")
       public void user_click_the_search_button_in_the_list() throws Exception{
           click(d1.clicksearch);
           Assert.assertTrue("user click the search button successfully", isdisplayed(d1.List));
           
       }

       @When("user click the relevant name shown")
       public void user_click_the_relevant_name_shown()throws Exception {
          click(d1.relevantname);
         
       }

//       @Then("user click back to list")
//       public void user_click_back_to_list() throws Exception{
//          click(d1.backtolist);
//       }

       @Given("user click the Modify Button")
       public void user_click_the_modify_button()throws Exception {
          click(d1.Modify);
          Assert.assertTrue("user click the Modify button successfully", isdisplayed(d1.List));

       }

       @Given("user modify the lastname in the input field {string}")
       public void user_modify_the_lastname_in_the_input_field(String string) throws Exception{
          sendkeys(d1.lastname, string);
          String actualText = d1.lastname.getAttribute("value");
          Assert.assertEquals(string, actualText);
       }

       @When("user modify the firstname in the input field {string}")
       public void user_modify_the_firstname_in_the_input_field(String string)throws Exception {
          sendkeys(d1.Firstname, string);
          String actualText = d1.Firstname.getAttribute("value");
          Assert.assertEquals(string, actualText);

       }

       @When("user modify the address in the input field {string}")
       public void user_modify_the_address_in_the_input_field(String string)throws Exception {
           sendkeys(d1.address, string);
           String actualText = d1.address.getAttribute("value");
           Assert.assertEquals(string, actualText);
       }

       @When("user modify the zipcode in the input field {string}")
       public void user_modify_the_zipcode_in_the_input_field(String string)throws Exception {
            sendkeys(d1.zipcode, string);   
            String actualValue = d1.zipcode.getAttribute("value");
            Assert.assertEquals(string, actualValue);
       }

       @When("user modify the busphone in the input field {string}")
       public void user_modify_the_busphone_in_the_input_field(String string) throws Exception{
          sendkeys(d1.Busphone, string);
          String actualValue = d1.Busphone.getAttribute("value");
          Assert.assertEquals(string, actualValue);
          
       }

       @When("user modify the persphone in the input field {string}")
       public void user_modify_the_persphone_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Persphone, string);
           String actualValue = d1.Persphone.getAttribute("value");
           Assert.assertEquals(string, actualValue);
       }

       @When("user modify the faxnumber in the input field {string}")
       public void user_modify_the_faxnumber_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Fax, string);
           String actualValue = d1.Fax.getAttribute("value");
           Assert.assertEquals(string, actualValue);
       }

       @Then("user click the save button if entered credentials are valid {string}")
       public void user_click_the_save_button_if_entered_credentials_are_valid(String status) throws Exception{
           click(d1.Save);
           if (status.equalsIgnoreCase("valid")) 
               Assert.assertTrue("user Modify the details successfully", isdisplayed(d1.newvendor));
           else {
        		System.out.println(gettext(d1.creationvalidation));
               }
         
           
       }
       @Given("user click the disable icon in the Modified contact")
       public void user_click_the_disable_icon_in_the_modified_contact()throws Exception {
           click(d1.disable);
                    
       }

       @When("user click the Reactivate icon in the contact")
       public void user_click_the_reactivate_icon_in_the_contact() throws Exception{
           click(d1.reactivate);
           Assert.assertTrue("user reactivate the contact successfully", isdisplayed(d1.List));
       }

       @When("user click the delete icon in the input field")
       public void user_click_the_delete_icon_in_the_input_field() throws Exception{
          click(d1.Delete);
            
       }

       @Then("user click No in the confirmation message")
       public void user_click_no_in_the_confirmation_message()throws Exception {
          click(d1.deleteno); 
          Assert.assertTrue("user is not delete the contact", isdisplayed(d1.contactcreation));
       }

       @Given("user click the service creation in the Headers")
       public void user_click_the_service_creation_in_the_headers() throws Exception{
           click(d1.services);
           String actualURL = driver.getCurrentUrl();
    	   String expectedURL = "https://demo.dolibarr.org/product/index.php?mainmenu=products&leftmenu=";
    	   Assert.assertEquals(actualURL, expectedURL);  
       }

       @When("user click the New service in the service page")
       public void user_click_the_new_service_in_the_service_page()throws Exception {
          jsClick(d1.Newservice);
              
                }

       @When("user enter the prod reference in the new service {string}")
       public void user_enter_the_prod_reference_in_the_new_service(String string) throws Exception {
              waitForVisibility(d1.Productref);
                sendkeys(d1.Productref, string);
                String actualValue = d1.Productref.getAttribute("value");
                Assert.assertEquals(string, actualValue);
       }

       @When("user enter the label in the new service {string}")
       public void user_enter_the_label_in_the_new_service(String string) throws Exception {
         sendkeys(d1.Label, string);
         String actualText = d1.Label.getAttribute("value");
         Assert.assertEquals(string, actualText);
       }

       @When("user enter the description in the new service page {string}")
       public void user_enter_the_description_in_the_new_service_page(String string)throws Exception {
          switchToFrame(d1.Descriptionclick);
          click(d1.Description);
         sendkeys(d1.Description, string);
          switchToDefaultContent();
       }

       @When("user enter the public URL in the new service page {string}")
       public void user_enter_the_public_url_in_the_new_service_page(String string)throws Exception {
           sendkeys(d1.publicurl, string);
       }

       @When("user enter the duration in the new service page {string}")
       public void user_enter_the_duration_in_the_new_service_page(String string)throws Exception {
          sendkeys(d1.Duration, string);
          String actualValue = d1.Duration.getAttribute("value");
          Assert.assertEquals(string, actualValue);
       }

       @When("user enter the notes in the service page {string}")
       public void user_enter_the_notes_in_the_service_page(String string)throws Exception {
           sendkeys(d1.Notes, string);
           String actualText = d1.Notes.getAttribute("value");
           Assert.assertEquals(string, actualText);
       }

       @When("user enter the selling price in the service page {string}")
       public void user_enter_the_selling_price_in_the_service_page(String string)throws Exception {
           sendkeys(d1.sellingprice, string);
           String actualValue = d1.sellingprice.getAttribute("value");
           Assert.assertEquals(string, actualValue);
       }

       @When("user enter the Minimum selling price in the service page {string}")
       public void user_enter_the_minimum_selling_price_in_the_service_page(String string)throws Exception {
          sendkeys(d1.Minsellingprice, string);
          String actualValue = d1.Minsellingprice.getAttribute("value");
          Assert.assertEquals(string, actualValue);
       }

       @When("user click the accounting sale dropdown in the service page {string}")
       public void user_click_the_accounting_sale_dropdown_in_the_service_page(String string)throws Exception {
          click(d1.Accountingsale);
          sendkeys(d1.searchaccountingsale, string);
          pressEnter(d1.searchaccountingsale);
       }
       @When("user click the accounting sale export dropdown in the service page {string}")
       public void user_click_the_accounting_sale_export_dropdown_in_the_service_page(String string)throws Exception {
          click(d1.salesimport);
          sendkeys(d1.searchaccountingsale, string);
          pressEnter(d1.searchaccountingsale);
       }
       
       @When("user click the accounting purchase dropdown in the service page {string}")
       public void user_click_the_accounting_purchase_dropdown_in_the_service_page(String string)throws Exception {
           click(d1.purchased);
           sendkeys(d1.searchaccountingsale, string);
           pressEnter(d1.searchaccountingsale);
       }
       @When("user click the accounting purchase import in the service page {string}")
       public void user_click_the_accounting_purchase_import_in_the_service_page(String string)throws Exception {
          click(d1.purchaseimport);
          sendkeys(d1.searchaccountingsale, string);
          pressEnter(d1.searchaccountingsale);
       }
       
       @Then("user click the create service if entered credentials are valid {string}")
       public void user_click_the_create_service_if_entered_credentials_are_valid(String status) {
           click(d1.createservice);
           if (status.equalsIgnoreCase("valid")) 
              Assert.assertTrue("user created the details successfully", isdisplayed(d1.Newservice));
           else {
        		System.out.println(gettext(d1.creationvalidation));
               }
         
       }
      
       @Given("user click the list in the service")
       public void user_click_the_list_in_the_service()throws Exception {
           click(d1.Listservice);
         Assert.assertTrue("user created list is displayed successfully", isdisplayed(d1.Newservice));  
       }
       @When("user search the prof reference name in the input field {string}")
       public void user_search_the_prof_reference_name_in_the_input_field(String string)throws Exception {
          sendkeys(d1.productrefsearch, string);
          String actualText = d1.productrefsearch.getAttribute("value");
          Assert.assertEquals(string, actualText);
       }


        @When("user click the relevant product ref displayed in the list")
       public void user_click_the_relevant_product_ref_displayed_in_the_list()throws Exception {
           click(d1.clicksearch);
           Assert.assertTrue("Relevant list is displayed successfully", isdisplayed(d1.Newservice));  
           
       }
        
        @When("user click the name in the displayed list")
        public void user_click_the_name_in_the_displayed_list()throws Exception {
           click(d1.namesearch);
           Assert.assertTrue("name is displayed successfully", isdisplayed(d1.Listservice));  
        }

       @When("user click the clone in the displayed list")
       public void user_click_the_clone_in_the_displayed_list()throws Exception {
          click(d1.clone);
       }
       @When("user click the No button in the displayed list")
       public void user_click_the_no_button_in_the_displayed_list()throws Exception {
           click(d1.No);
       }
       @When("user click the delete button in the displayed list")
       public void user_click_the_delete_button_in_the_displayed_list()throws Exception {
           click(d1.delete);
       }
       @Then("user click the No delete button in the displayed list")
       public void user_click_the_no_delete_button_in_the_displayed_list()throws Exception {
          click(d1.NObutton);
          Assert.assertTrue("user click the delete no button successfully", isdisplayed(d1.Newservice));
       }

       @Given("user click the variant attributes in the services")
       public void user_click_the_variant_attributes_in_the_services()throws Exception {
           click(d1.variantattributes);
           Assert.assertTrue("user click the delete no button successfully", isdisplayed(d1.millesime));
       }


       @When("user click the first millesime in the list")
       public void user_click_the_first_millesime_in_the_list() throws Exception{
          click(d1.millesime);
          String actualURL = driver.getCurrentUrl();
     	   String expectedURL = "https://demo.dolibarr.org/variants/card.php?id=5&save_lastsearch_values=1";
     	   Assert.assertEquals(actualURL, expectedURL);
       }

       @When("user click the Modify in the variant attribute")
       public void user_click_the_modify_in_the_variant_attribute() throws Exception{
           click(d1.Modifyinattribute);
           Assert.assertTrue("user click the Modify button successfully", isdisplayed(d1.Newservice));

       }

       @When("user click the save button in the variant attribute")
       public void user_click_the_save_button_in_the_variant_attribute() throws Exception{
           click(d1.saveinattribute);
           Assert.assertTrue("user click the save button successfully", isdisplayed(d1.Newservice)); 
           
       }

       @When("user enter the ref number in the input field {string}")
       public void user_enter_the_ref_number_in_the_input_field(String string)throws Exception {
           sendkeys(d1.lineref, string);
           String actualValue = d1.lineref.getAttribute("value");
           Assert.assertEquals(string, actualValue);
       }

       @When("user enter the value in the input field {string}")
       public void user_enter_the_value_in_the_input_field(String string)throws Exception {
           sendkeys(d1.value, string);
           String actualValue = d1.value.getAttribute("value");
           Assert.assertEquals(string, actualValue);
       }

       @Then("user click the Add if entered credentials are valid {string}")
       public void user_click_the_add_if_entered_credentials_are_valid(String status) {
           click(d1.Addline);
           if (status.equalsIgnoreCase("valid")) 
               Assert.assertTrue("user created the attribute successfully", isdisplayed(d1.Newservice));
            else {
         		System.out.println(gettext(d1.creationvalidation));
                }
          
           
           
       }

       
       @Given("user click the statistics in the services")
       public void user_click_the_statistics_in_the_services() throws Exception{
          click(d1.statistics);
          Assert.assertTrue("user click the statics button successfully", isdisplayed(d1.Newservice));
       
       }
       @When("user enter the product id in the input field {string}")
       public void user_enter_the_product_id_in_the_input_field(String string)throws Exception {
           sendkeys(d1.productorservice, string);
           String actualValue = d1.productorservice.getAttribute("value");
           Assert.assertEquals(string, actualValue);
       }
       @When("user enter the tags in the input field {string}")
       public void user_enter_the_tags_in_the_input_field(String string)throws Exception {
          click(d1.tagsservice);
          sendkeys(d1.searchtags, string);
          pressEnter(d1.searchtags);
       }
       @When("user enter the third party name in the input field {string}")
       public void user_enter_the_third_party_in_the_input_field(String string)throws Exception {
           click(d1.thirdpartyname);
           sendkeys(d1.searchtags, string);
           pressEnter(d1.searchtags);
       }
       @Then("user click the refresh button")
       public void user_click_the_refresh_button() throws Exception{
          click(d1.refresh);
          Assert.assertTrue("user click the refresh button successfully", isdisplayed(d1.variantattributes));
       }
      
       
       @When("user click the services by popularity in the header")
       public void user_click_the_services_by_popularity_in_the_header() throws Exception{
           click(d1.servicepopularity);
           Assert.assertTrue("user click the services button successfully", isdisplayed(d1.Newservice));
        
           
       }
       @When("user click the dropdwon in the List of services {string}")
       public void user_click_the_dropdwon_in_the_list_of_services(String string)throws Exception {
           click(d1.listofservice);
           sendkeys(d1.searchlistofservice, string);
           pressEnter(d1.searchlistofservice);
       }
       @Then("user click the refresh in the list of services")
       public void user_click_the_refresh_in_the_list_of_services() throws Exception{
          click(d1.Refreshlistofservice);
          Assert.assertTrue("user click the refresh button successfully", isdisplayed(d1.variantattributes));
       }
         

       @Given("user click the new reception in the services")
       public void user_click_the_new_reception_in_the_services() throws Exception {
           click(d1.newreception);
           Assert.assertTrue("user click the new reception button successfully", isdisplayed(d1.variantattributes));
           
       }

       @When("user click the List in the reception")
       public void user_click_the_list_in_the_reception()throws Exception {
          click(d1.Listreception);
          Assert.assertTrue("user click the list button successfully", isdisplayed(d1.Newservice));
          
       }

       @When("user search the name in the third party input field {string}")
       public void user_search_the_name_in_the_third_party_input_field(String string)throws Exception {
          sendkeys(d1.searchcompany, string);
          String actualText = d1.searchcompany.getAttribute("value");
          Assert.assertEquals(string, actualText);
         
       }

       @When("user click the search in the list")
       public void user_click_the_search_in_the_list() throws Exception{
           click(d1.clicksearch);
           System.out.println(gettext(d1.textgettext));
       }

       @Then("user click the cancel button in list")
       public void user_click_the_cancel_button_in_list()throws Exception {
          click(d1.cancelbuuton);
       Assert.assertTrue("user click the cancel button successfully", isdisplayed(d1.variantattributes));   
       }

       @Given("user click the draft in the reception")
       public void user_click_the_draft_in_the_reception()throws Exception {
           click(d1.Draft);
           String actualURL = driver.getCurrentUrl();
     	   String expectedURL ="https://demo.dolibarr.org/reception/list.php?leftmenu=receptions&search_status=0";
     	   Assert.assertEquals(actualURL, expectedURL);
        }

       @When("user search the name in the search field {string}")
       public void user_search_the_name_in_the_search_field(String string)throws Exception {
          sendkeys(d1.searchcompany, string);
          String actualText = d1.searchcompany.getAttribute("value");
          Assert.assertEquals(string, actualText);
                 }

       @When("user click the searchbox in the reception")
       public void user_click_the_searchbox_in_the_reception() throws Exception {
           click(d1.clicksearch);
           Assert.assertTrue("user click the draft button successfully", isdisplayed(d1.newreception));
       }

       @Then("user click the cancel button in draft")
       public void user_click_the_cancel_button_in_draft()throws Exception {
          click(d1.cancelbuuton);
          Assert.assertTrue("user click the cancel button successfully", isdisplayed(d1.statistics));  
       }

       @Given("user click the validated in the reception")
       public void user_click_the_validated_in_the_reception() throws Exception{
           click(d1.Validated);
           String actualURL = driver.getCurrentUrl();
     	   String expectedURL = "https://demo.dolibarr.org/reception/list.php?leftmenu=receptions&search_status=1";
     	   Assert.assertEquals(actualURL, expectedURL);

       }

       @When("user enter the name in the search box {string}")
       public void user_enter_the_name_in_the_search_box(String string)throws Exception {
          sendkeys(d1.searchcompany, string);
          String actualText = d1.searchcompany.getAttribute("value");
          Assert.assertEquals(string, actualText);
          
       }
       
       @When("user click the searchbox in the validation")
       public void user_click_the_searchbox_in_the_validation() {
           click(d1.clicksearch);
           Assert.assertTrue("user click the validated button successfully", isdisplayed(d1.newreception)); 
       }


       @Then("user click the cancel button in validated")
       public void user_click_the_cancel_button_in_validated()throws Exception {
          click(d1.cancelbuuton);
          Assert.assertTrue("user click the cancel button successfully", isdisplayed(d1.Draft));
       }
  
       @Given("user click the processed in reception")
       public void user_click_the_processed_in_reception()throws Exception {
          click(d1.processed);
          Assert.assertTrue("user click the processed button successfully", isdisplayed(d1.newreception));
       }

       @When("user search the name in the search bar {string}")
       public void user_search_the_name_in_the_search_bar(String string) throws Exception{
           sendkeys(d1.searchcompany, string);
           String actualText = d1.searchcompany.getAttribute("value");
           Assert.assertEquals(string, actualText);
       }

       @When("user click the searchbox in the processed")
       public void user_click_the_searchbox_in_the_processed() throws Exception{
          click(d1.clicksearch);
          Assert.assertTrue("user click the search box button successfully", isdisplayed(d1.Validated));  
       }

       @Then("user click the cancel button in processed")
       public void user_click_the_cancel_button_in_processed()throws Exception {
         click(d1.cancelbuuton);
         String actualURL = driver.getCurrentUrl();
   	   String expectedURL = "https://demo.dolibarr.org/reception/list.php";
   	   Assert.assertEquals(actualURL, expectedURL);

       }
       
       @Given("user click the statistics in the reception")
       public void user_click_the_statistics_in_the_reception()throws Exception {
          click(d1.statisticsReception);
          Assert.assertTrue("user click the statistics button successfully", isdisplayed(d1.submitbutton)); 
          Assert.assertTrue("User is not click the statistics page",CurrentURL().contains("reception/stats/index.php?leftmenu=receptions"));
       }

       @When("user enter the thirdparty in the reception {string}")
       public void user_enter_the_thirdparty_in_the_reception(String string)throws Exception {
          click(d1.partydropdwon);
          sendkeys(d1.thrdsearch, string);
          pressEnter(d1.thrdsearch);
       }

       @When("user enter the createdby in the reception {string}")
       public void user_enter_the_createdby_in_the_reception(String string) throws Exception{
           click(d1.createdby);
           sendkeys(d1.thrdsearch, string);
           pressEnter(d1.thrdsearch);
       }

       @When("user enter the year in the reception {string}")
       public void user_enter_the_year_in_the_reception(String string)throws Exception {
           click(d1.year);
           sendkeys(d1.thrdsearch, string);
           pressEnter(d1.thrdsearch);
       }


       @Then("user click the refresh button in the reception")
       public void user_click_the_refresh_button_in_the_reception()throws Exception {
           click(d1.submitbutton);
           Assert.assertTrue("user click the refresh button successfully", isdisplayed(d1.Draft)); 
           Assert.assertTrue("User is not click the refresh page",CurrentURL().contains("reception/stats/index.php?leftmenu=receptions"));
          
       }

       @Given("user click the projects in the header")
       public void user_click_the_projects_in_the_header()throws Exception {
           click(d1.projects);
           Assert.assertTrue("user click the project button successfully", isdisplayed(d1.newlead)); 
           Assert.assertTrue("User is not click the project page",CurrentURL().contains("projet/index.php?mainmenu=project&leftmenu="));
       }

       @When("user click the new lead in the project")
       public void user_click_the_new_lead_in_the_project()throws Exception {
           click(d1.newlead);
           String actualURL = driver.getCurrentUrl();
       	   String expectedURL = "https://demo.dolibarr.org/projet/card.php?leftmenu=projects&action=create&search_project_user=&mainmenu=project";
       	   Assert.assertEquals(actualURL, expectedURL);

           
       }

       @When("user enter the label in the project {string}")
       public void user_enter_the_label_in_the_project(String string)throws Exception {
           sendkeys(d1.labelproject, string);
           String actualText = d1.labelproject.getAttribute("value");
           Assert.assertEquals(string, actualText);
       }

       @When("user enter the thirdparty name in the project {string}")
       public void user_enter_the_thirdparty_name_in_the_project(String string) throws Exception{
           click(d1.thirdpartyproject);
           sendkeys(d1.searchthird, string);
           pressEnter(d1.searchthird);
       }

       @When("user enter the lead status in the project {string}")
       public void user_enter_the_lead_status_in_the_project(String string) throws Exception{
           click(d1.leadstatus);
           sendkeys(d1.searchthird, string);
           pressEnter(d1.searchthird);
       }

       @When("user enter the lead amount in the project {string}")
       public void user_enter_the_lead_amount_in_the_project(String string) throws Exception{
           sendkeys(d1.leadamount, string);
           String actualValue = d1.leadamount.getAttribute("value");
           Assert.assertEquals(string, actualValue);
       }

       @When("user enter the budget amount in the project {string}")
       public void user_enter_the_budget_amount_in_the_project(String string) throws Exception{
          sendkeys(d1.budgetamt, string);
          String actualValue = d1.budgetamt.getAttribute("value");
          Assert.assertEquals(string, actualValue);

       }

       @When("user enter the date in the input field {string}")
       public void user_enter_the_date_in_the_input_field(String string) throws Exception {
           sendkeys(d1.Date, string);
           String actaulDate = d1.Date.getAttribute("value");
           Assert.assertEquals(string, actaulDate);

       }

       @When("user enter the description in the input field {string}")
       public void user_enter_the_description_in_the_input_field(String string)throws Exception {
    	   switchToFrame(d1.Descriptionclick);
           click(d1.Description);
          sendkeys(d1.Description, string);
           switchToDefaultContent();     
           }

       @When("user enter categories in the input field {string}")
       public void user_enter_categories_in_the_input_field(String string) throws Exception{
          click(d1.Tags);
          sendkeys(d1.taggssearch, string);
          pressEnter(d1.searchtags);
       }

       @When("user enter the priority in the input field {string}")
       public void user_enter_the_priority_in_the_input_field(String string)throws Exception {
    	   click(d1.priority);
           sendkeys(d1.prioritysearch, string);
           pressEnter(d1.prioritysearch);
       }

       @Then("user click the create draft if entered credentials are valid {string}")
       public void user_click_the_create_draft_if_entered_credentials_are_valid(String status)throws Exception {
           click(d1.savedraft);
           if (status.equalsIgnoreCase("valid")) 
               Assert.assertTrue("user created the draft successfully", isdisplayed(d1.newlead));
            else {
         		System.out.println(gettext(d1.creationvalidation));
                }
       }
           @Given("user click the modfy button")
           public void user_click_the_modfy_button()throws Exception {
               click(d1.Modify);
               Assert.assertTrue("user click modify successfully", isdisplayed(d1.newlead));
               
           }
           @When("user enter the label modify in the project {string}")
           public void user_enter_the_label_modify_in_the_project(String string)throws Exception {
        	   sendkeys(d1.labelprojert, string);
        	   waitForVisibility(d1.labelprojert);
        	   String actualText = d1.labelprojert.getAttribute("value");
               Assert.assertEquals(string, actualText);
        	   
           }
           @When("user click the dropdown in the thirdparty in the project {string}")
           public void user_click_the_dropdown_in_the_thirdparty_in_the_project(String string) throws Exception {
        	   click(d1.thirdpartyproject);
               sendkeys(d1.searchthird, string);
               pressEnter(d1.searchthird);
           }
           @When("user click the leadstatus dropdown {string}")
           public void user_click_the_leadstatus_dropdown(String string)throws Exception {
        	   click(d1.leadstatus);
               sendkeys(d1.searchthird, string);
               pressEnter(d1.searchthird);
           }
           @When("user enter the amount in the lead {string}")
           public void user_enter_the_amount_in_the_lead(String string)throws Exception {
        	   sendkeys(d1.leadamount, string);
               String actualValue = d1.leadamount.getAttribute("value");
               Assert.assertEquals(string, actualValue);
           }
           @When("user enter the budamt in the project {string}")
           public void user_enter_the_budamt_in_the_project(String string)throws Exception {
        	   sendkeys(d1.budgetamt, string);
               String actualValue = d1.budgetamt.getAttribute("value");
               Assert.assertEquals(string, actualValue);
           }
           @When("user enter the datenumber in the input field {string}")
           public void user_enter_the_datenumber_in_the_input_field(String string)throws Exception {
        	   sendkeys(d1.Date, string);
               String actaulDate = d1.Date.getAttribute("value");
               Assert.assertEquals(string, actaulDate);

           }
           @When("user enter the description project in the field {string}")
           public void user_enter_the_description_project_in_the_field(String string)throws Exception {
        	   switchToFrame(d1.Descriptionclick);
               click(d1.Description);
              sendkeys(d1.Description, string);
               switchToDefaultContent();
           }
           @When("user click the categories dropdwon in the input field {string}")
           public void user_click_the_categories_dropdwon_in_the_input_field(String string)throws Exception {
        	   click(d1.Tags);
               sendkeys(d1.taggssearch, string);
               pressEnter(d1.searchtags);

           }
           @When("user click the priority dropdwon in the field {string}")
           public void user_click_the_priority_dropdwon_in_the_field(String string)throws Exception {
        	   click(d1.priority);
               sendkeys(d1.prioritysearch, string);
               pressEnter(d1.prioritysearch);
           }
           @Then("user click the save button in the project if enetered credentials are valid {string}")
           public void user_click_the_save_button_in_the_project_if_enetered_credentials_are_valid(String status) throws Exception{
               click(d1.Save);
               if (status.equalsIgnoreCase("valid")) 
                   Assert.assertTrue("user modified the project successfully", isdisplayed(d1.newlead));
                else {
             		System.out.println(gettext(d1.creationvalidation));
                    }

           }
           
           @Given("user click the send email in the project")
           public void user_click_the_send_email_in_the_project() throws Exception{
               click(d1.sendemailclick);
             
           }

           @Given("user select the template emailid {string}")
           public void user_select_the_template_emailid(String string)throws Exception {
               click(d1.partydropdwon);
               sendkeys(d1.Searchemail, string);
               pressEnter(d1.Searchemail);
           }
           @When("clicks the apply button in the send email page")
           public void clicks_the_apply_button_in_the_send_email_page()throws Exception {
              click(d1.Applybutton);
              
           }
           @When("user enters the validate to email in the send email page {string}")
           public void user_enters_the_validate_to_email_in_the_send_email_page(String string)throws Exception {
               sendkeys(d1.toemail, string);
               String actualText = d1.toemail.getAttribute("value");
               Assert.assertEquals(string, actualText);
           }
           @When("user enters the subject in the send email {string}")
           public void user_enters_the_subject_in_the_send_email_need_project(String string)throws Exception {
              sendkeys(d1.copyto, string);
              String actualText = d1.copyto.getAttribute("value");
              Assert.assertEquals(string, actualText); 
           }
           
           @When("user enters the message in the send email {string}")
           public void user_enters_the_message_in_the_send_email_hai(String string)throws Exception {
        	   switchToFrame(d1.Descriptionclick);
               click(d1.Description);
              sendkeys(d1.Description, string);
               switchToDefaultContent();

           }
           @Then("user clicks the send email button")
           public void user_clicks_the_send_email_button()throws Exception {
               click(d1.senemailb);
               System.out.println(gettext(d1.creationvalidation));
           }


           @Then("user click back to list in th email page")
           public void user_click_back_to_list_in_th_email_page() throws Exception{
             waitForVisibility(d1.backtolist);
             moveToElement(d1.backtolist);
           }

           @Given("user click the List in the leads")
           public void user_click_the_list_in_the_leads()throws Exception {
               click(d1.Listservice);
               String actualURL = driver.getCurrentUrl();
           	   String expectedURL = "https://demo.dolibarr.org/projet/list.php?leftmenu=projects";
           	   Assert.assertEquals(actualURL, expectedURL);

           }
           @When("user enter the name in the search {string}")
           public void user_enter_the_name_in_the_search(String string) throws Exception {
               sendkeys(d1.namesearchproject, string);
               String actaulText = d1.namesearchproject.getAttribute("value");
               Assert.assertEquals(string, actaulText);
               
           }
           @When("user click the search button in project")
           public void user_click_the_search_button_in_project() throws Exception{
              click(d1.clicksearch);
             Assert.assertTrue("user click the search button successfully", isdisplayed(d1.Listservice));
           }
           @Then("user click the first name of the lead list")
           public void user_click_the_first_name_of_the_lead_list() throws Exception {
               click(d1.relevantleadclick);
               Assert.assertTrue("user click the first name successfully", isdisplayed(d1.Listservice)); 
           }

           @Given("user click the statistics in the Leads")
           public void user_click_the_statistics_in_the_leads() throws Exception{
               click(d1.statistics);
               Assert.assertTrue("user click the statistics successfully", isdisplayed(d1.newlead));  
           }


           @When("user click the dropdown in the thirdparty in project {string}")
           public void user_click_the_dropdown_in_the_thirdparty_in_project(String string)throws Exception {
               click(d1.listofservice);
               sendkeys(d1.searchlistofservice, string);
               pressEnter(d1.searchlistofservice);
           }
           @When("user click the lead status dropdown in the project {string}")
           public void user_click_the_lead_status_dropdown_in_the_project(String string)throws Exception {
               click(d1.tagsservice);
               sendkeys(d1.searchlistofservice, string);
               pressEnter(d1.searchlistofservice);
           }
           @When("user click the year in the porject {string}")
           public void user_click_the_year_in_the_porject(String string)throws Exception {
               click(d1.year);
               sendkeys(d1.searchlistofservice, string);
               pressEnter(d1.searchlistofservice);
           }
           @Then("user click the refresh button in the leads")
           public void user_click_the_refresh_button_in_the_leads()throws Exception {
               click(d1.refresh);
               String actualURL = driver.getCurrentUrl();
           	   String expectedURL = "https://demo.dolibarr.org/projet/stats/index.php?leftmenu=projects";
           	   Assert.assertEquals(actualURL, expectedURL);

           }

           @Given("user click the new task in the project")
           public void user_click_the_new_task_in_the_project()throws Exception {
              click(d1.newtask);
              String actualURL = driver.getCurrentUrl();
          	   String expectedURL = "https://demo.dolibarr.org/projet/tasks.php?leftmenu=tasks&action=create";
          	   Assert.assertEquals(actualURL, expectedURL);

           }

           @When("user enter the label in the new task creation input field {string}")
           public void user_enter_the_label_in_the_new_task_creation_input_field(String string)throws Exception {
              sendkeys(d1.labelnewtask, string);
              String actaulText = d1.labelnewtask.getAttribute("value");
              Assert.assertEquals(string, actaulText);
           }

           @When("user enter the dropdwon in the child of project {string}")
           public void user_enter_the_dropdwon_in_the_child_of_project(String string)throws Exception {
               click(d1.listofservice);
               sendkeys(d1.searchlistofservice, string);
               pressEnter(d1.searchlistofservice);
           }

           @When("user click the dropdown in the assigned to {string}")
           public void user_click_the_dropdown_in_the_assigned_to(String string)throws Exception {
               click(d1.createdby);
               sendkeys(d1.searchlistofservice, string);
               pressEnter(d1.searchlistofservice);
           }

           @When("user enter the end date in the new task creation {string}")
           public void user_enter_the_end_date_in_the_new_task_creation(String string)throws Exception {
               sendkeys(d1.enddate, string);
               String actaulDate = d1.enddate.getAttribute("value");
               Assert.assertEquals(string, actaulDate);

           }

           @When("user enter the description in the new task {string}")
           public void user_enter_the_description_in_the_new_task(String string) throws Exception {
        	   switchToFrame(d1.Descriptionclick);
               click(d1.Description);
              sendkeys(d1.Description, string);
               switchToDefaultContent();

           }

           @When("user enter the Budget amount in the new task {string}")
           public void user_enter_the_budget_amount_in_the_new_task(String string) throws Exception{
               sendkeys(d1.budgetamtt, string);
               String actaulValue = d1.budgetamtt.getAttribute("value");
               Assert.assertEquals(string, actaulValue);
           }

           @Then("user click the Add button in the new task if entered credentials are valid {string}")
           public void user_click_the_add_button_in_the_new_task_if_entered_credentials_are_valid(String status)throws Exception {
               click(d1.addnewtask);
               if (status.equalsIgnoreCase("valid")) 
                   Assert.assertTrue("user add the project successfully", isdisplayed(d1.newlead));
                else {
             		System.out.println(gettext(d1.creationvalidation));
                    }

           }

           @Given("user click the list in the new task")
           public void user_click_the_list_in_the_new_task()throws Exception {
              click(d1.tasklist);
              String actualURL = driver.getCurrentUrl();
         	   String expectedURL = "https://demo.dolibarr.org/projet/tasks/list.php?leftmenu=tasks";
         	   Assert.assertEquals(actualURL, expectedURL);

           }

           @When("user search the created task name in the search field {string}")
           public void user_search_the_created_task_name_in_the_search_field(String string)throws Exception {
               sendkeys(d1.tasknamesearch, string);
               String actaulText = d1.tasknamesearch.getAttribute("value");
               Assert.assertEquals(string, actaulText);

           }
           @When("user click the search button in the task list")
           public void user_click_the_search_button_in_the_task_list()throws Exception {
              click(d1.clicksearch);
              Assert.assertTrue("user click the search button successfully", isdisplayed(d1.newlead));
              
           }
           @When("user click the name in the created task list")
           public void user_click_the_name_in_the_created_task_list()throws Exception {
               click(d1.relevanttaskclick);
               Assert.assertTrue("user verifies the new lead is displayed successfully", isdisplayed(d1.newlead));
               Assert.assertTrue("user verifies list is displayed successfully", isdisplayed(d1.tasklist));
           }
           @Then("user verifes the crated task is displayed")
           public void user_verifes_the_crated_task_is_displayed()throws Exception {
        	   Assert.assertTrue("user verifies the created task is displayed successfully", isdisplayed(d1.newlead)); 
 
           }
           @Then("user click back to list")
           public void user_click_back_to_list()throws Exception {
              click(d1.backtolist);
              String actualURL = driver.getCurrentUrl();
        	   String expectedURL = "https://demo.dolibarr.org/projet/list.php?restore_lastsearch_values=1";
        	   Assert.assertEquals(actualURL, expectedURL);

              
           }

           @Given("user click a statistics in tasks and activities")
           public void user_click_a_statistics_in_tasks_and_activities()throws Exception {
               click(d1.statisticstaskactivities);
               String actualURL = driver.getCurrentUrl();
        	   String expectedURL = "https://demo.dolibarr.org/projet/tasks/stats/index.php?leftmenu=projects";
        	   Assert.assertEquals(actualURL, expectedURL);               
           }
           @When("user click a dropdown yearin statistics {string}")
           public void user_click_a_dropdown_yearin_statistics(String string) throws Exception{
               click(d1.statisticsdropdwon);
               sendkeys(d1.searchstatistics, string);
               pressEnter(d1.searchstatistics);
               Assert.assertTrue("user verifies the new task is displayed successfully", isdisplayed(d1.newtask));
               Assert.assertTrue("user verifies refresh is displayed successfully", isdisplayed(d1.refreshtaskactivities));

               }
           
           @Then("user click the refresh button in tasks and activities")
           public void user_click_the_refresh_button_in_tasks_and_activities()throws Exception {
              click(d1.refreshtaskactivities);
              Assert.assertTrue("User is not click the refresh button",CurrentURL().contains("projet/tasks/stats/index.php?leftmenu=projects"));
              
           }
            
           @Given("user click the time tracking list")
           public void user_click_the_time_tracking_list()throws Exception {
               click(d1.clicktimetracking);
               String actualURL = driver.getCurrentUrl();
         	   String expectedURL = "https://demo.dolibarr.org/projet/tasks/time.php?leftmenu=tasks";
         	   Assert.assertEquals(actualURL, expectedURL);
           }
           
           @When("user click the Modify button in the time tracking")
           public void user_click_the_modify_button_in_the_time_tracking()throws Exception {
              click(d1.Modifytimetracking);
              Assert.assertTrue("user verifies the Modify button displayed successfully", isdisplayed(d1.newtask));
           }
           @When("user click the save button in the list")
           public void user_click_the_save_button_in_the_list()throws Exception {
              click(d1.savetimetacking);
              Assert.assertTrue("user clicks the save button successfully", isdisplayed(d1.newtask)); 
              Assert.assertTrue("user verifies the list successfully", isdisplayed(d1.tasklist));
           }
           @When("user click the name displayed in the time tracking")
           public void user_click_the_name_displayed_in_the_time_tracking() throws Exception{
               click(d1.clicktimetracking);
               Assert.assertTrue("user clicks the name displayed successfully", isdisplayed(d1.newtask));
           }
           @Then("user click the back to list in the timetracking")
           public void user_click_the_back_to_list_in_the_timetracking() throws Exception{
               click(d1.backtolist);
              Assert.assertTrue("user verifies new lead is displayed successfully", isdisplayed(d1.newlead)); 
              Assert.assertTrue("user verifies the name displayed successfully", isdisplayed(d1.newtask));
           }

           @Given("user click the commerce in the headers")
           public void user_click_the_commerce_in_the_headers()throws Exception {
               click(d1.commerce);
               String actualURL = driver.getCurrentUrl();
         	   String expectedURL = "https://demo.dolibarr.org/comm/index.php?mainmenu=commercial&leftmenu=";
         	   Assert.assertEquals(actualURL, expectedURL);

               
           }
           @When("user click the new commercial in the commerce")
           public void user_click_the_new_commercial_in_the_commerce()throws Exception {
              click(d1.newproposal);
              String actualURL = driver.getCurrentUrl();
        	   String expectedURL = "https://demo.dolibarr.org/comm/propal/card.php?action=create&leftmenu=propals";
        	   Assert.assertEquals(actualURL, expectedURL);

           }
           @When("user enter the Reference customer in the commerce {string}")
           public void user_enter_the_reference_customer_in_the_commerce(String string)throws Exception {
              sendkeys(d1.refcustomerproposal, string);
              String actaulText = d1.refcustomerproposal.getAttribute("value");
              Assert.assertEquals(string, actaulText);
              
           }
           @When("user enter the customer dropdown in the commerce {string}")
           public void user_enter_the_customer_dropdown_in_the_commerce(String string) throws Exception{
        	   click(d1.customerproposal);
        	   waitForElementToBeClickable(d1.customerproposal);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
               Assert.assertTrue("user clicks the customer dropdwon successfully", isdisplayed(d1.refcustomerproposal));
           }
           
           @When("user enter the payment terms dropdwon in the commerce {string}")
           public void user_enter_the_payment_terms_dropdwon_in_the_commerce(String string) throws Exception{
              click(d1.paymentterms);
              waitForElementToBeClickable(d1.paymentterms);
              sendkeys(d1.customerproposal1, string);
              pressEnter(d1.customerproposal1);
              Assert.assertTrue("user clicks the payment terms dropdwon successfully", isdisplayed(d1.refcustomerproposal));
           }
           
           @When("user enter the payment method dropdown in the commerce {string}")
           public void user_enter_the_payment_method_dropdown_in_the_commerce(String string)throws Exception {
              click(d1.paymentmethod);
              sendkeys(d1.customerproposal1, string);
              pressEnter(d1.customerproposal1);
             Assert.assertTrue("user clicks the payment method dropdwon successfully", isdisplayed(d1.refcustomerproposal));  
        	   
           }
           
           @When("user enter the source method dropdown in the commerce {string}")
           public void user_enter_the_source_method_dropdown_in_the_commerce(String string) throws Exception{
               click(d1.sourcecommercial);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
               Assert.assertTrue("user clicks the source method dropdwon successfully", isdisplayed(d1.refcustomerproposal));
           }
           
           @When("user enter the availability dropdown in the commerce {string}")
           public void user_enter_the_availability_dropdown_in_the_commerce(String string)throws Exception {
               click(d1.availabilitydelay);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
              Assert.assertTrue("user clicks the availability method dropdwon successfully", isdisplayed(d1.paymentterms));  
           }
           
           @When("user enter the delivery date in the input field {string}")
           public void user_enter_the_delivery_date_in_the_input_field(String string) throws Exception{
               sendkeys(d1.Deliverydate, string);
               String actaulDate = d1.Deliverydate.getAttribute("value");
               Assert.assertEquals(string, actaulDate);

               
           }
           @When("user enter the project in the commerce {string}")
           public void user_enter_the_project_in_the_commerce(String string)throws Exception {
              click(d1.project);
              sendkeys(d1.customerproposal1, string);
              pressEnter(d1.customerproposal1);
              Assert.assertTrue("user clicks the project method dropdwon successfully", isdisplayed(d1.paymentterms));
           }
           
           @When("user click the dropdwon in the tags commerce {string}")
           public void user_click_the_dropdwon_in_the_tags_commerce(String string)throws Exception {
               click(d1.tagscommercial);
               sendkeys(d1.tagscommercial, string);
               pressEnter(d1.tagsserach);
               Assert.assertTrue("user clicks the tags method dropdwon successfully", isdisplayed(d1.paymentterms));  
           }
           
           @Then("user enter the note in the public commerce {string}")
           public void user_enter_the_note_in_the_publipaymenttermsc_commerce(String string)throws Exception {
              sendkeys(d1.notepublic, string);
              String actaulText = d1.notepublic.getAttribute("value");
              Assert.assertEquals(string, actaulText);
           }
           
           @Then("user enter the note in the private commerce {string}")
           public void user_enter_the_note_in_the_private_commerce(String string)throws Exception {
               sendkeys(d1.noteprivate, string);
               String actaulText = d1.noteprivate.getAttribute("value");
               Assert.assertEquals(string, actaulText);

           }
           
           @Then("user click the create draft in the commerce if entered credentials are valid {string}")
           public void user_click_the_create_draft_in_the_commerce_if_entered_credentials_are_valid(String status) throws Exception{
             
        	   click(d1.savecommercial);
        	   if (status.equalsIgnoreCase("valid")) 
                   Assert.assertTrue("user add the proposal successfully", isdisplayed(d1.successmessage));
                else {
             		System.out.println(gettext(d1.creationvalidation));
                    }

              
           }
           
           @Given("user click the new order in the sales order")
           public void user_click_the_new_order_in_the_sales_order()throws Exception {
               click(d1.Neworder);
               String actualURL = driver.getCurrentUrl();
         	   String expectedURL = "https://demo.dolibarr.org/commande/card.php?action=create&leftmenu=orders";
         	   Assert.assertEquals(actualURL, expectedURL);

               
           }
           @When("user enter the ref number in the sales order {string}")
           public void user_enter_the_ref_number_in_the_sales_order(String string) throws Exception {
        	   sendkeys(d1.refcustomerproposal, string);
               String actaulText = d1.refcustomerproposal.getAttribute("value");
               Assert.assertEquals(string, actaulText);
        	   
           }
           
           @When("user enter the customer dropdwon in the sales {string}")
           public void user_enter_the_customer_dropdwon_in_the_sales(String string) throws Exception {
        	   click(d1.customerproposal);
        	   waitForElementToBeClickable(d1.customerproposal);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
               Assert.assertTrue("user clicks the customer dropdwon successfully", isdisplayed(d1.refcustomerproposal));
           }
           
           @When("user enter the delivery date in the sales {string}")
           public void user_enter_the_delivery_date_in_the_sales(String string)throws Exception {
        	   sendkeys(d1.planneddelivery, string);
               String actaulDate = d1.planneddelivery.getAttribute("value");
               Assert.assertEquals(string, actaulDate);

           }
           
           @When("user enter the availability dropdwon in the sales order {string}")
           public void user_enter_the_availability_dropdwon_in_the_sales_order(String string)throws Exception {
        	   click(d1.paymentterms);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
              Assert.assertTrue("user clicks the availability method dropdwon successfully", isdisplayed(d1.paymentterms));  

        	   
           }
           
           @When("user enter the payment terms dropdwon in the sales {string}")
           public void user_enter_the_payment_terms_dropdwon_in_the_sales(String string)throws Exception {
        	   click(d1.paymentmethod);
               waitForElementToBeClickable(d1.paymentmethod);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
               Assert.assertTrue("user clicks the payment terms dropdwon successfully", isdisplayed(d1.refcustomerproposal));

           }
           
           @When("user enter the payment method dropdown in the sales {string}")
           public void user_enter_the_payment_method_dropdown_in_the_sales(String string)throws Exception {
        	   click(d1.sourcecommercial);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
              Assert.assertTrue("user clicks the payment method dropdwon successfully", isdisplayed(d1.refcustomerproposal));  

           }
           
           @When("user enter the source dropdown in the sales order {string}")
           public void user_enter_the_source_dropdown_in_the_sales_order(String string) throws Exception{
        	   click(d1.availabilitydelay);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
               Assert.assertTrue("user clicks the source method dropdwon successfully", isdisplayed(d1.refcustomerproposal));
           }
           
           @When("user enter the project dropdwon in the sales order {string}")
           public void user_enter_the_project_dropdwon_in_the_sales_order(String string)throws Exception {
        	   click(d1.project);
               sendkeys(d1.customerproposal1, string);
               pressEnter(d1.customerproposal1);
               Assert.assertTrue("user clicks the project method dropdwon successfully", isdisplayed(d1.paymentterms));
           }
           
           @When("user enter the custom field1 in the sales order {string}")
           public void user_enter_the_custom_field1_in_the_sales_order(String string) throws Exception{
               sendkeys(d1.customfield, string);
               String actaulText = d1.customfield.getAttribute("value");
               Assert.assertEquals(string, actaulText);

           }
           
           @Then("user enter the note public in the sales {string}")
           public void user_enter_the_note_public_in_the_sales(String string)throws Exception {
        	   sendkeys(d1.notepublic, string);
               String actaulText = d1.notepublic.getAttribute("value");
               Assert.assertEquals(string, actaulText);
           }
           
           @Then("user enter the note private in the sales {string}")
           public void user_enter_the_note_private_in_the_sales(String string)throws Exception {
        	   sendkeys(d1.noteprivate, string);
               String actaulText = d1.noteprivate.getAttribute("value");
               Assert.assertEquals(string, actaulText);

           }
           
           @Then("user click the create draft in the salesorder if entered credentials are valid {string}")
           public void user_click_the_create_draft_in_the_salesorder_if_entered_credentials_are_valid(String status) throws Exception {
        	   click(d1.savecommercial);
        	   if (status.equalsIgnoreCase("valid")) 
                   Assert.assertTrue("user add the proposal successfully", isdisplayed(d1.successmessage));
                else {
             		System.out.println(gettext(d1.creationvalidation));
                    }

           }
     
           @Given("user click the list in the customer invoices")
           public void user_click_the_list_in_the_customer_invoices()throws Exception {
               click(d1.Listcommercial);
               String actualURL = driver.getCurrentUrl();
         	   String expectedURL = "https://demo.dolibarr.org/comm/propal/list.php?leftmenu=propals";
         	   Assert.assertEquals(actualURL, expectedURL);

           }
           @When("user search the name in the input field {string}")
           public void user_search_the_name_in_the_input_field(String string) throws Exception{
              sendkeys(d1.refcustomer, string);
              String actaulText = d1.refcustomer.getAttribute("value");
              Assert.assertEquals(string, actaulText);

           }
           
           @When("user click the search in the list commercial")
           public void user_click_the_search_in_the_list_commercial()throws Exception {
              click(d1.clicksearch);
              Assert.assertTrue("user clicks the search button successfully", isdisplayed(d1.newproposal));  
           }


            @When("user click the download button in the list")
           public void user_click_the_download_button_in_the_list() throws Exception{
               click(d1.clickdownloadbutton);
             Assert.assertTrue("user clicks the download button successfully", isdisplayed(d1.newproposal));  
           }
            
           @When("user click the download pdf in the list commercial")
           public void user_click_the_download_pdf_in_the_list_commercial()throws Exception {
               click(d1.downloadpdf);
             Assert.assertTrue("user clicks the download pdf successfully", isdisplayed(d1.Listcommercial));  
           }
           
           @When("user click the preview pdf in the list commercial")
           public void user_click_the_preview_pdf_in_the_list_commercial() throws Exception{
              click(d1.documentpreview);
           }
           
           @Then("user click the close button in the commercial")
           public void user_click_the_close_button_in_the_commercial() throws Exception {
              click(d1.closewindow);
           }
            @Then("user click the relevant name displayed in the commercial")
              public void user_click_the_relevant_name_displayed_in_the_commercial()throws Exception {
                click(d1.relevantnameclick);
              Assert.assertTrue("user clicks the relevant name successfully", isdisplayed(d1.newproposal));   
              }
           
            @Given("user click the draft in the commercial proposals")
            public void user_click_the_draft_in_the_commercial_proposals()throws Exception {
               click(d1.drafts);
               String actualURL = driver.getCurrentUrl();
         	   String expectedURL = "https://demo.dolibarr.org/comm/propal/list.php?leftmenu=propals&search_status=0";
         	   Assert.assertEquals(actualURL, expectedURL);

            	
            }
            
              @When("user search the name in the drafts {string}")
            public void user_search_the_name_in_the_drafts(String string)throws Exception {
               sendkeys(d1.refcustomer, string);
               String actaulText = d1.refcustomer.getAttribute("value");
               Assert.assertEquals(string, actaulText); 
            	
            }
            
            @When("user click search in drafts")
            public void user_click_search_in_drafts()throws Exception {
                click(d1.clicksearch);
              Assert.assertTrue("user clicks the name successfully", isdisplayed(d1.drafts));  
            	
            }
            
            @When("user click the first name in the draft")
            public void user_click_the_first_name_in_the_draft()throws Exception {
               click(d1.relevantleadclick); 
               Assert.assertTrue("user clicks the first name successfully", isdisplayed(d1.drafts));  
               Assert.assertTrue("user verifies the first name is click", isdisplayed(d1.newproposal)); 
            }
            
            @When("user verifies all the headers are displayed in drafts")
            public void user_verifies_all_the_headers_are_displayed_in_drafts()throws Exception {
            	Assert.assertTrue(verifyElement (d1.Commercialproposal));
            	Assert.assertTrue(verifyElement (d1.Contactaddress));
            	Assert.assertTrue(verifyElement (d1.Notesdraft));
            	Assert.assertTrue(verifyElement (d1.LinkedFiles));
            	Assert.assertTrue(verifyElement (d1.Eventsagenta));
            }


            @When("user click the contact address in the draft")
            public void user_click_the_contact_address_in_the_draft()throws Exception {
                click(d1.Contactaddress);
                Assert.assertTrue("contact address is not displayed",isdisplayed(d1.drafts));
       		 Assert.assertTrue("Online button  is not enabled",isEnabled(d1.drafts));
       		 System.out.println("Contact address is displayed successfully");
            }
            
            @When("user click the add button in the contact draft")
            public void user_click_the_add_button_in_the_contact_draft()throws Exception {
                click(d1.addcontactdraft);
              Assert.assertTrue("contact address is not displayed",isdisplayed(d1.drafts));  
            }
            
            @When("user click the notes in the draft")
            public void user_click_the_notes_in_the_draft()throws Exception {
               click(d1.Notesdraft);
               Assert.assertTrue("User is not click the Notes button",CurrentURL().contains("comm/propal/note.php?id"));
               
            }
            
            @When("user click the linked Files in the draft file name")
            public void user_click_the_linked_files_in_the_draft_file_name()throws Exception {
                click(d1.LinkedFiles);
              Assert.assertTrue("User is not click the linked files button",CurrentURL().contains("comm/propal/document.php?id"));   
            
           }
            
            @When("user select the file in the folder {string}")
            public void user_select_the_file_in_the_folder(String string) throws Exception {
            	click(d1.plusbutton);
        		uploadFile(d1.choosefile,string);
        		closedialog();
        		click(d1.upload);
        		Assert.assertTrue("document is not selected",isdisplayed(d1.Notesdraft));
            }
            
            @Then("user click the delete button")
            public void user_click_the_delete_button() throws Exception{
              click(d1.delete1);
              Assert.assertTrue("user is not click the delete button",isdisplayed(d1.drafts));  
            }
            
            @Then("user click the yes buuton")
            public void user_click_the_yes_buuton()throws Exception {
               click(d1.yes);
            }


            @Then("user click Events Agenta in drafts")
            public void user_click_events_agenta_in_drafts()throws Exception {
              click(d1.Eventsagenta);  
              Assert.assertTrue("user is not click events agenta",isdisplayed(d1.Contactaddress));  
            }

            @Given("user click the statistics in the commercial proposals")
            public void user_click_the_statistics_in_the_commercial_proposals() throws Exception{
               click(d1.statistics);
               String actualURL = driver.getCurrentUrl();
         	   String expectedURL = "https://demo.dolibarr.org/comm/propal/stats/index.php?leftmenu=propals";
         	   Assert.assertEquals(actualURL, expectedURL);
               
            }

            @When("user enter the third party drop in the field {string}")
            public void user_enter_the_third_party_drop_in_the_field(String string)throws Exception{
                click(d1.thirdpartydrop);
                sendkeys(d1.thirdpartysearch, string);
                pressEnter(d1.thirdpartysearch);
               
            }
            
            @When("user enter the third party type dropdown {string}")
            public void user_enter_the_third_party_type_dropdown(String string) throws Exception{
                click(d1.thirdpartytype);
                sendkeys(d1.thirdpartysearch, string);
                pressEnter(d1.thirdpartysearch);
                           
            }
            
            @When("user click the category customer dropdwon {string}")
            public void user_click_the_category_customer_dropdwon(String string) throws Exception{
                click(d1.customercategorydrop);
                sendkeys(d1.thirdpartysearch, string);
                pressEnter(d1.thirdpartysearch);
                
            
            }
           
            @When("user click the created by dropdwon in commercial {string}")
            public void user_click_the_created_by_dropdwon_in_commercial(String string)throws Exception {
                click(d1.createdbydrop);
                sendkeys(d1.thirdpartysearch, string);
                pressEnter(d1.thirdpartysearch);
                
            }  
            
            @When("user click the status dropdwon in commercial {string}")
            public void user_click_the_status_dropdwon_in_commercial(String string) throws Exception{
                click(d1.statusdrop);
                sendkeys(d1.thirdpartysearch, string);
                pressEnter(d1.thirdpartysearch);

            	}
            
            @Then("user enter the year dropdown in commercial {string}")
            public void user_enter_the_year_dropdown_in_commercial(String string)throws Exception {
                 click(d1.yeardrop);   
                 sendkeys(d1.thirdpartysearch, string);
                 pressEnter(d1.thirdpartysearch);
                 
            }
            
            @Then("user click the refresh button in commercial")
            public void user_click_the_refresh_button_in_commercial() throws Exception{
                click(d1.refreshstatistics);
            }

            @Given("user click new order in purchase order creation")
            public void user_click_new_order_in_purchase_order_creation()throws Exception {
                click(d1.neworderpurchase);
                String actualURL = driver.getCurrentUrl();
          	   String expectedURL = "https://demo.dolibarr.org/fourn/commande/card.php?action=create&leftmenu=orders_suppliers";
          	   Assert.assertEquals(actualURL, expectedURL); 
            }

            @When("user click a dropdown vendor {string}")
            public void user_click_a_dropdown_vendor(String string)throws Exception {
                click(d1.vendorthirdparty);
                sendkeys(d1.searchpurchase, string);
                pressEnter(d1.searchpurchase);
            	
            }
            
            @When("user enter a ref vendor in puchase order {string}")
            public void user_enter_a_ref_vendor_in_puchase_order(String string)throws Exception {
               sendkeys(d1.refvendor, string);
               String actaulText = d1.refvendor.getAttribute("value");
               Assert.assertEquals(string, actaulText);
               
            }
            
            
            @When("user enter payment terms dropdwon in purchase order {string}")
            public void user_enter_payment_terms_dropdwon_in_purchase_order(String string)throws Exception {
                click(d1.paymenttermsdrop);
                sendkeys(d1.searchpurchase, string);
                pressEnter(d1.searchpurchase);
            }
            
            @When("user click dropdown payment method in purchase order {string}")
            public void user_click_dropdown_payment_method_in_purchase_order(String string)throws Exception {
                click(d1.paymentmethoddrop);
                sendkeys(d1.searchpurchase, string);
                pressEnter(d1.searchpurchase);
            }
            
            @When("user enter planned date of delivery in purchase order {string}")
            public void user_enter_planned_date_of_delivery_in_purchase_order(String string) throws Exception{
                 sendkeys(d1.planneddate, string);
                 String actaulDate = d1.planneddate.getAttribute("value");
                 Assert.assertEquals(string, actaulDate);
            }
            
            @When("user click the project dropdwon in purchase order {string}")
            public void user_click_the_project_dropdwon_in_purchase_order(String string)throws Exception {
               click(d1.projectdropdwon);
               sendkeys(d1.searchpurchase, string);
               pressEnter(d1.searchpurchase);
               
            }
            
            @When("user click the currency dropdwon in purchase order {string}")
            public void user_click_the_currency_dropdwon_in_purchase_order(String string) throws Exception{
                click(d1.currencydropdwon);
                sendkeys(d1.searchpurchase, string);
                pressEnter(d1.searchpurchase);
                
            }
            
            @When("user enter the notes public in purchase order {string}")
            public void user_enter_the_notes_public_in_purchase_order(String string)throws Exception {
               sendkeys(d1.notepublic, string);
               String actaulText = d1.notepublic.getAttribute("value");
               Assert.assertEquals(string, actaulText);
            }
            
            @When("user enters the notes private in purchase order {string}")
            public void user_enters_the_notes_private_in_purchase_order(String string) throws Exception{
               sendkeys(d1.noteprivate, string);
               String actaulText = d1.noteprivate.getAttribute("value");
               Assert.assertEquals(string, actaulText); 
            }
            
            @Then("user click the created draft in purchase order if entered credentials are valid {string}")
            public void user_click_the_created_draft_in_purchase_order_if_entered_credentials_are_valid(String status) throws Exception{
                click(d1.savecommercial);
                if (status.equalsIgnoreCase("valid")) 
                    Assert.assertTrue("user created the purchase order successfully", isdisplayed(d1.neworderpurchase));
                 else {
              		System.out.println(gettext(d1.creationvalidation));
                     }


                
            }
            
              @Given("user click the statistics in the sales order")
              public void user_click_the_statistics_in_the_sales_order() throws Exception{
                  click(d1.salesstatistics);
                  String actualURL = driver.getCurrentUrl();
             	  String expectedURL = "https://demo.dolibarr.org/commande/stats/index.php?leftmenu=orders";
             	 Assert.assertEquals(actualURL, expectedURL);
              }

              @And("user enter the thirdparty dropdown in sales order {string}")
            public void user_enter_the_thirdparty_dropdown_in_sales_order(String string) throws Exception {
            	click(d1.thirdpartydropsales);
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
              Assert.assertTrue("user click the third party dropdown successfully", isdisplayed(d1.salesstatistics)); 
              
            }
            
            @And("user click the thirdparty type dropdwon in sales order {string}")
            public void user_click_the_thirdparty_type_dropdwon_in_sales_order(String string)throws Exception {
            	click(d1.salesorderthirdtype);
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
              Assert.assertTrue("user click the third party type dropdown successfully", isdisplayed(d1.thirdpartydropsales));   
       
            }
            
            @And("user click the category customer dropdown in sales order {string}")
            public void user_click_the_category_customer_dropdown_in_sales_order(String string) throws Exception{
            	click(d1.salescustomerdrop);
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
               Assert.assertTrue("user click the category dropdown successfully", isdisplayed(d1.salesorderthirdtype));   
            	
            }
            
            @And("user enter the created by dropdown in sales {string}")
            public void user_enter_the_created_by_dropdown_in_sales(String string) throws Exception{
            	 click(d1.salescreatedby);
                 sendkeys(d1.thirdpartysearchsales, string);
                 pressEnter(d1.thirdpartysearchsales);
             Assert.assertTrue("user click the createdby dropdown successfully", isdisplayed(d1.salescustomerdrop)); 
            	
            }
            
            @And("user enter the status in sales {string}")
            public void user_enter_the_status_in_sales(String string) throws Exception{
            	click(d1.salesstatusdrop);
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
             Assert.assertTrue("user click the status dropdown successfully", isdisplayed(d1.salescreatedby)); 
            	
            }
            
            @Then("user enter the year in sales order {string}")
            public void user_enter_the_year_in_sales_order(String string)throws Exception {
            	click(d1.salesyeardrop);   
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
              Assert.assertTrue("user click the year dropdown successfully", isdisplayed(d1.salesstatusdrop));  
            }
            
            @Then("user click the refresh button in sales order")
            public void user_click_the_refresh_button_in_sales_order() throws Exception {
                click(d1.refreshstatistics);
            }

            @Given("user click the sales order list")
            public void user_click_the_sales_order_list() throws Exception {
                  click(d1.listsales);
                  String actualURL = driver.getCurrentUrl();
            	   String expectedURL = "https://demo.dolibarr.org/commande/list.php?leftmenu=orders";
            	   Assert.assertEquals(actualURL, expectedURL);
  

            }
            
            @When("user search the name in refrence customer name {string}")
            public void user_search_the_name_in_refrence_customer_name(String string) {
                sendkeys(d1.refcustomersales, string);
                String actaulText = d1.refcustomersales.getAttribute("value");
                Assert.assertEquals(string, actaulText); 
             	
            }
            
            @When("user click the search in sales order list")
            public void user_click_the_search_in_sales_order_list() throws Exception{
                click(d1.clicksearch);
             Assert.assertTrue("user search the name successfully", isdisplayed(d1.listsales));    
            }
            
            @When("user click the name in the list displayed in sales order")
            public void user_click_the_name_in_the_list_displayed_in_sales_order()throws Exception {
                click(d1.relevantsalesnameclick);
                Assert.assertTrue("user clicks the first name successfully", isdisplayed(d1.listsales));  
                Assert.assertTrue("user verifies the first name is click", isdisplayed(d1.salesstatistics));
            }
            
            @When("user verifies all the headers are displayed in sales order")
            public void user_verifies_all_the_headers_are_displayed_in_sales_order()throws Exception {
            	Assert.assertTrue(verifyElement (d1.salesorderlist1));
            	Assert.assertTrue(verifyElement (d1.salesContactaddress));
            	Assert.assertTrue(verifyElement (d1.salesNotes));
            	Assert.assertTrue(verifyElement (d1.SalesLinkedFiles));
            	Assert.assertTrue(verifyElement (d1.SalesEventsagenta));

            }
            
            @When("user click the contact address in sales order")
            public void user_click_the_contact_address_in_sales_order()throws Exception {
                click(d1.salesContactaddress);
                Assert.assertTrue("contact address is not displayed",isdisplayed(d1.listsales));
          		 Assert.assertTrue("contact address  is not enabled",isEnabled(d1.salesorderlist1));
          		 System.out.println("Contact address is displayed successfully");

            }
            
            @When("user click the Add button in sales order")
            public void user_click_the_add_button_in_sales_order()throws Exception {
               click(d1.addcontactsales);
             Assert.assertTrue("contact address Add button is not displayed",isdisplayed(d1.listsales));   
            }
            
            @When("user click the notes in sales order")
            public void user_click_the_notes_in_sales_order() throws Exception{
            	click(d1.Notessales);
                Assert.assertTrue("User is not click the Notes button",CurrentURL().contains("commande/note.php?id"));

            	
            }
            
            @When("user click the linked Files in the sales order")
            public void user_click_the_linked_files_in_the_sales_order()throws Exception {
            	click(d1.SalesLinkedFiles);
                Assert.assertTrue("User is not click the linked files button",CurrentURL().contains("commande/document.php?id"));
            }
            
            @When("user select the file in the folder in sales order {string}")
            public void user_select_the_file_in_the_folder_in_sales_order(String string)throws Exception {
            	click(d1.plusbuttonsales);
        		uploadFile(d1.choosefilesales,string);
        		closedialog();
        		click(d1.uploadsales);
        		Assert.assertTrue("document is not selected",isdisplayed(d1.Notessales));
            
            }
            
            @Then("user click the delete button in sales order list")
            public void user_click_the_delete_button_in_sales_order_list()throws Exception {
                click(d1.delete1sales);
             Assert.assertTrue("user is not click the delete button",isdisplayed(d1.salesorderlist1));
            
            }
            
            @Then("user click the yes buuton in sales list")
            public void user_click_the_yes_buuton_in_sales_list()throws Exception {
            	click(d1.yes);

            }
            
            @Then("user click Events Agenta in saleslist")
            public void user_click_events_agenta_in_saleslist()throws Exception {
            	click(d1.Eventsagenta);  
                Assert.assertTrue("user is not click events agenta in sales",isdisplayed(d1.salesContactaddress));
            }


            @Given("user click the statistics in purchase order")
            public void user_click_the_statistics_in_purchase_order()throws Exception {
                click(d1.purchasestatistics);
                String actualURL = driver.getCurrentUrl();
           	  String expectedURL = "https://demo.dolibarr.org/commande/stats/index.php?leftmenu=orders_suppliers&mode=supplier";
           	 Assert.assertEquals(actualURL, expectedURL);
            }
            
            @When("user click the dropdown in third party purchase order {string}")
            public void user_click_the_dropdown_in_third_party_purchase_order(String string) throws Exception{
            	click(d1.purchasethirdpartydrop);
                sendkeys(d1.purchasethirdpartysearch, string);
                pressEnter(d1.purchasethirdpartysearch);
              Assert.assertTrue("user click the third party dropdown successfully", isdisplayed(d1.purchasestatistics));
            }
            
            @When("user click the thirdparty type in purchase order {string}")
            public void user_click_the_thirdparty_type_in_purchase_order(String string) throws Exception{
            	click(d1.purchasethirdtype);
                sendkeys(d1.purchasethirdpartysearch, string);
                pressEnter(d1.purchasethirdpartysearch);
              Assert.assertTrue("user click the third party type dropdown successfully", isdisplayed(d1.purchasethirdpartydrop)); 
            
            }
            
            @When("user click the tag vendor in purchase order {string}")
            public void user_click_the_tag_vendor_in_purchase_order(String string)throws Exception {
            	click(d1.purchasecustomerdrop);
                sendkeys(d1.purchasethirdpartysearch, string);
                pressEnter(d1.purchasethirdpartysearch);
               Assert.assertTrue("user click the category dropdown successfully", isdisplayed(d1.purchasethirdtype));   
            	

            }
            
            @When("user click the created by dropdown in purchase order {string}")
            public void user_click_the_created_by_dropdown_in_purchase_order(String string)throws Exception {
            	click(d1.purchasecreatedby);
                sendkeys(d1.purchasethirdpartysearch, string);
                pressEnter(d1.purchasethirdpartysearch);
            Assert.assertTrue("user click the createdby dropdown successfully", isdisplayed(d1.purchasecustomerdrop)); 

            	
            }
            
            
            @When("enter the status in the purchase order {string}")
            public void enter_the_status_in_the_purchase_order(String string) throws Exception{
                    click(d1.purchasestatus);
                    sendkeys(d1.statuspurchase, string);
                    pressEnter(d1.statuspurchase);
                Assert.assertTrue("user click the status dropdown successfully", isdisplayed(d1.purchasecreatedby)); 
      
            
            }
            
            @Then("user enter the year in purchase order {string}")
            public void user_enter_the_year_in_purchase_order(String string) throws Exception {
                click(d1.purchaseyear);
                sendkeys(d1.purchasethirdpartysearch, string);
                pressEnter(d1.purchasethirdpartysearch);
              Assert.assertTrue("user click the year dropdown successfully", isdisplayed(d1.purchasecreatedby)); 
            }
            
            @Then("user click the refresh in purchase order")
            public void user_click_the_refresh_in_purchase_order() throws Exception {
            	click(d1.refreshstatistics);
            	
            }

            @Given("user click the new price request in vendor proposals")
            public void user_click_the_new_price_request_in_vendor_proposals() throws Exception{
                click(d1.newvendorcreation);
                String actualURL = driver.getCurrentUrl();
         	   String expectedURL = "https://demo.dolibarr.org/supplier_proposal/card.php?action=create&leftmenu=supplier_proposals";
         	   Assert.assertEquals(actualURL, expectedURL);
  
            	
            }
           
            @When("click the vendor dropdown in vendor proposals {string}")
            public void click_the_vendor_dropdown_in_vendor_proposals(String string)throws Exception {
            	click(d1.vendorthirdparty);
                sendkeys(d1.searchpurchase, string);
                pressEnter(d1.searchpurchase);
            	
            }
            
            @When("user click the payment terms in vendor proposal {string}")
            public void user_click_the_payment_terms_in_vendor_proposal(String string)throws Exception {
            	 click(d1.paymenttermsdrop);
                 sendkeys(d1.searchpurchase, string);
                 pressEnter(d1.searchpurchase);
            
            }
            
            @When("user enter the payment method in vendor proposal {string}")
            public void user_enter_the_payment_method_in_vendor_proposal(String string)throws Exception {
            	click(d1.paymentmethoddrop);
                sendkeys(d1.searchpurchase, string);
                pressEnter(d1.searchpurchase);
    
            
            }
            
            @When("user enter the delivery date in vendor proposal {string}")
            public void user_enter_the_delivery_date_in_vendor_proposal(String string)throws Exception {
               sendkeys(d1.planneddeliveryvendor, string);
               String actaulDate = d1.planneddeliveryvendor.getAttribute("value");
               Assert.assertEquals(string, actaulDate);

            }
            
            @When("user enter the project in vendor proposal {string}")
            public void user_enter_the_project_in_vendor_proposal(String string) throws Exception{
                click(d1.currencydropdwon);
                sendkeys(d1.searchpurchase, string);
                pressEnter(d1.searchpurchase);
            }
            
            @When("user enter the currency in vendor proposal {string}")
            public void user_enter_the_currency_in_vendor_proposal(String string) throws Exception{
                click(d1.salesstatusdrop);
                sendkeys(d1.searchpurchase, string);
                pressEnter(d1.searchpurchase);
            }
            
            
            @Then("user click the created draft in vendor proposal if entered credentials are valid {string}")
            public void user_click_the_created_draft_in_vendor_proposal_if_entered_credentials_are_valid(String status) throws Exception{
                click(d1.savecommercial);
                if (status.equalsIgnoreCase("valid")) 
                    Assert.assertTrue("user created the vendor proposal successfully", isdisplayed(d1.newproposal));
                 else {
              		System.out.println(gettext(d1.creationvalidation));
                     }

            }

            @Given("user click the statistics in the vendor proposal")
            public void user_click_the_statistics_in_the_vendor_proposal()throws Exception {
               click(d1.statisticsvendor);
               String actualURL = driver.getCurrentUrl();
                String expectedURL = "https://demo.dolibarr.org/comm/propal/stats/index.php?leftmenu=supplier_proposals&mode=supplier";
            	 Assert.assertEquals(actualURL, expectedURL);

            }

            @When("user enter the thirdparty dropdown in vendor proposal {string}")
            public void user_enter_the_thirdparty_dropdown_in_vendor_proposal(String string) throws Exception {
            	click(d1.vendorthirddrop);
                sendkeys(d1.vendorsthirdpartysearch, string);
                pressEnter(d1.vendorsthirdpartysearch);
              Assert.assertTrue("user click the third party dropdown successfully", isdisplayed(d1.statisticsvendor));
            
            }
            
            @When("user click the thirdparty type dropdwon in vendor proposal {string}")
            public void user_click_the_thirdparty_type_dropdwon_in_vendor_proposal(String string)throws Exception {
            	click(d1.salesorderthirdtype);
                sendkeys(d1.vendorsthirdpartysearch, string);
                pressEnter(d1.vendorsthirdpartysearch);
              Assert.assertTrue("user click the third party type dropdown successfully", isdisplayed(d1.vendorthirddrop)); 
            	
            }
            
            @When("user click the category customer dropdown in vendor proposal {string}")
            public void user_click_the_category_customer_dropdown_in_vendor_proposal(String string) throws Exception {
            	click(d1.salescustomerdrop);
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
               Assert.assertTrue("user click the category dropdown successfully", isdisplayed(d1.salesorderthirdtype));   
            	
            }
            
            @When("user enter the created by dropdown in vendor {string}")
            public void user_enter_the_created_by_dropdown_in_vendor(String string)throws Exception {
            	click(d1.salescreatedby);
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
            Assert.assertTrue("user click the createdby dropdown successfully", isdisplayed(d1.salescustomerdrop));
            
            }
            
            @When("user enter the status in vendorstatus {string}")
            public void user_enter_the_status_in_vendorstatus(String string) throws Exception {
            	click(d1.salesstatusdrop);
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
             Assert.assertTrue("user click the status dropdown successfully", isdisplayed(d1.salescreatedby)); 
            	
            }
            
            @Then("user enter the year in vendor proposal {string}")
            public void user_enter_the_year_in_vendor_proposal(String string) throws Exception {
            	click(d1.salesyeardrop);   
                sendkeys(d1.thirdpartysearchsales, string);
                pressEnter(d1.thirdpartysearchsales);
              Assert.assertTrue("user click the year dropdown successfully", isdisplayed(d1.salesstatusdrop));
            
            }

            @Then("user click the refresh button in vendor proposal")
            public void user_click_the_refresh_button_in_vendor_proposal() throws Exception {
                click(d1.refreshstatistics);
            }

            @Given("user click the new contract in Contracts")
            public void user_click_the_new_contract_in_contracts()throws Exception {
               click(d1.Newcontract);
               String actualURL = driver.getCurrentUrl();
               String expectedURL = "https://demo.dolibarr.org/contrat/card.php?action=create&leftmenu=contracts";
           	 Assert.assertEquals(actualURL, expectedURL);
 
            }

            @Given("user enter the refernce customer in new contract {string}")
            public void user_enter_the_refernce_customer_in_new_contract(String string)throws Exception {
                sendkeys(d1.customercontract, string);
                String actaulText = d1.customercontract.getAttribute("value");
                Assert.assertEquals(string, actaulText);

            }
            
            @When("user enter the refernce vendor in new contract {string}")
            public void user_enter_the_refernce_vendor_in_new_contract(String string) throws Exception{
                sendkeys(d1.vendorcontract, string);
                String actaulText = d1.vendorcontract.getAttribute("value");
                Assert.assertEquals(string, actaulText);

            }
            
            @When("user enter the thirdparty in the new contract {string}")
            public void user_enter_the_thirdparty_in_the_new_contract(String string)throws Exception {
                click(d1.thirdpartydrop);
                sendkeys(d1.searchstatistics, string);
                pressEnter(d1.searchstatistics);
            
            }
            
            @When("user enter the following up in the new contract {string}")
            public void user_enter_the_following_up_in_the_new_contract(String string) throws Exception{
                click(d1.paymentmethoddrop);
                sendkeys(d1.searchstatistics, string);
                pressEnter(d1.searchstatistics);
            }
            
            @When("user enter the signing in the new contract {string}")
            public void user_enter_the_signing_in_the_new_contract(String string)throws Exception {
                click(d1.year);
                sendkeys(d1.searchstatistics, string);
                pressEnter(d1.searchstatistics);
 
            }
            
            @When("user enter the date in new contract {string}")
            public void user_enter_the_date_in_new_contract(String string)throws Exception {
                sendkeys(d1.datecontract, string);
                String actaulDate = d1.datecontract.getAttribute("value");
                Assert.assertEquals(string, actaulDate);

            }
            
            @When("user enter project in new contract {string}")
            public void user_enter_project_in_new_contract(String string)throws Exception {
            	click(d1.sourcecommercial);
                sendkeys(d1.searchstatistics, string);
                pressEnter(d1.searchstatistics);
 
            }
            
            @When("user enter the note in new contract {string}")
            public void user_enter_the_note_in_new_contract(String string)throws Exception {
                sendkeys(d1.notepublic, string);
                String actaulText = d1.notepublic.getAttribute("value");
                Assert.assertEquals(string, actaulText);

            }
            
            @When("user enter the note public in new contract {string}")
            public void user_enter_the_note_public_in_new_contract(String string)throws Exception {
                sendkeys(d1.noteprivate, string);
                String actaulText = d1.noteprivate.getAttribute("value");
                Assert.assertEquals(string, actaulText);
            	
            }
            
            @Then("user click the create new contract if entered credentials are valid {string}")
            public void user_click_the_create_new_contract_if_entered_credentials_are_valid(String status)throws Exception {
               click(d1.addcontactdraft);
               if (status.equalsIgnoreCase("valid")) 
                   Assert.assertTrue("user created the new contract successfully", isdisplayed(d1.newproposal));
                else {
             		System.out.println(gettext(d1.creationvalidation));
                    }
                 
            }
            
            @Given("user click the vendor proposals list")
            public void user_click_the_vendor_proposals_list()throws Exception {
                click(d1.listvendor);
                String actualURL = driver.getCurrentUrl();
                String expectedURL = "https://demo.dolibarr.org/supplier_proposal/list.php?leftmenu=supplier_proposals";
            	 Assert.assertEquals(actualURL, expectedURL);
  
            }

            @When("user search the name in refrence vendor {string}")
            public void user_search_the_name_in_refrence_vendor(String string) throws Exception{
               sendkeys(d1.searchvendor, string);
               String actaulText = d1.searchvendor.getAttribute("value");
               Assert.assertEquals(string, actaulText);
            }

            @When("user click the search in vendor list")
            public void user_click_the_search_in_vendor_list()throws Exception {
                click(d1.clicksearch);
              Assert.assertTrue("user click the search successfully", isdisplayed(d1.listvendor));   
            }

            @When("user click the name in the list displayed in vendor list")
            public void user_click_the_name_in_the_list_displayed_in_vendor_list()throws Exception {
                click(d1.relevantsalesnameclick);
                Assert.assertTrue("User is not click the name list button",CurrentURL().contains("supplier_proposal/card.php?id"));
            	
            }

            @When("user verifies all the headers are displayed in vendor list")
            public void user_verifies_all_the_headers_are_displayed_in_vendor_list()throws Exception {
            	Assert.assertTrue(verifyElement (d1.Commercialproposal));
            	Assert.assertTrue(verifyElement (d1.Contactaddress));
            	Assert.assertTrue(verifyElement (d1.Notesdraft));
            	Assert.assertTrue(verifyElement (d1.LinkedFiles));
            	Assert.assertTrue(verifyElement (d1.Eventsagenta));
            }

            @When("user click the contact address in vendor list")
            public void user_click_the_contact_address_in_vendor_list()throws Exception {
            	 click(d1.Contactaddress);
                 Assert.assertTrue("contact address is not displayed",isdisplayed(d1.listsales));
        		 Assert.assertTrue("Online button  is not enabled",isEnabled(d1.newproposal));
        		 System.out.println("Contact address is displayed successfully");
             }

            @When("user click the Add button in vendor list")
            public void user_click_the_add_button_in_vendor_list() throws Exception {
            	 click(d1.addcontactdraft);
                 Assert.assertTrue("contact address is not displayed",isdisplayed(d1.Commercialproposal));  
            }

            @When("user click the notes in vendor list")
            public void user_click_the_notes_in_vendor_list()throws Exception {
            	click(d1.Notesdraft);
                Assert.assertTrue("User is not click the Notes button",CurrentURL().contains("supplier_proposal/note.php?id"));

            }

            @When("user click the linked Files in the vendor list")
            public void user_click_the_linked_files_in_the_vendor_list()throws Exception {
            	 click(d1.LinkedFiles);
                 Assert.assertTrue("User is not click the linked files button",CurrentURL().contains("supplier_proposal/document.php?id")); 
            }

            @When("user select the file in the folder in vendor list {string}")
            public void user_select_the_file_in_the_folder_in_vendor_list(String string)throws Exception {
            	click(d1.plusbutton);
        		uploadFile(d1.choosefile,string);
        		closedialog();
        		click(d1.upload);
        		Assert.assertTrue("document is not selected",isdisplayed(d1.Notesdraft));
            }

            @Then("user click the delete button in vendor list")
            public void user_click_the_delete_button_in_vendor_list() throws Exception{
            	 click(d1.delete1);
                 Assert.assertTrue("user is not click the delete button",isdisplayed(d1.listvendor));
            }

            @Then("user click the yes buuton in vendor list")
            public void user_click_the_yes_buuton_in_vendor_list() throws Exception {
            	 click(d1.yes);
    
            }

            @Then("user click Events Agenta in vendorlist")
            public void user_click_events_agenta_in_vendorlist()throws Exception {
            	click(d1.Eventsagenta);  
                Assert.assertTrue("user is not click events agenta",isdisplayed(d1.Contactaddress));
            }

            @Given("user click the new intervention in commerce")
            public void user_click_the_new_intervention_in_commerce()throws Exception {
                click(d1.newintervention);
                String actualURL = driver.getCurrentUrl();
                String expectedURL = "https://demo.dolibarr.org/fichinter/card.php?action=create&leftmenu=ficheinter";
            	 Assert.assertEquals(actualURL, expectedURL);
   
            }
            
            @When("user enter the third party invention dropdwon {string}")
            public void user_enter_the_third_party_invention_dropdwon(String string) throws Exception {
               click(d1.thirdintervention);
               sendkeys(d1.searchlistofservice, string);
               pressEnter(d1.searchlistofservice);
            	
            }
            
            @Then("user click the create draft in new inervention")
            public void user_click_the_create_draft_in_new_inervention() throws Exception {
                click(d1.savetimetacking);
                String actualURL = driver.getCurrentUrl();
                String expectedURL = "https://demo.dolibarr.org/fichinter/card.php";
            	 Assert.assertEquals(actualURL, expectedURL);

            }

            @Given("user enter reference customer in new intervention {string}")
            public void user_enter_reference_customer_in_new_intervention(String string)throws Exception {
                sendkeys(d1.refcustomerproposal, string);
                String actaulText = d1.refcustomerproposal.getAttribute("value");
                Assert.assertEquals(string, actaulText);
            
            }
            
            @When("user enter the description in new intervention {string}")
            public void user_enter_the_description_in_new_intervention(String string)throws Exception {
               sendkeys(d1.description, string);
               String actaulText = d1.description.getAttribute("value");
               Assert.assertEquals(string, actaulText);
           
            }
            
            @When("user click project in create intervention {string}")
            public void user_click_project_in_create_intervention(String string)throws Exception {
                click(d1.thirdintervention);
                sendkeys(d1.thrdsearch, string);
                pressEnter(d1.thrdsearch);               
            	
            }
            
            @When("user enter note public in intervention {string}")
            public void user_enter_note_public_in_intervention(String string)throws Exception {
               sendkeys(d1.notepublic, string);
               String actaulText = d1.notepublic.getAttribute("value");
               Assert.assertEquals(string, actaulText);
            }
            
            @When("user enter note private in intervention {string}")
            public void user_enter_note_private_in_intervention(String string) throws Exception{
                sendkeys(d1.noteprivate, string);
                String actaulText = d1.noteprivate.getAttribute("value");
                Assert.assertEquals(string, actaulText);
            }
            
            @Then("user click create draft if entered credentials are valid {string}")
            public void user_click_create_draft_if_entered_credentials_are_valid(String status) throws Exception{
                    click(d1.savecommercial); 
                    if (status.equalsIgnoreCase("valid")) 
                        Assert.assertTrue("user created the new intervention successfully", isdisplayed(d1.newproposal));
                     else {
                  		System.out.println(gettext(d1.creationvalidation));
                         }
                      
                 }
           
            @Given("user click the billing in the headers")
            public void user_click_the_billing_in_the_headers()throws Exception {
                click(d1.billing);
                String actualURL = driver.getCurrentUrl();
                String expectedURL = "https://demo.dolibarr.org/compta/index.php?mainmenu=billing&leftmenu=";
            	 Assert.assertEquals(actualURL, expectedURL);  
            	
            }
            
            @When("user click the new invoice in the customer invoice")
            public void user_click_the_new_invoice_in_the_customer_invoice() throws Exception{
                click(d1.newinvoics);
             Assert.assertTrue("New invoice is not displayed",isdisplayed(d1.billing));
       		 Assert.assertTrue("new invoice button  is not enabled",isEnabled(d1.commerce));

            }
            
            @When("user enter customer dropdown in new invoice {string}")
            public void user_enter_customer_dropdown_in_new_invoice(String string)throws Exception {
                click(d1.partydropdwon);
                sendkeys(d1.prioritysearch, string);
                pressEnter(d1.prioritysearch);
            
            }
            
            @When("user enter payment terms dropdown in new invoice {string}")
            public void user_enter_payment_terms_dropdown_in_new_invoice(String string) throws Exception{
                click(d1.partydropdwon);
                sendkeys(d1.prioritysearch, string);
                pressEnter(d1.prioritysearch);      
                
            }
            
            @When("user enter payment method dropdown in new invoice {string}")
            public void user_enter_payment_method_dropdown_in_new_invoice(String string) throws Exception {
                click(d1.leadstatus);
            	sendkeys(d1.prioritysearch, string);
            	pressEnter(d1.prioritysearch);
            }
            
            




}




            
            
           



            

 






            
            
            
            
           
             
            




            

           
            







           
       

















       
     

       
       
      






      









