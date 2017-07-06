package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		
		LoginPage.login();
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
	driver.switchTo().frame("ptifrmtgtframe");
		WebElement acDropDown = driver.findElement(By.id("UQ_GR_STUD_SRCH_ACAD_CAREER"));
		acDropDown.click();
		Select drpdown = new Select(acDropDown);
		drpdown.selectByIndex(6);
	}

@Given("^I select Graduation Status search parameter as \"([^\"]*)\"$")
	public void graduationStatusParameter(String graduationStatustext) throws Throwable {
		WebElement gsDropDown = driver.findElement(By.id("UQ_GR_STUD_SRCH_UQ_GRAD_APP_STATUS"));
		gsDropDown.click();
		Select drpdown = new Select(gsDropDown);
		drpdown.selectByIndex(1);
	}

@Given("^I select Graduation Status as \"([^\"]*)\"$")
	public void graduationStatus(String graduationStatustext) throws Throwable {
		Thread.sleep(250);
		WebElement gsDropDown = driver.findElement(By.id("UQ_GR_STUD_COND_UQ_GRAD_APP_STATUS$0"));
		gsDropDown.click();
		Thread.sleep(250);
		Select drpdown = new Select(gsDropDown);
		drpdown.selectByIndex(4);
		Thread.sleep(250);
	}

@Given("^I navigate to Manage Graduations$")
	public void i_navigate_to_Manage_Graduations() throws Throwable {
	
	GraduationPage.navigate();

}

@When("^I click Search$")
	public void i_click_search() throws Throwable {
		driver.findElement(By.id("#ICSearch")).click();
		Thread.sleep(5000);
	
}

@Then("^I should see Search Results$")
	public void i_should_see_search_results() throws Throwable {

		WebElement element = driver.findElement(By.className("PSSRCHSUBTITLE"));
		boolean label = element.isDisplayed();
		Assert.assertTrue(label);
		
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
		//TODO move to base page actions
		boolean homepage = driver.findElement(By.className("pthomepagetabactive")).isDisplayed();
		Assert.assertTrue(homepage);
		
	}
	
	@Then("^I shouldn't see my si-net loginpage$")
	public void i_shouldnt_see_my_si_net_loginpage() throws Throwable {
	//TODO move to base page actions
	boolean loginpage = driver.findElement(By.className("PSERRORTEXT")).isDisplayed();
	Assert.assertTrue(loginpage);
	}


}

