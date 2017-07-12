package stepDefinition;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclasses.GraduationPage;
import pageclasses.HomePage;
import pageclasses.LoginPage;
import pageclasses.SearchMatchPage;
import util.CustomFunctions;
import util.DebugLog;
import util.PropertyReader;

public class testStepsDefinitions extends DriverFactory{
// TODO Implement dependency injection
//common steps 
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
		String screenshot = new PropertyReader().readProperty("screenshot");
		
	  	if (!scenario.isFailed()){
	  		
			DebugLog.LogInfo.info(scenarioname+" Test Passed");
			scenarioname = "passed_" + scenarioname;
			
		} else {
			
			DebugLog.LogInfo.warn(scenarioname + ":  test failed");
			scenarioname = "failed_" + scenarioname;
			
		}
	  	
		if (screenshot.equalsIgnoreCase("true")){
			CustomFunctions.PrintScreenShot(scenarioname);
		}
		
	    new DriverFactory().destroyDriver();
		DebugLog.EndTest(scenarioname);
	}
	
	
//login steps
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
	
//graduation steps
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

@Then("^I should see Search Results$")
	public void i_should_see_search_results() throws Throwable {
	
	GraduationPage.seeSearchResults();
	
	}

@Given("^I enter Empl ID as \"([^\"]*)\"$")
	public void i_enter_Empl_ID_as(String id) throws Throwable {

		GraduationPage.enterEmplID(id);
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
		if (status.contentEquals("unsuccessfull")) {
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

@Given("^I update graduation status to æConditionalÆ$")
public void i_update_graduation_status_to_Conditional() throws Throwable {
    //TODO
    throw new PendingException();
}

@Given("^I Flag half as mandatory, and the other half as discarded\\.$")
public void i_Flag_half_as_mandatory_and_the_other_half_as_discarded() throws Throwable {
    //TODO
    throw new PendingException();
}

@Then("^Graduation status and required enrolments are updated\\.$")
public void graduation_status_and_required_enrolments_are_updated() throws Throwable {
    
}

@When("^I Flag a course as mandatory$")
public void i_Flag_a_course_as_mandatory() throws Throwable {
    //TODO
    throw new PendingException();
}

@Then("^I unable to flage the same course as conditional$")
public void i_unable_to_flage_the_same_course_as_conditional() throws Throwable {
	GraduationPage.markMandatory("0");
	GraduationPage.markMandatory("1");
}

@When("^Update the Milestone field$")
public void update_the_Milestone_field() throws Throwable {
    //TODO
    throw new PendingException();
}

@Then("^The graduation status is updated to æConditionalÆ with a required milestone\\.$")
public void the_graduation_status_is_updated_to_Conditional_with_a_required_milestone() throws Throwable {
    //TODO
    throw new PendingException();
}

@Given("^I Click on Ceremony Management tab$")
public void i_Click_on_Ceremony_Management_tab() throws Throwable {
    //TODO
    throw new PendingException();
}

@Given("^I Enter <requirements> as $")
public void i_Enter_requirements_as() throws Throwable {
    //TODO
    throw new PendingException();
}


@Then("^Re-presentation event is saved$")
public void re_presentation_event_is_saved() throws Throwable {
    //TODO
    throw new PendingException();
}

@Given("^I Tick re-presentation field$")
public void i_Tick_re_presentation_field() throws Throwable {
    //TODO
    throw new PendingException();
}

@Then("^Error is displayed advising re-presentation ID must be entered$")
public void error_is_displayed_advising_re_presentation_ID_must_be_entered() throws Throwable {
    //TODO
    throw new PendingException();
}

@When("^I update their hons class$")
public void i_update_their_hons_class() throws Throwable {
    //TODO
    throw new PendingException();
}

@Then("^I see error message$")
public void i_see_error_message() throws Throwable {
    //TODO
    throw new PendingException();
}

@Then("^Update was success$")
public void update_was_success() throws Throwable {
	
	Assert.assertFalse(GraduationPage.alertmsgPresent());
}

@Then("^Update was failure$")
public void update_was_failure() throws Throwable {
	Assert.assertTrue(GraduationPage.alertmsgPresent());
}


//search steps
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

// menu journey steps
	
@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String param) throws Throwable {
		
		String id = "fldra_" + param;
		HomePage.navigate(id);
	}

@Then("^I should see \"([^\"]*)\"$")
	public boolean i_should_see(String param) throws Throwable {
		
		return true;
	}

}

