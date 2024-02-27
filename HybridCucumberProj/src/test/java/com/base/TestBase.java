package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.exceptions.BrowserNotcompatibleException;

public class TestBase {

	public static WebDriver driver;
	
	   Properties prop;
	   String browser;
	   
	   public TestBase() {
		   prop = new Properties();
		   try {
			prop.load(new FileInputStream("config//config.properties"));
			browser=prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("ff"))
					{
			System.setProperty("webdriver.gecko.driver", "drivers//firefoxdriver.exe");
			    driver=new FirefoxDriver();
					}
			else if(browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "drivers//IEServer.exe");
				driver= new InternetExplorerDriver();
			}
			 else
			 { 
				throw new BrowserNotcompatibleException(browser+ "not supported");
			}
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrowserNotcompatibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
	   
	   public void init() {
		   driver.get(prop.getProperty("url"));
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }
	
	
}
