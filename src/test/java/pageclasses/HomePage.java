package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;


public class HomePage extends DriverFactory{
	
	@FindBy(id="ptpglts")
	private static WebElement menu;
	
	@FindBy(className="PSSRCHACTION")
	private static WebElement error;
	
	@FindBy(id="uq_header")
	private static WebElement uq_header;
	

	public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
	}

	public static boolean loggedIn() {
		return menu.isDisplayed();
	}

	public static boolean loginError() {
		return error.isDisplayed();
	}

	public static void navigate(String id) throws InterruptedException {
		Thread.sleep(timeout.LONG);
		driver.switchTo().defaultContent();
		driver.findElement(By.id(id)).click();
	}

	public static boolean isLoaded() {
		return uq_header.isDisplayed();
	}

}
