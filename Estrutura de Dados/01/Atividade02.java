import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alunos7 = 0;
		double medias[] = new double[10], notas[] = new double[4];

		for (int i = 0; i < 10; i++) {
			System.out.println("Aluno " + (i + 1));
			System.out.println("-----------------------");
			for (int ii = 0; ii < 4; ii++) {
				System.out.print("Digite sua " + (ii + 1) + " nota: ");
				notas[ii] = sc.nextDouble();
				medias[i] = medias[i] + notas[ii];
			}
			System.out.println("M�dia" + (i + 1) + ": " + (medias[i] / 4));
			if ((medias[i] / 4) > 7) {
				alunos7++;
			}
			System.out.println("-----------------------");
		}
		System.out.println("O n�mero de alunos com a m�dia maior de 7 �: " + alunos7);
		sc.close();
	}
}