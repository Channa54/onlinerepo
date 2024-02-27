package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindowa {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CADEPPA\\eclipse-workspace\\Automationproj1\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.navigate().to("https://www.youtube.com/watch?v=t8tpRlgbStU&list=PLsjUcU8CQXGGJvTvqg5vmwEZcvok1luXd&index=14");
		 
		 driver.manage().window().maximize();
		 
	}

}

