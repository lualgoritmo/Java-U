package entites;

public class Products {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStocks() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
