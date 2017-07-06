package stepDefinition;
import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclasses.SearchMatchPage;


public class searchSteps extends DriverFactory{
	
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
	
	@After
    public void afterScenario() {
	  new DriverFactory().destroyDriver();
	}
	
	
}