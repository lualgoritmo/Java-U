package application;

import java.util.Locale;

import java.util.Scanner;
import entites.Employes;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Employes employe = new Employes();
		System.out.println("Digite o nome do Funcion�rio");
		employe.name = sc.nextLine();
		System.out.println("Digite o Sal�rio Bruto");
		employe.grossSalary = sc.nextDouble();
		System.out.println("Taxa de imposto");
		employe.tax = sc.nextDouble();
		System.out.println("Funcion�rio: " + employe.name + ", Sal�rio Bruto "+ employe.grossSalary);
		System.out.println("Sal�rio Liqu�do: " + employe.netSalary());
		System.out.println();
		System.out.println("Ter� aumento de sal�rio?");
		double percentage = sc.nextDouble();
		System.out.println("Atual: " + employe.increaseSalary(percentage));
		sc.close();
	}

}
