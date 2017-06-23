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
		And I click Search
		And I choose a graduate "1"
		And I add a row
		And I select Graduation Status as "Pending"
	When I save
	Then I should see my userID label
	
Scenario Outline: Demo: Verify graduation statuses
# 

	Given I enter username as "UQTRN42"
			And I enter password as "UQTRN"
			And I click signin
			And I navigate to graduations management
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
	Given I enter username as "UQTAHME4"
		And I enter password as "IT$1Sa$S"
		And I click signin
		And I navigate to Enrollment Request
		And Student ID "43595923" has been set up
		And I navigate to graduations management
		And I enter Empl ID as "43595923"		
		And I select Academic Career as "Undergraduate"
		And I select Graduation Status search parameter as "Conditional"
	When I click Search
	Then I should see graduate ID
	

#Test setup:
#	Common for all students:
#		Academid programm: 2000
#		Academic career: 2000
#		Graduation status: Conditional
#		Minimum required: 6
#	
#
#	Student1 
#		Event ID: 6720
#		Empl ID: 43595923
#		Grades: none, none, none
#		Units: 4
#
#	Student2 
#		ID:
#		Grades: 5, 5, 6
#		Units: 6
#		
#
#Scenarios:
#	Student 
#		
#Check:
#	How many units required
