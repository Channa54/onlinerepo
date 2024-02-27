import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		String browser = " ";
		WebDriver driver = null;
		
		if ( browser.equalsIgnoreCase("chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\CADEPPA\\eclipse-workspace\\Demoproj\\driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("firefox")) {
             System.setProperty("webdriver.gecko.driver ", "C:\\Users\\CADEPPA\\eclipse-workspace\\Demoproj\\driver\\gecko.exe");
			
			driver = new FirefoxDriver();
		}
		
		
		
		
	}

}
