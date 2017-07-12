@graduation
@graduation_5010_01
Feature: GD_PTSC_5010.01_Graduation Management Pages Graduation
Generate Identify Potential Graduands Process

Background:
	Given I am logged in as "UQCTO"
	And I navigate to Manage Graduations

@smoke
Scenario: Search an Undergraduate 
	Given I enter Empl ID as "30007846"		
	And I set Event ID as "000001730"
	And I select Academic Career as "Undergraduate"
	When I click Search
	Then I should see Search Results
	
Scenario Outline:  Verify add and update graduation status to eligible, 
				   Unsuccessful, Final, Ineligible, System Removed, Re-presentation
	Given Graduation test data is ready for student "<id>"
	And I search student "<id>"
	When I update status to "<dest>"
	Then Update was <result>
	  
	  Examples:
	  | student		|	id			|	origin			|	dest			|	result	|
	  | Student 1	| 	30048193	|	pending 		| 	eligible		| 	success |
	  | Student 2	|	30048193	|	conditional		|	eligible		|	success	|
	  | Student 2 	|	30048193	|	conditional		|	unsuccessfull	|	success	|
	  | Student 3 	|   30048193	|	conditional		|	final			|	success	|
	  | Student 3 	|   30048193	|	conditional		|	ineligible		|	success	|
#	  | Student 3 	|   30048193	|	conditional		|	system removed	|	success	|
	  | Student 3 	|   30048193	|	conditional		|	representation	|	success	|

Scenario: Verify update graduation status to Conditional and multiple current term enrolments for a UGRD student

	Given I enter Empl ID as "42594527"
	And I set Event ID as "000002556"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	And I Flag a course as mandatory
	When I click save
    Then Update was success

Scenario: Attempt to flag a course as both mandatory and discarded (should not be possible).
	Given I enter Empl ID as "42594527"
	And I set Event ID as "000002556"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	Then I unable to flag the same course as conditional
  
Scenario: Verify update graduation status to Conditional for a UGRD student with graduation status pending. 
		  Update milestone field
	Given I enter Empl ID as "42594527"
	And I set Event ID as "000002556"
	And I click Search
	And I Add a new row 
	When Update the Milestone field to "BLUE CARD"
	When I click save
	Then Update was success
@debug
Scenario: Verify Ceremony management - Enter Requirements
	Given I enter Empl ID as "42594527"
	And I set Event ID as "000002556"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	And I click save
	And I Click on Ceremony Management tab
	And I Enter ceremony requirements
	When I click save
	Then Update was success

#TODO: Was unable to setup consistent re-presentation event dependencies
#@debug
#Scenario: Verify Ceremony management. Attempt to Save without entering re-presentation event.
#	Given I search "Student 6" 
#	And I Click on Ceremony Management tab
#	And I Tick re-presentation field
#	When I save
#	Then Error is displayed advising re-presentation ID must be entered 

#
#Scenario: Verify Ceremony management - Re-presentation event
#	Given I search "Student 6" 
#	When Choose the re-presentaion event from the list. If no future GRAD events found then the following error message is displayed to the staff “This student has exhausted all re-presentation options based
#	Then Re-presentation event is saved. 

Scenario: No Honours Class allowed without a degree: 
	Given I enter Empl ID as "30889499"
	And I set Event ID as "000002556"
	And I click Search
	When I Click on Student Degrees tab
	Then Honours Class is not available
	
	