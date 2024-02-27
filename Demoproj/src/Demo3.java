import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CADEPPA\\eclipse-workspace\\Demoproj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lms.in.capgemini.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		
		 driver.findElement(By.linkText("Apply Leave")).click();
		 
		Set<String> windowsid = driver.getWindowHandles();
		  Iterator<String> itr = windowsid.iterator();
		  
		 String parentwindow = itr.next();
		 String childwindow = itr.next();
		 driver.switchTo().window(childwindow);
		 
		String str = driver.findElement(By.cssSelector("#CurrentBalance")).getText();
		 
		System.out.println(str);
		
		
		
		
		
	}

}
