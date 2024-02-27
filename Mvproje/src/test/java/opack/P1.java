package opack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class P1 {

	//public static void main(String[] args) {
		@Test
		public void methodA() {
		
		System.setProperty("webdriver.chromedriver.setup", "C:\\Users\\CADEPPA\\eclipse-workspace\\Mvproje\\drivers\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://talent.capgemini.com/in/");
          driver.manage().window().maximize(); 
          driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
          driver.findElement(By.linkText("Close")).click();
          driver.findElement(By.className("profil")).isDisplayed();
          System.out.println(driver.findElement(By.className("profil")).isDisplayed());
          driver.findElement(By.linkText("Leave Management System")).click();
        /*  Set<String> windowids = driver.getWindowHandles();
          
            Iterator<String> itr = windowids.iterator();
          while(itr.hasNext()) {
        	   
        	  String windowid = itr.next();
        	  driver.switchTo().window(windowid);
        	 if (driver.getCurrentUrl().equalsIgnoreCase("https://lms.in.capgemini.com/")) {
        		driver.findElement(By.className("btn btn-primary accordion-title-btn")).click();
        	 }
          }*/
          
             
              
              
              
	}

}
