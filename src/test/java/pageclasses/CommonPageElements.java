package pageclasses;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;
import stepDefinition.DriverFactory.timeout;


public class CommonPageElements extends DriverFactory {
	
    public static Logger logger = Logger.getLogger(CommonPageElements.class);
    
    public CommonPageElements(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }

	public static void clickClear() {
		switchFrame();
		fluentElement(By.id(cmnElements.CLEARBUTTON)).click();
		
	}    

	public static void search() throws InterruptedException {
		switchFrame();
		fluentElement(By.id(cmnElements.SEARCHBUTTON)).click();
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

	public static void selectFirstResult() {
		switchFrame();
		fluentElement(By.id(cmnElements.FIRSTRESULT)).click();
	}

	public static void enterTextField(String id, String keys) {
		switchFrame();
		fluentElement(By.id(id)).clear();
		fluentElement(By.id(id)).sendKeys(keys);		
	}

	public static WebElement runButton() {
		return fluentElement(By.id("PRCSRQSTDLG_WRK_LOADPRCSRQSTDLGPB"));
	}

	public static WebElement saveButtonFrame() {
		return frameElement(By.id("#ICSave"));
	}
	
	public static WebElement saveButton() {
		return fluentElement(By.id("#ICSave"));
	}

	public static WebElement processMonitorLink() throws InterruptedException {
		switchFrame();
		return fluentElement(By.id("PRCSRQSTDLG_WRK_LOADPRCSMONITORPB"));
	}

	public static WebElement refreshButton() {
		return fluentElement(By.id("REFRESH_BTN"));
	}

	public static void enterID(String id) {
		enterTextField("PEOPLE_SRCH_EMPLID", id);
	}

	public static void enterTextFieldFrame(String id, String keys) {
		frameElement(By.id(id)).clear();
		frameElement(By.id(id)).sendKeys(keys);
		
	}

	public static String getElementValue(By locator) {
		return fluentElement(locator).getAttribute("value");
	}
	
	public static String getElementText(By locator) {
		return fluentElement(locator).getText();
	}

	public static WebElement addTab() {
		switchFrame();
		return fluentElement(By.id("ICTAB_1"));
	}
	
	
}
