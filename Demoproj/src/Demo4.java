import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CADEPPA\\eclipse-workspace\\Automationproj1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://talent.capgemini.com/in/");
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	driver.manage().window().fullscreen();
	//	driver.findElement(By.xpath("//span[contains(text(),'Goodbye, 2022! Hello, 2023!')]")).click();
	  //  driver.findElements(By.tagName("iframe")).size();
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement frame = driver.findElement(By.id("_hjRemoteVarsFrame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.linkText("Close")).click();
				
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='select-country']"));
		ele.click();
		//Select a = new Select(ele);	
		
		
		
		
	}

}
