package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Products;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		System.out.println("Digite os Produtos");
		System.out.print("Nome");
		product.name = sc.nextLine();
		System.out.print("Preço");
		product.price = sc.nextDouble();
		System.out.print("Quantidade");
		product.quantity = sc.nextInt();
		//System.out.print(product.toString());
		System.out.println("Produtos " + product);
		
		System.out.print("Adicionar mais Produtos?");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Produtos " + product);
		
		System.out.print("Remover Produtos");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Remover Produtos " + product);
		sc.close();
	}

}







