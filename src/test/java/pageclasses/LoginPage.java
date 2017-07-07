package pageclasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;
import util.PropertyReader;


public class LoginPage extends DriverFactory {
	
    public static Logger logger = Logger.getLogger(LoginPage.class);
	
    @FindBy(id="userid1")
    private static WebElement usernamefield;
    
    @FindBy(id="pwd")
    private static WebElement passwordfield;
    
    @FindBy(xpath="(//input[@value=''])[3]")
    private static WebElement singinbutton;
	
  
    
    public LoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    
    }
    
    
	public static void navigate() {
		
		String URL= new PropertyReader().readProperty("URL");
		driver.get(URL + "/ps/uqsinetsignin.html");
        driver.manage().window().maximize();
	}

	
	public static void login() {
		
		String username= new PropertyReader().readProperty("DEFAULT_USER");
		String password= new PropertyReader().readProperty("DEFAULT_PASSWORD");
		
		navigate();
		enterUsername(username);
		enterPassword(password);
		clickSingin();
		
	}	
	

	public static void enterUsername(String username) {
		usernamefield.sendKeys(username);
	}


	public static void enterPassword(String password) {
		passwordfield.sendKeys(password);
	}


	public static void clickSingin() {
		singinbutton.click();
	}


	public static boolean isLoggedIn() {

		return driver.findElement(By.className("pthomepagetabactive")).isDisplayed();
		
	}


	public static boolean isLoggedOut() {

		return driver.findElement(By.className("PSERRORTEXT")).isDisplayed();
	
	}

}



