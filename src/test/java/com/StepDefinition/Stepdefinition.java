package com.StepDefinition;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.baseclass;
import com.PomClass.pomclass;

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
       }

       @When("user modify the firstname in the input field {string}")
       public void user_modify_the_firstname_in_the_input_field(String string)throws Exception {
          sendkeys(d1.Firstname, string);
       }

       @When("user modify the address in the input field {string}")
       public void user_modify_the_address_in_the_input_field(String string)throws Exception {
           sendkeys(d1.address, string);
       }

       @When("user modify the zipcode in the input field {string}")
       public void user_modify_the_zipcode_in_the_input_field(String string)throws Exception {
            sendkeys(d1.zipcode, string);    
       }

       @When("user modify the busphone in the input field {string}")
       public void user_modify_the_busphone_in_the_input_field(String string) throws Exception{
          sendkeys(d1.Busphone, string);
       }

       @When("user modify the persphone in the input field {string}")
       public void user_modify_the_persphone_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Persphone, string);
       }

       @When("user modify the faxnumber in the input field {string}")
       public void user_modify_the_faxnumber_in_the_input_field(String string)throws Exception {
           sendkeys(d1.Fax, string);
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
       }

       @When("user enter the label in the new service {string}")
       public void user_enter_the_label_in_the_new_service(String string) throws Exception {
         sendkeys(d1.Label, string);
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
       }

       @When("user enter the notes in the service page {string}")
       public void user_enter_the_notes_in_the_service_page(String string)throws Exception {
           sendkeys(d1.Notes, string);
       }

       @When("user enter the selling price in the service page {string}")
       public void user_enter_the_selling_price_in_the_service_page(String string)throws Exception {
           sendkeys(d1.sellingprice, string);
       }

       @When("user enter the Minimum selling price in the service page {string}")
       public void user_enter_the_minimum_selling_price_in_the_service_page(String string)throws Exception {
          sendkeys(d1.Minsellingprice, string);
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
       }


        @When("user click the relevant product ref displayed in the list")
       public void user_click_the_relevant_product_ref_displayed_in_the_list()throws Exception {
           click(d1.clicksearch);
           Assert.assertTrue("Relevant list is displayed successfully", isdisplayed(d1.Newservice));  
           
       }
        
        @When("user click the name in the displayed list")
        public void user_click_the_name_in_the_displayed_list()throws Exception {
           click(d1.namesearch);
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
       }

       @When("user enter the value in the input field {string}")
       public void user_enter_the_value_in_the_input_field(String string)throws Exception {
           sendkeys(d1.value, string);
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
       
      














       
     

       
       
      }






      









