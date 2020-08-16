package com.AutomationPractice.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.AutomationPractice.qa.util.TestUtility;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		prop = new Properties();
		FileInputStream file = null;
		try {
			file = new FileInputStream("C:\\Users\\shami\\ProjectsOfEclips\\shoppingWebsite\\src\\main\\java\\com\\AutomationPractice\\qa\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void intialization() {
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\shami\\ProjectsOfEclips\\shoppingWebsite\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\shami\\ProjectsOfEclips\\shoppingWebsite\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else
			{
				System.out.println("No Browser Avaliable");
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
	}

}
