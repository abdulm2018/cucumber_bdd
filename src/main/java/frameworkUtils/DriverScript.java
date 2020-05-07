package frameworkUtils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverScript extends CoreUtils{
	public static  PropertiesReader config = new PropertiesReader(FrameworkParameters.configFilePath);
	public  static void launchBrowser(){
		if(config.getData("BrowserName").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohsin\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver =new ChromeDriver(options);
			//return new ChromeDriver(options);
			
		}else if(config.getData("BrowserName").equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
			InternetExplorerOptions options = new InternetExplorerOptions().destructivelyEnsureCleanSession().ignoreZoomSettings().introduceFlakinessByIgnoringSecurityDomains().enablePersistentHovering();
			driver =new InternetExplorerDriver(options);
			driver.manage().window().maximize();
		}
		
		
	}
	
	

}
