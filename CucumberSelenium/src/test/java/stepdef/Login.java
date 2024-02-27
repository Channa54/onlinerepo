package stepdef;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login{

	       WebDriver driver;
	       
	       @Before("@login")
	       public void init() {
	    	   
	       }
	       

		@Given("user is on login page")
		public void user_is_on_login_page() {
		   System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		   driver=new ChromeDriver();
		    driver.get("https://www.shoppersstop.com/#login");
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.xpath("//a[@class='signinwithemail']")).click();
		  
		}

	

			@When("user enters {string} and {string}")
			public void user_enters_and(String user, String pass) {
			driver.findElement(By.name("j_username")).sendKeys(user);
			driver.findElement(By.name("j_password")).sendKeys(pass);
			}






		@When("user clicks on submit button")
		public void user_clicks_on_submit_button() {
		   driver.findElement(By.id("loginajax")).click();
		}
		@Then("user is on home page")
		public void user_is_on_home_page() {
		   
		}

		

		@When("user enters credentials")
		public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) {
			   
			Map<String,String> map= dataTable.asMap(String.class, String.class);
			System.out.println(map.get("user"));
			System.out.println(map.get("pass"));
			System.out.println(map.get("mob"));
		}


		@Then("user is on same page")
		public void user_is_on_same_page() {
			   
		}


         @After()
         public void teardown() {
        	// driver.quit();
         }


	


}
