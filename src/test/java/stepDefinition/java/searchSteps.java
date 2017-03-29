package stepDefinition.java;

import java.util.List;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class searchSteps {

	WebDriver driver = new ChromeDriver();
		
	@Given("^I open mysinet url$")
	public void setup() throws Throwable {
		driver.get("https://pswebdev.soe.uq.edu.au:9700/ps/uqsinetsignin.html");
		driver.manage().window().maximize();
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
		driver.get("https://pswebdev.soe.uq.edu.au:9700/psp/ps/EMPLOYEE/HRMS/c/RECRUIT_PROSPECTIVE_STUDENTS.HCR_SM_SEARCH.GBL?PORTALPARAM_PTCNAV=HC_HCR_SM_SEARCH_GBL9&EOPP.SCNode=HRMS&EOPP.SCPortal=EMPLOYEE&EOPP.SCName=HCAD_PROSPECTIVE_STUDENTS&EOPP.SCLabel=Maintain%20Prospects&EOPP.SCPTfname=HCAD_PROSPECTIVE_STUDENTS&FolderPath=PORTAL_ROOT_OBJECT.HCAD_ADMISSIONS_RECRUIT.HCAD_PROSPECTIVE_STUDENTS.HC_HCR_SM_SEARCH_GBL9&IsFolder=false");
	}
	
	@Given("^I select searchType as \"([^\"]*)\"$")
	public void searchType(String typetext) throws Throwable {
		WebElement table = driver.findElement(By.xpath(".//*[@id='win0tblSrchFlds']"));
		WebElement rows = table.findElement(By.xpath("//tr/td/[contains(text(), 'HCR_SM_PARM_VW_SM_TYPE')]"));
		rows.click();
	}
}
