Feature:Dolibar Website automation

Scenario:verify login
Given user launch browser
Given user click the Test online in Homepage
When user click the create my instance
When user enter the email id "<email>"
When user enter the companyname "<companyname>"
When user enter the phonenumber "<phonenumber>"
When user enter the password "<password>"
When user enter the repeatpassword "<repeatpassword>"
Then user click the checkbox in signup page
Then user click the signup button 

Example:

|email                  |companyname|phonenumber|password  |repeatpassword|
|selva123.kiaq@gmail.com|kid        |7418529630 |Selva123@A|Selva123@A    |

Scenario:Features in CRM & Sales

Given user click the features in dashborad page
Given user click the crm sales customers in features
When user click the opportunites in features dashboard page
When user click the proposals in features dashboard page
Then user click the sales and order in the dasboard page
Then user click the contracts in the features dashboard page
Then user click the Helpdesk in the crm and sales dashboard page
Then user click the Knowledge in the crm and sales dashboard page

Scenario Outline:HR Management

Given user click the employees in the HR management
When user click the Expense reports in the HR Management
When user click the leave request in the HR Management
When user click the timesheets in the HR Management
When user click the recuirement in the HR Management
Then  user click the membership in the HR management

Scenario Outline:CMS,Website,POS

Given user click the cms and website in Features
Then user click the point of sale in the Features

Scenario Outline:Product & Stock

Given user click the product service page in the Features
When user click the stock page in the feature
When user click the purchase approvising in feature
When user click the shipments in the Feature
Then user click the Manufacturing in the Feature

Scenario Outline:Finance & Billing

Given user click the Bills and payment in Finance
When user click the Bank reconciliation in Finance
Then user click the Double entry accounting in finance

Scenario Outline:Marketing

Given user click the Emailing in the Marketing
Then user click the surveys in the Marketing

Scenario Outline:Productivity

Given user click the project and tasks in the productivity
When user click the Interventions in the productivity
Then user click the agenda in the productivity

Scenario Outline:Integration,Development

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

Scenario:Newly created prospect validation

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
|Mandra     |Trademark|Tirunelveli|6524001    |tirunelveli| TN    |8527419630    |74120  |www.dolibar.org |sev@gmail.com|098765      |852041741      |963741   |3215      |0987654   |654321  | valid   |    


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
@Selva
Scenario Outline:Newly service creation

When user enter the prod reference in the new service "<productref>"
When user enter the label in the new service "<label>"
When user enter the description in the new service page "<description>"
When user enter the public URL in the new service page "<public url>"
When user enter the duration in the new service page "<duration>"
When user enter the notes in the service page "<notes>"
#When user click the tags dropdwon in the service page "<tags>"
When user enter the selling price in the service page "<sellingprice>"
When user enter the Minimum selling price in the service page "<Minselling>"
When user click the accounting sale dropdown in the service page "<accountingsale>"
When user click the accounting sale export dropdown in the service page "<saleexport>"
When user click the accounting purchase dropdown in the service page "<salepurchase>"
When user click the accounting purchase import in the service page "<purchaseimport>"
Then user click the create service if entered credentials are valid "<status>"

Examples:
|productref  |label  |description   | public url  |duration   |  notes     |tags | sellingprice  | Minselling  |accountingsale  | saleexport  |salepurchase | purchaseimport |status  |
|            |       |              |             |           |            |     |               |             |                |             |             |                |Invalid |
|741852039   |Mandra |Smartwatch    |dolibar.org  |3          |smart watch | 1000 |20000         |50000        |  109           |   109       | 109         |  109           |valid   |



