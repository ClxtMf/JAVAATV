package Exercicios;

import javax.swing.JOptionPane;

public class Atividade02 {

	public static void main(String[] args) {
		
		int i;
		double precoFinal;
		
		String preco = JOptionPane.showInputDialog("DIGITE O PRE�O DO P�O: ");
		double number = Double.parseDouble(preco);
		
		for(i = 1; i <= 50; i++) {
			precoFinal = number * i;
			
			JOptionPane.showMessageDialog(null, "PRECO:"  + precoFinal);
		}
	}
}