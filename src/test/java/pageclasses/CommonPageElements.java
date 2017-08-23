package pageclasses;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;


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
	
}
