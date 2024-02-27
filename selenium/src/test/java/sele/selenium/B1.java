package sele.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1 {

	public static void main(String[] args) {
     
		
		
     WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=h9eLOA1ib3I&list=PLsjUcU8CQXGGJvTvqg5vmwEZcvok1luXd&index=11");
		driver.manage().window().maximize();
	}

}
