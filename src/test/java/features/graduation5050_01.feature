@graduation
@graduation_5050_01
Feature: GD_PTSC_5050.01_Graduation Event and Meeting Setup

Background:
	Given I am logged in as "UQCTO"
@smoke
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
	
@skipped
Scenario: 2 New Meeting is saved
	Given I navigate to Event Management Meetings
	And I navigate to add new meeting
	# BUG: menu item not present - unable to add a new meeting with any user
#	And I enter Event ID
#	And I click add
#	And I enter Event Desciption as "660012Dec"
#	And I enter Event Type as "GRAD"
#	And I enter Academic Institution as "UQUNI"
#	When I click save
#	Then Update was success 