package commonfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static WebDriver driver=null;
	public static Properties properties=null;

	//static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(CommonFunctions.class);
	public Properties propertiesLoadFile() throws IOException {

		FileInputStream fileinputstream=new FileInputStream("Config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;
	}
	@BeforeSuite	
	public void launchBrowser() throws IOException {
		//PropertyConfigurator.configure("log4j.properties");

		propertiesLoadFile();
		String browser =properties.getProperty("browser");
		String url=	properties.getProperty("url");
		String location = 	properties.getProperty("location");

		if(browser.equalsIgnoreCase("Chrome")){

			System.setProperty("webdriver.chrome.driver", location);
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		driver.manage().window().maximize();
		driver.get(url);


	}
	@AfterSuite
	public void closeBrowser() {



	}
}
