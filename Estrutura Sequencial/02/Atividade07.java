package Exercicio;

import java.util.Scanner;

public class Atividade07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, total, inss, sind, ir, bruto;
		int hora;
		
		System.out.println("Para saber as informa��es sobre seu sal�rio digite a quantidade de horas trabalhadas no m�s");
		hora = sc.nextInt();
		System.out.println("Agora digite o quanto voc� ganha por hora");
		salario = sc.nextDouble();
		total = hora * salario;
		inss = total * 0.08;
		ir = total * 0.11;
		sind = total * 0.05;
		bruto = total - (total * 0.24);
		
				
		System.out.println("O seu sal�rio l�quido  � " + total + " reais");
		System.out.println("O seu Imposto de Renda � " + ir + " reais");
		System.out.println("O seu INSS � " + inss + " reais");
		System.out.println("O seu sindicato � " + sind + " reais");
		System.out.println("O seu sal�rio bruto � " + bruto + " reais" );
		sc.close();
	}

}
