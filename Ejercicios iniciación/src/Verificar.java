import java.util.Random;

public class Verificar {

	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int numerox =r.nextInt(10);
		int numeroy =r.nextInt(5);
		System.out.println("numerox: " + numerox);
		System.out.println("numeroy: " + numeroy);
		
		if(numerox%numeroy==0) {
			System.out.println("El número X es divisible entre el número Y");
		}
		
		else {
			System.out.println("El número X no es divisible entre el número Y");
		}
	}

}
