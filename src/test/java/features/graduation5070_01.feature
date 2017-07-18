@graduation
@graduation_5070_07
Feature: GD_PTSC_5070.07_Revoke Degree 


Background:
	Given I am logged in as "UQCTO"


Scenario: 1 Warning message will appear when delete degree from testamur details
	Given I navigate to Graduations Management> Testamur Details
	And I enter Empl ID testamur as "30000614"
	And I click Search
	When I click delete
	Then Update was failure

Scenario: Check award status: 
          Student 30018338 cannot be listed as Verified until 100% completion rate is achieved
	Given I navigate to Manage UQ Awards> Student Summary
	And I enter Empl ID UQ award as "30018338"
	And I click Search
	When I change Award status to Verified
	Then Update was failure