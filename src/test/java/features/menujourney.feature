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
	Given I navigate to each menu item specified in "rootMenuDictionary.csv"

@csvtext
	Scenario: Smoke test using external data source (CSV table) locating by text link
	Given I navigate to each menu item specified in "rootMenuDictionaryTextFields.csv" located by text link