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
		System.out.print("Pre�o");
		product.price = sc.nextDouble();
		System.out.print("Quantidade");
		product.quantity = sc.nextInt();
		//System.out.print(product.toString());
		System.out.print(product);
		
		sc.close();
	}

}







