package stepDefinition;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class setupSteps extends DriverFactory{

	@Before
	public void beforeScenario() {
		driver = new DriverFactory().getDriver();
	}

	@Given("^Student ID \"([^\"]*)\" has been set up")
	public void studentSetup(String idnumber) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.id("ENRL_REQ_HDR_VW_EMPLID")).sendKeys(idnumber);
		driver.findElement(By.id("ENRL_REQ_HDR_VW_ACAD_CAREER")).sendKeys("UGRD");
		driver.findElement(By.id("ENRL_REQ_HDR_VW_INSTITUTION")).sendKeys("UQUNI");
		driver.findElement(By.id("ENRL_REQ_HDR_VW_STRM")).sendKeys("6780");
		driver.findElement(By.id("#ICSearch")).click();
		Thread.sleep(2000);
	}

	@After
    public void afterScenario() {
	  new DriverFactory().destroyDriver();
	}
	
	
}
