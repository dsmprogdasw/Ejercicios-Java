import java.util.Random;
import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);
	
	System.out.println("¿comprobar si un número es divisible entre otro?");
	String respuesta = in.next();
	while (respuesta.equals("s".toLowerCase())) {
		System.out.println("introduce un número: ");
		int x = in.nextInt();
		System.out.println("introduce otro número: ");
		int y = in.nextInt();
		
		if(x%y==0) {
			System.out.println(x + " es divisible por " + y);
		}
		else {
			System.out.println(x + " no es divisible por " + y);
			System.out.println("¿comprobar si un número es divisible entre otro?");
			respuesta = in.next();
		}
		
		

	}
	
		
	}



}
