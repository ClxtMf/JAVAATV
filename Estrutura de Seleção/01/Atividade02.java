package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;

		System.out.print("Digite um n�mero para saber se � positivo ou negativo: ");
		num1 = sc.nextDouble();

		if (num1 > 0) {
			System.out.println("Seu n�mero � positivo.");
		} else {
			System.out.println("Seu n�mero � negativo.");
			sc.close();
		}
	}

}
