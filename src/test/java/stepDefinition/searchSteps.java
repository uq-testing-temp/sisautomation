package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchSteps extends DriverFactory{

	@Before
	public void beforeScenario() {
		driver = new DriverFactory().getDriver();
	}
	
	@Given("^I open mysinet url$")
	public void setup() throws Throwable {
		driver.get(environment + "/ps/uqsinetsignin.html");
		//driver.manage().window().maximize();
	}
	
	@Given("^I enter username as \"([^\"]*)\"$")
	public void enter_username(String username) throws Throwable {
		driver.findElement(By.id("userid1")).sendKeys(username);
	}
	
	@Given("^I enter password as \"([^\"]*)\"$")
	public void enter_password(String password) throws Throwable {
		driver.findElement(By.id("pwd")).sendKeys(password);
	}
	
	@Given("^I click signin$")
	public void click_signin() throws Throwable {
		driver.findElement(By.xpath("(//input[@value=''])[3]")).click();
	}
		
	@Given("^I navigate to search match$")
	public void search_match() throws Throwable {
		driver.get(environment + "/psp/ps/EMPLOYEE/HRMS/c/RECRUIT_PROSPECTIVE_STUDENTS.HCR_SM_SEARCH.GBL?PORTALPARAM_PTCNAV=HC_HCR_SM_SEARCH_GBL9&EOPP.SCNode=HRMS&EOPP.SCPortal=EMPLOYEE&EOPP.SCName=HCAD_PROSPECTIVE_STUDENTS&EOPP.SCLabel=Maintain%20Prospects&EOPP.SCPTfname=HCAD_PROSPECTIVE_STUDENTS&FolderPath=PORTAL_ROOT_OBJECT.HCAD_ADMISSIONS_RECRUIT.HCAD_PROSPECTIVE_STUDENTS.HC_HCR_SM_SEARCH_GBL9&IsFolder=false");
	}
	
	@Given("^I select searchType as \"([^\"]*)\"$")
	public void searchType(String typetext) throws Throwable {
		driver.switchTo().frame("ptifrmtgtframe");
		WebElement searchDropDown = driver.findElement(By.id("HCR_SM_PARM_VW_SM_TYPE"));
		searchDropDown.click();
		Select drpdown = new Select(searchDropDown);
		drpdown.selectByIndex(2);
		
	}
	
	@Given("^I enter searchParameter as \"([^\"]*)\"$")
	public void i_enter_searchParameter_as(String param) throws Throwable {
		driver.findElement(By.id("HCR_SM_PARM_VW_SM_PARM_CD$prompt")).sendKeys(param);
	}
	
	@When("^I save searchCriteria$")
	public void i_save_searchCriteria() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Save Search Criteria')]")).click();

	}
	
	@When("^I enter nameSearch as \"([^\"]*)\"$")
	public void i_enter_nameSearch_as(String searchname) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='#ICDefnName']")).sendKeys(searchname);
	}
	
	@When("^I click save$")
	public void i_click_save() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='#ICSave']")).click();
	}
	
	@Then("^I should see my search label$")
	public void i_should_see_my_search_label() throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().frame("ptifrmtgtframe");
		WebElement selectsearch = driver.findElement(By.xpath("//select[@id='#ICSelectSearch']"));
		selectsearch.click();
		Select element = new Select(selectsearch);
		element.selectByIndex(1);
		boolean mysearchbox = selectsearch.isDisplayed();
		Assert.assertTrue(mysearchbox);	
		
	}	
	
	@Then("^I should see my si-net homepage$")
	public void i_should_see_my_si_net_homepage() throws Throwable {
		//driver.switchTo().frame("ptfrmtgtframe");
		boolean homepage = driver.findElement(By.className("pthomepagetabactive")).isDisplayed();
		Assert.assertTrue(homepage);
		
	}
	
	@Then("^I shouldn't see my si-net loginpage$")
	public void i_shouldnt_see_my_si_net_loginpage() throws Throwable {
		//driver.switchTo().frame("ptfrmtgtframe");		
		boolean loginpage = driver.findElement(By.className("PSERRORTEXT")).isDisplayed();
		Assert.assertTrue(loginpage);
	}
	
	@After
    public void afterScenario() {
	  new DriverFactory().destroyDriver();
	}
	
	
}
