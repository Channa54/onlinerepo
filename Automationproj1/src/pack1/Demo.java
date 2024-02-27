package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
	

		File file = new File("C:\\New folder\\Doc.txt");
		file .exists();
		
		System.out.println(file .exists()); 
		
		FileReader fr = new FileReader(file);  // checked exception.
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = br.readLine();
		
		if ( str!= null) {
			
			for (int i =0 ; i<str.length();i++) {
				System.out.println(str);
			}
		
	    
		}
}
	
}
