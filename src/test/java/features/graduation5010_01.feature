@graduation
Feature: GD_PTSC_5010.01_Graduation Management Pages Graduation
Generate Identify Potential Graduands Process

#test data
#
#Student 1: UGRD Student with graduation status of ‘Pending’. 33188876
#Student 2: UGRD Student with graduation status of ‘Conditional’.
#Student 3: UGRD Student with graduation status of ‘Conditional’.
#Student 4: UGRD Student with graduation status of ‘Conditional’ and multiple current term enrollments.
#Student 5: UGRD student with a graduation status of ‘Pending’
#Student 6: Dual UGRD student with a graduation status of ‘Pending’
#Student 7: UGRD/PGCW student in a plan without a degree 

Background:
	Given I am logged in as "UQCTO"
	And I navigate to Manage Graduations

@smoke
Scenario: Search a Final Undergraduate 
	And I enter Empl ID as "30007846"		
	And I select Academic Career as "Undergraduate"
	And I select Graduation Status search parameter as "Final"
	When I click Search
	Then I should see Search Results
	
	
@debug
Scenario Outline:  Verify add and update graduation status to eligible, Unsuccessful, Final, Ineligible, System Removed, Re-presentation

	Given Graduation test data is ready for student"<id> as <origin>"
#		//	Student 1: UGRD Student with graduation status of ‘Pending’.
	And I search student "<id>"
	When I update status to "<final>"
	Then Update was <result>
	  
	  Examples:
	  | student		|			id	|	origin			|	final			|	result	|
	  | Student 1	| 	33188876	|	pending 		| 	eligible		| 	success |
	  | Student 2	|	40294289	|	conditional		|	eligible		|	failure	|
	  | Student 2 	|	40294289	|	conditional		|	unsuccessfull	|	success	|	
	  | Student 3 	|   40294289	|	conditional		|	final			|	failure	|
	  | Student 3 	|   40294289	|	conditional		|	ineligible		|	failure	|
	  | Student 3 	|   40294289	|	conditional		|	system removed	|	failure	|
	  | Student 3 	|   40294289	|	conditional		|	representation	|	failure	|
	 
Scenario: Verify update graduation status to Conditional and multiple current term enrolments for a UGRD student

	Given I search "Student 4"
	And I Add a new row 
	And I update graduation status to ‘Conditional’
	And I Flag half as mandatory, and the other half as discarded. 
	When  I Save
    Then Graduation status and required enrolments are updated.
	  
Scenario: Attempt to flag a course as both mandatory and discarded (should not be possible).

	Given I search "Student 4" 
	And I Add a new row 
	And I update graduation status to ‘Conditional’.
	When I Flag a course as mandatory 
	Then I unable to flage the same course as conditional

Scenario: Verify update graduation status to Conditional for a UGRD student with graduation status pending
	Given I search "Student 5" 
	And I Add a new row 
	And I update graduation status to ‘Conditional’
	When Update the Milestone field
	And  I Save
	Then The graduation status is updated to ‘Conditional’ with a required milestone.
	  
Scenario Outline: Verify Ceremony management - Enter Requirements
	Given I search "Student 6" 
	And I Click on Ceremony Management tab
	And I Enter <requirements> as <value>
	When I save
	Then Re-presentation event is saved
	
	Examples:
	|requirement|value|
	|Attendance||
	|Residential College||
	|Other||
	|Addendum||
	|Valedictoiran||
	|Medallist||
	|Academic Procession||

Scenario: Verify Ceremony management. Attempt to Save without entering re-presentation event.
	Given I search "Student 6" 
	And I Click on Ceremony Management tab
	And I Tick re-presentation field
	When I save
	Then Error is displayed advising re-presentation ID must be entered 

#TODO	
#
#Scenario: Verify Ceremony management - Re-presentation event
#	Given I search "Student 6" 
#	When Choose the re-presentaion event from the list. If no future GRAD events found then the following error message is displayed to the staff “This student has exhausted all re-presentation options based
#	Then Re-presentation event is saved. 

Scenario: No Honours Class allowed without a degree: 
	Given I search "Student 7"
	When  I update their hons class
	Then I see error message 
	