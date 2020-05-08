package frameworkUtils;

import java.awt.Desktop.Action;
import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreUtils {
	public static RemoteWebDriver driver;
	public PropertiesReader config = new PropertiesReader(System.getProperty("user.dir")+File.separator+"config.properties");
	private WebDriverWait wait = new WebDriverWait(driver, 60);

	public void launchApplication(String url) {
		driver.get(config.getData("Url"));
	}

	public void waitForPresenceOfElement(By by) {
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	public void waitForPresenceOfAllElement(By by) {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
	}
	
	public void waitForElementToBeClickable(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public WebElement findElement(By by) {
		waitForPresenceOfElement(by);
		return driver.findElement(by);                                
	}
	public List<WebElement> findElements(By by){
		waitForPresenceOfAllElement(by);
		return driver.findElements(by);
	}

	public void clickElement(By element) {
		waitForElementToBeClickable(element);
		driver.findElement(element).click();
	}
	public void clickElement(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
		}
	public void pressEnterKey(By element) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(element).sendKeys(Keys.ENTER);
	}
	public void pressEscKey(By element) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(element).sendKeys(Keys.ESCAPE);
	}


	public void typeText(By element, String text) {
		waitForPresenceOfElement(element);
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(text);
		
	}
//--------------Mouse Hover-------------------	
	public void actionClick(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
		actions.click();
	}
	public void javaScriptClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		
	}
	
	public boolean isDisplayed(By webElement) {
		waitForPresenceOfElement(webElement);
		return driver.findElement(webElement).isDisplayed();
	}

	public void click(By element) {
		try {
			clickElement(element);
		}catch(ElementClickInterceptedException e) {
			javaScriptClick(driver.findElement(element));
		}catch(Exception e) {
			javaScriptClick(driver.findElement(element));
		}

	}
//---------------Some Extra Method for Click--------------------	
	public void clickWebelement(WebDriver driver, WebElement element) {
		
		try {
			
			element.click();
			
		}catch (WebDriverException e) {
			
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeAsyncScript("arguments[0].click;", element);
			  
		}
	}
//-------------------Action Mouse Hover-------------------------
	/*WebElement element = driver.findElement(By.xpath("?"));
	
	Actions action = new Actions(driver);
	
	action.moveToElement(element)*/
//-------------------------------------------------------------- 
	
	public void click(WebElement element) {

		try {
			clickElement(element);
		}catch(ElementClickInterceptedException e) {
			javaScriptClick(element);
		}catch(Exception e) {
			javaScriptClick(element);
		}
	}

}
