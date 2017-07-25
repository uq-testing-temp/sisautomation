@healthcheck		
@smoke
	Feature: Health check
	
	Scenario: Able to login 
	
		Given I am on login page
		Then I should see welcome screen
			
	Scenario: Able to login 
	
		Given I am logged in
		Then I should beLoggedIn

