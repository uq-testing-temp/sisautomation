package stepDefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import pageclasses.CommonPageElements;
import stepDefinition.DriverFactory.timeout;
import util.DebugLog;
import util.PropertyReader;

public class DriverFactory {

	protected static WebDriver driver;
    public static final String URL = new PropertyReader().readProperty("URL");
    public static final String fluidURL = new PropertyReader().readProperty("fluidURL");
    public static Logger logger = Logger.getLogger(DriverFactory.class);
    
    public static class timeout {
    	/**
    	 * Timeouts enumerator class
	     */
        public static final int TINY = 100;
        public static final int SHORT = 250;
        public static final int MEDIUM = 1000;
        public static final int LONG = 2000;
        public static final int XLONG = 5000;
        public static final int PROCESSING = 5000;
        public static final int FLUENTWAIT = 10;
		public static final long FLUENTPOLLING = 500;
        
        
        
    }
    
    public static class graduationStatus {
    	/**
    	 * Graduation statuses enumerator class
	     */
        public static final int CONDITIONAL = 0;
        public static final int ELIGIBLE = 1;
        public static final int FINAL = 2;
        public static final int INELIGIBLE = 3;
        public static final int PENDING = 4;
        public static final int PROCESSIN_ERROR = 5;
        public static final int RE_PRESENTATION = 6;
        public static final int SYSTEM_REMOVED = 7;
        public static final int UNSUCCESFULL = 8;
        
    }
    
    public static class TPCstatus {
    	/**
    	 * Graduation statuses enumerator class
	     */
        public static final int NA = 0;
        public static final int ACTIVE = 1;
        public static final int CANCELLED = 2;
        public static final int HOLD = 3;
        public static final int INACTIVE = 4;
        public static final int NOT_POSTED = 5;
        
    }
        
    public static class menu {
    	/**
    	 * This is menu elements "id" locators enumerator class
	     */
    	
    	public static final String MYFAVORITES   					= "fldra_MYFAVORITES";
    	public static final String UQ_MANAGE_GRADUATIONS   			= "fldra_UQ_MANAGE_GRADUATIONS";
    	public static final String UQ_MANAGE_AWARDS  				= "fldra_UQ_MANAGE_AWARDS";
    	public static final String UQ_MYSINET_STAFF  				= "fldra_UQ_MYSINET_STAFF";
    	public static final String UQ_MYSINET_ADMIN  				= "fldra_UQ_MYSINET_ADMIN";
    	public static final String UQ_SUPPORT_FOLDER   				= "fldra_UQ_SUPPORT_FOLDER";
    	public static final String UQ_DEC_FOLDER   					= "fldra_UQ_DEC_FOLDER";
    	public static final String MANAGE_RESEARCH_STUDENTS  		= "fldra_MANAGE_RESEARCH_STUDENTS";
    	public static final String MANAGE_RESEARCH_CONFIGURATION  	= "fldra_MANAGE_RESEARCH_CONFIGURATION";
    	public static final String UQ_SCHOLARSHIPS_AND_PRIZES  		= "fldra_UQ_SCHOLARSHIPS_AND_PRIZES";
    	public static final String CO_EMPLOYEE_SELF_SERVICE  		= "fldra_CO_EMPLOYEE_SELF_SERVICE";
    	public static final String CO_MANAGER_SELF_SERVICE   		= "fldra_CO_MANAGER_SELF_SERVICE";
    	public static final String HC_RECRUIT_EMPLOYEE  		 	= "fldra_HC_RECRUIT_EMPLOYEE";
    	public static final String HC_WORKFORCE_ADMINISTRATION   	= "fldra_HC_WORKFORCE_ADMINISTRATION";
    	public static final String HC_BENEFITS   					= "fldra_HC_BENEFITS";
    	public static final String CO_COMPENSATION   				= "fldra_CO_COMPENSATION";
    	public static final String HC_STOCK_ADMINISTRATION   		= "fldra_HC_STOCK_ADMINISTRATION";
    	public static final String HC_TIME_AND_LABOR1  				= "fldra_HC_TIME_AND_LABOR1";
    	public static final String HC_NORTH_AMERICAN_PAYROLL   		= "fldra_HC_NORTH_AMERICAN_PAYROLL";
    	public static final String HC_GLOBAL_PAYROLL  				= "fldra_HC_GLOBAL_PAYROLL";
    	public static final String HC_PAYROLL_INTERFACE  			= "fldra_HC_PAYROLL_INTERFACE";
    	public static final String HC_WORKFORCE_DEVELOPMENT  		= "fldra_HC_WORKFORCE_DEVELOPMENT";
    	public static final String HC_ORGANIZATIONAL_DEVELOPMENT  	= "fldra_HC_ORGANIZATIONAL_DEVELOPMENT";
    	public static final String CO_ENTERPRISE_LEARNING  			= "fldra_CO_ENTERPRISE_LEARNING";
    	public static final String HC_WORKFORCE_MONITORING   		= "fldra_HC_WORKFORCE_MONITORING";
    	public static final String HC_PENSION_PLANS  				= "fldra_HC_PENSION_PLANS";
    	public static final String HCCC_BUILD_COMMUNITY  			= "fldra_HCCC_BUILD_COMMUNITY";
    	public static final String HCAD_ADMISSIONS_RECRUIT   		= "fldra_HCAD_ADMISSIONS_RECRUIT";
    	public static final String HCAD_STUDENT_ADMISSIONS   		= "fldra_HCAD_STUDENT_ADMISSIONS";
    	public static final String HCSR_RECORDS_AND_REGISTRATION  	= "fldra_HCSR_RECORDS_AND_REGISTRATION";
    	public static final String HCSR_CURRICULUM_MANAGEMENT  		= "fldra_HCSR_CURRICULUM_MANAGEMENT";
    	public static final String HCCC_ADMINISTER_FINANCIAL_AID  	= "fldra_HCCC_ADMINISTER_FINANCIAL_AID";
    	public static final String HCCC_MANAGE_STUDENT_FINANCIALS 	= "fldra_HCCC_MANAGE_STUDENT_FINANCIALS";
    	public static final String M9_STUDENT_PLACEMENTS   			= "fldra_M9_STUDENT_PLACEMENTS";
    	public static final String HCAA_ACADEMIC_ADVISING  			= "fldra_HCAA_ACADEMIC_ADVISING";
    	public static final String HCCC_MANAGE_CONTRIBUTOR_RELATI 	= "fldra_HCCC_MANAGE_CONTRIBUTOR_RELATI";
    	public static final String HCSAE_INTEGRATION_PLATFORM  		= "fldra_HCSAE_INTEGRATION_PLATFORM";
    	public static final String HC_SETUP_HRMS  	 				= "fldra_HC_SETUP_HRMS";
    	public static final String HCCC_DESIGN_STUDENT_ADMINISTRA 	= "fldra_HCCC_DESIGN_STUDENT_ADMINISTRA";
    	public static final String EOCO_MAIN   						= "fldra_EOCO_MAIN";
    	public static final String PT_WORKLIST   					= "fldra_PT_WORKLIST";
    	public static final String PTDIAGNOSTICS   					= "fldra_PTDIAGNOSTICS";
    	public static final String PT_TREE_MANAGER   				= "fldra_PT_TREE_MANAGER";
    	public static final String PT_REPORTING_TOOLS 	 			= "fldra_PT_REPORTING_TOOLS";
    	public static final String PT_PEOPLETOOLS  					= "fldra_PT_PEOPLETOOLS";
        
    }
    
    public static class sfmenu {
    	/**
    	 * This is menu elements "id" locators enumerator class
	     */
    	public static final String UQ_SF_REPORTS = "fldra_UQ_SF_REPORTS";
    	public static final String HCCC_CALCULATE_TUITION_AND_FEE = "fldra_HCCC_CALCULATE_TUITION_AND_FEE";
    	public static final String HCCC_MAINTAIN_RECEIVABLES = "fldra_HCCC_MAINTAIN_RECEIVABLES";
    	public static final String HCCC_BILL_CUSTOMERS = "fldra_HCCC_BILL_CUSTOMERS";
    	public static final String HCCC_RUN_CASHIERING = "fldra_HCCC_RUN_CASHIERING";
    	public static final String HCCC_ADMINISTER_PAYMENT_PLANS = "fldra_HCCC_ADMINISTER_PAYMENT_PLANS";
    	public static final String HCSF_IHC = "fldra_HCSF_IHC";
    	public static final String HCCC_COLLECT_RECEIVABLES = "fldra_HCCC_COLLECT_RECEIVABLES";
    	public static final String HCCC_ADMINISTER_SF_GL_INTERFAC = "fldra_HCCC_ADMINISTER_SF_GL_INTERFAC";
    	public static final String HCSF_ADMINISTER_STUDYLINK = "fldra_HCSF_ADMINISTER_STUDYLINK";
    	public static final String HCCC_MANAGE_TAX_REPORTING = "fldra_HCCC_MANAGE_TAX_REPORTING";
    	public static final String HCSF_BANKING = "fldra_HCSF_BANKING";
    	public static final String HCSF_SSF_STUDENT_FINANCIAL_NLD = "fldra_HCSF_SSF_STUDENT_FINANCIAL_NLD";
    }
    
    public static class cmnElements {
    	/**
    	 * This is common elements "id" locators enumerator class
	     */
    	public static final String SEARCHBUTTON = "#ICSearch";
    	public static final String CLEARBUTTON = "#ICClear";
    	public static final String FIRSTRESULT = "SEARCH_RESULT1";
    }

    public  DriverFactory() {
        initialize();
    }

    public void initialize() {

    	if (driver == null)
    		createNewDriverInstance();
    }

    private void createNewDriverInstance() {
    	
    	String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("chrome")) {
        	
        	DesiredCapabilities capability = DesiredCapabilities.chrome();
        	
//        	ChromeDriverManager.getInstance().setup();
        	ChromeOptions options = new ChromeOptions();
        	options.addArguments("test-type");
//        	options.addArguments("start-maximized");
        	options.addArguments("--js-flags=--expose-gc");  
        	options.addArguments("--enable-precise-memory-info"); 
        	options.addArguments("--disable-popup-blocking");
        	options.addArguments("--disable-default-apps");
        	options.addArguments("test-type=browser");
        	options.addArguments("disable-infobars");

        	String seleniumPort = System.getenv("SELENIUM_PORT");
        	if (seleniumPort == null || seleniumPort.isEmpty()) {
        		driver = new ChromeDriver(options);
        	} else {
                try {
                	driver = new RemoteWebDriver(new URL("http://localhost:" + seleniumPort + "/wd/hub"), capability);
                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
                    driver.manage().window().setSize(new Dimension(1080, 800));
        		} catch (MalformedURLException e) {
        			e.printStackTrace();
        		}
        	}
        } else {
            System.out.println("I cannot read browser type");
        }
        driver.manage().window().setSize(new Dimension(1080, 800));
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
    
    public static boolean switchFrame() {
    	
    	try {
    		Thread.sleep(timeout.SHORT);
    		driver.switchTo().defaultContent();
    		Thread.sleep(timeout.SHORT);
    		driver.switchTo().frame("ptifrmtgtframe");
    		Thread.sleep(timeout.SHORT);
    	} catch (Exception e) {
    		
    		DebugLog.Error("Unable to switch to frame: " + e);
    		
    	}	
		return true;
    }
    
    
	public static WebElement fluentElement(By locator) {
		
		new WebDriverWait(driver, timeout.PROCESSING)
			.until(ExpectedConditions.invisibilityOfElementLocated(By.id("processing")));
		
		WebElement element = (new WebDriverWait(driver, timeout.FLUENTWAIT, timeout.FLUENTPOLLING))
			.until(ExpectedConditions.elementToBeClickable(locator));
		
		new WebDriverWait(driver, timeout.PROCESSING)
			.until(ExpectedConditions.invisibilityOfElementLocated(By.id("processing")));
				
		return element;
	}
	
	public static WebElement frameElement(By locator) {
		
		driver.switchTo().defaultContent();
		
		int minIndex = 0;
		int maxIndex = 10;
		int maxRetries = 2;
		int retry = 0;
	
		while (true){
			
			if (retry > maxRetries) break;
			
			for(int i=maxIndex; i>minIndex; i--){
		         try {
	//	         	System.out.println("Trying to find frame with index: "+i);
		         	driver.switchTo().frame(i);
		         	System.out.println("Succesfully switched to frame with index"+i);
		         	try {
						Thread.sleep(timeout.TINY);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		         	try {
		         		driver.findElement(locator);
	         			System.out.println("Succesfully located the element within frame with index"+i);
	         			retry = maxRetries;
	         			break;
		         	} catch (NoSuchElementException e) {
	//	         		System.out.println("Element was not located within frame with index "+i);
		         	}
		         	
		         } catch (NoSuchFrameException e) {
	//	             System.out.println("Frame with index "+i+" not found");
		             try {
						Thread.sleep(timeout.TINY);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
		         }
			}
			retry++;
		}
				
	return fluentElement(locator);
	}

	/**
	 * @param path
	 * 			string, path to the menu item to navigate as seen in test cases, separated by ">" 
	 * 			ex:  "Student Financials > Bill Customers> Corporate Bills > Review Invoice".
	 * 			Will fail if actual link text is not equal to the path. No tolerance to typos
	 * @return
	 * 		  true if navigation was successful
	 */
	public static boolean menuNavigation(String path) {
		
		String[] links = path.split(">");
		
		for (String link: links) {
			
			link = link.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
	        System.out.println("Navigating to \""+link+"\"... ");
			driver.switchTo().defaultContent();
			fluentElement(By.linkText(link)).click();
	    }
		
		return true;
	}
}