package stepDefinition;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;

import com.opencsv.CSVReader;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclasses.CampusCommunityPage;
import pageclasses.CommonPageElements;
import pageclasses.GraduationPage;
import pageclasses.HomePage;
import pageclasses.LoginPage;
import pageclasses.ManageUQAwardsPage;
import pageclasses.SearchMatchPage;
import pageclasses.StudentFinancialsPage;
import util.CustomFunctions;
import util.DebugLog;
import util.PropertyReader;

/**
 * @author uqdalter
 *
 */
public class testStepsDefinitions extends DriverFactory{
	// TODO Implement dependency injection
	//common steps 
	/**
	 * @param scenario
	 */
	@Before
	public void beforeScenario(Scenario scenario) {
		new LoginPage(driver);
		new HomePage(driver);
		
		String scenarioname=scenario.getName();
		
		DebugLog.StartTest(scenarioname);
	}
	
@After
	public void afterScenario(Scenario scenario) throws Throwable {
	  
		String scenarioname = scenario.getName();
		String screenshotOnPass = new PropertyReader().readProperty("screenshotOnPass");
		String screenshotOnFail = new PropertyReader().readProperty("screenshotOnFail");
		
	  	if (!scenario.isFailed()){
	  		
			DebugLog.LogInfo.info(scenarioname+" Test Passed");
			scenarioname = "passed_" + scenarioname;
			
		} else {
			
			DebugLog.LogInfo.warn(scenarioname + ":  test failed");
			scenarioname = "failed_" + scenarioname;
			if (screenshotOnFail.equalsIgnoreCase("true")){
				CustomFunctions.PrintScreenShot(scenarioname);
			}
		}
	  	
		if (screenshotOnPass.equalsIgnoreCase("true")){
			CustomFunctions.PrintScreenShot(scenarioname);
		}
		
	    new DriverFactory().destroyDriver();
		DebugLog.EndTest(scenarioname);
	}
	
	
@Then("^I should be able to access every page$")
	public void i_should_be_able_to_access_every_page() throws Throwable {
    
    menu uuiDd=new menu();
    Field[] fields= uuiDd.getClass().getDeclaredFields(); // get all declared fields
    for(Field field:fields){
       if(field.getType().equals(String.class)){ // if it is a String field
          System.out.println("navigating to: "+field.getName());
          Assert.assertTrue(StudentFinancialsPage.navigateTo((String) field.get(uuiDd)));
        }
    }
}

	/**
	 * login steps------------------------------------------------------------------------
	 */
	@Given("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		
		LoginPage.login(null);
	}
	
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
		LoginPage.navigate();
	}
	
	@Given("^I enter username as \"([^\"]*)\"$")
	public void enter_username(String username) throws Throwable {
		LoginPage.enterUsername(username);
	}
	
	@Given("^I enter password as \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		LoginPage.enterPassword(password);
		
	}
	
	@When("^I click signin$")
	public void click_signin() throws Throwable {
		LoginPage.clickSingin();
	}
	
	@Then("^I should see welcome screen$")
	public void i_should_see_welcome_screen() throws Throwable {
		Assert.assertTrue(HomePage.isLoaded());
		
	}
	
	@Then("^I should beLoggedIn$")
	public void i_should_be_logged_in() throws Throwable {
		Assert.assertTrue(HomePage.loggedIn());
		
	}
	
	@Then("^I should seeAnError$")
	public void i_should_see_an_error() throws Throwable {
		Assert.assertTrue(HomePage.loginError());
		
	}
	
	/**
	 * graduation steps---------------------------------------------------------------------
	 */
	@Given("^I select Academic Career as \"([^\"]*)\"$")
	
	public void academicCareer(String academicCareertext) throws Throwable {
	
			GraduationPage.selectAcademicCareer(academicCareertext, 6);
		}
	
	@Given("^I select Graduation Status search parameter as \"([^\"]*)\"$")
	public void graduationStatusParameter(String graduationStatustext) throws Throwable {
			
			GraduationPage.selectGraduationStatusSearchParameter(graduationStatustext, 3);
			
		}
	
	@Given("^I select Graduation Status as \"([^\"]*)\"$")
	public void graduationStatus(String graduationStatustext) throws Throwable {
	
			GraduationPage.selectGraduationStatus(graduationStatustext, 4);
		
		}
	
	@Given("^I navigate to Manage Graduations$")
	public void i_navigate_to_Manage_Graduations() throws Throwable {
		
		GraduationPage.navigate();
	
	}
	
	@When("^I click Search$")
	public void i_click_search() throws Throwable {
	
		GraduationPage.search();
		
	}
	
	@When("^I click delete$")
	public void i_click_delete() throws Throwable {
	
		GraduationPage.delete();
		
	}
	
	@When("^I click add$")
	public void i_click_add() throws Throwable {
	
		GraduationPage.search();
		
	}

	@Then("^I should see Search Results$")
	public void i_should_see_search_results() throws Throwable {
		
		GraduationPage.seeSearchResults();
		
		}
	
	@Given("^I enter Empl ID as \"([^\"]*)\"$")
	public void i_enter_Empl_ID_as(String id) throws Throwable {
	
			GraduationPage.enterEmplID(id);
	}
	
	@Given("^I enter Empl ID testamur as \"([^\"]*)\"$")
	public void i_enter_Empl_ID_testamur_as(String id) throws Throwable {
	
		GraduationPage.enterEmplIDtestamur(id);
	}
	
	@Given("^I click clear")
	public void i_click_clear() throws Throwable {
	
		GraduationPage.clickClear();
	}

	@Given("^I set Event ID as \"([^\"]*)\"$")
	public void i_set_event_id_as(String id) throws Throwable {
	
			GraduationPage.setEventID(id);
	}
	
	@Given("^I am logged in as \"([^\"]*)\"$")
	public void i_am_logged_in_as(String securityGroup) throws Throwable {
	//TODO
	    LoginPage.login(securityGroup); 
	}
	
	@Given("^Graduation test data is ready for student \"([^\"]*)\"$")
	public void test_data_is_ready_for_student(String id) throws Throwable {
	//TODO: implement test data mapping
	    //TODO: move event id into configuration
		GraduationPage.setEventID("000001091");
		//TODO: move student id into configuration
		GraduationPage.enterEmplID(id);
		GraduationPage.search();
		GraduationPage.addRow();
		//TODO: create enumerator for statuses - Done
		if (id.contains("33188876")) {
			GraduationPage.selectGraduationStatus("conditional", graduationStatus.CONDITIONAL);
		}
		if (id.contains("30048193")) {
			GraduationPage.selectGraduationStatus("Pending", graduationStatus.PENDING);
			}
			GraduationPage.save();
			GraduationPage.navigate();
		}
	
	@When("^I update status to \"([^\"]*)\"$")
	public void i_update_status_to(String status) throws Throwable {
    //TODO implement all statuses
	int index = 0;
	if (status.contentEquals("eligible")) {
		index = graduationStatus.ELIGIBLE;
	}
	if (status.contentEquals("UNSUCCESFULL")) {
		index = graduationStatus.UNSUCCESFULL;
	}
	if (status.contentEquals("system removed")) {
		index = graduationStatus.SYSTEM_REMOVED;
	}
	if (status.contentEquals("representation")) {
		index = graduationStatus.RE_PRESENTATION;
	}
	if (status.contentEquals("processing error")) {
		index = graduationStatus.PROCESSIN_ERROR;
	}
	if (status.contentEquals("ineligible")) {
		index = graduationStatus.INELIGIBLE;
	}
	if (status.contentEquals("final")) {
		index = graduationStatus.FINAL;
	}
	if (status.contentEquals("conditional")) {
			index = graduationStatus.CONDITIONAL;		
	}
	//TODO: Implement historic date injection. Test is not valid when using "add row"
	GraduationPage.addRow(); 
	GraduationPage.selectGraduationStatus(status, index);
	GraduationPage.save();
}

	@Given("^I search student \"([^\"]*)\"$")
	public void i_search_student(String id) throws Throwable {
	    //TODO: move event id into configuration
		GraduationPage.setEventID("000001091");
		//TODO: move student id into configuration
		GraduationPage.enterEmplID(id);
		GraduationPage.search();
	}
	
	@Given("^I Add a new row$")
	public void i_Add_a_new_row() throws Throwable {
	    
		GraduationPage.addRow();
	}
	
	@Given("^I Flag a course as mandatory")
	public void i_Flag_a_course_as_mandatory() throws Throwable {
		GraduationPage.markMandatory("0");
		GraduationPage.markMandatory("1");
	}
	
	@Then("^Update was success$")
	public void update_was_success() throws Throwable {
		
		Assert.assertFalse(GraduationPage.alertmsgPresent());
	}
	
	@Then("^Update was failure$")
	public void update_was_failure() throws Throwable {
	Assert.assertTrue(GraduationPage.alertmsgPresent());
}

	@Then("^I unable to flag the same course as conditional$")
	public void i_unable_to_flag_the_same_course_as_conditional() throws Throwable {
		
		if (!GraduationPage.checkMandatory("0")) {
			GraduationPage.markMandatory("0");
		}
		
		Assert.assertTrue(GraduationPage.checkDiscarded("0"));
	}
	
	@When("^Update the Milestone field to \"([^\"]*)\"$$")
	public void update_the_Milestone_field(String milestone) throws Throwable {
		
		GraduationPage.setMilestone(milestone);

	}
    
	@Given("^I Click on Ceremony Management tab$")                            
	public void i_Click_on_Ceremony_Management_tab() throws Throwable {       
		
		GraduationPage.navigateToCeremonyManagement();
		
	}                                                                         
	
	@Given("^I Click on Student Degrees tab$")
	public void i_Click_on_student_degrees_tab() throws Throwable {       
		
		GraduationPage.navigateToStudentDegrees();
		
	}   
	
	@Given("^I Enter ceremony requirements$")                            
	public void i_enter_ceremony_requirements() throws Throwable {       
		
		GraduationPage.setCeremony("1");
		GraduationPage.setAttendance(1);
		GraduationPage.setResidentialCollege("10000120");
		GraduationPage.setOther("spam spam");
		GraduationPage.setAddendum();
		GraduationPage.setValedictoiran();
		GraduationPage.setMedallist();
		GraduationPage.setAcademicProcession();
	}    
	
	@Then("^Honours Class is not available$")
	public void honours_class_is_not_available() throws Throwable {
	Assert.assertFalse(GraduationPage.honourClassAvaliable());
}
	
    @Given("^I navigate to Event Management Events$")
    public void i_navigate_to_event_management_events() throws Throwable {
        CampusCommunityPage.navigateToEventManagement();
    }

    @Given("^I navigate to add new event$")
    public void i_navigate_to_add_new_event() throws Throwable {
    
    	CampusCommunityPage.addNewEvent();
    }
    
    @Given("^I navigate to add new meeting$")
    public void i_navigate_to_add_new_meeting() throws Throwable {
    
    	CampusCommunityPage.addNewMeeting();
    }
    
    @Given("^I enter Event ID$")
    public void i_enter_event_id() throws Throwable {
    	Random rand = new Random();

    	int  eventID = rand.nextInt(999999) + 1;
    	
    	CampusCommunityPage.enterEventID(String.valueOf(eventID));
    }
    
    @Given("^I enter Event Desciption as \"([^\"]*)\"$")
    public void i_enter_event_idand_i_enter_event_desciption_as_something(String description) throws Throwable {
    	CampusCommunityPage.enterEventDesc(description);
    }

    @Given("^I enter Event Type as \"([^\"]*)\"$")
    public void i_enter_event_type_as_something(String type) throws Throwable {
    	CampusCommunityPage.enterEventType(type);
    }
    
    @Given("^I enter Academic Institution as \"([^\"]*)\"$")
    public void i_enter_academic_institution_as(String institution) {
    	
    	CampusCommunityPage.enterAcademicInstitution(institution);
    }
    
    @Given("^I navigate to Event Management Meetings$")
    public void i_navigate_to_event_management_meetings() throws Throwable {
        CampusCommunityPage.navigateToEventManagementMeetings();
    }

    @Given("^I navigate to Graduations Management> Testamur Details$")
    public void i_navigate_to_Graduations_Management_Testamur_Details() throws Throwable {

    	GraduationPage.navigateToTestamurDetails();
    			
    }
    
    @Given("^I navigate to Manage UQ Awards> Student Summary$")
    public void i_navigate_to_Manage_UQ_Awards_Student_Summary() throws Throwable {
    	ManageUQAwardsPage.navigate();
    	ManageUQAwardsPage.navigateStudentSummary();
    }

    @Given("^I enter Empl ID UQ award as \"([^\"]*)\"$")
    public void i_enter_Empl_ID_UQ_award_as(String id) throws Throwable {
    	ManageUQAwardsPage.enterEmplID(id);
    }

    @When("^I change Award status to Verified$")
    public void i_change_Award_status_to_Verified() throws Throwable {

    	ManageUQAwardsPage.changeAwardStatus("verified", 7);
    	
    }
    
    @When("^I clear Registered Post Number$")
    public void i_clear_Registered_Post_Number() throws Throwable {
    	
    	GraduationPage.enterRegisteredPostNumber("");
    }
    
    @When("^I enter Registered Post Number as \"([^\"]*)\"$")
    public void i_enter_Registered_Post_Number_as(String number) throws Throwable {
    	GraduationPage.enterRegisteredPostNumber(number);
    }

    @Then("^Refresh mailing address links is enabled$")
    public void refresh_mailing_address_links_is_enabled() throws Throwable {
    	
    	Assert.assertTrue(GraduationPage.maililngLinkEnabled());
    }
    
    @Then("^Refresh mailing address links is disabled$")
    public void refresh_mailing_address_links_is_disabled() throws Throwable {
    	
    	Assert.assertFalse(GraduationPage.maililngLinkEnabled());
    }
    
    @Given("^I navigate to Manage Graduations > GAT Production$")
    public void i_navigate_to_Manage_Graduations_GAT_Production() throws Throwable {
    	GraduationPage.navigateToGATProduction();
		
    }

    @Given("^I add a new value$")
    public void i_add_a_new_value() throws Throwable {
    	Random rand = new Random();
    	String  runControlID = String.valueOf(rand.nextInt(999999) + 1);

    	GraduationPage.addValue(runControlID);
    }
    
	@Given("^I select Graduation Status GAT as \"([^\"]*)\"$")
	public void i_select_graduation_status_as(String graduationStatustext) throws Throwable {
		
		if (graduationStatustext.equalsIgnoreCase("Final")) {
			GraduationPage.selectGraduationStatusGAT(graduationStatustext, 4);
		}
	}
    
	@Given("^I choose Academic Group as \"([^\"]*)\"$")
	public void i_choose_Academic_Group_as(String group) throws Throwable {

		GraduationPage.selectAcademicGroup(group);
	}
	
	@Given("^I choose report option as \"([^\"]*)\"$")
	public void i_choose_report_option_as(String option) throws Throwable {
		
		GraduationPage.selectReportFormat(option);
	}
	
	@Given("^I click Run$")
	public void i_click_Run() throws Throwable {
	    
		GraduationPage.clickRun();
	}
	
	@Then("^I should see Process Scheduler Request$")
	public void i_should_see_Process_Scheduler_Request() throws Throwable {
		
		Assert.assertTrue(GraduationPage.schedulerRequestIsDisplayed());
	}
	
	@Given("^I select Academic Career GAT as \"([^\"]*)\"$")
	public void i_select_Academic_Career_GAT_as(String academicCareertext) throws Throwable {
		
		if (academicCareertext.equalsIgnoreCase("Undergrad")) {
			GraduationPage.selectAcademicCareerGAT(academicCareertext, 6);
		}
	}

	@Given("^I enter Academic Program as \"([^\"]*)\"$")
	public void i_enter_Academic_Program_as(String program) throws Throwable {
	    
		GraduationPage.selectAcademicProgramGAT(program);
	}
	
    /**
	 * Search steps ------------------------------------------------------------------------
	 */
	@Given("^I navigate to search match$")
	public void search_match() throws Throwable {
		
		SearchMatchPage.navigate();
				
	}
	
	@Given("^I select searchType as \"([^\"]*)\"$")
	public void searchType(String typetext) throws Throwable {
		
		SearchMatchPage.searchType(typetext);
		
	}
	
	@Given("^I enter searchParameter as \"([^\"]*)\"$")
	public void i_enter_searchParameter_as(String param) throws Throwable {
		
		SearchMatchPage.searchParameter(param);
	}
	
	@When("^I save searchCriteria$")
	public void i_save_searchCriteria() throws Throwable {
		
		SearchMatchPage.saveSearchCriteria();
	
	}
	
	@When("^I enter nameSearch as \"([^\"]*)\"$")
	public void i_enter_nameSearch_as(String searchname) throws Throwable {
		
		SearchMatchPage.nameSearch(searchname);
	
	}
	
	@When("^I click save$")
	public void i_click_save() throws Throwable {
		
		SearchMatchPage.save();
	
	}
	
	@Then("^I should see my search label$")
	public void i_should_see_my_search_label() throws Throwable {
	
		Assert.assertTrue(SearchMatchPage.checkSearchLabelPresent());	
		
	}	
	
	@Then("^I should see my si-net homepage$")
	public void i_should_see_my_si_net_homepage() throws Throwable {
	
		Assert.assertTrue(LoginPage.isLoggedIn());
	}
	
	@Then("^I shouldn't see my si-net loginpage$")
	public void i_shouldnt_see_my_si_net_loginpage() throws Throwable {
		
	Assert.assertTrue(LoginPage.isLoggedOut());
	}

	
	/**
	 * menu journey steps ------------------------------------------------------------------------
	 */
	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String param) throws Throwable {
		
		String id = "fldra_" + param;
			HomePage.navigate(id);
		}
	
	@Then("^I should see \"([^\"]*)\"$")
	public boolean i_should_see(String param) throws Throwable {
		
		return true;
	}

	@Given("^I wait for \"([^\"]*)\" seconds$")
	public void i_wait(int delay) throws Throwable {

		Thread.sleep(delay * 1000);

	}

	/**
	 * student financials steps ------------------------------------------------------------------------
	 */
	@When("^I click SearchSF$")
	public void i_click_searchSF() throws Throwable {
	
		StudentFinancialsPage.searchSF();
		
	}
	
	@Given("^I navigate to Student Financials > Customer Accounts$")
	public void i_navigate_to_Student_Financials_Customer_Accounts() throws Throwable {
	    StudentFinancialsPage.navigate();
	    StudentFinancialsPage.navigateToViewCustomerAccounts();
	}

	@When("^I enter student id SF as \"([^\"]*)\"$")
	public void i_enter_student_id_SF_as(String student) throws Throwable {
		StudentFinancialsPage.enterEmplID(student);
	}

	@Then("^I should see student account balance$")
	public void i_should_see_student_account_balance() throws Throwable {
	    Assert.assertTrue(StudentFinancialsPage.canSeeBalances());
	}

	@Then("^I should be able to access every SF page$")
	public void i_should_be_able_to_access_every_sf_page() throws Throwable {
	    StudentFinancialsPage.navigate();
	    
	    sfmenu uuiDd=new sfmenu();
	    Field[] fields= uuiDd.getClass().getDeclaredFields(); // get all declared fields
	    for(Field field:fields){
	       if(field.getType().equals(String.class)){ // if it is a String field
	          System.out.println("navigating to: " + field.getName());
	          Assert.assertTrue(StudentFinancialsPage.navigateTo((String) field.get(uuiDd)));
	        }
	    }
	}
	
	@Given("^I navigate to each menu item specified in \"([^\"]*)\"$")
	public void i_navigate_to_each_menu_item_specified_in(String csvFile) throws Throwable {
	    
		StudentFinancialsPage.navigate();
		
		 HashMap<String, String> hmap = CustomFunctions.readCSV(csvFile);
		
        Set<?> set = hmap.entrySet();
        Iterator<?> iterator = set.iterator();
        
        while(iterator.hasNext()) {
        	@SuppressWarnings("rawtypes")
			Map.Entry mentry = (Map.Entry)iterator.next();
           	System.out.print("Navigating to menu "+ mentry.getKey() + " with element id: ");
           	System.out.println(mentry.getValue());
           	Thread.sleep(500);
           	Assert.assertTrue(StudentFinancialsPage.navigateTo((String) mentry.getValue()));
        }
	}

	@Given("^I navigate to Student Financials > International Health Coverage > Student Maintenance$")
	public void i_navigate_to_Student_Financials_International_Health_Coverage_Student_Maintenance() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToIHCStudentMaintanance();
	}

	@When("^I search student id IHC as \"([^\"]*)\"$")
	public void i_search_student_id_IHC_as(String student) throws Throwable {
		StudentFinancialsPage.searchIHCstudent(student);
	}

	@When("^I search student id UQ acc as \"([^\"]*)\"$")
	public void i_search_student_id_UQ_acc_as(String student) throws Throwable {
		StudentFinancialsPage.enterEmplID(student);
		StudentFinancialsPage.search();
	}
	
	@When("^I enter enterEmplID as \"([^\"]*)\"$")
	public void i_enter_emplid_as(String student) throws Throwable {
		StudentFinancialsPage.enterEmplID(student);
		StudentFinancialsPage.search();
	}
	
	@Then("^I should see OSHC details$")
	public void i_should_see_OSHC_details() throws Throwable {
	    Assert.assertTrue(StudentFinancialsPage.canSeeIHCSMDetails());
	}

	@Then("^I should see Balance and Anticipated Aid as (\\d+) AUD$")
	public void i_should_see_Balance_and_Anticipated_Aid_as_AUD(int arg1) throws Throwable {
		Assert.assertTrue(StudentFinancialsPage.anticipatedAmountAUD("0.00"));
	}

	@Given("^I navigate to > Student Financials > View UQ Student Accounts$")
	public void i_navigate_to_Student_Financials_View_UQ_Student_Accounts() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToIHCFinancials_View_UQ_Student_Accounts();
	}

	@Then("^I should see charges and refunds$")
	public void i_should_see_charges_and_refunds() throws Throwable {
		Assert.assertTrue(StudentFinancialsPage.seeChargesAndrefunds());
	}

	@Given("^I navigate to > Student Financials > View Customer Accounts$")
	public void i_navigate_to_Student_Financials_View_Customer_Accounts() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToViewCustomerAccounts();
	}

	@Then("^I should see relevant student account details$")
	public void i_should_see_relevant_student_account_details() throws Throwable {
		Assert.assertTrue(StudentFinancialsPage.seeCustomerAccount());
	}

	@Given("^I navigate to > Student Financials > View Corporate Account$")
	public void i_navigate_to_Student_Financials_View_Corporate_Account() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToIHCFinancials_View_Corporate_Accounts();
	}

	@When("^I search External Org ID as \"([^\"]*)\"$")
	public void i_search_External_Org_ID_as(String student) throws Throwable {
		StudentFinancialsPage.searchExternalOrgID(student);
	}

	@Then("^I should see Corp Accounts details$")
	public void i_should_see_Corp_Accounts_details() throws Throwable {
		Assert.assertTrue(StudentFinancialsPage.seeCorpAccount());
	}
	
	@Given("^I navigate to Student Financials > Tution and Fees > Tuition Calculation$")
	public void i_navigate_to_Student_Financials_Tution_and_Fees_Tuition_Calculation() throws Throwable {
		StudentFinancialsPage.navigate();		
		StudentFinancialsPage.navigateToIHCFinancials_tutionAndFees_calculation();
	}
	
	@Given("^I navigate to > Student Financials > Bill Customers> Corporate Bills >   Review Invoice$")
	public void i_navigate_to_Student_Financials_Bill_Customers_Corporate_Bills_Review_Invoice() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToStudentFinancialsBillCustomersCorporateBillsReviewInvoice();
	}

	@Given("^Enter External Org ID as \"([^\"]*)\"$")
	public void enter_External_Org_ID_as(String orgID) throws Throwable {
		StudentFinancialsPage.enterOrgID(orgID);
	}

	@Then("^I should see correct invoice details$")
	public void i_should_see_correct_invoice_details() throws Throwable {
	    CustomFunctions.checkElementPresense("External Org ID");
	    CustomFunctions.checkElementPresense("Total Billed");
    
	}
	
	@When("^I click Search OrgID$")
	public void i_click_search_orgid() throws Throwable {
	
		CommonPageElements.search();
		
	}
	
	@When("^I select the latest result$")
	public void i_select_the_latest_result() throws Throwable {
		CommonPageElements.selectFirstResult();
	}
}

