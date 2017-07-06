package pageclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinition.DriverFactory;
import stepDefinition.DriverFactory.timeout;
import util.DebugLog;


public class SearchMatchPage extends DriverFactory {
	
    public static class index {
    	/**
    	 * This is Search type index enumerator class
	     */
        public static final int PERSON = 2;
        public static final int ORGANISATION = 1;
        
    }

	public static Logger logger = Logger.getLogger(LoginPage.class);
	
    @FindBy(id="fldra_HCAD_ADMISSIONS_RECRUIT")
    private static WebElement menuStudentRecruiting;
    
    @FindBy(id="fldra_HCAD_PROSPECTIVE_STUDENTS")
    private static WebElement menuMaintainProspects;
    
    @FindBy(id="HCR_SM_PARM_VW_SM_PARM_CD")
    private static WebElement element_searchParameter;
    
    @FindBy(xpath="//a[contains(text(),'Save Search Criteria')]")
    private static WebElement element_saveSearchCriteria;
    

    public SearchMatchPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }
    
	public static void navigate() throws Throwable {
		//TODO implement elements
		Thread.sleep(timeout.MEDIUM);        
		
		driver.switchTo().defaultContent();
		
//		menuStudentRecruiting.click();
		driver.findElement(By.id("fldra_HCAD_ADMISSIONS_RECRUIT")).click();
		driver.findElement(By.id("fldra_HCAD_PROSPECTIVE_STUDENTS")).click();
//		menuMaintainProspects.click();
		
		driver.switchTo().frame("ptifrmtgtframe");		
		
		
		driver.findElements(By.className("EOPP_SCSECTIONCONTENTLINK")).get(1).click();
	}


	
	public static void searchType(String typetext) {
		
		driver.switchTo().frame("ptifrmtgtframe");

		WebElement searchDropDown = driver.findElement(By.id("HCR_SM_PARM_VW_SM_TYPE"));
		searchDropDown.click();
		Select drpdown = new Select(searchDropDown);
		
		if (typetext.equalsIgnoreCase("Person")) {
			drpdown.selectByIndex(index.PERSON);
		
		} else if (typetext.equalsIgnoreCase("Organisation")){
			drpdown.selectByIndex(index.ORGANISATION);
			
		} else {
			DebugLog.fatalError("search type was not choosen");
		}
		
	}

	
	public static void searchParameter(String param) {

		driver.findElement(By.id("HCR_SM_PARM_VW_SM_PARM_CD$prompt")).sendKeys(param);
//		TODO implement element
//		element_searchParameter.sendKeys(param);

	}

	public static void saveSearchCriteria() {
		// TODO implement element
		driver.findElement(By.xpath("//a[contains(text(),'Save Search Criteria')]")).click();
//		element_saveSearchCriteria.click();
	}

	public static void nameSearch(String searchname) throws InterruptedException {
		
		Thread.sleep(timeout.TINY);
		driver.findElement(By.id("#ICDefnName")).sendKeys(searchname);
		
	}

	public static void save() {

		driver.findElement(By.id("#ICSave")).click();
		
	}

	public static boolean checkSearchLabelPresent() {
//		TODO implement element		
		driver.switchTo().frame("ptifrmtgtframe");
		
		WebElement selectsearch = driver.findElement(By.id("#ICSelectSearch"));
		selectsearch.click();
		Select element = new Select(selectsearch);
		element.selectByIndex(1);
		
		return selectsearch.isDisplayed();
	}

	
}



