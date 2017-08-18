package pageclasses;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;
import stepDefinition.DriverFactory.timeout;

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

	public static void navigateToIHCStudentMaintanance() throws InterruptedException {

		Thread.sleep(timeout.SHORT);
		driver.switchTo().defaultContent();
		Thread.sleep(timeout.SHORT);
		driver.findElement(By.id("fldra_HCSF_IHC")).click();
		Thread.sleep(timeout.SHORT);
		driver.findElement(By.id("crefli_HC_SSF_IHC_STDNT_GBL")).click();
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

	public static void searchIHCstudent(String student) throws InterruptedException {
		switchFrame();
		Thread.sleep(timeout.TINY);
		driver.findElement(By.id("SSF_ADMPRG_SRCH_EMPLID")).sendKeys(student);
		driver.findElement(By.id("#ICSearch")).click();
		Thread.sleep(timeout.LONG);
		
	}

	public static boolean canSeeIHCSMDetails() {
		switchFrame();
		boolean pageOpen = driver.findElement(By.id("win0divPSPAGECONTAINER")).isDisplayed();
		boolean nameDisplayed = driver.findElement(By.id("HCR_PERSON_NM_I_NAME_DISPLAY")).isDisplayed();
		return pageOpen&&nameDisplayed;
	}

	public static boolean anticipatedAmountAUD(String amount) {
		
		return driver.findElement(By.id("SSF_IHC_STDNT_SSF_IHC_RPT_AMT$0")).getText().equalsIgnoreCase(amount);
	}

	public static void navigateToIHCFinancials_View_UQ_Student_Accounts() throws InterruptedException {
		Thread.sleep(timeout.SHORT);
		driver.switchTo().defaultContent();
		Thread.sleep(timeout.SHORT);
		driver.findElement(By.id("crefli_UQ_STUD_ACCT_PNG_GBL")).click();
		Thread.sleep(timeout.MEDIUM);	
	}

	public static void search() throws InterruptedException {
		switchFrame();
		driver.findElement(By.id("#ICSearch")).click();
		Thread.sleep(timeout.XLONG);
	}

	public static boolean seeChargesAndrefunds() {
		switchFrame();
		boolean pageOpen = driver.findElement(By.id("win0divUQ_STUD_ACCT_VWGP$0")).isDisplayed();
		boolean charge = driver.findElement(By.id("UQ_STUD_ACCT_VW_UQ_ACCT_CHARGE$0")).isDisplayed();
		boolean refund = driver.findElement(By.id("win0divUQ_STUD_ACCT_VW_UQ_REFUND_AMT$0")).isDisplayed();
		return pageOpen&&charge&&refund;
	}

}
