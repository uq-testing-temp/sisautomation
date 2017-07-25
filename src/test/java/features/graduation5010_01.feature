@regression
@graduation
@graduation_5010_01
Feature: GD_PTSC_5010.01_Graduation Management Pages Graduation
Generate Identify Potential Graduands Process

Background:
	Given I am logged in as "UQCTO"
	And I navigate to Manage Graduations

Scenario: Search an Undergraduate 
	Given I enter Empl ID as "30007846"		
	And I set Event ID as "000001730"
	And I select Academic Career as "Undergraduate"
	When I click Search
	Then I should see Search Results


Scenario Outline:  Verify add and update graduation status to eligible, Unsuccessful, Final, Ineligible, System Removed, Re-presentation
	Given Graduation test data is ready for student "<id>"
	And I search student "<id>"
	When I update status to "<dest>"
	Then Update was <result>
	  
	  Examples:
	  | student		|	id			|	origin			|	dest			|	result	|
	  | Student 1	| 	30048193	|	pending 		| 	eligible		| 	success |
	  | Student 2	|	30048193	|	conditional		|	eligible		|	success	|
	  | Student 2 	|	30048193	|	conditional		|	UNSUCCESFULL	|	success	|
	  | Student 3 	|   30048193	|	conditional		|	final			|	failure	|
	  | Student 3 	|   30048193	|	conditional		|	ineligible		|	failure	|
	  | Student 3 	|   30048193	|	conditional		|	representation	|	failure	|

@smoke
Scenario: Verify update graduation status to Conditional and multiple current term enrolments for a UGRD student

	Given I enter Empl ID as "42552992"
	And I set Event ID as "000002556"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	And I Flag a course as mandatory
	When I click save
    Then Update was success

Scenario: Attempt to flag a course as both mandatory and discarded (should not be possible).
	Given I enter Empl ID as "42552992"
	And I set Event ID as "000002556"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	Then I unable to flag the same course as conditional

Scenario: Verify update graduation status to Conditional for a UGRD student with graduation status pending. 
		  Update milestone field
	Given I enter Empl ID as "42552992"
	And I set Event ID as "000002556"
	And I click Search
	And I Add a new row 
	When Update the Milestone field to "BLUE CARD"
	When I click save
	Then Update was success

Scenario: Verify Ceremony management - Enter Requirements
	Given I enter Empl ID as "42552992"
	And I set Event ID as "000002556"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	And I click save
	And I Click on Ceremony Management tab
	And I Enter ceremony requirements
	When I click save
	Then Update was success


Scenario: No Honours Class allowed without a degree: 
	Given I enter Empl ID as "30889499"
	And I set Event ID as "000002556"
	And I click Search
	When I Click on Student Degrees tab
	Then Honours Class is not available

	
	