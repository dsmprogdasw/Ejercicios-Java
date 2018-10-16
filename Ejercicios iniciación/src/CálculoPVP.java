import java.util.Scanner;

public class CálculoPVP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el precio: ");
		float precio = in.nextFloat();
		System.out.println("Tipo de IVA: (0) 7% - (1) 10% - (2) 21%");
		int tipoiva = in.nextInt();
		float iva = 0;
		if(tipoiva == 0)
			iva = 0.07f;
		else if (tipoiva == 1)
			iva = 0.1f;
		else if (tipoiva == 2) 
			iva = 0.21f;
		else
			System.out.println("El tipo de IVA no es correcto");

		if (tipoiva >= 0 && tipoiva <=2) {
			double totaliva = precio * iva;
			double total = precio + totaliva;
			System.out.println(total);
		}
		
		in.close();
				
	}

	
}
