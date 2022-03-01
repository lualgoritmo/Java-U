package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Products;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Products product = new Products();
		
		System.out.println("Produto a ser inserido");
		System.out.print("Nome do Produto");
		product.name = sc.nextLine();
		System.out.print("Valor do Produto");
		product.price = sc.nextDouble();
		System.out.print("Quantidade do Produto");
		product.quantity = sc.nextInt();
		System.out.println(product.toString());
		sc.close();
	}

}
