package application;

import java.util.Locale;
import java.util.Scanner;
import entites.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		System.out.println("Nome do Aluno");
		student.nameStudent = sc.nextLine();
		System.out.println("Primeira Nota");
		student.primeiroTrimestre = sc.nextDouble();
		System.out.println("Segunda Nota");
		student.segundoTrimestre = sc.nextDouble();
		System.out.println("Terceira Nota");
		student.terceiroTrimestre = sc.nextDouble();
		System.out.println("Média Final: " + student.mediaFinal());
		if(student.media() < 60.0) {
			System.out.println("Reprovado");
			System.out.println("Falto: " + student.media());
		}
		else {
			System.out.println("Aprovado" + student.mediaFinal());
		}
		sc.close();
	}

}
