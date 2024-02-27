package opack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P2 {

	
	
	@Test
	public void methodA() {
		
		System.setProperty("webdriver.chromedriver.setup", "C:\\Users\\CADEPPA\\eclipse-workspace\\Mvproje\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=uvNdGd2FqUQ&list=PLsjUcU8CQXGGJvTvqg5vmwEZcvok1luXd&index=21");
        driver.manage().window().maximize(); 
        
		
		/*Actions a = new Actions(driver);
		WebElement eleme = driver.findElement(By.linkText("SkillPath"));
		a.moveToElement(eleme).click().perform();*/
		
		
		
		

	}

}
