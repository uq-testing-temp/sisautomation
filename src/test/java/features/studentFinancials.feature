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
    Given I navigate to > Student Financials > Bill Customers> Corporate Bills >   Review Invoice
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
 
@skipped
@SF118
    Scenario: Verify the display of the HECS, Fee-help, and SA-help eCAF within mySI-net and the related conditions for post 2005 students.	HECS, Fee-HELP and SA-HELP eCAF details should be displayed correctly as per the conditions for all students enrolled after 2005
    Given I navigate to mySI-net >   Financial – HECS-HELP eCAF/ FEE-HELP eCAF/ SA-HELP eCAF
    And skipped

@SF108	
	Scenario: Verify Monthly reporting	Monthly reports should be extracted correctly
	Given I navigate to Student Financials > UQ Student Financials Reports > Payment Allocation
	And I add a New Value
	When I choose reporting option as "overnight"
	Then I should see Run status as Processing