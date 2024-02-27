
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "  channabasava adeppa nagwar bidar ";
		String vname = name.trim();
		 String[] para = name.split(" ");
		System.out.println(name.length());
		System.out.println(name.equals("basava")); //false //
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 8));
	    System.out.println(vname);
	    System.out.println(name.indexOf("adeppa"));
	   
	    
	   for (String i : para){
		   System.out.println(i);
		   
	   }
	}

}
