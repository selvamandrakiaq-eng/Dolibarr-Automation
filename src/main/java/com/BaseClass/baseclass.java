package com.BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseclass {

	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static   WebDriver launchBrowser() {
		
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> pref=new HashMap<>();
		pref.put("Credentials_enable_service", false);
		pref.put("profile.password_manager_enabled",false);
		pref.put("profile.password_manager_leak_detection",false);
		options.setExperimentalOption("prefs",pref);
		
		options.setExperimentalOption("prefs", pref);
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-features=passwordLeakDetection");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.dolibarr.org");
		return driver;

	}
	public static void closeBrowser() {
		driver.quit();
	}
	//click
	public void click (WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	//sendkeys
	public void sendkeys (WebElement element, String value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(value);
	
	}
	

	//windowhandles
		//parentwindow
		public  String getParentWindow() {
			return driver.getWindowHandle();
		}
		//switch to child window
		public void switchToChildwindow(String parentwindow) {
			for(String window : driver.getWindowHandles()) {
				if (!window.equals(parentwindow)) {
					driver.switchTo().window(window);
					break;
				}
			}
		}
		//switch back to parent
		public void switchtoparentwindow(String parentwindow) {
			driver.switchTo().window(parentwindow);
		}
		//close current windows & switch back to parent
		public void closeCurrentWindowAndReturn(String parentwindow) {
			driver.close();
			driver.switchTo().window(parentwindow);

		}
		
		//get url
		public String getURL() {
			return driver.getCurrentUrl();
		}
		// title text
		public void title(WebElement gettitle){
			 driver.getTitle();
		}
		//current URL
		public  String CurrentURL() {
			return driver.getCurrentUrl();
		}

		//scrolldown
		public void scrolldown(WebElement element) {
			WebElement resolved = element; 
			resolved.getTagName();
			new Actions(driver).moveToElement(resolved).perform();
		}

		//verification method
		public boolean isdisplayed (WebElement verification) {
			wait.until(ExpectedConditions.visibilityOf(verification));
			return verification.isDisplayed();

	}
	   // is Enabled
		public boolean isEnabled(WebElement element) {
			wait.until(ExpectedConditions.visibilityOf(element));
			 return element.isEnabled();
		}
		
		//gettext
		public  String gettext(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();
		}
	
		 

	    // Wait until element is visible
	       public WebElement waitForVisibility(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        return wait.until(ExpectedConditions.visibilityOf(element));
	    }
	       
	    // Wait until element is clickable
	       public WebElement waitForElementToBeClickable(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        return wait.until(ExpectedConditions.elementToBeClickable(element));
	    
	       }

		
        //switchtoNewwindow
		public String parentWindow;
	   public void switchToNewWindow() {
			parentWindow = driver.getWindowHandle();
			Set<String> allWindows = driver.getWindowHandles();
			
			for(String windowHandle : allWindows) {
				if(!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);
					break;
				}
			}
			
		}
	 //alerts
		public void acceptalert() {
			wait.until(ExpectedConditions.alertIsPresent()).accept();
		}
		public void dismissalert() {
			wait.until(ExpectedConditions.alertIsPresent()).dismiss();
		}
  
		public void jsClick(WebElement element) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			}
		public void switchToFrameByIndex(int index) {

		    driver.switchTo().frame(index);

		}

		public void switchToFrame(WebElement frameElement) {

		    driver.switchTo().frame(frameElement);

		}

		public void switchToDefaultContent() {

		    driver.switchTo().defaultContent();

		}
		

//enterkeys
     public static void pressEnter(WebElement element) {
    	 element.sendKeys(Keys.ENTER);
     }

//movetoelement
      
     public void moveToElement(WebElement element) {
    	 Actions actions = new Actions(driver);
    	 actions.moveToElement(element).perform();
     }
     
   //Uploadfile

 	public void uploadFile(WebElement upload, String filepath) {
 		wait.until(ExpectedConditions.visibilityOf(upload));
 		upload.sendKeys(filepath);
 		
 	}

     
   //Close dialog box
 	
 	public void closedialog() throws AWTException {
 		try {
 		 Robot robot = new Robot();
 		    robot.delay(3000);
 		    robot.keyPress(KeyEvent.VK_ESCAPE);
 		    robot.keyRelease(KeyEvent.VK_ESCAPE);
 	}catch(Exception e) {
 		e.printStackTrace();;
 	}
 	}
 	
 // Element Verify
 	public boolean verifyElement(WebElement element) {
 		 return element.isDisplayed()&& element.isEnabled();
 	 }
 	

     }




