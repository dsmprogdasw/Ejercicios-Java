import java.util.Random;

public class Verificar {

	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int X =r.nextInt(10);
		int Y =r.nextInt(5);
		System.out.println("X: " + X);
		System.out.println("Y: " + Y);
		
		if(X%Y==0) {
			System.out.println("El número X es divisible entre el número Y");
		}
		
		else {
			System.out.println("El número X no es divisible entre el número Y");
		}
	}

}
