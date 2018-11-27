
public class Ej3 {

	public static void main(String[] args) {
		boolean a = true;
		
		boolean b = false;
		
		boolean c = true;
		
		System.out.println( a && b || a && c );
		
		System.out.println( (a || ! b) && (! a || c) );
		
		System.out.println(a || b && c);
		
		 System.out.println(! (a || b) && c); 

	}

}
