import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero, contador = 0, media = 0;
		
		do {
			
			System.out.print("Digite um n�mero real: ");
			numero = sc.nextDouble();
			
			contador ++;
			
			media = media + numero;
			
		}while(numero > 0);
		
		contador= contador - 1;
		
		media = media / contador;
		
		System.out.println("Voc� digitou " +contador+  " n�meros\nA m�dia desses d� " +media);
		
		sc.close();
	}

}
