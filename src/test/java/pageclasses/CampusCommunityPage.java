package pageclasses;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;


public class CampusCommunityPage extends DriverFactory {
	
    public static Logger logger = Logger.getLogger(CampusCommunityPage.class);
//	
//    @FindBy(id="fldra_UQ_MANAGE_GRADUATIONS")
//    private static WebElement menuItem_manageGraduations;
//
//    @FindBy(id="fldra_UQ_GRADUATIONS_MANAGEMENT")
//    private static WebElement menuItem_graduationsManagement;
   
    
    public CampusCommunityPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }

	public static void navigate() throws InterruptedException  {
		//TODO implement navigation package - epic
		driver.switchTo().defaultContent();
		
		Thread.sleep(timeout.LONG);
		//TODO implement elements		
		driver.findElement(By.id("fldra_HCCC_BUILD_COMMUNITY")).click();
		Thread.sleep(timeout.TINY);	
	}

	public static void navigateToEventManagement() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(timeout.SHORT);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("fldra_HCCC_BUILD_COMMUNITY")).click();
		Thread.sleep(timeout.SHORT);
		driver.findElement(By.id("fldra_HCCC_PLAN_EVENTS")).click();
		Thread.sleep(timeout.SHORT);
		driver.findElement(By.id("fldra_HCCC_EVENT_MANAGEMENT")).click();
		Thread.sleep(timeout.SHORT);	
		driver.switchTo().frame("ptifrmtgtframe");
		
		driver.findElements(By.className("EOPP_SCSECTIONCONTENTLINK")).get(0).click();
		Thread.sleep(timeout.MEDIUM);	
	}

	public static void addNewEvent() throws Exception {
		switchFrame();
		driver.findElement(By.id("ICTAB_1")).click();
		Thread.sleep(timeout.LONG);		
	}
	
	public static void addNewMeeting() throws Exception {
		switchFrame();
		driver.findElement(By.id("ICTAB_1")).click();
		Thread.sleep(timeout.LONG);		
	}

	public static void enterEventID(String eventID) throws InterruptedException {
		switchFrame();
		
		driver.findElement(By.id("CAMPUS_EVENT_CAMPUS_EVENT_NBR")).clear();
		driver.findElement(By.id("CAMPUS_EVENT_CAMPUS_EVENT_NBR")).sendKeys(eventID);;
		
		Thread.sleep(timeout.LONG);			
	}

	public static void enterEventDesc(String description) {
		switchFrame();
		driver.findElement(By.id("CAMPUS_EVENT_DESCR")).clear();
		driver.findElement(By.id("CAMPUS_EVENT_DESCR")).sendKeys(description);
	}

	public static void enterEventType(String type) {
		switchFrame();
		driver.findElement(By.id("CAMPUS_EVENT_CAMPUS_EVENT_TYPE")).clear();
		driver.findElement(By.id("CAMPUS_EVENT_CAMPUS_EVENT_TYPE")).sendKeys(type);		
	}

	public static void enterAcademicInstitution(String institution) {
		switchFrame();
		driver.findElement(By.id("CAMPUS_EVENT_INSTITUTION")).clear();
		driver.findElement(By.id("CAMPUS_EVENT_INSTITUTION")).sendKeys(institution);
	}

	public static void navigateToEventManagementMeetings() throws Exception {
		Thread.sleep(timeout.SHORT);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("fldra_HCCC_BUILD_COMMUNITY")).click();
		Thread.sleep(timeout.SHORT);
		driver.findElement(By.id("fldra_HCCC_PLAN_EVENTS")).click();
		Thread.sleep(timeout.SHORT);
		driver.findElement(By.id("fldra_HCCC_EVENT_MANAGEMENT")).click();
		Thread.sleep(timeout.MEDIUM);	
		switchFrame();
		driver.findElements(By.className("EOPP_SCSECTIONCONTENTLINK")).get(1).click();
	}
	
}
