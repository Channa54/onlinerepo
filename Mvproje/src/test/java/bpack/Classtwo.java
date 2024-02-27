package bpack;

import org.testng.annotations.BeforeTest;

public class Classtwo {

	@BeforeTest
	public void MethodTwo() {
		System.out.println("method two of class two executed  before test");
	}
	
	
}
