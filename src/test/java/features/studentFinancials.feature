@regression
@studentfinances
	Feature: Search
	As a user
	I want to be able to search records
	so that I can get information of the existing records

	Background:
		Given I am logged in

@menujourney
Scenario: All Student Financials pages are acesible for staff account
	Given I should be able to access every SF page

@smoke
	Scenario: Able to access student balances
	Given I navigate to Student Financials > Customer Accounts
	And I enter student id SF as "41761854"
	When I click SearchSF
	Then I should see student account balance

@csv
	Scenario: Smoke test using external data source (CSV table)
	Given I navigate to each menu item specified in "rootMenuDictionary.csv"
	
@SF051
	Scenario: Verify if new student OSHC details appear. OSHC details for new students should be displayed correctly
	Given I navigate to Student Financials > International Health Coverage > Student Maintenance
	When I search student id IHC as "41761854"
	Then I should see OSHC details

@SF056
	Scenario: Verify AUSAID OSHC. Charges should be transferred to the Third Party Contractor and student should be skipped or exempted from OSHC charges
	Given I navigate to Student Financials > International Health Coverage > Student Maintenance
	When I search student id IHC as "41761854"
	Then I should see Balance and Anticipated Aid as 0 AUD
	
@SF104 
	Scenario: Verify UQ Student Account	All charges, refunds and payments made by the student should be displayed correctly
	Given I navigate to > Student Financials > View UQ Student Accounts
	When I enter enterEmplID as "41761854"
	Then I should see charges and refunds

@SF103	
	Scenario: Verify customer Account. All details for a given student should be relevant and correct
	Given I navigate to > Student Financials > View Customer Accounts
	When I enter enterEmplID as "41761854"
	Then I should see relevant student account details

@SF107	
	Scenario: Verify Corporate Account.	All students assigned to Third Party Contract should have correct charges
	Given I navigate to > Student Financials > View Corporate Account
	When I search External Org ID as "41018558"
	Then I should see Corp Accounts details

@SF065
    Scenario: Verify information displayed on invoice	Information displayed on the invoice should be correct
    Given I navigate to > Student Financials > Bill Customers> Corporate Bills > Review Invoice
    And Enter External Org ID as "40448747"
    When I click Search OrgID
    And I select the latest result
    Then I should see correct invoice details

@SF106
    Scenario: Verify TPC for Corporation	Contract details and student details should be displayed correctly
    Given I navigate to > Student Financials > Payment Plans > Third Party Contract > Create
    And Enter External Org ID as "40448747"
    When I click Search OrgID
    And I select the latest result
    Then I should see correct TPC details
 
@SF108
	Scenario: Verify Monthly reporting	Monthly reports should be extracted correctly
	Given I navigate to Student Financials > UQ Student Financials Reports > Payment Allocation
	And I add a New Value
	When I choose reporting option as "monthly"
	Then I should see Run status as Processing or Queued
	
@SF109
	Scenario: Verify Adhoc  reporting.	Adhoc  reports should be extracted correctly
	Given I navigate to Student Financials > UQ Student Financials Reports > Payment Allocation
	And I add a New Value
	And I choose reporting option as "adhoc"
	Then I should see Run status as Processing or Queued


	Scenario: Verify Overnight  reporting.	Adhoc  reports should be extracted correctly
	Given I navigate to Student Financials > UQ Student Financials Reports > Payment Allocation
	And I add a New Value
	 
	And I choose reporting option as "overnight"
	Then I should see Run status as Processing or Queued
	
@SF077
	Scenario: Verify the AP interface works correctly for student refunds. 3090.01 3090.02 Refund reports are generated and student and refund details should be listed correctly
	Given I navigate to Student Financials > Refunds - Student Bank Details
	And I search ID as "44315829"
	And I enter and save bank details
	Then I navigate to Student Financials > Refunds - Refund with Extra Amount
	And I search business unit as "UQUNI"
	
@debug
	Scenario: Tuition Calculation. Checks prior to fees calculation
	Given I navigate to Records and Enrolment > Student Term Information > Term Activate a Student
	And I search the Student Number "40005690"
	When The Term Activation page displayed 
	Then Ensure that the correct Academic Career is displayed as "Postgraduate Coursework"
	And I Ensure the Student Career Nbr refers to the students current active program as ""
	And I Ensure that the Eligible To Enrol checkbox is selected
	When I click Loan Election tab
	Then The Loan Election page will display
	Then I ensure that the Primary Academic Program correctly reflects the students current active program as "Master Laws"
	And Also ensure that the Liability Status code has been populated. The liability status is populated overnight for new students or via the Commonwealth Supported eCAF for Commonwealth Supported students
	
	Scenario: Entering/verifying Tax File Number (TFN). Some students may not supply a Tax File Number (TFN) when they initially apply for a HECS-HELP / FEE-HELP Loan. This process outlines how to verify that a TFN has been previously entered and/or enter a new TFN for a student.
	Given I Navigate to: Campus Community > Personal Information > Add/Update a Person 
	And I Enter the student number in the ID field.
	When I Click the Search button.
	Then The Biographical Details page will display. The TFN field is located on the "Regional" tab.  	
	When Click the Regional tab.
	Then The Regional page will display. If a TFN has previously been entered in the system, the Tax File Number section will display "TFN on file". This indicates that the TFN has already been entered. System security masks this TFN, given that this is sensitive and confidential information. If required, the TFN can be re-entered by selecting the Re-Enter TFN checkbox. In this case, the TFN has been previously entered.
	When I Click the Re-Enter TFN option
	And I enter the TFN into the Tax File Number field. In this case, "451156249" is entred.
	When I Click the Save button.
	Then You have now completed the process for entering/verifying a Tax File Number for a student.
	
	Scenario: Removing Negative Service Indicators. A Negative Service Indicator (NSI) may be placed on a student's record if they have an outstanding fee liability. Once payment has been made, the NSI is removed in an overnight batch process. In some instances, students may need to urgently access their studies report, or perform other mySI-net actions immediately. In such cases, the NSI can be removed manually.
	Given I Navigate to: Campus Community > Service Indicators >Person >Manage Service Indicators
	And Navigate to: Campus Community > Service Indicators >Person >Manage Service Indicators
	And Enter the student number in the ID field.
	When Click the Search button.
	Then The Manage Service Indicators page will display. 
	And This page is used to add and remove service indicators. 
	And If the student has multiple NSIs, you would need to locate the correct NSI by checking each Code.
	Then To view more information about the “FEE” negative service indicator, click the “FEE” link.
	Then The Edit Service Indicator page will display. The page contains a range of information about the service indicator. It also lists the services that are impacted as a result of the service indicator. With these details you can verify that this “FEE” indicator is the correct NSI to be removed.
	And I click the Release button to remove the NSI  
	When I click on the Release button you will be asked to confirm the delete. Click the OK button.
	Then I have now completed the process for removing a NSI. 

	Scenario: Re-Coding FEE-HELP Status
	Given I Navigate to: Records and Enrolments > Student Term Information > Term Activate a Student
	And Enter the student number in the ID field. In this case, enter "40001991".
	When Click the Search button.
	Then The Term Activation page will display. 
	When Navigate to the correct Academic Career and current Term, and ensure the Student Career Nbr and Program are correct. 
	And I Click the Loan Election tab.
	Then The Loan Election page will display. 
	And I Ensure the Primary Academic Program is correct. In this case, the Liability Status field needs to be updated to Paid Full - Award or Enabling (302). This is done by simply overwriting the code that is currently in this field, and saving the record. 

	
	Scenario: Verifying Citizenship Status
	Given I Navigate to:  Campus Community > Personal Information > Add/Update a Person
	And Enter the student number in the ID field. In this case enter "40001991". 
	And Click the Search button. 
	Then The Biographical Details page will display. 
	And To verify the Citizenship Status, click the Regional tab.
	Then The Regional page will display. In this  case, the Citizenship Status field is blank. This is a "mandatory" field.
	When Click the Citizenship Status list.
	And Select an appropriate value from the list. In this case, the student is an Australian Citizen.
	When Click the Save button.
	Then You have now verified a student's Citizenship Status.
	
	Scenario: Creating a Third Party Contract
	Given I navigate to Student Financials > Payment Plans > Third Party Contract
	And Click the Create link.
	And Click the Add a New Value tab.
	And Click the magnifier and select “UQUNI” in the Business Unit field.
	And Enter the desired information into the Contract Number field. For example, enter "UQIRTA". The Contract Number can be anything - there is no official format.
	And Click the Add button. 
	And Enter the desired information into the Description field.
	And Enter the desired information into the Short Description field.
	And Enter the desired information into the Long Description field.
	And Click the Look up External Org ID (Alt+5) button.
	And Use the fields available to find the Organisation. Enter the desired information into the External Org ID field.
	And Click the Look Up button.
	And Select the relevant organisation from the search results. In this scenario, click the UNIAPPLSCIENCEOFFENBURG link.
	And Click the Look up Contact Type (Alt+5) button.
	And Select Accountant
	And The Ext. Contract filed can be left blank.
	And Enter the standard information "9999999999" into the Contract Max field.
	And Enter the standard information "999999" into the Student Max field. Contract Max should be entered as high value unless specified as a capped amount by sponsor. Value cannot be changed once students are attached to TPC. Students Max should be entered as high value unless specified as a capped amount by sponsor. Value cannot be changed once students are attached to TPC.
	And  Enter the standard information "21/12/2030" into the Last Date field.
	And  Leave the remaining fields (“Delivery Code”, “Requisition Nbr” and “Service Impact”) blank.
	And Click the Third Party Item Types tab.
	And Enter the desired information into the Account Type field. Enter "TPC".
	And Click the Look up Charge Item Type (Alt+5) button.
	And Make your selection from the Search Results List. It is most likely “Third Party Charge-Tuition” but can be HECS-HELP, OSHC or others.
	And The Discount Item Type and Credit Account type fields are not used.
	And Click the Look up (Alt+5) button in the Credit Item Type field.
	When Click the Third Party Credit link.
	Then Ensure the “Specific Year or Period” is selected for the Contract Type field and “Date Range” is selected for the Date Type field.
	And Enter the desired information into the Start Date field. E.g. "01/01/2010".
	And Enter the standard information "31/12/2030" into the End Date field. 
	And Click the Third Party Charges tab.
	And Leave the Item Type Group field blank.
	And Click the Look up Tree Node (Alt+5) button in the Tree Node field.
	And Scroll down and then select the “TUITION” link from the Search Results. The Charge Item Type field should be automatically populated with the relevant information.
	And Enter the desired information into the Max Amount field. E.g. “999999”. The amount has to be less than the amount in the Student Max field from the first Third Party Contract tab.
	And Enter the desired information into the Charge% field. E.g. "50" or “100”. In some cases, the third party contract can cover 50% of the tuition fees. For example, the remote students have a 50% waiver applied in their student account and are charged 50% of the total tuition fees.
	And Unselect Include Tax checkbox.
	And A second row can be added e.g. “OSHC” if the sponsor also pays for the students’ OSHC. However, in this case, it is necessary to manually select “Third Party Charge-OSHC” in the Charge Item Type field
	And Click the Save button. 
		
	Scenario: Assigning a student to a Third Party Contract 
	Given I navigate to Student Financials > Payment Plans > Third Party Contract
	And Click the Assign link
	And Enter ’40861999’ into the External Org ID field. 
	And Click the Search button. 
	And Select the relevant Contract Number link. E.g. “DV-C (I&D) 100% TUIT&OSHC”
	And Enter Student ID number into the ID field.
	And If necessary, enter a comment in the Reference Number field underneath the student ID. E.g. “”BEL – SEM 1 06 ONLY”
	And The information in the Student Max field is automatically populated. However, it can be manually overridden if required.
	When Click the Post button. 
	Then In the Status field, the information is changed from “Not Posted” to “Active”. The Post button has been greyed out
	And Once the student is attached to the third party contract, the third party credit will be applied into the student’s account when the fee is calculated. 
	And The “Payment Plans” link on the “Customer Accounts” page also displays the third party information. Go to Student FinancialsView Customer Accounts.
	And Click the Payment Plans link. 
	
	Scenario: View Corporate Accounts
	Given I Navigate to: Student Financials> >View Corporate Accounts
	And Enter the desired information into the External Org ID field.
	And Click the Search button. 
	And Click the Account Details link for the relevant semester.
	When Click the OK button.
	Then The Account Details page shows all the charges and the payments the third party has made for that semester. 
	
	Scenario: Cancelling a Student from the Third Party Contract
	Given I Navigate to: Student Financials > Payment Plans > Third Party Contract > Assign
	And Enter ’40861999’ into the External Org ID field.
	And Click the Search button. 
	And Select the relevant Contract Number link. E.g. “ DV-C (I%D) 100% TUIT&OSHC”
	And Find the relevant student in the ID field.
	When Change the Status from “Active” to “Cancelled”. 
	Then The “Reversal Detail” page will appear. Today’s date is automatically populated in the “Item Effective Date” field. 
	Given Enter the desired information in the “Description” field.
	And Select a relevant option for the “Reason” field.
	And Click the “OK” button
	When Click the Post button. 
	Then In the Status field, the information is changed from “Active” to “Cancelled”. The Post button is greyed out. 
	Given Go to Student Financials> View Customer Accounts. 
	Then Check the third party credit has been reversed from the student’s account
	And Click the Payment Plan link to check the third party information. 
	Then The Contract Status field shows “Cancelled”
	
	Scenario: Inactivating a Student from the Third Party Contract
	Given I Navigate to: Student Financials > Payment Plans > Third Party Contract> Assign
	And Enter ’40861999’ into the External Org ID field.
	And Click the Search button.  
	And Select the relevant Contract Number link. E.g. “DV-C (I&D) 100% TUIT&OSHC”
	And Find the relevant student from the ID field.
	And Change the Status from “Active” to “Inactive”.
	When Click the “Save” button.
	Then If no sponsorship funds remain for the current semester, simply change the Status field from “Active” to “Inactive”, and click Save button. You will need to reverse charges for current semester and re-calculate to remove Third Party Credit for the current term.
	Given I Navigate to to Student Financials > Tuition and Fees > Tuition Calculation. Enter the relevant student ID number and click the Search button
	And Find the relevant semester for the tuition calculation page. Select “UNDETUndetermined_HECS 999” in the Override Tuition Group field to reverse the tuition charges in the relevant semester.
	And Click “Calculate Tuition and Fees” button. 
	When Remove “UNDET- Undetermined_HECS 999” in the Override Tuition Group field.
	Then Click “Calculate Tuition and Fees” button. 
	Given I navigate to Student Financials> View Customer Accounts to check that the third party credit has been reversed.
	And If a student‘s tuition fee in one semester is partially sponsored by the third party but previously was sponsored for 100% tuition fee (for example the total student tuition fee is $10,000 in semester 1 2011, and only $7000 of this is sponsored by the balance of the third party sponsorship arrangement), the amount in the “Student Max” field needs to be changed to “7,000” and the status is set to “Active’ in the Third Party Contract Assign page. To do this, the previous (100% sponsorship) third party credit needs to first be reversed from the customer account, before the Student Max amount can be overridden. As such, the student’s Status on the Third Party Contract Assign page needs to be made “Inactive” first. Then go to Student Financials > Tuition and Fees > Tuition Calculation. Enter the relevant student ID number and click the Search button. 
	And Find the relevant semester for the tuition calculation page. Select “UNDETUndetermined_HECS 999” in the Override Tuition Group field to reverse the tuition charges in the relevant semester.
	And Click “Calculate Tuition and Fees” button.
	And Go to Student Financials > View Customer Accounts. Check that the Semester 1 2011 tuition fee charge in the student’s account is zero. 
	And Go to Student Financials > Payment Plans > Third Party Contract > Assign. Enter the relevant ID in the External Org ID field, then select the relevant contract number. 
	And Change the amount in “Student Max” field to “7,000”. 
	And Change the Status from “Inactive” to “Active.” 
	When Click the “Post” button. 
	Then The Post button is greyed out
	And Go to Student Financials > Tuition and Fees > Tuition Calculation. Enter the relevant student ID in the ID field. Click the Search button. 
	And Remove ‘UNDET’ from the Override Tuition Group field.
	When Click Calculate Tuition and Fees button for the relevant semester. In this scenario, select Sem1 2011. 
	Then Go back to Student Financials> View Customer Accounts. Check the third party credit $7000 is applied to the student’s account. 
	
		
