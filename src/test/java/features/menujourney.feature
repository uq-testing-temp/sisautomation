@menujourney
@smoke
	Feature: Menu 
	As a user
	I want to be able to access every page
	
	Background:
		Given I am logged in
			
	Scenario Outline: Menu joruney smoke
	
		Given I navigate to "<page>"
		Then  I should see <expectedElement>
		
		Examples:
		| page	 						| expectedElement |
		| Graduations Management		| searchMenu   	  |
		| Graduations Management		| searchMenu   	  |		
		| Graduations Management		| searchMenu   	  |
		| Graduations Management		| searchMenu   	  |