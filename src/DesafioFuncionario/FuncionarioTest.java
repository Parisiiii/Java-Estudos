package DesafioFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioTest {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		System.out.println("Employer name: ");
		f1.nome = entrada.next();
		
		System.out.println("Gross Salary: ");
		f1.grossSalary = entrada.nextDouble();
		
		System.out.println("Tax: ");
		f1.tax = entrada.nextDouble();
		
		System.out.println("Net Salary: ");
		System.out.println(f1.NetSalary());
		
		System.out.println("How much you want increse salary?");
		double percentage = entrada.nextDouble();
		f1.increaseSalary(percentage);
		
		System.out.println("Dados Atualizados: " + f1);
		
		
		entrada.close();
	}
}
