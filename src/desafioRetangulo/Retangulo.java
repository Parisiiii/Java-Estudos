package desafioRetangulo;

public class Retangulo {

	public double width;
	public double height;
	
	double Area() {
		return width * height;
	}
	
	double Perimeter() {
		return 2*(width + height);
	}
	
	double Diagonal() {
		double d = Math.pow(width, 2) + Math.pow(height, 2);
		double results = Math.sqrt(d);
		
		return results;
	}
	
	
	
}
