package pageclasses;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import stepDefinition.DriverFactory;


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
		driver.findElement(By.id("UQ_GR_STUD_SRCH_EMPLID")).sendKeys(id);
		
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


	public static void search() throws InterruptedException {

		switchFrame();
		driver.findElement(By.id("#ICSearch")).click();
		Thread.sleep(timeout.MEDIUM);
	}


	public static void seeSearchResults() throws InterruptedException {

		switchFrame();
		Thread.sleep(timeout.XLONG);
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

	public static void save() {
		// TODO move to common page elements
		driver.findElement(By.id("#ICSave")).click();
		
	}

	public static void addRow() throws InterruptedException {
		Thread.sleep(timeout.MEDIUM);
		driver.findElement(By.name("UQ_DERIVED_GRD_UQ_ADD_PB$IMG")).click();
		Thread.sleep(timeout.MEDIUM);
	}


	public static boolean alertmsgPresent() {

		Boolean result = true;
		try {
			driver.findElement(By.id("alertmsg")).isDisplayed();
			result = true;
	        } catch (NoSuchElementException e) {
	          result = false;
	    }
		return result;
	}


	public static void markMandatory(String i) throws InterruptedException {
		Thread.sleep(timeout.MEDIUM);
		driver.findElement(By.name("UQ_GR_STUD_ENRL_UQ_GRAD_MANDATORY$" + i)).click();
	}
	
}
