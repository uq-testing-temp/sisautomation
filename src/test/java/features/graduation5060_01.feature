@graduation
@graduation_5060_01
Feature: GD_PTSC_5060.01_Graduation Event and Meeting Setup

Background:
	Given I am logged in as "UQCTO"

@smoke
Scenario: 6 Update Registered Post Number - enabled
		  Attempt to update mailing address on testamur details page.
	Given I navigate to Graduations Management> Testamur Details
	And I enter Empl ID testamur as "42594527"
	And I click Search
	When I clear Registered Post Number
	And I click save
	Then Update was success 
	And Refresh mailing address links is enabled

Scenario: 6 Update Registered Post Number - disabled
		  Attempt to update mailing address on testamur details page.
	Given I navigate to Graduations Management> Testamur Details
	And I enter Empl ID testamur as "42594527"
	And I click Search
	When I enter Registered Post Number as "42"
	And I click save
	Then Update was success 
	And Refresh mailing address links is disabled

