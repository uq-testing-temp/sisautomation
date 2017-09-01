@regression
@menujourney
	Feature: Menu 
	As a user I want to be able to access every page

@skipped
	Scenario: Menu journey smoke
	Given I am logged in
	Then I should be able to access every page

@csv
	Scenario: Smoke test using external data source (CSV table)
	Given I am logged in
	Given I navigate to each menu item specified in "rootMenuDictionary.csv"

@debug
@csvtext
	Scenario: Smoke test using external data source (CSV table) locating by text link
	Given I am logged in
	Given I navigate to each menu item specified in "rootMenuDictionaryTextFields.csv" located by text link

@student
	Scenario: As a student I should be able to access every page
	Given I am logged in as a student
	Given I navigate to each menu item specified in "rootMenuDictionaryTextFieldsStudent.csv" located by text link