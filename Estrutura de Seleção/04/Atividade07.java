package Exercicios;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcoes;
		
		System.out.println("Escolha o seu lanche: (5R$ | DOG�O | 1), (7R$ | X-SALADA | 2), (10R$ | X-BURGUER | 3), (6R$ | MISTO | 4), (15R$ | X-DACASA | 5)");
		
		opcoes = sc.nextInt();
		
		switch(opcoes){
		case 1: 
			System.out.println("VOC� ESCOLHEU O DOG�O, MELHOR DOG DA CIDADE =)\nFEITO COM P�O NA CHAPA COM 5 SALSICHAS, MAIONESE, BATATA PALHA, MOLHO, MILHO, TOMATE, SALAME, SALSICHA, BACON, PURE DE BATATA E DE BRINDE UMA COCA");
			System.out.println("CONFIRMAR PEDIDO? PRE�O: 5R$");
			break;
		case 2:
			System.out.println("VOC� ESCOLHEU O X-SALADA, MELHOR XIS DA CIDADE =)\nFEITO COM P�O NA CHAPA COM UM HAMBURGUER GG, TOMATE, PALMITO, ALFACE, PEPINO, MILHO, E DE BRINDA UMA COCA");
			System.out.println("CONFIRMAR PEDIDO? PRE�O: 7R$");
			break;
		case 3: 
			System.out.println("VOC� ESCOLHEU O X-BURGUER, MELHOR BURG�O DA CIDADE =)\nFEITO COM P�O NA CHAPA COM 3 HAMBURGUER GG, BACON, ONIONS FRITOS, TOMATE, ALFACE E DE BRINDE UMA COCA");
			System.out.println("CONFIRMAR PEDIDO? PRE�O: 10R$");
			break;
		case 4:
			System.out.println("VOC� ESCOLHEU O MISTO, O MELHOR P�O NA CHAPA DA CIDADE =)\nFEITO COM P�O NA CHAPA BEM APERTADO, 1 HAMBURGUER GG, QUEIJO, PRESUNTO E DE BRINDE UMA COCA");
			System.out.println("CONFIRMAR PEDIDO? PRE�O: 6R$");
			break;
		case 5:
			System.out.println("VOC� ESCOLHEU O DA CASA, N�O PRECISO NEM FALAR NADA.\nFEITO COM P�O NA CHAPA COM 5 SALSICHAS, 5 HAMBURGUER GG, MAIONESE, BATATA PALHA, MOLHO, MILHO, TOMATE, SALAME, SALSICHA, BACON, PURE DE BATATA, PALMITO, ALFACE, PEPINO, MILHO, ONIONS FRITOS, QUEIJO PRESUNTO E DE BRINDE 2 COCA");
			System.out.println("CONFIRMAR PEDIDO? PRE�O: 15R$");
			break;
			default: System.out.println("ESCOLHA OUTRO LANCHE!");
		}
		
		sc.close();
	}

}
