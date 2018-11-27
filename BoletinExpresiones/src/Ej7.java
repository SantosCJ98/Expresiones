
public class Ej7 {

	public static void main(String[] args) {
		
		int lado1 = 3, hipotenusa = 5, lado2 = 4;
		
		double precio = 325.6;

		char ch = '7';
		
		boolean comprar = false;
		
		System.out.println(5 * precio - 1.50);
		
		System.out.println((precio < 300 + 0.1 * precio) || comprar);
		
		System.out.println(Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2)) == hipotenusa);
		
		// System.out.println((! comprar) && (precio + 125.3) );  No valida
		
		System.out.println( (ch <= 'A') && comprar );
		
		System.out.println(ch == '7' || ! comprar );
		
		
	}

}
