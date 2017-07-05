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
	
	public static int timeout=10;
	
	public CustomFunctions(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	

	
	
	public static void PrintScreenShot(String scenarioname) throws Throwable{
		
		LocalDateTime now = LocalDateTime.now();
		String date= now.toString();
		date=date.replaceAll("[^a-zA-Z0-9]", "");
		DebugLog.LogInfo.info("Taking a screenshot "+date+".jpg");
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(".//target/screenshots//"+date+scenarioname+".jpg"));
	}
	
}