package desafioTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class TriangleTest {
	public static void main(String[] args) {
		
		Triangle x,y;
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangle X:");
		double aX = entrada.nextDouble();
		double bX = entrada.nextDouble();
		double cX = entrada.nextDouble();
		
		x = new Triangle(aX,bX,cX);
		
		System.out.println("Enter the measures of triangle Y:");
		double aY = entrada.nextDouble();
		double bY = entrada.nextDouble();
		double cY = entrada.nextDouble();
		
		y = new Triangle(aY,bY,cY);
		
		System.out.println("Triangle X area: " + x.CalcularArea(x));
		System.out.println("Triangle Y area: " + y.CalcularArea(y));
		
		if(x.CalcularArea(x) > y.CalcularArea(y)) {
			System.out.println("Larger area: Triangle X");
		} else {
			System.out.println("Larger area: Triangle Y");
		}
		
		
		entrada.close();
	}
}
