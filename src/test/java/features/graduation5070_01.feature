@graduation
@graduation_5070_01
Feature: GD_PTSC_5070.07_Revoke Degree 

Background:
	Given I am logged in as "UQCTO"
@smoke
@debug
Scenario: 1 Warning message will appear when delete degree from testamur details
	Given I navigate to Graduations Management> Testamur Details
	And I enter Empl ID testamur as "30000146"
	And I click Search
	When I click delete
	Then Update was failure

	