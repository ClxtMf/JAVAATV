import java.util.Scanner;

public class Atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pergunta[] = {"Telefonou para a v�tima?", "Esteve no local do crime?", "Mora perto da v�tima?", "Devia para a v�tima?", "J� trabalhou com a v�tima?"};
		int resposta[] = new int[5], probabilidade = 0;
		String resultado[] = {"Suspeita", "C�mplice", "Assasino", "Inocente"};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(pergunta[i] + (" 1 - Sim / 2 - N�o"));
			resposta[i] = sc.nextInt();
			
			if(resposta[i] == 1) {
				probabilidade += resposta[i];
			}
		}
		if(probabilidade == 1) {
			System.out.println(resultado[3]);
		}
		else if(probabilidade == 2) {
			System.out.println(resultado[0]);
		}else if(probabilidade == 3) {
			System.out.println(resultado[1]);
		}else if(probabilidade == 4) {
			System.out.println(resultado[1]);
		}else if(probabilidade == 5) {
			System.out.println(resultado[2]);
		}
		sc.close();
	}
}