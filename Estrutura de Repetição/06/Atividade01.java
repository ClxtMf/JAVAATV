package Exercicios;

import javax.swing.JOptionPane;

public class Atividade01 {
	public static void main(String[] args) {
		double precototal;
		double preco[] = new double[51];
				
		for(int i = 1; i <= 50; i++) {
			precototal = 1.99;
			preco[i] = precototal * i;
		} 
		
			JOptionPane.showMessageDialog(null, "<html><body>"
					+ "<tr><td> PRE�O 1 :" + preco[1] + " </td></tr>"
					+ "<tr><td> PRE�O 2 :" + preco[2] + "</td></tr>"
					+ "<tr><td> PRE�O 3 :" + preco[3] + "</td></tr>"
					+ "<tr><td> PRE�O 4 :" + preco[4] + "</td></tr>"
					+ "<tr><td> PRE�O 5 :" + preco[5] + "</td></tr>"
					+ "<tr><td> PRE�O 6 :" + preco[6] + "</td></tr>"
					+ "<tr><td> PRE�O 7 :" + preco[7] + "</td></tr>"
					+ "<tr><td> PRE�O 8 :" + preco[8] + "</td></tr>"
					+ "<tr><td> PRE�O 9 :" + preco[9] + " </td></tr>"
					+ "<tr><td> PRE�O 10 :" + preco[10] + "</td></tr>"
					+ "<tr><td> PRE�O 11 :" + preco[11] + "</td></tr>"
					+ "<tr><td> PRE�O 12 :" + preco[12] + "</td></tr>"
					+ "<tr><td> PRE�O 13 :" + preco[13] + "</td></tr>"
					+ "<tr><td> PRE�O 14 :" + preco[14] + "</td></tr>"
					+ "<tr><td> PRE�O 15 :" + preco[15] + "</td></tr>"
					+ "<tr><td> PRE�O 16 :" + preco[16] + " </td></tr>"
					+ "<tr><td> PRE�O 17 :" + preco[17] + "</td></tr>"
					+ "<tr><td> PRE�O 18 :" + preco[18] + "</td></tr>"
					+ "<tr><td> PRE�O 19 :" + preco[19] + "</td></tr>"
					+ "<tr><td> PRE�O 20 :" + preco[20] + "</td></tr>"
					+ "<tr><td> PRE�O 21 :" + preco[21] + "</td></tr>"
					+ "<tr><td> PRE�O 22 :" + preco[22] + "</td></tr>"
					+ "<tr><td> PRE�O 23 :" + preco[23] + "</td></tr>"
					+ "<tr><td> PRE�O 24 :" + preco[24] + " </td></tr>"
					+ "<tr><td> PRE�O 25 :" + preco[25] + "</td></tr>"
					+ "<tr><td> PRE�O 26 :" + preco[26] + "</td></tr>"
					+ "<tr><td> PRE�O 27 :" + preco[27] + "</td></tr>"
					+ "<tr><td> PRE�O 28 :" + preco[28] + "</td></tr>"
					+ "<tr><td> PRE�O 29 :" + preco[29] + "</td></tr>"
					+ "<tr><td> PRE�O 30 :" + preco[30] + "</td></tr>"
					+ "</table></body></html>", "TABELA", JOptionPane.PLAIN_MESSAGE);
	}
}