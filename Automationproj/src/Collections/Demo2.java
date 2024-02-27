package Collections;

import java.util.HashMap;

public class Demo2 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "chanu");
		map.put(11, "basava"); // in the collections the values are stored in the form of objects 
		                         // where as in the arrays thay are stored as values //
		map.put(12, "nagwar");
		map.put(10, "bidar");
		map.put(14, "nirna");
		 
		System.out.println(map.get(12));
		
		for ( Integer i : map.keySet()) {
			System.out.println(i);
		}
	}

}
