
public class Ej6 {

	public static void main(String[] args) {
	
		final int MAX = 1000;
		
		int i, a = 3, b = 4;
		
		double x;
		
		char c;
		
		String s;
		
		//a
		
			i = (990 - MAX) / a; //Valida
		
			System.out.println("a) " + i);
		
		//b
			
			//i = b/0; No valida
			
		//c
		
		i = a % (MAX - 990);  //Válida

		System.out.println("c) " + i);
		
		//d
		
		i = (MAX - 990) % a;  //Válida
		
		System.out.println("d) " + i);
		
		//e
		
		//i = 3.34 * a;	 No valida
		
		//f
		
		x = a / b;
		
		System.out.println("f) " + x); //Valida
		
		//g
		
		// x = a % (a / b); No valida
		
		//h
		
		i = a / b;
		
		System.out.println("h) " + i); //Valida
		
		//i
		
		++a;
		
		System.out.println("i) " + a); //Valida
		
		//j
		
		a++;
	
		System.out.println("j) " + a); //Valida
		
		//k
		
		// c = '''; No valido
		
		//l
		
		c = '"'; //Valido
		
		System.out.println("l) " + c);
		
		//m
		
		// s = 'c'; //No valido
				
		//n
				
		s = "'"; // Valido
		
		System.out.println("n) " + s);
		
		//o
		
		//s = """; No Valido
		
		//p
		
		c='\u0041'; //Valido
		
		System.out.println("p) " + c);
		
		//q
		
		c=65; //Valido
		
		System.out.println("q) " + c);
		
		
		
		
		
		
		
		
		
		
		
	}

}
