import java.util.Scanner;

public class Comisión {
	/*
	 * public static void main(String[] args) { Scanner teclado = new
	 * Scanner(System.in); float sueldo; float ventas;
	 * 
	 * System.out.println("Introduce sueldo base: "); sueldo = teclado.nextFloat();
	 * 
	 * System.out.println("Introduce el numero de ventas: "); ventas =
	 * teclado.nextFloat();
	 * 
	 * System.out.println("Comisión: " + 0.1f * ventas * sueldo); teclado.close();
	 * 
	 * System.out.println("Sueldo total: " + sueldo + 0.1f * ventas * sueldo);
	 * teclado.close();
	 */
	// CORRECION CLASE (public class Sueldo Vendedor)
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float venta1;
		//float venta2;
		//float venta3;
		float comision1;
		//float comision2;
		//float comision3;
		float sueldo = 1200;
		final float porcentaje = 0.1f;

		System.out.println("Valor de la venta 1: ");
		venta1 = teclado.nextFloat();
		comision1 = venta1 * porcentaje;
		sueldo += comision1;
		System.out.println("comision por la venta 1: " + comision1);
		
		
		/*System.out.println("Valor de la venta 1: ");
		venta1 = teclado.nextFloat();
		comision1 = venta1 * porcentaje;

		System.out.println("Valor de la venta 2: ");
		venta2 = teclado.nextFloat();
		comision2 = venta2 * porcentaje;

		System.out.println("Valor de la venta 3: ");
		venta3 = teclado.nextFloat();
		comision3 = venta3 * porcentaje;

		System.out.println("Valor comisión 1: " + comision1);
		System.out.println("Valor comisión 2: " + comision2);
		System.out.println("Valor comisión 3: " + comision3);

		System.out.printf("Comisión total: " + (comision1 + comision2 + comision3));
		teclado.close();
	*/
	}

}
