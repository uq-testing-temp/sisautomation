Feature: Search
As a user
I want to be able to search records
so that I can get information of the existing records

Background:
	Given I open mysinet url
		And I enter username as "UQTRN42"
		And I enter password as "UQTRN"
		And I click signin
		 
Scenario: create a search criteria
	Given I navigate to search match
		And I select searchType as "Person"
		And I enter searchParameter as "UQ_SRCH"
	When I save searchCriteria
		And I enter nameSearch as "Standard"
		And I click save
		And I click on "ReturnToAdvancedSearch" link
	Then I should see my search label as "standard"
		