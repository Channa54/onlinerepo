package opack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class P3 {

	
	@Test
	public void methodA() {
		
		
		System.setProperty("webdriver.chromedriver.setup", "C:\\Users\\CADEPPA\\eclipse-workspace\\Mvproje\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=google&rlz=1C1GCEB_enIN976IN976&oq=google&aqs=chrome.0.0i131i355i433i512j46i131i199i433i465i512j0i131i433i512l5j5.2856j0j7&sourceid=chrome&ie=UTF-8");
		
         driver.manage().window().maximize();
         
	
	}

}
