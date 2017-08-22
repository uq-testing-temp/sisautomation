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
@debug
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

@SF001
  Scenario: Verify configuration of tuition groups to assign a set of fees according to specific rule	Configurations are set as per rules
  Given I navigate to Student Financials > Tution and Fees > Tuition Calculation
  
@SF002
  Scenario: Verify configuration of HECS Band Fees	Configurations set correctly
  Given I navigate to Student Financials > Tution and Fees > Tuition Calculation
  
@SF003
  Scenario: Verify configuration of a group of courses for use with third-party contracts or course fees.	Configurations set correctly
  Given I navigate to Student Financials > Tution and Fees > Tuition Calculation
  
@SF004
  Scenario: Verify configuration of fees for all courses within a given course list.	Configurations set correctly
  Given I navigate to Student Financials > Tution and Fees > Tuition Calculation
  
@SF005
  Scenario: Verify Configuration of term fee codes to link to tuition groups.	Configurations set correctly
  Given I navigate to Student Financials > Tution and Fees > Tuition Calculation
  
@SF006
  Scenario: Verify configuration of transaction fees for adding or dropping classes as of a specific date.	Configurations set correctly
  Given I navigate to Student Financials > Tution and Fees > Tuition Calculation
  	