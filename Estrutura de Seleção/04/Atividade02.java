package Exercicios;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, divisivel7, divisivel3, soma;
		
		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();
		
		divisivel7 = numero % 7;
		
		divisivel3 = numero % 3;
		
		soma = divisivel7+divisivel3;
		
		
		switch(soma){
			case 0: System.out.println("Seu n�mero � divisivel por 7 e 3.");
			break;
			default: System.out.println("Seu n�mero n�o � divisivel por 7 e 3.");
		}
		sc.close();
	}

}
