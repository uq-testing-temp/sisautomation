Feature: Search
As a user
I want to be able to search records
so that I can get information of the existing records

Background:
	Given I open mysinet url
		
Scenario Outline: Verify Login
	When I enter username as "<username>"
		And I enter password as "<password>"
		And I click signin
	Then I <condition> see my si-net <page>
	
	Examples:
	| username | password | condition | page      |
	| UQTRN42  | UQTRN    | should    | homepage  |
	| UQTRN	   | UQTRN212 | shouldn't | loginpage |
		 
Scenario: create and save a search criteria
	Given I enter username as "UQTRN42"
		And I enter password as "UQTRN"
		And I click signin
		And I navigate to search match
		And I select searchType as "Person"
		And I enter searchParameter as "UQ_SRCH"
	When I save searchCriteria
		And I enter nameSearch as "Standard"
		And I click save
		And I navigate to search match
	Then I should see my search label
