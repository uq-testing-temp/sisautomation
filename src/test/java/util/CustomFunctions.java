package util;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.opencsv.CSVReader;

import pageclasses.StudentFinancialsPage;
import stepDefinition.DriverFactory;
public class CustomFunctions extends DriverFactory {
	
	static long unixTime = System.currentTimeMillis() / 1000L;
	
	
	public CustomFunctions(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}


	public static void PrintScreenShot(String scenarioname) {
	    
		String path;
	
	    try {
	    	
	    	String time = Objects.toString(unixTime).replaceAll("[^a-zA-Z0-9]", "");
			DebugLog.LogInfo.info("Taking a screenshot " + scenarioname + time);
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        path = "./target/screenshots/" + scenarioname + time + ".png";
	        FileUtils.copyFile(source, new File(path));
	        
	    } catch(Throwable e) {
	    	
	        DebugLog.LogInfo.warn("Failed to capture screenshot: " + e.getMessage());
	        
	    }
	    
	}
	
		@SuppressWarnings("resource")
		public static HashMap<String, String> readCSV(String csvFile) throws Throwable {
        
		csvFile = "src/data/" + csvFile;
		
        CSVReader reader = null;
        
        reader = new CSVReader(new FileReader(csvFile));
        String[] line;
        
        HashMap<String, String> hmap = new HashMap<String, String>();
        
        while ((line = reader.readNext()) != null) {

        	hmap.put(line[0], (line[1]).replaceAll("^\\s+", "").replaceAll("\\s+$", ""));
        }
        
        /* Display content using Iterator*/
        Set<?> set = hmap.entrySet();
        Iterator<?> iterator = set.iterator();
        
        while(iterator.hasNext()) {
        	@SuppressWarnings("rawtypes")
			Map.Entry mentry = (Map.Entry)iterator.next();
           	System.out.print("Reading data... key is: "+ mentry.getKey() + " value is: ");
           	System.out.println(mentry.getValue());
        }

        return hmap;
	}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public static void fluentwait(WebElement element) {
			
			Wait wait = new FluentWait(driver)
				    .withTimeout(10000, TimeUnit.MILLISECONDS)
				    .pollingEvery(500, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);

			wait.until(ExpectedConditions.visibilityOf(element));
		}


		public static WebElement fluentElement(By locator) {
			
			WebElement element = (new WebDriverWait(driver, 10))
					   .until(ExpectedConditions.elementToBeClickable(locator));
			
			return element;
		}


		public static void checkElementPresense(String element) {
			
			driver.switchTo().defaultContent();
			String bodyText = fluentElement(By.tagName("body")).getText();
			boolean outsideFrame = bodyText.contains(element);
			
			switchFrame();
			String bodyTextFrame = fluentElement(By.tagName("body")).getText();
			boolean withinFrame = bodyTextFrame.contains(element);
			Assert.assertTrue(element + " element not found!", outsideFrame||withinFrame);
		}


		public static String getRandomLong() {
			
			int value = ThreadLocalRandom.current().nextInt(100000, 9999999);
			return Integer.toString(value);
		}
		
		public static boolean navigateTo(String id) throws InterruptedException {
			driver.switchTo().defaultContent();
			fluentElement(By.id(id)).click();
			return true;	
		}
		
		public static boolean navigateToByTextField(String linkText) throws InterruptedException {

			menuNavigation(linkText);
			
			return true;	
		}


		public static void menujourney(String csvFile) throws InterruptedException {
			
			HashMap<String, String> hmap = null;
			try {
				hmap = CustomFunctions.readCSV(csvFile);
			} catch (Throwable e) {
				e.printStackTrace();
			}
			
	        Set<?> set = hmap.entrySet();
	        Iterator<?> iterator = set.iterator();
	        
	        while(iterator.hasNext()) {
	        	@SuppressWarnings("rawtypes")
				Map.Entry mentry = (Map.Entry)iterator.next();
	           	System.out.print("Navigating to menu "+ mentry.getKey() + " with element id: ");
	           	System.out.println(mentry.getValue());
	           	Thread.sleep(timeout.SHORT);
	           	Assert.assertTrue(navigateTo((String) mentry.getValue()));
	        }
		}
		
		public static void menujourneyByTextFields(String csvFile) throws InterruptedException {
			
			HashMap<String, String> hmap = null;
			try {
				hmap = CustomFunctions.readCSV(csvFile);
			} catch (Throwable e) {
				e.printStackTrace();
			}
			
	        Set<?> set = hmap.entrySet();
	        Iterator<?> iterator = set.iterator();
	        
	        while(iterator.hasNext()) {
	        	@SuppressWarnings("rawtypes")
				Map.Entry mentry = (Map.Entry)iterator.next();
	           	String link = (String) mentry.getValue();
	           	System.out.print("Navigating to menu item \"" + link + "\"");
	           	System.out.println(link);
	           	Thread.sleep(timeout.SHORT);
	           	Assert.assertTrue(navigateToByTextField(link));
	        }
		}


		public static boolean checkFrameElementPresense(String element) {
			String bodyTextFrame = frameElement(By.tagName("body")).getText();
			boolean withinFrame = bodyTextFrame.contains(element);
			return withinFrame;
		}


		public static void recordToDB(String arg1) {
			// TODO Implement connector to artefacts DB
			
		}


		public static void navigateToWEB(String arg1) {
			driver.navigate();
			
		}


		public static void getFees(String arg2) {
			// TODO Lookup fees via DB
			
		}


		public static String getRecordToDB(String arg1) {
			// TODO Implement connector to artefacts DB
			return "1440";
			
		}
}
