package com.BaseClass;

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
		Map<String,Object> prefs=new HashMap<>();
		prefs.put("Credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled",false);
		options.setExperimentalOption("prefs",prefs);
		
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-save-password-bubble");
		
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
	
	//sendkey
	public void sendkeys(Keys enterKeys) {
	sendkeys(enterKeys);
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
	
		//gettext
		public  String gettext(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element)).getText();
		}
	
		 // Wait until element is present in DOM
	    public WebElement waitForPresence(By locator) {
	        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	    }

	    // Wait until element is visible
	    public WebElement waitForVisibility(By locator) {
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    }

	    // Wait until element is clickable
	    public WebElement waitForClickable(By locator) {
	        return wait.until(ExpectedConditions.elementToBeClickable(locator));
	    }

	    // Wait until alert is present
	    public Alert waitForAlert() {
	        return wait.until(ExpectedConditions.alertIsPresent());
	    }

	    // Wait until URL contains text
	    public boolean waitForUrlContains(String value) {
	        return wait.until(ExpectedConditions.urlContains(value));
	    }

	    // Wait until title contains text
	    public boolean waitForTitleContains(String value) {
	        return wait.until(ExpectedConditions.titleContains(value));
	    }
	    public WebElement waitForClickable(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        return wait.until(ExpectedConditions.elementToBeClickable(element));
	    }
	    public WebElement waitForVisibility(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        return wait.until(ExpectedConditions.visibilityOf(element));
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
		public void enterText(WebElement element,String value) {
			element.clear();
			element.sendKeys(value);
			}
		

//enterkeys
     public static void pressEnter(WebElement element) {
    	 element.sendKeys(Keys.ENTER);
     }
}