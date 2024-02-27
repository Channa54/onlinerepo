import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProject1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CADEPPA\\eclipse-workspace\\Demoproj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://lms.in.capgemini.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.navigate().to("https://www.youtube.com/playlist?list=PLsjUcU8CQXGGJvTvqg5vmwEZcvok1luXd");
		driver.get("https://lms.in.capgemini.com/");
		 driver.findElement(By.linkText("Apply Leave")).click();
		WebElement ele= driver.findElement(By.cssSelector("#ALDescription"));
		  ele.sendKeys("sick");
		  Thread.sleep(10000);
		  ele.clear();
		  
		 String str = driver.findElement(By.linkText("Apply Leave")).getText();
		 System.out.println(str);
		 
	     
	}
	
	

}
