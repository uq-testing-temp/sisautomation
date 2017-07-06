package util;
import java.io.File;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinition.DriverFactory;
public class CustomFunctions extends DriverFactory {
	
	private static String date = LocalDateTime.now().toString().replaceAll("[^a-zA-Z0-9]", "");;
	
	public CustomFunctions(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}


	public static void PrintScreenShot(String scenarioname) {
	    
		String path;
	
	    try {
	    	
			DebugLog.LogInfo.info("Taking a screenshot " + scenarioname + date);
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        path = "./target/screenshots/" + scenarioname + date + ".png";
	        FileUtils.copyFile(source, new File(path));
	        
	    } catch(Throwable e) {
	    	
	        DebugLog.LogInfo.warn("Failed to capture screenshot: " + e.getMessage());
	        
	    }
	    
	}

}