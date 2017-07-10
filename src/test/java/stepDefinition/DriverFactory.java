package stepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import util.DebugLog;
import util.PropertyReader;


public class DriverFactory {
//TODO implement fluent waits
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
        public static final int LONG = 2000;
        public static final int XLONG = 5000;
        
    }
    
    public static class graduationStatus {
    	/**
    	 * This is a timeout enumerator class
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
    
    public static boolean switchFrame() {
    	
    	try {
    		
			driver.switchTo().defaultContent();
			driver.switchTo().frame("ptifrmtgtframe");
    	
    	} catch (Exception e) {
    		
    		DebugLog.Error("Unable to switch to frame: " + e);
    		
    	}
		return true;
    }
}