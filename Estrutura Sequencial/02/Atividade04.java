package Exercicio;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double altura, soma;

		System.out.println("Escreva sua altura para saber o pe�o ideal (Exemplo 1,60)");
		altura = sc.nextDouble();

		soma = (72.7 * altura) - 58;
		System.out.println("O seu pe�o ideal � " + soma);
		sc.close();
	}

}
