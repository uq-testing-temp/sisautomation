@graduation
Feature: Graduation
As a user I want to be able to manage graduations

Background:
	Given I am logged in
	  And I navigate to Manage Graduations

@smoke
@debug	 
Scenario: Search a Final Undergraduate 
	Given I set Event ID as "000001730"
		And I enter Empl ID as "30007846"		
		And I select Academic Career as "Undergraduate"
		And I select Graduation Status search parameter as "Final"
	When I click Search
	Then I should see Search Results
	

#	Obj ID 1
#Verify Graduations Management
#Test case Legacy ID 5010.01

#Scenario: Verify add and update graduation status to eligible


#Scenario: Verify add and update graduation status to Unsuccessful
#
#
#Scenario: Verify add and update graduation status to Final
#
#
#Scenario: Verify add and update graduation status to Ineligible
#
#
#Scenario: Verify add and update graduation status to System Removed
#
#
#Scenario: Verify add and update graduation status to Re-presentation	
	
	
#Obj ID 2
# Verify Potential Graduands Process to confirm correct student data is uploaded to the Graduation Management Pages.  
#Test case Legacy ID 5020.01   

#Scenario: Verify record is created in the Graduation Management Pages for event/term entered on run control page with a graduation status of ‘Eligible’
#
#Scenario: Verify record is created in the Graduation Management Pages for event/term entered on run control page with a graduation status of ‘Pending’
#
#Scenario: Verify EGTM can be changed to include students who meets criteria
#
#Scenario: Verify PGA record is available
#
#Scenario: Verify that students with programs excluded from grads does not get included
#
#Scenario: Verify Original conferral event update
#
#Scenario Outline: Demo: Verify graduation statuses
#
#	Given I select Academic Career as "Undergraduate"
#			And I select Graduation Status search parameter as "Conditional"
#			And I click Search
#			And I choose a graduate "1"
#			And I add a row
#			And I select Graduation Status as "<status2>"
#	When I save
#	Then Status <saved_condition> be saved
#	
#	Examples:
#	| student 	| status1		| status2		| saved_condition	|
#	| 1			| pending		| eligible		| should			|
#	| 1			| conditional	| unsuccesfull	| should not		|
#	| 2			| conditional	| final			| should not		|
#	| 2			| conditional	| ineligible	| should not		|
#	| 2			| conditional	| removed		| should not		|
#	| 2			| conditional	| representation| should not		|
#
#Scenario: Demo: Able to change graduation status
#	
#	Given I select Academic Career as "Undergraduate"
#		And I select Graduation Status search parameter as "Conditional"
#		And I click Search
#		And I choose a graduate
#		And I add a row
#		And I select Graduation Status as "Pending"
#	When I save
#	Then I should see my userID label