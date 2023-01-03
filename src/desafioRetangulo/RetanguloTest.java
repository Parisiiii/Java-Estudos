package desafioRetangulo;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloTest {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Retangulo r1 = new Retangulo();
		
		System.out.println("Enter the height of the retangle: ");
		r1.height = entrada.nextDouble();
		System.out.println("Enter the width of the retangle: ");
		r1.width = entrada.nextDouble();
		
		
		System.out.println("The Area of the retangle is: "+ r1.Area());
		System.out.println("The Perimeter of the retangle is: "+ r1.Perimeter());
		System.out.println("The Diagonal of the retangle is: "+ r1.Diagonal());
		
		entrada.close();
	}
}
