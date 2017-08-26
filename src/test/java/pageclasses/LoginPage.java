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
//        driver.manage().window().maximize();
	}

	
	public static void login(String securityGroup) {
		// TODO: implement user groups
		String username = null;
		String password = null;
		if (securityGroup == null) {
			username= new PropertyReader().readProperty("DEFAULT_USER");
			password= new PropertyReader().readProperty("DEFAULT_PASSWORD");
		} else {
			if (securityGroup.equals("UQCTO")) {
				username = "UQTAHME4";
				password = "IT$1Sa$S";
			}
		}
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



