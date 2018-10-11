import java.util.Random;

public class Determinar {

	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int numero =r.nextInt(100);
		System.out.println("numero: " + numero);
		
		if(numero%2==0) {
			System.out.println("Es un número par.");
		}
		
		else {
			System.out.println("Es un número impar.");
		}

	}

}
