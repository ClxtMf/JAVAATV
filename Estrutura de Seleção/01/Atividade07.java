package Exercicios;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1, num2, num3;

		System.out.print("Digite o numero 1: ");
		num1 = sc.nextDouble();

		System.out.print("Digite o numero 2: ");
		num2 = sc.nextDouble();

		System.out.print("Digite o numero 3: ");
		num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior �: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior �: " + num2);
		} else {
			System.out.println("O maior �: " + num3);
		}
		if (num1 < num2 && num1 < num3) {
			System.out.println("O menor �: " +num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("O menor �: " +num2);
		} else { 
			System.out.println(" O menor �:" +num3);
		}
		
		
		sc.close();
	}
}
