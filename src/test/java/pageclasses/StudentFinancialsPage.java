package pageclasses;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;

public class StudentFinancialsPage extends DriverFactory {
	
    public static Logger logger = Logger.getLogger(StudentFinancialsPage.class);
//	
//    @FindBy(id="fldra_UQ_MANAGE_GRADUATIONS")
//    private static WebElement menuItem_manageGraduations;
//
//    @FindBy(id="fldra_UQ_GRADUATIONS_MANAGEMENT")
//    private static WebElement menuItem_graduationsManagement;
   
    
    public StudentFinancialsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }

	public static void navigate() throws InterruptedException  {
		//TODO implement navigation package - epic
		driver.switchTo().defaultContent();
		
		Thread.sleep(timeout.LONG);
		//TODO implement elements		
		driver.findElement(By.id("fldra_HCCC_MANAGE_STUDENT_FINANCIALS")).click();
		Thread.sleep(timeout.TINY);	
	}

	public static void navigateToViewCustomerAccounts() throws InterruptedException {

		Thread.sleep(timeout.SHORT);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("crefli_HC_ACCOUNT_VW_GBL4")).click();
		Thread.sleep(timeout.MEDIUM);	
	}
	
	public static void enterEmplID(String student) {
		switchFrame();
		driver.findElement(By.id("PEOPLE_SRCH_SF_EMPLID")).clear();
		driver.findElement(By.id("PEOPLE_SRCH_SF_EMPLID")).sendKeys(student);
		
	}

	public static boolean canSeeBalances() {
		return driver.findElement(By.className("PSEDITBOXLABEL")).isDisplayed();
	}

	public static boolean navigateTo(String id) throws InterruptedException {
		//TODO implement navigation package - epic
		driver.switchTo().defaultContent();
		
		Thread.sleep(timeout.TINY);
		//TODO implement elements		
		driver.findElement(By.id(id)).click();
		Thread.sleep(timeout.TINY);
		return true;	
	}

}
