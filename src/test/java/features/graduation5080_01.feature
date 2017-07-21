@regression
@graduation
@graduation_5080_01
Feature: GD_PTSC_5080.01_Graduation Advisement Transcript


Background:
	Given I am logged in as "UQCTO"

@skipped
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