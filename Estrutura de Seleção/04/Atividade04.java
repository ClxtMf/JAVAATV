package Exercicios;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1, numero2, operacao, soma;

		System.out.println("Escolha: (1)Adi��o | (2) Subtra��o | (3) Multiplica��o | (4) Divis�o ");
		operacao = sc.nextInt();

		System.out.print("Digite o n�mero 1: ");
		numero1 = sc.nextInt();

		System.out.print("Digite o n�mero 2: ");
		numero2 = sc.nextInt();

		switch (operacao) {
		case 1:
			soma = numero1 + numero2;
			System.out.println("Resultado: " + soma);
			break;

		case 2:
			soma = numero1 - numero2;
			System.out.println("Resultado: " + soma);
			break;
		case 3:
			soma = numero1 * numero2;
			System.out.println("Resultado: " +soma);
			break;
		case 4:
			soma = numero1 / numero2;
			System.out.println("Resultado: " +soma);
		break;
		default: System.out.println("Opera��o n�o correta.");
		}
		sc.close();
	}

}
