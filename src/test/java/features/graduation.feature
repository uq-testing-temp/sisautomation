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

# Conditional = a student is "Maybe" eligible for graduation
#
# Objective:
#	Check graduation eligibility criteria for students with status "conditional".
#   Eligibility criteria: pass grade and minimal number of units. 
#   Oracle: Student eligible if 
#			 - enrolled units are equal or greater than minimum 
#            AND 
#			 - all papers are PASS graded

# Test setup
#	username "UQTAHME4"
#	password "IT$1Sa$S"
#	TE setup:
#	EventID = 3245
#	Academic career = undergraduade
#	Graduation status = Conditional
#   Minimum units required: 6
#
# Test setup steps
# Navigate to "Records and enrolment > Enroll Students > Enrollment Request
# Put 
#  StudentID: 40999614
#  Academic Career: UGRD
#  Academic Institution: UQUNI
#  Term: 6720
# Request form:
#  Action: add Grades noPASS (1-3) for all courses -->submit
#
# Run the validation process
#  Navigate Graduation Management > Identify potential Graduates
#  Run Control ID: TA
#  EventID: 3245
#  Term: 6720
#  EmplID override = 1
#  EmplID: 40999614
#  Run (Not save)
#  Wait for status change from queued to success
# check the validation process results:
#  navigate to Graduation Management > Graduation validation and repeat above
##	Student 1 
#		Event ID: 6720
#		Empl ID: 43595923
#		Grades: 5, 5
#		Units enrolled: 4
#
#	Student 2.1 
#		ID:
#		Grades: none, none, none
#		Units enrolled: 6
#
#	Student 2.2
#		ID:
#		Grades: 6, 5, none
#		Units enrolled: 6
#
#	Student 2.3
#		ID:
#		Grades: 6, 5, 6
#		Units enrolled: 6
#				
#
# Scenarios:
#	1 Minimum units requirement: summary of papers should be greater than minimum units required:
#	1.1 Student1.1 enrolled into and passed 4 papers = not eligible to graduate
#	
#	2 Passed grades requirement: (1) Minimum units requirement satisfied AND
#	2.1 Student2.1 pass no grades = not eligible to graduate
#	2.2 Student2.2 pass 4 out of 6 = not eligible to graduate
#	2.3 Student2.3 pass 6 out of 6 = eligible to graduate

#TODO:
# Objective: system should change status of a student to "Processing error"
# if number of mimimum units required is much greater than enrolled ones. 
#
#

