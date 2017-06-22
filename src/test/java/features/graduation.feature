Feature: Graduation
As a user
I want to make sure that 
UGRD Student with no enrolment, outstanding milestones or graduation conditions
graduation status can be changed from ‘Conditional’ to ‘Eligible’

Background:
	Given I open mysinet url
		
Scenario: Demo: Able to see graduation management search criteria
	Given I enter username as "UQTRN42"
		And I enter password as "UQTRN"
		And I click signin
		And I navigate to graduations management
	Then I should see my eventID label


Scenario: Demo: Able to change graduation status
	Given I enter username as "UQTRN42"
		And I enter password as "UQTRN"
		And I click signin
		And I navigate to graduations management
		And I select Academic Career as "Undergraduate"
		And I select Graduation Status search parameter as "Conditional"
		And I Search Graduates
		And I choose a graduate
		And I add a row
		And I select Graduation Status as "Pending"
	When I save
	Then I should see my userID label
	
Scenario Outline: Verify graduation statuses
# 

	Given I enter username as "UQTRN42"
			And I enter password as "UQTRN"
			And I click signin
			And I navigate to graduations management
			And I select Academic Career as "Undergraduate"
			And I select Graduation Status search parameter as "Conditional"
			And I Search Graduates
			And I choose a graduate <student>
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