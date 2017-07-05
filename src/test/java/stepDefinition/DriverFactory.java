package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import util.PropertyReader;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class DriverFactory {

    protected static WebDriver driver;
    public static final String URL = new PropertyReader().readProperty("URL");
    public static Logger logger = Logger.getLogger(DriverFactory.class);
    
    public static class timeout {
    	/**
    	 * This is a timeout enumerator class
	     */
        public static final int TINY = 100;
        public static final int SHORT = 250;
        public static final int MEDIUM = 1000;
        public static final int LONG = 5000 ;
        
    }


    public  DriverFactory() {
        initialize();
    }

    public void initialize() {

    	if (driver == null)
    		createNewDriverInstance();

    }

    private void createNewDriverInstance() {
//TODO implement binaries management of all browsers
//    	ChromeDriverManager.getInstance().setup(); // Done
//    	InternetExplorerDriverManager.getInstance().setup();
//    	OperaDriverManager.getInstance().setup();
//    	EdgeDriverManager.getInstance().setup();
//    	PhantomJsDriverManager.getInstance().setup();
//    	FirefoxDriverManager.getInstance().setup();
    	
    	
    	String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("chrome")) {
        	ChromeDriverManager.getInstance().setup();
        	ChromeOptions options = new ChromeOptions();
        	options.addArguments("test-type");
        	options.addArguments("start-maximized");
        	options.addArguments("--js-flags=--expose-gc");  
        	options.addArguments("--enable-precise-memory-info"); 
        	options.addArguments("--disable-popup-blocking");
        	options.addArguments("--disable-default-apps");
        	options.addArguments("test-type=browser");
        	options.addArguments("disable-infobars");
        	driver = new ChromeDriver(options);
        	
            
        } else {
            System.out.println("I cannot read browser type");
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}