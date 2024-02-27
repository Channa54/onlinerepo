package pack1;

public class Exceptionhandling {

	public static void main(String[] args) {
		
	//	compilere wont check the exception here arthmetic and array index outof bounds are the example for 
		// unchecked exception whereas file not found is an checked exception which insists us 
	// to add throws or try catch which has shown in demo.java //
		
		/*System.out.println("Hii");
	    int a = 10/0;   
		System.out.println("exception not handled ");*/
		
		
		
         try {
		     int b = 20/0 ;
         }
         catch (Exception e ) {
        	 e.printStackTrace();
        	 System.out.println(e.getMessage());
         }
	
		System.out.println("hello ");
	}

}
