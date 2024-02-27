package stepdef;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Registration {

        WebDriver driver;

		@Given("user is on signin page")
		public void user_is_on_signin_page() {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			   driver=new ChromeDriver();
			    driver.get("https://www.shoppersstop.com/#login");
			   driver.manage().window().maximize();
			   driver.findElement(By.linkText("Sign Up")).click();
			   
			   
			
		}


		@When("enters credentials")
		public void enters_credentials(io.cucumber.datatable.DataTable dataTable) {
		   
			Map<String,String> map = dataTable.asMap(String.class, String.class);
			driver.findElement(By.id("signupFullName")).sendKeys(map.get("firstname"));
			driver.findElement(By.id("signupEmail")).sendKeys(map.get("email"));
			driver.findElement(By.id("signupMobileNumber")).sendKeys(map.get("mobile"));
			driver.findElement(By.id("signupPassword")).sendKeys(map.get("pass"));
			driver.findElement(By.id("men")).click();
			
			 
			
			
			
		}
		@When("user clicks on continue btn")
		public void user_clicks_on_continue_btn() {
			//driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		}


      
	
	
	
	
	
}
