@graduation
@skipped
@graduation_5020_01
Feature: GD_PTSC_5020.01_Identify Potential Graduands Process

#Prerequisites	Values or Status
#EXAMPLE STUDENTS	
#1  PGRS student with a completion row within the last 12 months, but no ‘Final’ graduation entry in the Graduation Management pages	
#2  PGRS student with a completion row within the last 12 months, and a ‘Final’ graduation entry in the Graduation Management pages	
#3  PGRS student with a completion row between 12 – 24 months, but no ‘Final’ graduation entry in the Graduation Management pages	
#4  UGRD student within 2 units of their program minimum unit requirements	
#5  PGCW student within 2 units of their program minimum unit requirements	
#6  UGRD student within 0 units of their program minimum unit requirements	
#7  PGCW student within 0 units of their program minimum unit requirements	
#8  UGRD student with > 2 units outstanding towards their program minimum unit requirements, with an EGTM matching the run control term	
#9  PGCW student with > 2 units outstanding towards their program minimum unit requirements, with an EGTM matching the run control term 	
#10 NAWD student with EGTM matching the run control term	

Background:
	Given I am logged in as "UQCTO"
	And I navigate to Manage Graduations

#@setup
#Scenario: setup students
#	Given setup student "1"
#	
#

Scenario: Verify Potential Graduands Process to confirm correct student data is uploaded to the Graduation Management Pages
  Given I navigate to Identify potential graduates 
#Add new
#Add control ID
#Event ID = 000002814
#Term 6660
#Empl ID 33622567

#666002Dec