import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto, resultado;
		
		System.out.print("Digite o texto: ");
		texto = sc.next();
		
		resultado = verificacao(texto);
		System.out.println(resultado);
		sc.close();
	}

	static String verificacao(String texto) {
		String resultado;
		if (texto.toUpperCase().equals (texto)) {
			resultado = ("TODOS S�O MAISCULO");
		}else if(texto.toLowerCase().equals (texto)){
			resultado = ("todas s�o minusculo");
		}else {
			resultado = ("O TeXto � mIsto");
		}
		return resultado;
	}
}