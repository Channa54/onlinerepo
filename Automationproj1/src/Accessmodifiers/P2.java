package Accessmodifiers;

public class P2  extends P1{

	private static int c = 2;
	private String d = "chammu";
	
	
	private static void methodC() {
		System.out.println("hii");
	}
	
	public static void main (String[]  args) {
		methodC();
		System.out.println(c);
	}
	
	
	// private cannot be applied to the class name it can be used for only variables and method 
	// its strictly private only to the class even inheritence cant work here //
	
}
