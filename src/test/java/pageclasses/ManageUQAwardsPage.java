package pageclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinition.DriverFactory;


public class ManageUQAwardsPage extends DriverFactory {
	
    public static class index {
    	/**
    	 * This is Search type index enumerator class
	     */
        
    }

	public static Logger logger = Logger.getLogger(LoginPage.class);
	
    @FindBy(id="fldra_HCAD_ADMISSIONS_RECRUIT")
    private static WebElement menuStudentRecruiting;
    

    public ManageUQAwardsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }
    
	public static void navigate() throws Throwable {
		//TODO implement elements
		Thread.sleep(timeout.MEDIUM);        
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("fldra_UQ_MANAGE_AWARDS")).click();
		
		driver.switchTo().frame("ptifrmtgtframe");		
		
	}

	public static void navigateStudentSummary() {
		// TODO Auto-generated method stub 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("crefli_UQ_AWD_SUMM_STAFF_GBL")).click();
		
		driver.switchTo().frame("ptifrmtgtframe");	
	}

	public static void enterEmplID(String id) throws Exception {
		Thread.sleep(timeout.LONG);
		switchFrame();
    	driver.findElement(By.id("UQ_AWD_SUMM_VW_EMPLID")).clear();
    	driver.findElement(By.id("UQ_AWD_SUMM_VW_EMPLID")).sendKeys(id);
		
	}

	public static void changeAwardStatus(String status, int dropDownIndex) {
    	//TODO dropdownIndex enumerator
    	switchFrame();
		
		//TODO implement dropDown index enumerator and mapping
		WebElement gsDropDown = driver.findElement(By.id("UQ_AWD_STD_HDR_UQ_AWD_REG_STAT$0"));
		gsDropDown.click();
		Select drpdown = new Select(gsDropDown);
		drpdown.selectByIndex(dropDownIndex);		
	}



	
}



