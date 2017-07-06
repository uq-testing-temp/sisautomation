@graduation
Feature: Graduation
As a user I want to be able to manage graduations

Background:
	Given I am logged in
	  And I navigate to Manage Graduations


@smoke
Scenario: Able to see graduation management search results
	
	Given I select Academic Career as "Undergraduate"
  	  And I select Graduation Status search parameter as "Conditional"
	 When I click Search
	 Then I should see Search Results
	
@debug	 
Scenario: Demo: Able to change graduation status
	
	Given I select Academic Career as "Undergraduate"
		And I select Graduation Status search parameter as "Conditional"
		And I click Search
		And I choose a graduate
		And I add a row
		And I select Graduation Status as "Pending"
	When I save
	Then I should see my userID label
	
	
Scenario Outline: Demo: Verify graduation statuses

	Given I navigate to graduations management
			And I select Academic Career as "Undergraduate"
			And I select Graduation Status search parameter as "Conditional"
			And I click Search
			And I choose a graduate "1"
			And I add a row
			And I select Graduation Status as "<status2>"
	When I save
	Then Status <saved_condition> be saved
	
	Examples:
	| student 	| status1		| status2		| saved_condition	|
	| 1			| pending		| eligible		| should			|
	| 1			| conditional	| unsuccesfull	| should not		|
	| 2			| conditional	| final			| should not		|
	| 2			| conditional	| ineligible	| should not		|
	| 2			| conditional	| removed		| should not		|
	| 2			| conditional	| representation| should not		|
	
Scenario: Checking minimal academic requirement for eligibility to graduate
	Given I navigate to graduations management
		And I enter Empl ID as "43595923"		
		And I select Academic Career as "Undergraduate"
		And I select Graduation Status search parameter as "Conditional"
	When I click Search
	Then I should see graduate ID
	