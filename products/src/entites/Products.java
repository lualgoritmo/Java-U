package entites;

public class Products {

	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removerProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ","
			+ quantity
			+ " Unidades, Total: $"
			+ String.format("$.2f",TotalValueInStock());
	}
}



