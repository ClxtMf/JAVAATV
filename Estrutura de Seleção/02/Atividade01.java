package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;

		System.out.print("Digite o n�mero 1: ");
		num1 = sc.nextInt();

		System.out.print("Digite o n�mero 2: ");
		num2 = sc.nextInt();

		System.out.print("Digite o n�mero 3: ");
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior �: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior �: " + num2);
		} else {
			System.out.println("O maior �: " + num3);
		}

		if (num1 < num2 && num1 > num3) {
			System.out.println("O do meio �: " + num1);
		} else if (num2 < num1 && num2 > num3) {
			System.out.println("O do meio �: " + num2);
		} else {
			System.out.println("O do meio �: " + num3);
		}

		if (num1 < num2 && num1 < num3) {
			System.out.println("O menor �: " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("O menor �: " + num2);
		} else {
			System.out.println("O menor �:" + num3);
		}

		sc.close();

	}

}
