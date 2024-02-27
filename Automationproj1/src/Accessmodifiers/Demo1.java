package Accessmodifiers;

public abstract class Demo1 {

	public static void main(String[] args) {
		
		
		final  int a = 5;
      //      a = 10; can not change the value for final //
		 methodB();
			
		}
		
	public abstract  void methodA(); 
		
	private static void methodB() {
		System.out.println("hii");
	}
	
	}


