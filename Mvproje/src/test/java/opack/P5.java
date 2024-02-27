package opack;

import org.testng.annotations.Test;

public class P5 {
	

	//public static void main(String[] args) {
		
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
   		
              
           
	}


