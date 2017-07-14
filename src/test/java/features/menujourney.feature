@menujourney
	Feature: Menu 
	As a user
	I want to be able to access every page
	
#	Background:
#		Given I am logged in
			
	Scenario Outline: Menu journey smoke
	
		Given I navigate to "<page>"
		Then  I should see <expectedElement>
		And No errors
		
		Examples:
| page	 				| expectedElement |
| MYFAVORITES | true |
| UQ_MANAGE_GRADUATIONS | true |
| UQ_MANAGE_AWARDS  | true |
| UQ_MYSINET_STAFF  | true |
| UQ_MYSINET_ADMIN  | true |
| UQ_SUPPORT_FOLDER | true |
| UQ_DEC_FOLDER | true |
| MANAGE_RESEARCH_STUDENTS  | true |
| MANAGE_RESEARCH_CONFIGURATION | true |
| UQ_SCHOLARSHIPS_AND_PRIZES  | true |
| CO_EMPLOYEE_SELF_SERVICE  | true |
| CO_MANAGER_SELF_SERVICE | true |
| HC_RECRUIT_EMPLOYEE | true |
| HC_WORKFORCE_ADMINISTRATION | true |
| HC_BENEFITS | true |
| CO_COMPENSATION | true |
| HC_STOCK_ADMINISTRATION | true |
| HC_TIME_AND_LABOR1  | true |
| HC_NORTH_AMERICAN_PAYROLL | true |
| HC_GLOBAL_PAYROLL | true |
| HC_PAYROLL_INTERFACE  | true |
| HC_WORKFORCE_DEVELOPMENT  | true |
| HC_ORGANIZATIONAL_DEVELOPMENT | true |
| CO_ENTERPRISE_LEARNING  | true |
| HC_WORKFORCE_MONITORING | true |
| HC_PENSION_PLANS  | true |
| HCCC_BUILD_COMMUNITY  | true |
| HCAD_ADMISSIONS_RECRUIT | true |
| HCAD_STUDENT_ADMISSIONS | true |
| HCSR_RECORDS_AND_REGISTRATION | true |
| HCSR_CURRICULUM_MANAGEMENT  | true |
| HCCC_ADMINISTER_FINANCIAL_AID | true |
| HCCC_MANAGE_STUDENT_FINANCIALS  | true |
| M9_STUDENT_PLACEMENTS | true |
| HCAA_ACADEMIC_ADVISING  | true |
| HCCC_MANAGE_CONTRIBUTOR_RELATI  | true |
| HCSAE_INTEGRATION_PLATFORM  | true |
| HC_SETUP_HRMS | true |
| HCCC_DESIGN_STUDENT_ADMINISTRA  | true |
| EOCO_MAIN | true |
| PT_WORKLIST | true |
| PTDIAGNOSTICS | true |
| PT_TREE_MANAGER | true |
| PT_REPORTING_TOOLS  | true |
| PT_PEOPLETOOLS  | true |