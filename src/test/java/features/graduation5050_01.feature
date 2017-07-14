@graduation
@graduation_5050_01
Feature: GD_PTSC_5050.01_Graduation Event and Meeting Setup

Background:
	Given I am logged in as "UQCTO"

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
	
@debug
Scenario: 5 New Meetup is saved
	Given I navigate to Event Management Meetings
	Given For the event setup for current term, click on the lookup button for re-presentation events. 
#And Add Meetings
#And  Enter Academic Dress Details
#And Enter Ticket Details
#And Assign Programs to Event/Meetings
#And Enter Program Overrides for Academic Plan, Campus and Surname.
#And Generate Ceremony Allocation Process for Event entered in step 3.
#And Generate Ceremony Rollover Process
#
#Check two new checkboxes: Send Communication and Show eCGA are present and ticked by default for a given program
#Change a Program default ceremony
#Generate Ceremony Allocation Process
#
#Choose a UGRD/PGCW program, untick Send Communication 
#Example Student 1:
#Pick a student in that program with status of Pending. Make sure they have been assigned to the correct ceremony. Change their status to Conditional, run Identify. Then change the status to Eligible and run Identify and Validation again. 
#Run the process for the current term and with CGA and GRS letter codes ticked. 
#Choose a UGRD/PGCW program, untick Show eCGA 
#Example Student 2:
#Pick a student in that program with status of Pending. Make sure they have been assigned to the correct ceremony. Change their status to Conditional, run Identify. 
#In the above scenario, tick Show eCGA back
#Choose a program with a ceremony assign record and with potential graduands in the current ceremony. Make sure there are students assigned to this ceremony. Then click on the Delete button to delete the ceremony assign record. 
#	