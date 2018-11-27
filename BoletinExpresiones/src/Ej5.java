
public class Ej5 {

	public static void main(String[] args) {
		
		int x = 10, y=19;
		
		boolean j = true, k = false;
		
		System.out.println(x == y || j);
		
		System.out.println( x >= y || x <= y && j );

		System.out.println(! j || j );
		
		System.out.println(! (k && k)); //Solo hay que añadir los parentesis entre k y k.
	}

}
