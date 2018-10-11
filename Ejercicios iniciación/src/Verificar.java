import java.util.Random;

public class Verificar {

	public static void main(String[] args) {
		Random r = new Random(System.nanoTime());
		int X =r.nextInt(10);
		int Y =r.nextInt(5);
		System.out.println("X: " + X);
		System.out.println("Y: " + Y);
		
		if(X%Y==0) {
			System.out.println(X + " es divisible por " + Y);
		}
		
		else {
			System.out.println(X + " no es divisible por " + Y);
		}
	}

}
