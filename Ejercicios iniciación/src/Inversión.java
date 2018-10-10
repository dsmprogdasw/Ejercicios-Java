import java.util.Scanner;

public class Inversión {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float capital;
//		float retribución;
		
		System.out.println("Introduce el capital: ");
		capital = teclado.nextFloat();
/*		retribución = capital * .02f;
		System.out.println("retribución: " + retribución);
																														//concatenar: unir dos trozos de texto
*/
		System.out.println("retribución: " + capital * .02f);
		teclado.close();
	}

}
