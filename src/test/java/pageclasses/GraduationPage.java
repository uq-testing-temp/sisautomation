package pageclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;



public class GraduationPage extends DriverFactory {
	
    public static Logger logger = Logger.getLogger(LoginPage.class);
	
    @FindBy(id="fldra_UQ_MANAGE_GRADUATIONS")
    private static WebElement menuItem_manageGraduations;

    @FindBy(id="fldra_UQ_GRADUATIONS_MANAGEMENT")
    private static WebElement menuItem_graduationsManagement;

    
    
    public GraduationPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }

    
	public static void navigate() throws InterruptedException  {
		//TODO implement navigation package - epic
		
		Thread.sleep(timeout.TINY);
		//TODO implement elements		
		driver.findElement(By.id("fldra_UQ_MANAGE_GRADUATIONS")).click();
//		menuItem_manageGraduations.click(); 
		driver.findElement(By.id("fldra_UQ_GRADUATIONS_MANAGEMENT")).click();
//		menuItem_graduationsManagement.click();
		
		driver.switchTo().frame("ptifrmtgtframe");

		driver.findElements(By.className("EOPP_SCSECTIONCONTENTLINK")).get(0).click();
		
		Thread.sleep(timeout.TINY);
		
	}
}
