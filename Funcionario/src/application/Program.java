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
		System.out.println("Digite o nome do Funcionário");
		employe.name = sc.nextLine();
		System.out.println("Digite o Salário Bruto");
		employe.grossSalary = sc.nextDouble();
		System.out.println("Taxa de imposto");
		employe.tax = sc.nextDouble();
		System.out.println("Funcionário: " + employe.name + ", Salário Bruto "+ employe.grossSalary);
		System.out.println("Salário Liquído: " + employe.netSalary());
		System.out.println();
		System.out.println("Terá aumento de salário?");
		double percentage = sc.nextDouble();
		System.out.println("Atual: " + employe.increaseSalary(percentage));
		sc.close();
	}

}
