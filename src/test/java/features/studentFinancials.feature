@regression
@studentfinances
	Feature: Search
	As a user
	I want to be able to search records
	so that I can get information of the existing records

	Background:
		Given I am logged in

@menujourney
@smoke	
Scenario: All Student Financials pages are acesible for staff account

	Given I should be able to access every page

@smoke
	Scenario: Able to access student balances
	Given I navigate to Student Financials > Customer Accounts
	And I enter student id SF as "41761854"
	When I click Search
	Then I should see student account balance