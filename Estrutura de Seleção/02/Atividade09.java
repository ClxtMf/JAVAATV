package Exercicios;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano, soma;

		System.out.print("Digite em que ano voc� est�:");
		ano = sc.nextInt();

		soma = ano % 4;

		if (soma == 0) {
			System.out.println("O ano � bissexto!");
		} else {
			System.out.println("O ano n�o � bissexto");
		}
		sc.close();
	}

}