import java.util.Scanner;

public class Atividade14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra, resultado;
		
		System.out.print("Digite uma palavra: ");
		palavra = sc.nextLine();
		resultado = reverso(palavra);
		System.out.println(resultado);
		sc.close();
	}

	static String reverso(String palavra) {
		String resultado, verso = palavra;
		StringBuilder strb = new StringBuilder(verso);
		String inverso = strb.reverse().toString();
		if(verso.equals(inverso)) {
			resultado =  "� um pal�ndromo";
		}else {
			resultado =  "N�o � um pal�ndromo";
		}
		return resultado;
	}
}