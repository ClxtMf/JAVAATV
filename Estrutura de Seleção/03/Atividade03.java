package Exercicios;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int resp1, resp2, resp3, resp4, resp5, total;

		System.out.print(
				"--------INTERROGAT�RIO--------\n-----RESPONDA AS PERGUNTAS-----\n-------(1) SIM | (0) N�O-------");
		System.out.print("\nTelefonou para a v�tima?");
		resp1 = sc.nextInt();

		System.out.print("\nEsteve no local do crime?");
		resp2 = sc.nextInt();

		System.out.print("\nMora perto da v�tima?");
		resp3 = sc.nextInt();

		System.out.print("\nDevia para a v�tima?");
		resp4 = sc.nextInt();

		System.out.print("\nJ� trabalhou com a v�tima?");
		resp5 = sc.nextInt();

		total = resp1 + resp2 + resp3 + resp4 + resp5;

		if (total <= 1) {
			System.out.println("----------Inocente----------");
		} else if (total == 2) {
			System.out.println("----------Suspeita----------");
		} else if (total == 3 || total == 4) {
			System.out.println("----------C�mplice----------");
		} else if (total == 5) {
			System.out.println("----------Assassino---------");
		} else {
			System.out.println("-----------ERROR-----------");
		}

		sc.close();
	}

}
