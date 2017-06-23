package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class graduationSteps extends DriverFactory{

	@Before
	public void beforeScenario() {
		driver = new DriverFactory().getDriver();
	}

	@Given("^I select Academic Career as \"([^\"]*)\"$")
	public void academicCareer(String academicCareertext) throws Throwable {
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
		Thread.sleep(2000);
		WebElement gsDropDown = driver.findElement(By.id("UQ_GR_STUD_COND_UQ_GRAD_APP_STATUS$0"));
		gsDropDown.click();
		Thread.sleep(2000);
		Select drpdown = new Select(gsDropDown);
		Thread.sleep(2000);
		drpdown.selectByIndex(4);
		Thread.sleep(2000);
	}

	@Given("^I enter Empl ID as \"([^\"]*)\"$")
	public void i_enter_empl_id(String idnumber) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("UQ_GR_STUD_SRCH_EMPLID")).sendKeys(idnumber);
	}	
	
	@Then("^I should see my eventID label$")
	public void i_should_see_my_search_label() throws Throwable {
		Thread.sleep(2000);
		WebElement eventIDlabel =driver.findElement(By.id("UQ_GR_STUD_SRCH_CAMPUS_EVENT_NBR_LBL"));
		boolean label = eventIDlabel.isDisplayed();
		Assert.assertTrue(label);			
	}

	@Then("^I should see search results$")
	public void results() throws Throwable {
		Thread.sleep(2000);
		WebElement sr = driver.findElement(By.id("RESULT16$0"));
		boolean label = sr.isDisplayed();
		Assert.assertTrue(label);			
	}

	@Then("^I should see my userID label$")
	public void label() throws Throwable {
		Thread.sleep(2000);
		String uidLabel = driver.findElement(By.id("UQ_GR_STUD_COND_LASTUPDOPRID$0")).getText();
		Assert.assertEquals(uidLabel, "UQTRN42");			
	}

	@Then("^I should see graduate ID$")
	public void i_should_see_graduate_id() throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("win0divHCR_PERSON_I_EMPLID"));
		boolean label = element.isDisplayed();
		Assert.assertTrue(label);			
	}
	
	@When("^I click Search$")
	public void i_save_searchGratuates() throws Throwable {
		driver.findElement(By.id("#ICSearch")).click();
	}
	
	@When("^I choose a graduate \"([^\"]*)\"$")
	public void i_choose_a_gratuate(String id) throws Throwable {
		Thread.sleep(2000);
		String graduateID = "RESULT16$" + id;
		driver.findElement(By.id(graduateID)).click();
	}
	
	@When("^I add a row$")
	public void i_add_a_row() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("UQ_DERIVED_GRD_UQ_ADD_PB")).click();
	}
	
	@When("^I save$")
	public void i_save() throws Throwable {
		driver.findElement(By.id("#ICSave")).click();
		Thread.sleep(2000);
	}

	@After
    public void afterScenario() {
	  new DriverFactory().destroyDriver();
	}
	
	
}
