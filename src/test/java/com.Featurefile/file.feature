Feature:Dolibar Website automation

Scenario:verify login
Given user launch browser
Given user click the Test online in Homepage

Scenario:Features in CRM & Sales

Given user click the features in dashborad page
Given user click the crm sales customers in features
When user click the opportunites in features dashboard page
When user click the proposals in features dashboard page
Then user click the sales and order in the dasboard page
Then user click the contracts in the features dashboard page
Then user click the Helpdesk in the crm and sales dashboard page
Then user click the Knowledge in the crm and sales dashboard page

Scenario:HR Management

Given user click the employees in the HR management
When user click the Expense reports in the HR Management
When user click the leave request in the HR Management
When user click the timesheets in the HR Management
When user click the recuirement in the HR Management
Then  user click the membership in the HR management

Scenario:CMS,Website,POS

Given user click the cms and website in Features
Then user click the point of sale in the Features

Scenario:Product & Stock

Given user click the product service page in the Features
When user click the stock page in the feature
When user click the purchase approvising in feature
When user click the shipments in the Feature
Then user click the Manufacturing in the Feature

Scenario:Finance & Billing

Given user click the Bills and payment in Finance
When user click the Bank reconciliation in Finance
Then user click the Double entry accounting in finance

Scenario:Marketing

Given user click the Emailing in the Marketing
Then user click the surveys in the Marketing

Scenario:Productivity

Given user click the project and tasks in the productivity
When user click the Interventions in the productivity
Then user click the agenda in the productivity

Scenario:Integration,Development

Given user click the API Integration page in feature
When user click the connectivity with external tools in feature
When user click the export import in feature
Then user click the Module Builder for developers

@Selva
Scenario:Validate Login

Given user click the Home icon
When user click the Test online in dashboard page
When user click the solution2 option
When user click the Freelance selling service only
@Selva
Scenario Outline:Login validation using valid and invalid

When user enter the username "<username>"
When user enter the password1 "<password1>"
Then user click the Login if entered credentials are valid "<status>"

Examples:
|username |password1  |status|
|demo     |DEMODEMO   |Invalid|
|dem      |demooooo   |Invalid|
|demo     |demo       |valid  |
@Selva
Scenario:Third party creation

Given user click the third party in the Header
#When user click the new prospect creation

Scenario Outline:New prospect creation 

When user enter the Third party name in the input field "<NameThirdparty>"
When user enter the Third party Alias name "<Aliasname>"
When user enter the Address in the input field "<Address>"
When user enter the Zipcode in the input field "<Zipcode>"
When user enter the City in the input field "<city>"
When user click the State in the input field
When user select the state from the dropdwon list "<state>"
When user enter the phone number in the field "<phonenumber>"
When user enter Mobile number in the input field "<mobilenumber>"
When user enter the fax in the input field "<fax>"
When user enter Web in the input field "<web>"
When user enter email in the input field "<emailid>"
When  user enter the profid1 in the field "<profid1>"
When user enter the profid2 in the field "<profid2>"
When user enter the profid3 in the field "<profid3>"
When user enter the profid4 in the field "<profid4>"
When user enter the profid5 in the field "<profid5>"
When user enter VATID in the input field "<vatid>"
Then user click the create third party if entered credentials are valid "<status>"

Examples:

|NameThirdparty  |Aliasname  |Address    |Zipcode  |city    |state   |phonenumber   |mobilenumber   |fax    | web                |emailid        |profid1    |profid2   |profid3  |  profid4|profid5  |vatid   |status  |
|                |           |@@@@@@      |000000  |Chennai  |TN     |  0422145678   |7894561230    |123045 |http://dolibarr.org |selva@gmail.com|78945612    |4152630   |4567891 | 415263   |45612333|77777777|Invalid|
|                |            |           |        |         |        |               |              |       |                    |               |            |           |       |          |        |         |Invalid|
|selvamandra     |commercial  |chennai    |6000001 |chennai  |TN     |044527892      |94561230789   |456123 |http://dolibarr.org |selva@gmail.com|78945612    |4152630   |4567891 | 415263   |45612333|77777777 |Valid|

Scenario Outline:Newly created prospect validation

Given user click the Prospects list
When user search the newly created prospect name "<prospectname>"
Then user click the relevant name is displayed
Then user sees the newly created is displayed or not
 
 Example:
|prospectname|
|selvamandra |

Scenario:New Customer creation

When user click the new customer creation

Scenario Outline:Customer creation

When user enter the New customer name in the input field "<customer>"
When user enter the alias name in the input field "<Alias>"
When user enter the address in the field "<address>"
When user enter the Zip code "<zipcode>"
When user enter the new city in the field "<newcity>"
When user click the state in the field
When user enter the State in the Dropdown list "<State>"
When user enter the mobilenumber in the input field "<Mobilenumber>"
When user enter the Fax in the field "<Fax>"
When user enter web in the field "<Web>"
When user enter Email in the inputfield "<Email>"
When user enter the prof id1 "<PROFID1>"
When user enter the prof id2 "<PROFID2>"
When user enter the prof id3 "<PROFID3>"
When user enter the prof id4 "<PROFID4>"
When user enter the prof id5 "<PROFID5>"
When user enter the vatid "<VATID>"
Then user click the create customer if entered credentials are valid "<status>"

Examples:

|customer   |Alias   | address    |  zipcode  |  newcity  |State  |Mobilenumber  | Fax  | Web             |Email        |PROFID1     | PROFID2       |PROFID3  |PROFID4   |  PROFID5 | VATID  | satatus |
|           |         |           |           |           |       |              |       |                |             |            |               |         |          |          |        |Invalid  |
|           |         |1234567    |5204178    |tirunelveli| TN    |7418529630    |32105  |www.dolibar.org |sev@gmail.com|098765      |852041741      |963741   |3215      |0987654   |654321  |Invalid  |
|Muthu      |Trademark|Tirunelveli|6524001    |tirunelveli| TN    |8527419630    |74120  |www.dolibar.org |sev@gmail.com|098765      |852041741      |963741   |3215      |0987654   |654321  | valid   |    


Scenario:New contact creation

Given user click the new contact in the third party page

 Scenario Outline:

When user enter the Lastname in the input field "<lastname>"
When user enter the Firstname in the input field "<firstname>"
When user enter the job position in the input field  "<jobposition>"
When user enter the address "<addresss>"
When user enter the code in the field "<code>"
When user enter the City "<City>"
When user enter the busphone in the field "<busphone>"
When user enter the persphone in the field "<persphone>"
When user enter the Mobile1 in the field "<Mobile1>"
When user enter the faxnumber in the field "<faxnumber>"
When user enter the emailid in the field "<Emailid1>"
Then user click the add button if entered credentials are valid "<status>"

Examples:

|lastname  |firstname |jobposition |addresss  |code   |City   |busphone|persphone |Mobile1   |faxnumber   |Emailid1      |status  |
|          |          |@@@@@@@@@   | @@@@     |7415222|chennai|852741963|8527419630|7418529630|0422154455|selva@gmail.com|Invalid  |
|          |          |             |         |       |       |         |          |          |          |               |Invalid  |
|Mandra    |Selvaa    |Tester       |Chennai  |6000001|chennai|852741963|8527419630|7418529630|0422154455|selva@gmail.com|Valid    |

Scenario:New vendor creation

Given user click the new vendor cration in the Third party list

Scenario Outline:Vendor Creation 

When user enter the partyname in the input field "<partyname>"
When user enter the aliasname in the input field "<aliasname>"
When user enter the mainaddress in the input field "<mainaddress>"
When user enter the zipnumber in the field "<zipnumber>"
When user enter the cityname in the input field "<cityname>"
When user click the province 
When user search the province "<searchprovince>"
When user enter the phnumber in the input field "<phnnumber>"
When user enter the Mobnumber in the input field "<Mobnumber>"
When user enter the fax1 in the field "<fax1>"
When user enter the weburl in the input field "<weburl>"
When user enter the email2 in the field "<email2>"
When user enter the proof ID1 "<ID1>"
When user enter the proof ID2 "<ID2>"
When user enter the proof ID3 "<ID3>"
When user enter the proof ID4 "<ID4>"
When user enter the proof ID5 "<ID5>"
When user enter the idvat "<IDVAT>"
Then user click the vendor create button if entered entered credentials are valid "<status>"

Examples:

|partyname  |aliasname  |mainaddress  |zipnumber   |cityname   |searchprovince |phnnumber  |Mobnumber  |fax1  | weburl    | email2        | ID1  | ID2  | ID3  | ID4   |  ID5  |  IDVAT  | status  |
|           |           |             |            |           |               |           |           |      |           |               |      |      |      |       |       |         |Invalid  |
|           |           |@@@@@@@@     |654789      |Chennai    |TN             |7418529630 |8574129630 |451200|dolibar.org|selva@gmail.com|412502|874502|654120|415263 |635241 | 321456  |Invalid  |
|Selvii     |commercial |Chennai      |6000001     |Chennai    |TN             |9874561230 |65412307890|451200|dolibar.org|selva@gmail.com|412502|874502|654120|415263 |635241 | 321456  |valid    |

Scenario:Contact List prespect,customer,vendor

Given user click the list view in the contact
When user search the created name "<listname>"
When user click the search button in the list
When user click the relevant name shown 
#Then user click back to list

Examples:
|listname  |
|selva    |

Scenario:Send Modify

Given user click the Modify Button

Scenario Outline:Modify the information

Given user modify the lastname in the input field "<lastname>"
When user modify the firstname in the input field "<firstname>"
When user modify the address in the input field "<addresss>"
When user modify the zipcode in the input field "<zipcode>"
When user modify the busphone in the input field "<busphone>"
When user modify the persphone in the input field "<persphone>"
When user modify the faxnumber in the input field "<faxnumber>"
Then user click the save button if entered credentials are valid "<status>"

Examples:
|lastname  |firstname  |addresss  |zipcode  |busphone  |persphone  |faxnumber  |status  |
|          |           |         |         |          |           |           |Invalid |
|selva     |Mandra     |Chennai  |6000001  |741852963| 7418529630 |412030     |valid   |

Scenario:Disable and Delete the contact details

Given user click the disable icon in the Modified contact
When user click the Reactivate icon in the contact
When user click the delete icon in the input field
Then user click No in the confirmation message 
@Selva
Scenario:Service creation 

Given user click the service creation in the Headers
When user click the New service in the service page

Scenario Outline:Newly service creation

When user enter the prod reference in the new service "<productref>"
When user enter the label in the new service "<label>"
When user enter the description in the new service page "<description>"
When user enter the public URL in the new service page "<public url>"
When user enter the duration in the new service page "<duration>"
When user enter the notes in the service page "<notes>"
When user enter the selling price in the service page "<sellingprice>"
When user enter the Minimum selling price in the service page "<Minselling>"
When user click the accounting sale dropdown in the service page "<accountingsale>"
When user click the accounting sale export dropdown in the service page "<saleexport>"
When user click the accounting purchase dropdown in the service page "<salepurchase>"
When user click the accounting purchase import in the service page "<purchaseimport>"
Then user click the create service if entered credentials are valid "<status>"

Examples:
|productref  |label  |description   | public url  |duration   |  notes     | sellingprice  | Minselling  |accountingsale  | saleexport  |salepurchase | purchaseimport |status  |
|            |       |              |             |           |            |               |             |                |             |             |                |Invalid |
|0418852888   |Mandra |Smartwatch    |dolibar.org  |3          |smart watch  |20000         |50000        |  109           |   109       | 109         |  109           |valid   |


Scenario Outline: List Verification

Given user click the list in the service
When user search the prof reference name in the input field "<searchprofid>"
When user click the relevant product ref displayed in the list
When user click the name in the displayed list
When user click the clone in the displayed list
When user click the No button in the displayed list
When user click the delete button in the displayed list
Then user click the No delete button in the displayed list

Examples:
|searchprofid |
| 741852039   |

Scenario:Variant Attributes

Given user click the variant attributes in the services
When user click the first millesime in the list
When user click the Modify in the variant attribute 
When user click the save button in the variant attribute

Scenario Outline:Verify the variant add

When user enter the ref number in the input field "<refnum>"
When user enter the value in the input field "<value>"
Then user click the Add if entered credentials are valid "<status>"

Examples:

| refnum  |value  |status |
|         |       |Invalid|
|1000     |number |valid  |

Scenario:Statistics in services

Given user click the statistics in the services

Scenario Outline:statistics chart

When user enter the product id in the input field "<productid>"
When user enter the tags in the input field "<tagsstatistics>"
When user enter the third party name in the input field "<thirddparty>"
Then user click the refresh button 

Examples:

| productid  |tagsstatistics  |thirddparty  |
|741852039   |01-MASTIC       |abc          |

Scenario Outline:Services by popularity

When user click the services by popularity in the header 
When user click the dropdwon in the List of services "<listofservice>"
Then user click the refresh in the list of services

Examples:

|listofservice        |
|Commercial proposals |

Scenario:New Reception creation

Given user click the new reception in the services
When user click the List in the reception

Scenario Outline:List in reception

When user search the name in the third party input field "<thirdpartysearch>"
When user click the search in the list
Then user click the cancel button in list
Examples:
|thirdpartysearch |
| Mandra          |
|selva            |

Scenario:Draft in reception

Given user click the draft in the reception 

Scenario Outline:draft created
When user search the name in the search field "<search>"
When user click the searchbox in the reception
Then user click the cancel button in draft

Examples:

|search  |
|mandra  |
|selva   |

Scenario:Validated in reception
Given user click the validated in the reception

Scenario Outline:validate the reception

When user enter the name in the search box "<nameid>"
When user click the searchbox in the validation
Then user click the cancel button in validated

Examples:
|nameid|
|selva|
|Mandra|

Scenario:Processed in reception
Given user click the processed in reception

Scenario Outline:processed Creation
When user search the name in the search bar "<searchname>"
When user click the searchbox in the processed
Then user click the cancel button in processed

Examples:

|searchname|
|selva     |
|mandra    |

Scenario:Statistics in reception

Given user click the statistics in the reception
When user enter the thirdparty in the reception "<thirdpartyreception>"
When  user enter the createdby in the reception "<createdby>"
When user enter the year in the reception "<year>"
Then user click the refresh button in the reception

Examples:
|thirdpartyreception | createdby  | year  |
|abc                 |david doe   |2026   |


Scenario:Projects in the header

Given user click the projects in the header 
When user click the new lead in the project 

Scenario Outline:New project creation

When user enter the label in the project "<label>"
When user enter the thirdparty name in the project "<thirdproject>"
When user enter the lead status in the project "<leadstatus>"
When user enter the lead amount in the project "<leadamount>"
When user enter the budget amount in the project "<budgetamount>"
When user enter the date in the input field "<date>"
When user enter the description in the input field "<description>"
When user enter categories in the input field "<categories>"
When user enter the priority in the input field "<priority>"
Then user click the create draft if entered credentials are valid "<status>"

Examples:
| label  |thirdproject  | leadstatus  | leadamount  | budgetamount  | date     | description | categories | priority | status |
|        |              |             |             |               |          |             |            |          |Invalid |
|selva   |abc           |won          |50000        |100000         |20/29/2026|smartwatch   |English     |2         |valid   |

Scenario:Modify the project created

Given user click the modfy button 

Scenario Outline:Modify changes

When user enter the label modify in the project "<labelname>"
When user click the dropdown in the thirdparty in the project "<party>"
When user click the leadstatus dropdown "<leadstatus>"
When user enter the amount in the lead "<lead>"
When user enter the budamt in the project "<budgetamt>"
When user enter the datenumber in the input field "<datenumber>"
When user enter the description project in the field "<descriptionproject>"
When user click the categories dropdwon in the input field "<categories>"
When user click the priority dropdwon in the field "<priorityproject>"
Then user click the save button in the project if enetered credentials are valid "<status>"

Examples:
|labelname  |party  |leadstatus  | lead  | budgetamt  | datenumber  |descriptionproject  | categories  | priorityproject | status  |
|           |       |            |       |            |             |                    |             |                  |Invalid  |
|Mandra     | AAB   |Loss        |500    |70000       | 18/06/2026  | smart work         | CLF         | 4                |Valid     |

Scenario:Send Email

Given user click the send email in the project

Scenario Outline:verifing sending mail in project

Given user select the template emailid "<email id template>"
When  clicks the apply button in the send email page
When user enters the validate to email in the send email page "<To>"
When user enters the subject in the send email "<Subject>"
When user enters the message in the send email "<Message>"
Then user clicks the send email button
Then user click back to list in th email page

Examples:
|email id template |  To               |Subject            |Message|
|20250509-Private  |selva@gmail.com    |Need project       |Hai    |


Scenario Outline:List verification

Given user click the List in the leads
When user enter the name in the search "<name project>"
When user click the search button in project
Then user click the first name of the lead list

Examples:
|name project |
|selva        |

Scenario:Statistics

Given user click the statistics in the Leads

Scenario Outline:statistics verification

When user click the dropdown in the thirdparty in project "<dropdwon>"
When user click the lead status dropdown in the project "<Leadstatus>"
When user click the year in the porject "<year>"
Then user click the refresh button in the leads 

Examples:
|dropdwon  |  Leadstatus  |  year  |
|          |              |         |
|abc       | proposal     |2026     |

Scenario: New task in project
Given user click the new task in the project

Scenario Outline:task creation
When user enter the label in the new task creation input field "<labelnewtask>"
When user enter the dropdwon in the child of project "<childofproject>"
When user click the dropdown in the assigned to "<assignedto>"
When user enter the end date in the new task creation "<enddate>"
When user enter the description in the new task "<descripnewtask>"
When user enter the Budget amount in the new task "<budgetamt>"
Then user click the Add button in the new task if entered credentials are valid "<status>"

Examples:

| labelnewtask | childofproject  | assignedto  | enddate  |  descripnewtask  | budgetamt  | status |
|              |                 |             |          |                  |            |Invalid |
|Selva mandra  |11051991         |apiuser      |07/31/2026|New task added    |70000000    |valid   |


Scenario: Create task verification in list

Given user click the list in the new task 

Scenario Outline:Created task is displayed

When user search the created task name in the search field "<nametask>"
When user click the search button in the task list
And user click the name in the created task list
Then user verifes the crated task is displayed
Then user click back to list


Examples:
|nametask  |
|selva     |

Scenario Outline:statistics in task
Given user click a statistics in tasks and activities 
When user click a dropdown yearin statistics "<yearstatistics>"
Then user click the refresh button in tasks and activities 

Examples:
|yearstatistics|
|2026          |


Scenario:Time tracking list

Given user click the time tracking list
When user click the Modify button in the time tracking
When user click the save button in the list
And user click the name displayed in the time tracking
Then user click the back to list in the timetracking
@Selva
Scenario:Commerce in Headers

Given user click the commerce in the headers
When user click the new commercial in the commerce

Scenario Outline: new proposal creation

And user enter the Reference customer in the commerce "<refcustomer>"
And user enter the customer dropdown in the commerce "<customerdropdwon>"
And user enter the payment terms dropdwon in the commerce "<paymentterms>"
And user enter the payment method dropdown in the commerce "<paymentmethod>"
And user enter the source method dropdown in the commerce "<sourcemethod>"
And user enter the availability dropdown in the commerce "<availabaility>"
And user enter the delivery date in the input field "<deliverydate>"
And user enter the project in the commerce "<project>"
Then user enter the note in the public commerce "<notepublic>"
Then user enter the note in the private commerce "<noteprivate>"
Then user click the create draft in the commerce if entered credentials are valid "<status>"

Examples:

| refcustomer | customerdropdwon  |paymentterms  | paymentmethod  | sourcemethod      | availabaility  | deliverydate  | project | notepublic  | noteprivate | status |
|             |                   |              |                |                   |                |               |         |             |             | Invalid|
|Selva        |abc                |30 days       |Bank transfer   |Commercial contact | Immediate      |20/14/2026     |11051991 |public       |private      |Valid   |


Scenario: New sales order creation

Given user click the new order in the sales order

Scenario Outline:Order creation

When user enter the ref number in the sales order "<refsales>"
And user enter the customer dropdwon in the sales "<customersales>"
When user enter the delivery date in the sales "<deliverydatesales>"
And user enter the availability dropdwon in the sales order "<salesorderavailability>"
And user enter the payment terms dropdwon in the sales "<paymenttermsales>"
And user enter the payment method dropdown in the sales "<paymentmethodsales>"
And user enter the source dropdown in the sales order "<sourcesales>"
And user enter the project dropdwon in the sales order "<projectsales>"
And user enter the custom field1 in the sales order "<customfield1>"
Then user enter the note public in the sales "<public>"
Then user enter the note private in the sales "<private>"
Then user click the create draft in the salesorder if entered credentials are valid "<status>"

Examples:

|  refsales  |customersales  | deliverydatesales | salesorderavailability | paymenttermsales  | paymentmethodsales | sourcesales      | projectsales |customfield1| public  | private | status |
|            |               |                   |                        |                   |                    |                  |              |            |          |        |Invalid |
|selva       |abc            |20/14/2026         | Immediate              | 30 days           | Bank transfer      |Commercial contact|11051991      |Mandra      |public    |private |Valid   |

Scenario:statistics in sales order

Given user click the statistics in the sales order

Scenario Outline:statistics verification

And user enter the thirdparty dropdown in sales order "<salesthirdpartydropdwon>"
And user click the thirdparty type dropdwon in sales order "<thirdpartytype sales>"
And user click the category customer dropdown in sales order "<categorycustomersales>"
And user enter the created by dropdown in sales "<createdbysales>"
And user enter the status in sales "<statussales>"
Then user enter the year in sales order "<year>"
Then user click the refresh button in sales order 

Examples:

| salesthirdpartydropdwon  | thirdpartytype sales | categorycustomersales | createdbysales | statussales  |  year  |
|                          |                      |                       |                |              |2026    |
| ABC Company              |  Large company       | Another               | Albert Einstein| Validated    |2026    |

Scenario:List customer invoice

Given user click the list in the customer invoices
When user search the name in the input field "<listcommercial>"
When user click the search in the list commercial
When user click the download button in the list
When user click the download pdf in the list commercial
When user click the preview pdf in the list commercial
Then user click the close button in the commercial
Then user click the relevant name displayed in the commercial 
Examples:
| listcommercial  |
| selva           |

Scenario Outline:Draft in commercial proposals

Given user click the draft in the commercial proposals
When user search the name in the drafts "<namedraft>"
When user click search in drafts
When user click the first name in the draft
When user verifies all the headers are displayed in drafts
When user click the contact address in the draft
And user click the add button in the contact draft
And user click the notes in the draft
And user click the linked Files in the draft file name 
And user select the file in the folder "C:\\selva mandra\\postman_tutorial.pdf"
Then user click the delete button
Then user click the yes buuton 
Then user click Events Agenta in drafts

Examples:

|namedraft |                               
|selva     |

Scenario:statistics in commercial proposals

Given user click the statistics in the commercial proposals

Scenario Outline:By month

When user enter the third party drop in the field "<dropthird>"
When user enter the third party type dropdown "<partydropdwon>"
And user click the category customer dropdwon "<category customer>"
And user click the created by dropdwon in commercial "<createdbydrop>"
And user click the status dropdwon in commercial "<statusdrop>"
Then user enter the year dropdown in commercial "<yeardrpdwoncommercial>"
Then user click the refresh button in commercial 

Examples:

|dropthird  | partydropdwon  |category customer  | createdbydrop  |  statusdrop                |  yeardrpdwoncommercial |
|           |                |                   |                |                            |                        |
|abc        |Governmental    |  AMA              | David Doe      |Darft(needs to be validated)| 2026                   |

Scenario: purchase order creation

Given user click new order in purchase order creation

Scenario Outline:pruchase order creation

When user click a dropdown vendor "<vendor>"
When user enter a ref vendor in puchase order "<refvendor purchase>"
When user enter payment terms dropdwon in purchase order "<paymentpurchase>"
When user click dropdown payment method in purchase order "<purchaseorderpaymentmethod>"
When user enter planned date of delivery in purchase order "<planneddelivery>"
When user click the project dropdwon in purchase order "<projectdropdown1>"
When user click the currency dropdwon in purchase order "<currencydropdown>"
When user enter the notes public in purchase order "<notespurchase>"
When user enters the notes private in purchase order "<privatepurchase>"
Then user click the created draft in purchase order if entered credentials are valid "<status>"

Examples:

|vendor  |refvendor purchase | paymentpurchase  | purchaseorderpaymentmethod | planneddelivery | projectdropdown1 | currencydropdown | notespurchase | privatepurchase | status |
|        |                   |                  |                            |                 |                  |                  |               |                 |Invalid |
|ABC Corp|Selva mandra       | 30 days          |Bank transfer               |08/05/2026       |11051991          |Euros             | vendor        |purchase order   |valid   |


Scenario:sales order list verification

Given user click the sales order list 
When user search the name in refrence customer name "<refcustomername>"
When user click the search in sales order list 
When user click the name in the list displayed in sales order 
When user verifies all the headers are displayed in sales order
And user click the contact address in sales order
And user click the Add button in sales order
And user click the notes in sales order 
And user click the linked Files in the sales order 
When user select the file in the folder in sales order "C:\selva mandra\(PROV8705).pdf"
Then user click the delete button in sales order list
Then user click the yes buuton in sales list
Then user click Events Agenta in saleslist

Examples:

|refcustomername  |
|selva            |

Scenario:Statistics in purchase orders 

Given user click the statistics in purchase order
When user click the dropdown in third party purchase order "<thirdpurchaseparty>"
When user click the thirdparty type in purchase order "<thirdpartytypedrop>"
When user click the tag vendor in purchase order "<tagvendorpurchase>"
When user click the created by dropdown in purchase order "<createdbypurchase>"
When enter the status in the purchase order "<statuspurchase>"
Then user enter the year in purchase order "<yearpurchase>"
Then user click the refresh in purchase order

Examples:

| thirdpurchaseparty | thirdpartytypedrop | tagvendorpurchase  | createdbypurchase | statuspurchase | yearpurchase  |
|                    |                    |                    |                   |Canceled        |2026           |
|ABC123              |Medium company      | 2024               |apiuser            |Approved        |2026           |


Scenario:New vendor proposals

Given user click the new price request in vendor proposals 


Scenario Outline:New price request

When click the vendor dropdown in vendor proposals "<vendorproposal>"
When user click the payment terms in vendor proposal "<paymentvendor>"
When user enter the payment method in vendor proposal "<methodvendor>"
When user enter the delivery date in vendor proposal "<datevendor>"
When user enter the project in vendor proposal "<projectvendor>"
When user enter the currency in vendor proposal "<currencyproposal>"
Then user click the created draft in vendor proposal if entered credentials are valid "<status>"

Examples:

| vendorproposal | paymentvendor | methodvendor | datevendor | projectvendor |currencyproposal |status  |
|                |               |              |             |              |                 |Invalid |
|ABC Corp        | 30 days       | Cash         | 08/15/2026  |11051991      | Euros           |Valid   |


Scenario:statistics in vendor proposal

Given user click the statistics in the vendor proposal


Scenario Outline:statistics verification in vendor proposal

When user enter the thirdparty dropdown in vendor proposal "<vendorthirdpartydropdwon>"
When user click the thirdparty type dropdwon in vendor proposal "<vendorthirdpartytype>"
When user click the category customer dropdown in vendor proposal "<vendorcategorycustomer>"
And user enter the created by dropdown in vendor "<vendorcreatedby>"
And user enter the status in vendorstatus "<vendorstatus>"
Then user enter the year in vendor proposal "<vendoryear>"
Then user click the refresh button in vendor proposal 

Examples:

| vendorthirdpartydropdwon | vendorthirdpartytype | vendorcategorycustomer| vendorcreatedby| vendorstatus  |  vendoryear  |
|                          |                      |                       |                |               |2026          |
| ABC Company              |  Large company       | 2024                  | Albert Einstein| Validated     |2026          |


Scenario: New contract subscription

Given user click the new contract in Contracts

Scenario Outline:Contract creation

Given user enter the refernce customer in new contract "<refcuscontract>"
When user enter the refernce vendor in new contract "<refvencontract>"
When user enter the thirdparty in the new contract "<thirdpartycontract>"
When user enter the following up in the new contract "<followingupcontract>"
When user enter the signing in the new contract "<signing>"
When user enter the date in new contract "<datenewcontract>"
When user enter project in new contract "<projectcontract>"
When user enter the note in new contract "<notecontract>"
When user enter the note public in new contract "<notepubliccontract>"
Then user click the create new contract if entered credentials are valid "<status>"

Examples:

|refcuscontract  | refvencontract  | thirdpartycontract | followingupcontract  | signing  | datenewcontract  | projectcontract  | notecontract  | notepubliccontract | status |
|                |                 |                     |                     |          |                  |                  |               |                    | Invalid|
|Selva           | Mandra          | abc (aabc)          |David Doe           |David Doe  |07/08/2026        | 11051991         |  Public       |  Private           |valid   |

Scenario Outline:Vendor proposals list verification

Given user click the vendor proposals list 
When user search the name in refrence vendor "<refvendorname>"
When user click the search in vendor list 
When user click the name in the list displayed in vendor list 
When user verifies all the headers are displayed in vendor list
And user click the contact address in vendor list
And user click the Add button in vendor list
And user click the notes in vendor list 
And user click the linked Files in the vendor list 
When user select the file in the folder in vendor list "C:\selva mandra\(PROV8705).pdf"
Then user click the delete button in vendor list
Then user click the yes buuton in vendor list
Then user click Events Agenta in vendorlist

Examples:

|refvendorname    |
|abc              |


Scenario:Intervention Creation

Given user click the new intervention in commerce
When user enter the third party invention dropdwon "abc"
Then user click the create draft in new inervention


Scenario Outline:New Intervention

Given user enter reference customer in new intervention "<refcustomerin>"
When user enter the description in new intervention "<descriptionin>"
When user click project in create intervention "<projectin>"
When user enter note public in intervention "<publicin>"   
When user enter note private in intervention "<privatein>"
Then user click create draft if entered credentials are valid "<status>"

Examples:

| refcustomerin  | descriptionin      | projectin | publicin | privatein | status |
#|                |                    |           |          |           |Invalid |
|Selva           | create intervention| 11051991  | public   |private    |valid   |

@Selva

Scenario:Billing

Given user click the billing in the headers
When user click the new invoice in the customer invoice 
@Selva
Scenario Outline:New invoice

When user enter customer dropdown in new invoice "<slectthirdparty>"
When user enter payment terms dropdown in new invoice "<termsinvoice>"
When user enter payment method dropdown in new invoice "<methodinvoice>"
When user click the bank account in new invoice "<bankaccount>"
When user enter the source dropdown in invoice "<sourcedropdown>"
When user click the project dropdown in invoice "<projectdropdown>"
When user enter the document template "<document>"
When user enter the currency in invoice "<currency>"
Then user enter the notes public in invoice "<public>"
Then user enter the notes private in invoice "<private>"
Then user click create draft in invoice if entered credentials are valid "<status>"

Examples:

| slectthirdparty | termsinvoice | methodinvoice | bankaccount |sourcedropdown |projectdropdown | document  |currency  | public | private  | status |
|                 |              |               |             |               |                |           |          |        |          |Invalid |

