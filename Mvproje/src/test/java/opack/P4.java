package opack;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class P4 {

	//public static void main(String[] args) {
	@Test
	public void Automation() throws Exception{
		
		
		int a = 5;                                           
		
		if (a<18 ) {
			
			
			throw new SkipException("a cannot be less than 18 ");
		}
		
		// if we want to manually throw an exception we use throw new Exception in java//
		// but to skip an exception we use SkipNew Exception in TestNg //
		// Exception is predifined class of java //
		// SkipException is predefined class of testng //
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
