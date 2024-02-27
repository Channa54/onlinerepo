package pack1;

public class Exceptionhandling1 {

	public static void main(String[] args) {
		
		
		int [] a = new int [3];
		a[0] = 1;
		a[1] = 12;
		a[2] = 34;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		try {
		System.out.println(a[3]);     // array index out of bounds exception handled here using try catch //
		}
		catch (Exception e ) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("hi");

	}

}
