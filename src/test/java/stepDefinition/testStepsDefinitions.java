package stepDefinition;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.opencsv.CSVReader;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
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
import stepDefinition.DriverFactory.cmnElements;
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
	
		CommonPageElements.search();
		
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
	
	@Then("^Update was successful$")
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
		
		CommonPageElements.saveButton().click();
	
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
	public void i_navigate_to(String path) throws Throwable {
		
		CustomFunctions.menuNavigation(path);
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
	    
		LoginPage.login(null);
		
		CustomFunctions.menujourney(csvFile);

	}

	@Given("^I navigate to each menu item specified in \"([^\"]*)\" located by text link$")
	public void i_navigate_to_each_menu_item_specified_in_text(String csvFile) throws Throwable {
	    
		LoginPage.login(null);
		
		CustomFunctions.menujourneyByTextFields(csvFile);

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
	
	@Given("^I navigate to > Student Financials > Bill Customers> Corporate Bills > Review Invoice$")
	public void i_navigate_to_Student_Financials_Bill_Customers_Corporate_Bills_Review_Invoice() throws Throwable {
		menuNavigation("Student Financials > Bill Customers> Corporate Bills > Review Invoice");
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
	
	@Given("^I navigate to > Student Financials > Payment Plans > Third Party Contract > Create$")
	public void i_navigate_to_Student_Financials_Payment_Plans_Third_Party_Contract_Create() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToStudentFinancialsPayment_Plans_Third_Party_Contract_Create();
	}

	@Then("^I should see correct TPC details$")
	public void i_should_see_correct_TPC_details() throws Throwable {
	    CustomFunctions.checkElementPresense("Third Party Contract Detail");
	}
	
	@Given("^I navigate to Student Financials > UQ Student Financials Reports > Payment Allocation$")
	public void i_navigate_to_Student_Financials_UQ_Student_Financials_Reports_Payment_Allocation() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToStudent_Financials_UQ_Student_Financials_Reports_Payment_Allocation();
	}

	@Given("^I add a New Value$")
	public void i_add_a_New_Value() throws Throwable {
		StudentFinancialsPage.addPaymentAllocationNewValue();
		StudentFinancialsPage.runControlID("random");
		CommonPageElements.search();
		if (driver.findElements(By.id(cmnElements.FIRSTRESULT)).size() > 0) {
			CommonPageElements.selectFirstResult();
		}
	}

	@When("^I choose reporting option as \"([^\"]*)\"$")
	public void i_choose_Overnight_reporting(String option) throws Throwable {
		StudentFinancialsPage.runOptions(option);
		CommonPageElements.runButton().click();
		CommonPageElements.saveButtonFrame().click();
	}

	@Then("^I should see Run status as Processing or Queued$")
	public void i_should_see_Run_status_as_Processing() throws Throwable {
		CommonPageElements.processMonitorLink().click();
		CommonPageElements.refreshButton().click();
		CustomFunctions.checkElementPresense("Processing");
	}
	
	@Given("^I navigate to Student Financials > Refunds - Student Bank Details$")
	public void i_navigate_to_Student_Financials_Refunds_Student_Bank_Details() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToStudent_Financials_Refunds_Student_Bank_Details();
	}
	
	@Given("^I navigate to Student Financials > Refunds - Refund with Extra Amount$")
	public void i_navigate_to_Student_Financials_Refunds_Refund_with_Extra_Amount() throws Throwable {
		StudentFinancialsPage.navigate();
		StudentFinancialsPage.navigateToStudent_Financials_Refund_with_Extra_Amount();
	}

	@Given("^I enter and save bank details$")
	public void i_enter_and_save_bank_details() throws Throwable {
	    CommonPageElements.enterTextField("UQ_DDP_DISTRIB_BANK_CD$0", "QIB");
	    CommonPageElements.enterTextField("UQ_DDP_DISTRIB_BRANCH_EC_CD$0", "924001");
	    CommonPageElements.enterTextField("UQ_DDP_DISTRIB_UQ_ACCOUNT_NBR$0", "54524");
	    CommonPageElements.enterTextField("UQ_DDP_DISTRIB_UQ_ACCOUNT_TITLE$0", "Zbirka,Kai");
	    CommonPageElements.saveButton().click();
	}
	
	@Given("^I search ID as \"([^\"]*)\"$")
	public void i_enter_ID_as(String id) throws Throwable {
	
			CommonPageElements.enterID(id);
			CommonPageElements.search();
	}
	
	@Given("^I search business unit as \"([^\"]*)\"$")
	public void i_enter_business_unit_as(String id) throws Throwable {
	
			CommonPageElements.enterTextField("BUS_UNIT_TBL_SF_BUSINESS_UNIT", id);
			CommonPageElements.search();
	}
	
	@Given("^I navigate to Records and Enrolment > Student Term Information > Term Activate a Student$")
	public void i_navigate_to_Records_and_Enrolment_Student_Term_Information_Term_Activate_a_Student() throws Throwable {
	    menuNavigation("Records and Enrollment > Student Term Information > Term Activate a Student");
	}

	@Given("^I search the Student Number \"([^\"]*)\"$")
	public void i_search_the_Student_Number(String number) throws Throwable {
	    StudentFinancialsPage.searchStudentNumber(number);
	}

	@When("^The Term Activation page displayed$")
	public void the_Term_Activation_page_displayed() throws Throwable {
	    Assert.assertTrue(StudentFinancialsPage.termActivationTabOpen());
	}

	@Then("^Ensure that the correct Academic Career is displayed as \"([^\"]*)\"$")
	public void ensure_that_the_correct_Academic_Career_is_displayed_as(String academicCareerText) throws Throwable {
		Assert.assertTrue(StudentFinancialsPage.academicCareerText().contains(academicCareerText));
	}

	@Then("^I Ensure the Student Career Nbr refers to the students current active program as \"([^\"]*)\"$")
	public void i_Ensure_the_Student_Career_Nbr_refers_to_the_student_s_current_active_program(String nbr) throws Throwable {
		Assert.assertTrue(StudentFinancialsPage.getStudentCareerNbr().contains(nbr));
	}
	
	@Then("^I Ensure that the Eligible To Enrol checkbox is selected$")
	public void i_Ensure_that_the_Eligible_To_Enrol_checkbox_is_selected() throws Throwable {
		Assert.assertTrue(StudentFinancialsPage.enrolCheckbox());
	}

	@When("^I click Loan Election tab$")
	public void i_click_Loan_Election_tab() throws Throwable {
	    fluentElement(By.id("ICTAB_1")).click();
	}

	@Then("^The Loan Election page will display$")
	public void the_Loan_Election_page_will_display() throws Throwable {
	    Assert.assertFalse(CommonPageElements.alertmsgPresent());
	}


	@Then("^I ensure that the Primary Academic Program correctly reflects the students current active program as \"([^\"]*)\"$")
	public void i_ensure_that_the_Primary_Academic_Program_correctly_reflects_the_student_s_current_active_program(String program) throws Throwable {
	    Assert.assertTrue(StudentFinancialsPage.getAcademicProgramm().contains(program));
	} 

	@Then("^Also ensure that the Liability Status code has been populated\\. The liability status is populated overnight for new students or via the Commonwealth Supported eCAF for Commonwealth Supported students$")
	public void also_ensure_that_the_Liability_Status_code_has_been_populated_The_liability_status_is_populated_overnight_for_new_students_or_via_the_Commonwealth_Supported_eCAF_for_Commonwealth_Supported_students() throws Throwable {
	    Assert.assertTrue(StudentFinancialsPage.getliabilityCode().isEmpty());
	}
	
	@Given("^I Navigate to Campus Community > Personal Information > Add/Update a Person$")
	public void i_Navigate_to_Campus_Community_Personal_Information_Add_Update_a_Person() throws Throwable {
	    menuNavigation("Campus Community > Personal Information > Add/Update a Person");
	}

	@Given("^I Enter the student number in the ID field as \"([^\"]*)\"$")
	public void i_Enter_the_student_number_in_the_ID_field_as(String id) throws Throwable {
	    StudentFinancialsPage.enterPpleSearchID(id);
	}

	@Then("^The Biographical Details page will display$")
	public void the_Biographical_Details_page_will_display() throws Throwable {
	    Assert.assertTrue(CommonPageElements.alertmsgPresent());
	}

	@When("^Click the Regional tab$")
	public void click_the_Regional_tab() throws Throwable {
	    StudentFinancialsPage.regionalTab().click();
	}

	@Then("^The Regional page will display$")
	public void the_Regional_page_will_display() throws Throwable {
		Assert.assertTrue(CommonPageElements.alertmsgPresent());
	}

	@When("^I Click the Re-Enter TFN option$")
	public void i_Click_the_Re_Enter_TFN_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I enter the TFN into the Tax File Number field as \"([^\"]*)\"$")
	public void i_enter_the_TFN_into_the_Tax_File_Number_field_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Saved succesfully$")
	public void saved_succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Given("^I Navigate to Campus Community > Service Indicators >Person >Manage Service Indicators$")
	public void i_Navigate_to_Campus_Community_Service_Indicators_Person_Manage_Service_Indicators() throws Throwable {
	    menuNavigation("Campus Community > Service Indicators >Person >Manage Service Indicators");
	}

	@Given("^Enter the student number in the ID field as \"([^\"]*)\"$")
	public void enter_the_student_number_in_the_ID_field_as(String id) throws Throwable {
	    StudentFinancialsPage.enterPpleSearchID(id);
	}

	@Then("^The Manage Service Indicators page will display$")
	public void the_Manage_Service_Indicators_page_will_display() throws Throwable {
		Assert.assertFalse(CommonPageElements.alertmsgPresent());
	}

	@Then("^I add service indicator$")
	public void i_add_service_indicator() throws Throwable {
	    StudentFinancialsPage.addServiceIndicator();
	}
	
	@Then("^A new service indicator should be displayed$")
	public void a_new_service_indicator_should_be_displayed() throws Throwable {
	    Assert.assertTrue(StudentFinancialsPage.serviceIndicator().isDisplayed());
	}

	@When("^I delete service indicator$")
	public void i_delete_service_indicator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		StudentFinancialsPage.serviceIndicator().click();
		StudentFinancialsPage.releaseButton().click();
		CommonPageElements.saveButtonFrame();
		
	}

	@Then("^A new service indicator should be deleted$")
	public void a_new_service_indicator_should_be_deleted() throws Throwable {
	    StudentFinancialsPage.serviceIndicatorMessage().isDisplayed();
	}
	
	@Given("^I Navigate to: Records and Enrollment > Student Term Information > Term Activate a Student$")
	public void i_Navigate_to_Records_and_Enrollment_Student_Term_Information_Term_Activate_a_Student() throws Throwable {
	    menuNavigation("Records and Enrollment > Student Term Information > Term Activate a Student");
	}
	
	@Given("^Enter the student number in the ID field\\. In this case, enter \"([^\"]*)\"$")
	public void enter_the_student_number_in_the_ID_field_In_this_case_enter(String id) throws Throwable {
		StudentFinancialsPage.searchStudentNumber(id);
	}
	
	@Then("^I update liability code to \"([^\"]*)\"$")
	public void i_update_liability_code_to(String code) throws Throwable {
	    CommonPageElements.enterTextField("SSR_HECS_ELEC_SSR_HECS_XMPT_STAT$0", code);
	}

	@Then("^I save the record$")
	public void i_save_the_record() throws Throwable {
	    CommonPageElements.saveButton().click();
	}
	
	@Given("^I Navigate to Campus Community > Personal Information > Identification > Citizenship > Citizenship and Passport$")
	public void i_Navigate_to_Campus_Community_Personal_Information_Identification_Citizenship_Citizenship_and_Passport() throws Throwable {
	    menuNavigation("Campus Community > Personal Information > Identification > Citizenship > Citizenship and Passport");
	}
	
	@When("^Select citizenship as \"([^\"]*)\"$")
	public void select_citizenship_as(String status) throws Throwable {
		StudentFinancialsPage.updateCitizenshipStatus(status);
	}
	
	@Then("^I make sure the citizenship was updated to \"([^\"]*)\"$")
	public void i_make_sure_the_citizenship_was_updated_to(String status) throws Throwable {
		System.out.println(StudentFinancialsPage.getCitizenshipStatus());
	    Assert.assertTrue(StudentFinancialsPage.getCitizenshipStatus().contains(status));
	}
	
	@Given("^Click the Add a New Value tab$")
	public void click_the_Add_a_New_Value_tab() throws Throwable {
	    StudentFinancialsPage.addNewValueTPC();
	}
	
	@Given("^Enter \"([^\"]*)\" into the Description fields$")
	public void enter_into_the_Description_field(String description) throws Throwable {
	    StudentFinancialsPage.enterDescription(description+description);
	    StudentFinancialsPage.enterShortDescription(description);
	    StudentFinancialsPage.enterLongDescription(description+description+description);
	}
	
	@Given("^Enter Org ID as \"([^\"]*)\"$")
	public void enter_Org_ID_as(String orgID) throws Throwable {
	    StudentFinancialsPage.TP_CONTRACT_EXT_ORG_ID_textField(orgID);
	}
	
	@Given("^Select Contact type as \"([^\"]*)\"$")
	public void select_Contact_type_as(String type) throws Throwable {
	    StudentFinancialsPage.TP_CONTRACT_ORG_CONTACT_TYPE_textField(type);
	}
	
	@Given("^Enter \"([^\"]*)\" into the Contract Max field$")
	public void enter_into_the_Contract_Max_field(String max) throws Throwable {
	    StudentFinancialsPage.TP_CONTRACT_TP_CAP_CONTRACT_text_field(max);
	}
	
	@Given("^Enter \"([^\"]*)\" into the Student Max field$")
	public void enter_into_the_Student_Max_field(String max) throws Throwable {
	    StudentFinancialsPage.TP_CONTRACT_TP_CAP_STUDENT(max);
	}
	
	@Given("^Enter the standard information \"([^\"]*)\" into the Last Date field$")
	public void enter_the_standard_information_into_the_Last_Date_field(String date) throws Throwable {
	    StudentFinancialsPage.TP_CONTRACT_TP_CON_LAST_COR_DT_textField(date);
	}
	
	@Given("^Click the Third Party Item Types tab$")
	public void click_the_Third_Party_Item_Types_tab() throws Throwable {
	    StudentFinancialsPage.thirdPartyTab().click();
	}
	
	@Given("^Enter \"([^\"]*)\" into the Account Type field$")
	public void enter_into_the_Account_Type_field(String tpc) throws Throwable {
	    StudentFinancialsPage.enterTPC(tpc);
	}
	
	@Given("^I enter credit item type as \"([^\"]*)\"$")
	public void i_enter_credit_item_type_as(String type) throws Throwable {
	    StudentFinancialsPage.TP_CONTRACT_PMT_ITEM_TYPE_field(type);
	}
	
	@Given("^I enter charge item type as \"([^\"]*)\"$")
	public void i_enter_charge_item_type_as(String type) throws Throwable {
		StudentFinancialsPage.TP_CONTRACT_ITEM_TYPE_field(type);
	}

	@Given("^I enter Start date as \"([^\"]*)\"$")
	public void i_enter_Start_date_as(String date) throws Throwable {
	    StudentFinancialsPage.TP_CONTRACT_START_DT_field(date);
	}

	@Given("^I enter End date as \"([^\"]*)\"$")
	public void i_enter_End_date_as(String date) throws Throwable {
		StudentFinancialsPage.TP_CONTRACT_END_DT_field(date);
	}

	@Given("^I enter Tree Node as \"([^\"]*)\"$")
	public void i_enter_Tree_Node_as(String text) throws Throwable {
	    StudentFinancialsPage.TP_CHARGES_TREE_NODE_field(text);
	}

	@Given("^I enter Max Amount as \"([^\"]*)\"$")
	public void i_enter_Max_Amount_as(String amount) throws Throwable {
	    StudentFinancialsPage.enterMaxAmount(amount);
	}

	@Given("^I enter Percentage \"([^\"]*)\"$")
	public void i_enter_Percentage(String percentage) throws Throwable {
	    StudentFinancialsPage.enter_Percentage(percentage);
	}
	
	@Given("^Click the Third Party Charges tab$")
	public void click_the_Third_Party_Charges_tab() throws Throwable {
	    StudentFinancialsPage.thirdPartyChargesTab().click();
	}

	@Given("^Enter \"([^\"]*)\" into the External Org ID field\\.$")
	public void enter_into_the_External_Org_ID_field(String id) throws Throwable {
	    StudentFinancialsPage.TP_CONTRCT_SRCH_EXT_ORG_ID_field(id);
	}

	@Given("^Select the relevant Contract Number$")
	public void select_the_relevant_Contract_Number() throws Throwable {
	    CommonPageElements.selectFirstResult();
	}

	@Given("^Enter Student ID number into the ID field \"([^\"]*)\"$")
	public void enter_Student_ID_number_into_the_ID_field(String id) throws Throwable {
	    StudentFinancialsPage.IDCourseList(id);
	}

	@Given("^I enter Student Max amount$")
	public void i_enter_Student_Max_amount() throws Throwable {
		int amount = ThreadLocalRandom.current().nextInt(1, 997 + 1);
		StudentFinancialsPage.StudentMaxAmount(String.valueOf(amount));
	    StudentFinancialsPage.priority().click();
	}

	@When("^I Click OK frame button$")
	public void click_OK_frame_button() throws Throwable {
	    StudentFinancialsPage.okFrameButton();
	}
	
	@When("^Click the Post button$")
	public void click_the_Post_button() throws Throwable {
	    StudentFinancialsPage.postButton().click();
	}

	@Then("^Status field is changed to Active$")
	public void status_field_is_changed_to_Active() throws Throwable {
	    Assert.assertTrue(StudentFinancialsPage.getStatus().getText().contains("Active"));
	}

	@Then("^The Post button has been greyed out$")
	public void the_Post_button_has_been_greyed_out() throws Throwable {
		Assert.assertFalse(StudentFinancialsPage.postButton().isEnabled());
	}
	
	@Given("^Enter External Org ID Corp Acc as \"([^\"]*)\"$")
	public void enter_External_Org_ID_Corp_Acc_as(String id) throws Throwable {
	    StudentFinancialsPage.enterOrgIDCorpAcc(id);
	}

	@Given("^I Click the Account Details link for the relevant semester$")
	public void i_Click_the_Account_Details_link_for_the_relevant_semester() throws Throwable {
	    StudentFinancialsPage.accountLink().click();
	}

	@Then("^The Account Details page shows all the charges and the payments the third party has made for that semester\\.$")
	public void the_Account_Details_page_shows_all_the_charges_and_the_payments_the_third_party_has_made_for_that_semester() throws Throwable {
	    Assert.assertTrue(StudentFinancialsPage.accountDetailsDisplayed());
	}

	@When("^Change the Status from Active to Cancelled$")
	public void change_the_Status_from_Active_to_Cancelled() throws Throwable {
	    StudentFinancialsPage.changeStatus(TPCstatus.CANCELLED);
	}
	
	@When("^Change the Status from Active to Active$")
	public void change_the_Status_from_Active_to_Active() throws Throwable {
	    StudentFinancialsPage.changeStatus(TPCstatus.ACTIVE);
	}
	
	@When("^Select a Reason as \"([^\"]*)\"$")
	public void i_select_reason(String status) throws Throwable {
	    StudentFinancialsPage.reason(status);
	}
	
	@When("^Change the Status from Active to Inactive$")
	public void change_the_Status_from_Active_to_Inactive() throws Throwable {
		StudentFinancialsPage.changeStatus(TPCstatus.INACTIVE);
	}
}

