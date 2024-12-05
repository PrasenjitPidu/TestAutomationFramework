package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver uiDriver;
	public static Properties prop = new Properties();
	public static FileReader file;
	
	public void openBrowser() throws IOException {
		if(uiDriver==null) {
			FileReader file = new FileReader("C:\\Users\\007pr\\PDas\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(file);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			uiDriver = new ChromeDriver();
			uiDriver.get(prop.getProperty("testurl"));
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			uiDriver = new FirefoxDriver();
			uiDriver.get(prop.getProperty("testurl"));
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			uiDriver = new EdgeDriver();
			uiDriver.get(prop.getProperty("testurl"));
		}
	}
	
	public void closeBrowser() {
		uiDriver.close();
	}
}