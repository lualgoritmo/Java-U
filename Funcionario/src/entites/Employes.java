package entites;

public class Employes {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double percentage) {
		return netSalary() + (grossSalary * percentage) / 100;
	}
	
	public String toString( ) {
		return "Nome: " + name + ", " +
				"Salário Liquido R$: " 
				+ String.format("%.2f",netSalary());
	}
}
