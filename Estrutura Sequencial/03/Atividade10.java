package Exercicios;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double p, i, n, total;

		System.out.println("Para saber o rendimento da sua poupan�a, digite o valor aplicado por m�s");
		p = sc.nextDouble();

		System.out.println("Agora digite o numero de meses aplicados");
		n = sc.nextDouble();

		System.out.println("Digite a taxa mensal");
		i = sc.nextDouble();

		total = p * (((1 + i) * n) - 1) / i;

		System.out.println("Seu rendimento �: " + total + " R$");
		sc.close();
	}

}
