package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, soma;

		System.out.println("Digite um n�mero para saber se ele � inteiro ou decimal");
		num = sc.nextDouble();

		soma = (num * 10) % 10;

		if (soma > 0) {
			System.out.println("Seu n�mero � decimal");
		} else {
			System.out.println("Seu n�mero � inteiro");

			sc.close();
		}
	}

}
