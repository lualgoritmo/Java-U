package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Area;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Area area = new Area();
		
		System.out.print("Valor da Largura e Altura");
		System.out.println();
		area.width = sc.nextDouble();
		area.heigth = sc.nextDouble();
		
		System.out.println("Áreas: " + area);
		sc.close();
	}

}
