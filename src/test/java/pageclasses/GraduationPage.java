package pageclasses;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinition.DriverFactory;
import stepDefinition.DriverFactory.timeout;


public class GraduationPage extends DriverFactory {
	
    public static Logger logger = Logger.getLogger(GraduationPage.class);
//	
//    @FindBy(id="fldra_UQ_MANAGE_GRADUATIONS")
//    private static WebElement menuItem_manageGraduations;
//
//    @FindBy(id="fldra_UQ_GRADUATIONS_MANAGEMENT")
//    private static WebElement menuItem_graduationsManagement;
   
    
    public GraduationPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }

	public static void navigate() throws InterruptedException  {
		//TODO implement navigation package - epic
		driver.switchTo().defaultContent();
		
		Thread.sleep(timeout.LONG);
		//TODO implement elements		
		driver.findElement(By.id("fldra_UQ_MANAGE_GRADUATIONS")).click();
//		menuItem_manageGraduations.click(); 
		driver.findElement(By.id("fldra_UQ_GRADUATIONS_MANAGEMENT")).click();
//		menuItem_graduationsManagement.click();
		Thread.sleep(timeout.TINY);	
		driver.switchTo().frame("ptifrmtgtframe");
		
		driver.findElements(By.className("EOPP_SCSECTIONCONTENTLINK")).get(0).click();
		Thread.sleep(timeout.TINY);		
			
	}

	public static void enterEmplID(String id) {
		
		switchFrame();
		driver.findElement(By.id("UQ_GR_STUD_SRCH_EMPLID")).clear();
		driver.findElement(By.id("UQ_GR_STUD_SRCH_EMPLID")).sendKeys(id);
		
	}
	
	public static void enterEmplIDtestamur(String id) {
		
		switchFrame();
		driver.findElement(By.id("UQ_TESTAMR_SRCH_EMPLID")).clear();
		driver.findElement(By.id("UQ_TESTAMR_SRCH_EMPLID")).sendKeys(id);
		
	}

	public static void setEventID(String id) throws InterruptedException {
		switchFrame();
		Thread.sleep(timeout.MEDIUM);
		driver.findElement(By.id("UQ_GR_STUD_SRCH_CAMPUS_EVENT_NBR")).clear();
		driver.findElement(By.id("UQ_GR_STUD_SRCH_CAMPUS_EVENT_NBR")).sendKeys(id);
		
	}

	public static void selectGraduationStatusSearchParameter(String graduationStatustext, int dropdownIndex) {
		switchFrame();
		
		//TODO implement dropDown index enumerator and mapping
		WebElement gsDropDown = driver.findElement(By.id("UQ_GR_STUD_SRCH_UQ_GRAD_APP_STATUS"));
		gsDropDown.click();
		Select drpdown = new Select(gsDropDown);
		drpdown.selectByIndex(dropdownIndex);
	}

	public static void selectAcademicCareer(String academicCareertext, int index) {
		switchFrame();
		
		WebElement acDropDown = driver.findElement(By.id("UQ_GR_STUD_SRCH_ACAD_CAREER")); 
		acDropDown.click();
		Select drpdown = new Select(acDropDown);
		drpdown.selectByIndex(index);
	}
	
	public static void selectAcademicCareerGAT(String academicCareertext, int index) {
		switchFrame();
		
		WebElement acDropDown = driver.findElement(By.id("UQ_RC_GAT_HDR_ACAD_CAREER")); 
		acDropDown.click();
		Select drpdown = new Select(acDropDown);
		drpdown.selectByIndex(index);
	}

	public static void search() throws InterruptedException {
		Thread.sleep(timeout.LONG);
		switchFrame();
		driver.findElement(By.id("#ICSearch")).click();
		Thread.sleep(timeout.XLONG);
	}
	
	public static void add() throws InterruptedException {

		switchFrame();
		driver.findElement(By.id("#ICSearch")).click();
		Thread.sleep(timeout.MEDIUM);
	}

	public static void seeSearchResults() throws InterruptedException {

		switchFrame();
		WebElement element = driver.findElement(By.id("win0divHCR_PERSON_NM_I_NAME_DISPLAY"));
		boolean label = element.isDisplayed();
		Assert.assertTrue(label);
		
	}

	public static void selectGraduationStatus(String graduationStatustext, int dropdownIndex) throws InterruptedException {
		switchFrame();
		
		WebElement gsDropDown = driver.findElement(By.id("UQ_GR_STUD_COND_UQ_GRAD_APP_STATUS$0"));
		gsDropDown.click();
		Select drpdown = new Select(gsDropDown);
		drpdown.selectByIndex(dropdownIndex);
	}

	public static void save() throws Exception {
		// TODO move to common page elements
		driver.findElement(By.id("#ICSave")).click();
		Thread.sleep(timeout.LONG);
		
	}

	public static void addRow() throws InterruptedException {
		Thread.sleep(timeout.MEDIUM);
		driver.findElement(By.name("UQ_DERIVED_GRD_UQ_ADD_PB$IMG")).click();
		Thread.sleep(timeout.MEDIUM);
	}

	public static boolean alertmsgPresent() throws Exception {
		Thread.sleep(timeout.MEDIUM);
		driver.switchTo().defaultContent();
		Boolean result = true;
		try {
			if (driver.findElement(By.id("alertmsg")).isDisplayed()) {
				result = true;
			}
	    } catch (NoSuchElementException e) {
	          result = false;
	    }
		return result;
	}

	public static void markMandatory(String i) throws InterruptedException {
		Thread.sleep(timeout.MEDIUM);
		driver.findElement(By.id("UQ_GR_STUD_ENRL_UQ_GRAD_MANDATORY$" + i)).click();
	}

	public static void markDiscarded(String i) throws InterruptedException {
		Thread.sleep(timeout.MEDIUM);
		driver.findElement(By.id("UQ_GR_STUD_ENRL_UQ_GRAD_DISCARDED$" + i)).click();
		
	}

	public static boolean checkDiscarded(String i) {
		return driver.findElement(By.id("UQ_GR_STUD_ENRL_UQ_GRAD_MANDATORY$" + i)).isSelected();
	}

	public static boolean checkMandatory(String i) {
		return driver.findElement(By.id("UQ_GR_STUD_ENRL_UQ_GRAD_MANDATORY$" + i)).isSelected();
	}
	
	public static void navigateToCeremonyManagement() throws InterruptedException {
		switchFrame();
		Thread.sleep(timeout.MEDIUM);
		driver.findElement(By.id("ICTAB_2")).click();
		Thread.sleep(timeout.MEDIUM);
		
	}

	public static void setMilestone(String milestone) {
		switchFrame();
		driver.findElement(By.id("UQ_GR_STUD_OREQ_MILESTONE$0")).clear();
		driver.findElement(By.id("UQ_GR_STUD_OREQ_MILESTONE$0")).sendKeys(milestone);
	}

	public static void setAttendance(int dropdownIndex) {
		switchFrame();
		
		//TODO implement dropDown index enumerator and mapping
		WebElement gsDropDown = driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_ATTEN_MODE"));
		gsDropDown.click();
		Select drpdown = new Select(gsDropDown);
		drpdown.selectByIndex(dropdownIndex);
	}
	
	public static void setCeremony(CharSequence ceremony) {
		switchFrame();
		driver.findElement(By.id("UQ_GR_STUD_CERE_EVENT_MTG_NBR")).clear();
		driver.findElement(By.id("UQ_GR_STUD_CERE_EVENT_MTG_NBR")).sendKeys(ceremony);
		
	}

	public static void setResidentialCollege(String college) {
		switchFrame();
		driver.findElement(By.id("UQ_GR_STUD_CERE_EXT_ORG_ID")).clear();
		driver.findElement(By.id("UQ_GR_STUD_CERE_EXT_ORG_ID")).sendKeys(college);
		
	}

	public static void setOther(String string) {
		switchFrame();
		driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_OTHER")).clear();
		driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_OTHER")).sendKeys(string);
		
	}

	public static void setAddendum() {
		if (!driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_ADDENDUM")).isSelected()) {
			driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_ADDENDUM")).click();
		}
	}

	public static void setValedictoiran() {
		if (!driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_VALEDICTOR")).isSelected()) {
			driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_VALEDICTOR")).click();		
		}
	}

	public static void setMedallist() {
		if (!driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_MEDALLIST")).isSelected()) {
			driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_MEDALLIST")).click();
		}
	}

	public static void setAcademicProcession() {
		if (!driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_AC_PROCESS")).isSelected()) {
			driver.findElement(By.id("UQ_GR_STUD_CERE_UQ_GRAD_AC_PROCESS")).click();
		}
	}

	public static void navigateToStudentDegrees() throws InterruptedException {
		switchFrame();
		Thread.sleep(timeout.MEDIUM);
		driver.findElement(By.id("ICTAB_1")).click();
		Thread.sleep(timeout.MEDIUM);		
	}
	
	public static boolean honourClassAvaliable() {
		return driver.findElement(By.id("UQ_GR_STUD_DEGR_HONORS_CODE$0")).isEnabled();
	}

	public static void delete() throws Exception {
		switchFrame();
		driver.findElement(By.id("UQ_DRV_TESTAMUR_UQ_DELETE_PB")).click();
		Thread.sleep(timeout.LONG);		
	}

	public static boolean maililngLinkEnabled() {
    	switchFrame();    
    	Boolean result = true;
        try {
        	Assert.assertTrue(driver.findElement(By.id("UQ_DERIVED_GRD_UQ_REFRESH_ADDR$0")).isEnabled());
        } catch (NoSuchElementException e) {
        	result = false;
        }
		return result;
		
	}

	public static void selectGraduationStatusGAT(String graduationStatustext, int dropDownIndex) throws Exception {
		
		Thread.sleep(timeout.LONG);
		switchFrame();
		
		WebElement gsDropDown = driver.findElement(By.id("UQ_RC_GAT_HDR_UQ_GRAD_APP_STATUS"));
		gsDropDown.click();
		Select drpdown = new Select(gsDropDown);
		drpdown.selectByIndex(dropDownIndex);
		
	}
	
	public static void selectAcademicProgramGAT(String program) throws Exception {
		Thread.sleep(timeout.MEDIUM);
		switchFrame();
		driver.findElement(By.id("UQ_RC_GAT_HDR_ACAD_PROG")).sendKeys(program);		
	}

	public static void navigateToTestamurDetails() throws Exception {
		driver.switchTo().defaultContent();
		
		Thread.sleep(timeout.LONG);
		driver.findElement(By.id("fldra_UQ_MANAGE_GRADUATIONS")).click();
		driver.findElement(By.id("fldra_UQ_GRADUATIONS_MANAGEMENT")).click();
		Thread.sleep(timeout.TINY);	
		driver.findElement(By.id("crefli_UQ_TESTAMUR_DTL_GBL")).click();
		Thread.sleep(timeout.TINY);			
	}

	public static void enterRegisteredPostNumber(CharSequence number) throws InterruptedException {
    	Thread.sleep(timeout.LONG);
    	switchFrame();
        driver.findElement(By.id("UQ_TESTAMUR_DTL_UQ_GRAD_REG_POST$0")).clear();		
        driver.findElement(By.id("UQ_TESTAMUR_DTL_UQ_GRAD_REG_POST$0")).sendKeys(number);
	}

	public static void navigateToGATProduction() throws InterruptedException {
		driver.switchTo().defaultContent();
		
		Thread.sleep(timeout.LONG);
		driver.findElement(By.id("fldra_UQ_MANAGE_GRADUATIONS")).click();
		driver.findElement(By.id("crefli_UQ_RUNCTL_GAT_GBL")).click();
		Thread.sleep(timeout.TINY);	
		driver.switchTo().frame("ptifrmtgtframe");		
	}

	public static void addValue(String runControlID) throws Exception {
    	
    	Thread.sleep(timeout.LONG);
    	switchFrame();
    	driver.findElement(By.className("PTUNDERLINE")).click();
    	Thread.sleep(timeout.MEDIUM);
    	driver.findElement(By.id("PRCSRUNCNTL_RUN_CNTL_ID")).clear();
    	driver.findElement(By.id("PRCSRUNCNTL_RUN_CNTL_ID")).sendKeys(runControlID);
		driver.findElement(By.id("#ICSearch")).click();
		Thread.sleep(timeout.MEDIUM);		
	}

	
	public static void selectAcademicGroup(String group) throws Exception {
		
		Thread.sleep(timeout.MEDIUM);
		switchFrame();
		
		driver.findElements(By.id("UQ_RC_GAT_HDR_ACAD_GROUP")).clear();
		driver.findElement(By.id("UQ_RC_GAT_HDR_ACAD_GROUP")).sendKeys(group);
	}


	public static void selectReportFormat(String option) {
		
		if (option.equalsIgnoreCase("CSV")) {
			driver.findElement(By.id("UQ_RC_GAT_HDR_UQ_GAT_RPT_OPTION_LBL")).click();
		}
		if (option.equalsIgnoreCase("PDF")) {
			driver.findElement(By.id("UQ_RC_GAT_HDR_UQ_GAT_RPT_OPTION$30$_LBL")).click();
		}
				
	}

	public static void clickRun() throws Exception {
		driver.findElement(By.id("PRCSRQSTDLG_WRK_LOADPRCSRQSTDLGPB")).click();
		Thread.sleep(timeout.LONG);		
	}

	
	public static boolean schedulerRequestIsDisplayed() throws Exception {
		Thread.sleep(timeout.LONG);
		driver.switchTo().activeElement();
		if (driver.findElement(By.id("#ICSave")).isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	
}
