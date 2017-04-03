package stepDefinition.java;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class searchSteps {

	WebDriver driver = new ChromeDriver();
		
	@Given("^I open mysinet url$")
	public void setup() throws Throwable {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("start-maximized");
		options.addArguments("--js-flags=--expose-gc");  
		options.addArguments("--enable-precise-memory-info"); 
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-default-apps");
		options.addArguments("test-type=browser");
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://pswebdev.soe.uq.edu.au:9700/ps/uqsinetsignin.html");
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
		driver.switchTo().frame("ptifrmtgtframe");
		//WebElement searchDropDown = driver.findElement(By.xpath("//select[@tabindex='13']"));
		//WebElement searchDropDown = driver.findElement(By.xpath("//select[@id='HCR_SM_PARM_VW_SM_TYPE']"));
		WebElement searchDropDown = driver.findElement(By.id("HCR_SM_PARM_VW_SM_TYPE"));
		//WebElement table = driver.findElement(By.xpath(".//*[@id='win0tblSrchFlds']"));
		//WebElement rows = table.findElement(By.xpath("//tr/td/[contains(text(), 'HCR_SM_PARM_VW_SM_TYPE')]"));
		searchDropDown.click();
		Select drpdiwn = new Select(searchDropDown);
		drpdiwn.selectByIndex(2);
	}
}
