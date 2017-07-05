package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclasses.LoginPage;
import util.CustomFunctions;
import util.DebugLog;
import util.PropertyReader;



public class graduationSteps extends DriverFactory{

@Before
	public void beforeScenario(Scenario scenario) {
		
		final String scenarioname=scenario.getName();

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
	//TODO implement a proper way of navigating
	Thread.sleep(250);
	driver.findElement(By.id("fldra_UQ_MANAGE_GRADUATIONS")).click(); 
	driver.findElement(By.id("fldra_UQ_GRADUATIONS_MANAGEMENT")).click();
	driver.switchTo().frame("ptifrmtgtframe");
	driver.findElements(By.className("EOPP_SCSECTIONCONTENTLINK")).get(0).click();
	Thread.sleep(250);
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


@Given("^I am logged in$")
	public void i_am_logged_in() throws Throwable {           
		
		String username= new PropertyReader().readProperty("DEFAULT_USER");
		String password= new PropertyReader().readProperty("DEFAULT_PASSWORD");
		
		LoginPage.navigate();
		LoginPage.enterUsername(username);
		LoginPage.enterPassword(password);
		LoginPage.clickSingin();
}

}