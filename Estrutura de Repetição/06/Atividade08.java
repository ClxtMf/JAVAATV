package Exercicios;

import javax.swing.JOptionPane;

public class Atividade08 {

	public static void main(String[] args) {
		
		String stringnumero = JOptionPane.showInputDialog("Digite qual tabuada voc� deseja ");
		int tabuada = (int) Double.parseDouble(stringnumero);
		
		String stringI = JOptionPane.showInputDialog("Em qual n�mero voc� deseja come�ar? ");
		int comeco = (int) Double.parseDouble(stringI);
		
		String terminar = JOptionPane.showInputDialog("Em qual n�mero voc� deseja terminar? ");
		int term = (int) Double.parseDouble(terminar);
		
		if(term < comeco) {
			JOptionPane.showMessageDialog(null, "Digite o n�mero inicial menor que o final");
		}
		
		int resultado;
		for(int i = comeco; i <= term ; i++) {
			resultado = tabuada * i;
			JOptionPane.showMessageDialog(null, tabuada + " x " + i + " = " + resultado);
		}
	}
}