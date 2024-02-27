package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
	
		HashSet<String> set = new HashSet<>();
		
		set.add("channa");  // here indexing is not present hence we can not use for each loop//
		set.add("basava");
		set.add("nagwar");
		
		for ( String j :set) {
			System.out.println(j);
		}
		System.out.println(set.size());  // iterator() is an method belongs to collection interface 
		                                   // but iterator() method returns Iterator interface and this Interface 
		                                    // has has next() and next() methods so we use it.
		
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
