Feature: Graduation
As a user
I want to make sure that 
UGRD Student with no enrolment, outstanding milestones or graduation conditions
graduation status can be changed from ‘Conditional’ to ‘Eligible’

Background:
	Given I open mysinet url
		
Scenario: Able to see graduation management search criteria
	Given I enter username as "UQTRN42"
		And I enter password as "UQTRN"
		And I click signin
		And I navigate to graduations management
	Then I should see my eventID label


Scenario: Able to change graduation status
	Given I enter username as "UQTRN42"
		And I enter password as "UQTRN"
		And I click signin
		And I navigate to graduations management
		And I select Academic Career as "Undergraduate"
		And I select Graduation Status search parameter as "Conditional"
		And I Search Graduates
		And I choose a graduate
		And I add a row
		And I select Graduation Status as "Pending"
	When I save
	Then I should see my userID label
