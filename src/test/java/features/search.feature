@regression
@search
@smoke
	Feature: Search
	As a user
	I want to be able to search records
	so that I can get information of the existing records
	
	Background:
		Given I am on login page
			
	Scenario Outline: Verify Login
		When I enter username as "<username>"
			And I enter password as "<password>"
			And I click signin
		Then I <condition> see my si-net <page>
		
		Examples:
		| username | password | condition | page      |
		| UQTAHME4 | IT$1Sa$S | should    | homepage  |
		| UQTRN	   | UQTRN212 | shouldn't | loginpage |
			 
	Scenario: Create and save a search criteria
		Given I enter username as "UQTAHME4"
			And I enter password as "IT$1Sa$S"
			And I click signin
			And I navigate to search match
			And I select searchType as "Person"
			And I enter searchParameter as "UQ_SRCH"
		When I save searchCriteria
			And I enter nameSearch as "Standard"
			And I click save
			And I navigate to search match
		Then I should see my search label