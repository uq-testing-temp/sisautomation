@regression
@studentfinances
	Feature: Student finances module features suite

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

@skipped
	Scenario: Entering/verifying Tax File Number (TFN). Some students may not supply a Tax File Number (TFN) when they initially apply for a HECS-HELP / FEE-HELP Loan. This process outlines how to verify that a TFN has been previously entered and/or enter a new TFN for a student.
	Given I Navigate to Campus Community > Personal Information > Add/Update a Person
	And I Enter the student number in the ID field as "40005690"
	When I click Search
	Then The Biographical Details page will display  	
	When Click the Regional tab
	Then The Regional page will display
	When I Click the Re-Enter TFN option
# TODO coould not find TFN option
	And I enter the TFN into the Tax File Number field as "451156249"
	When I click save
	Then Saved succesfully

	Scenario: Adding and Removing Negative Service Indicators. A Negative Service Indicator (NSI) may be placed on a student's record if they have an outstanding fee liability. Once payment has been made, the NSI is removed in an overnight batch process. In some instances, students may need to urgently access their studies report, or perform other mySI-net actions immediately. In such cases, the NSI can be removed manually.
	Given I Navigate to Campus Community > Service Indicators >Person >Manage Service Indicators
	And Enter the student number in the ID field as "40005690"
	When I click Search
	Then The Manage Service Indicators page will display
	When I add service indicator
	Then A new service indicator should be displayed
	When I delete service indicator

	Scenario: Re-Coding FEE-HELP Status
	Given I Navigate to: Records and Enrollment > Student Term Information > Term Activate a Student
	And Enter the student number in the ID field. In this case, enter "40005690"
	And I click Loan Election tab
	Then The Loan Election page will display
	And I update liability code to "20"
	When I save the record
	Then Update was successful

	Scenario: Updating and verifying Citizenship Status
	Given I Navigate to Campus Community > Personal Information > Identification > Citizenship > Citizenship and Passport
	And I Enter the student number in the ID field as "40005690"
	And I click Search
	And Select citizenship as "AUS"
	When I click save
	Given I Navigate to Campus Community > Personal Information > Identification > Citizenship > Citizenship and Passport
	And I Enter the student number in the ID field as "40005690"
	And I click Search
	Then I make sure the citizenship was updated to "AUS"
	
@SF085
	Scenario: Creating a Third Party Contract
	Given I navigate to "Student Financials > Payment Plans > Third Party Contract > Create"
	And Click the Add a New Value tab
	And Enter "Description" into the Description fields
	And Enter Org ID as "10000009"
	And Select Contact type as "ACC"
	And Enter "999999" into the Contract Max field
	And Enter "999998" into the Student Max field 
	And  Enter the standard information "21/12/2030" into the Last Date field
	And Click the Third Party Item Types tab
	And Enter "TPC" into the Account Type field
	And I enter credit item type as "610200000200"
	And I enter charge item type as "300100000199"
	And I enter Start date as "30/08/2016"
	And I enter End date as "30/08/2017"
	And Click the Third Party Charges tab
	And I enter Tree Node as "ADJUSTMENTS"
	And I enter Max Amount as "10"
	And I enter Percentage "50"
	And I click save

	Scenario: Assigning a student to a Third Party Contract 
	Given I navigate to "Student Financials > Payment Plans > Third Party Contract > Assign"
	And Enter "40005618" into the External Org ID field. 
	And I click Search
	And Select the relevant Contract Number 
	And Enter Student ID number into the ID field "44751708"
	And I enter Student Max amount 
	When Click the Post button
	Then Status field is changed to Active
	And The Post button has been greyed out

	Scenario: View Corporate Accounts
	Given I navigate to "Student Financials > View Corporate Accounts"
	And Enter External Org ID Corp Acc as "10000241"
	And I click Search
	And I Click the Account Details link for the relevant semester
	Then The Account Details page shows all the charges and the payments the third party has made for that semester. 
	
	Scenario: Cancelling a Student from the Third Party Contract
	Given I navigate to "Student Financials > Payment Plans > Third Party Contract > Assign"
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
	Given I navigate to "Student Financials > Payment Plans > Third Party Contract> Assign"
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
	
		
