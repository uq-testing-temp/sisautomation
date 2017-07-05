@graduation
	Feature: Graduation
	As a user I want to be able to manage graduations
	
	Background:
		Given I am logged in
			
	Scenario: Able to see graduation management search results
		Given I navigate to Manage Graduations
		  And I select Academic Career as "Undergraduate"
	  	  And I select Graduation Status search parameter as "Conditional"
		 When I click Search
		 Then I should see Search Results