package desafioTriangulo;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	
	Triangle(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	double CalcularArea(Triangle triangulo) {
		
		double p = (a + b + c) / 2;
		
		double area = Math.sqrt(p*(p - a) * (p - b) * (p - c));
		
		return area;
	}
}
