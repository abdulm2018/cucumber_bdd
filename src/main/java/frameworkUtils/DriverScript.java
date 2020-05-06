package frameworkUtils;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
			
		}
		
		
	}
	
	

}
