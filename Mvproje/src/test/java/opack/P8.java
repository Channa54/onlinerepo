package opack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P8 {

	
	@BeforeClass
	public void beforemethd() {
		System.out.println("Hii");
	}
	
	
	
	@Test(priority=1)
	public void Registration() {
		
		System.out.println("registation done succesfully");
	}
	  @Test(priority=2)
       public void Login() {
		
		System.out.println("login done succesfully");
	}
	   @Test(priority=3)
       public void logout() {
			
			System.out.println("logout  done succesfully");
		}
	   @AfterClass
		public void Aftermethd() {
			System.out.println("bye");
		}
		
	
	
	
}
