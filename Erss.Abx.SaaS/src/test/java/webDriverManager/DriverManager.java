package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

private static WebDriver driver=null; //select the driver->Right click->source->set the getter getDriver
	
	public static void launchBrowser() {
		
		try {
			
			switch (Constants.Browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
				

			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
				
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static WebDriver getDriver() {
		return driver; //once set getter setter after this retun method is automatically created
	}
}
