package DesafioFuncionario;

public class Funcionario {
	String nome;
	double grossSalary;
	double tax;
	
	double NetSalary() {
		return grossSalary - tax;
	}
	
	void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100;
	}

	@Override
	public String toString() {
		return nome + ", $" + String.format("%.2f", NetSalary());
	}
	
	

}
