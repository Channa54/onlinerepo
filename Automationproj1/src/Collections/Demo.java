package Collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		List<Double> alist = new ArrayList<>();
		list.add(3);
		list.add(2);                // List is a parent interface of arraylist class //
		list.add(6);
		list.add(7);                  // indexing is present here where as in hash set its not posiible //
     System.out.println(list.size());
		/*for( Integer i : list) {
			System.out.println(i);
		}*/
		
		for ( Integer j=0; j<list.size();j++) {
			System.out.println(list.get(j));
		}
		
	}
}
