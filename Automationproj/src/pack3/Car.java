package pack3;

public class Car {

	int cost;                          //instance variable //
	String type;
	int milage;
 
	public Car(int cost,String type,int milage) {
		
		this.cost=cost;
		this.type=type;   // this keyword is used to diffrenetiate instantance and parameterized variables
		                  // Constructors helps in intializing the variables //
		this.milage=milage;
				
	}

	public void startcar() {
		System.out.println("started ");
	}
	
	
	
	
	
	
	
}
