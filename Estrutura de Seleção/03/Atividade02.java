package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, soma;
		int operacao;

		System.out.print("Digite um n�mero:");
		num = sc.nextDouble();

		System.out.println("Escolha a opera��o: \n(1)Par ou �mpar;\n(2)Positivo ou negativo;\n(3)Inteiro ou decimal.");
		operacao = sc.nextInt();

		if (operacao == 1) {
			soma = num % 2;
			if (soma == 0) {
				System.out.println("Seu n�mero � par");
			} else {
				System.out.println("Seu n�mero � impar");
			}
		} else if (operacao == 2) {
			if (num > 0) {
				System.out.println("Seu n�mero � positivo");
			} else {
				System.out.println("Seu n�mero � negativo");
			}
		} else if (operacao == 3) {
			soma = (num * 10) % 10;

			if (soma > 0) {
				System.out.println("Seu n�mero � decimal");
			} else {
				System.out.println("Seu n�mero � inteiro");
			}
		}
		sc.close();
	}

}
