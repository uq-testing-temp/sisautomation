@regression
@graduation
Feature: Graduation Management Pages 
Generate Identify Potential Graduands Process

Background:
	Given I am logged in as "UQCTO"
	And I navigate to Manage Graduations

#GD_PTSC_5010.01_Graduation Management Pages Graduation
@graduation_5010_01
Scenario: Search an Undergraduate 
	Given I enter Empl ID as "30007846"		
	And I set Event ID as "000001730"
	And I select Academic Career as "Undergraduate"
	When I click Search
	Then I should see Search Results

@debug
@graduation_5010_01
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

@graduation_5010_01
@smoke
Scenario: Verify update graduation status to Conditional and multiple current term enrolments for a UGRD student

	Given I enter Empl ID as "42552992"
	And I set Event ID as "000001912"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	And I Flag a course as mandatory
	When I click save
    Then Update was success

@graduation_5010_01
Scenario: Attempt to flag a course as both mandatory and discarded (should not be possible).
	Given I enter Empl ID as "42552992"
	And I set Event ID as "000001912"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	Then I unable to flag the same course as conditional

@graduation_5010_01
Scenario: Verify update graduation status to Conditional for a UGRD student with graduation status pending. 
		  Update milestone field
	Given I enter Empl ID as "42552992"
	And I set Event ID as "000001912"
	And I click Search
	And I Add a new row 
	When Update the Milestone field to "BLUE CARD"
	When I click save
	Then Update was success

@graduation_5010_01
Scenario: Verify Ceremony management - Enter Requirements
	Given I enter Empl ID as "42552992"
	And I set Event ID as "000001912"
	And I click Search
	And I Add a new row 
	And I update status to "Conditional"
	And I click save
	And I Click on Ceremony Management tab
	And I Enter ceremony requirements
	When I click save
	Then Update was success

@graduation_5010_01
Scenario: No Honours Class allowed without a degree: 
	Given I enter Empl ID as "30889499"
	And I set Event ID as "000001912"
	And I click Search
	When I Click on Student Degrees tab
	Then Honours Class is not available

#GD_PTSC_5050.01_Graduation Event and Meeting Setup.
@graduation_5050_01
Scenario: 1 New Event is saved
	Given I navigate to Event Management Events
	And I navigate to add new event
	And I enter Event ID
	And I click add
	And I enter Event Desciption as "660012Dec"
	And I enter Event Type as "GRAD"
	And I enter Academic Institution as "UQUNI"
	When I click save
	Then Update was success 

# GD_PTSC_5060.01_Graduation Event and Meeting Setup
@graduation_5050_01
@skipped
Scenario: 2 New Meeting is saved
	Given I navigate to Event Management Meetings
	And I navigate to add new meeting
#	 BUG: menu item not present - unable to add a new meeting with any user
	And I enter Event ID
	And I click add
	And I enter Event Desciption as "660012Dec"
	And I enter Event Type as "GRAD"
	And I enter Academic Institution as "UQUNI"
	When I click save
	Then Update was success 
	
@graduation_5060_01
Scenario: 6 Update Registered Post Number - enabled
		  Attempt to update mailing address on testamur details page.
	Given I navigate to Graduations Management> Testamur Details
	And I enter Empl ID testamur as "42552992"
	And I click Search
	When I clear Registered Post Number
	And I click save
	Then Update was success 
	And Refresh mailing address links is enabled

@graduation_5060_01
Scenario: 6 Update Registered Post Number - disabled
		  Attempt to update mailing address on testamur details page.
	Given I navigate to Graduations Management> Testamur Details
	And I enter Empl ID testamur as "42552992"
	And I click Search
	When I enter Registered Post Number as "42"
	And I click save
	Then Update was success 
	And Refresh mailing address links is disabled

#GD_PTSC_5070.07_Revoke Degree
@graduation_5070_07 
Scenario: 1 Warning message will appear when delete degree from testamur details
	Given I navigate to Graduations Management> Testamur Details
	And I enter Empl ID testamur as "30000614"
	And I click Search
	When I click delete
	Then Update was failure

@graduation_5070_07
Scenario: Check award status: 
          Student 30018338 cannot be listed as Verified until 100% completion rate is achieved
	Given I navigate to Manage UQ Awards> Student Summary
	And I enter Empl ID UQ award as "30018338"
	And I click Search
	When I change Award status to Verified
	Then Update was failure

#GD_PTSC_5080.01_Graduation Advisement Transcript
@graduation_5080_01
Scenario Outline: 1 Generate GAT’s by Graduation Status and ‘List of Graduands (CSV)’
	Given I navigate to Manage Graduations > GAT Production
	And I add a new value
	And I select Graduation Status GAT as "Final"
	And I choose Academic Group as "UQUNI"
	And I select Academic Career GAT as "Undergrad"
	And I enter Academic Program as "2000"
	And I choose report option as "<Format>"
	When I click Run
	Then I should see Process Scheduler Request  
	And Update was success	

Examples:
	|Format|
	|CSV|
	|PDF|