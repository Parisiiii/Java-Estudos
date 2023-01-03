package desafioProduto;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		Produto product = new Produto();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = entrada.nextLine(); 
		System.out.println("Price: ");
		product.price = entrada.nextDouble(); 
		System.out.println("Quantity in stock: ");
		product.quantity = entrada.nextInt(); 
		
		
		System.out.println();
		System.out.println(product);
		
		
		System.out.println();
		System.out.println("Enter the number of products to be added in the stock: ");
		int quantity = entrada.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in the stock: ");
		int quantityR = entrada.nextInt();
		product.removeProducts(quantityR);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		
		entrada.close();
	}
}
