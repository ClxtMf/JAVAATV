package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, soma;

		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();

		soma = numero % 5;

		switch (soma) {
		case 0:
			System.out.println("O n�mero � divisivel por 5.");
			break;
		default:
			System.out.println("O n�mero n�o � divisivel por 5.");
			break;
		}

		sc.close();
	}
}
