package Exercicios;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0, opcao;
		double nota, media, notaTotal = 0, maiorNota = 0, menorNota = 11;
		String nome;

		System.out.print("Digite o seu nome: ");
		nome = sc.next();

		do {

			contador++;
			System.out.print("Digite a sua " + contador + "� nota: ");
			nota = sc.nextDouble();

			System.out.print("Voc� deseja lan�ar outra nota? (1) Sim (2) N�o: ");
			opcao = sc.nextInt();

			if (nota < menorNota) {
				menorNota = nota;
			}
			if (nota > maiorNota) {
				maiorNota = nota;
			}

			notaTotal = notaTotal + nota;

		} while (opcao != 2);

		media = notaTotal / contador;
		System.out.println("A maior nota �: " + maiorNota);
		System.out.println("A menor nota �: " + menorNota);
		System.out.println("Quantidade de notas informadas: " + contador);
		System.out.printf("A media do aluno �: %.2f\n", media);

		if (media >= 7) {
			System.out.println(nome + " Voc� foi Aprovado");
		} else if (media > 4 && media < 7) {
			System.out.println(nome + " Voc� est� de Exame");
		} else if (media <= 4) {
			System.out.println(nome + " Voc� foi Reprovado");
		}
		sc.close();
	}
}