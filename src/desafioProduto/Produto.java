package desafioProduto;

public class Produto {
	public String name;
	public double price;
	public int quantity;
	
	//Produto(String name, double price, int quantity){
	//	this.name = name;
	//	this.price = price;
	//	this.quantity = quantity;		
	//}
	
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}


	@Override
	public String toString() {
		return "Product data: " + name + ", $" + String.format("%.2f", price) + ", " + quantity + " units. Total: $" + String.format("%.2f", TotalValueInStock());
	}
}
