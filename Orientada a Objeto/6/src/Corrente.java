import java.util.ArrayList;
import java.util.Scanner;

public class Corrente extends Conta {
	static Scanner sc = new Scanner(System.in);

	static ArrayList<Corrente> listaCorrente = new ArrayList<Corrente>();

	private double limite;

	public void pagamento(int conta) {
		System.out.print("QUANTO VOC� DESEJA PAGAR? ");
		double pagamento = sc.nextDouble();

		if(Corrente.listaCorrente.get(conta).getLimite() < pagamento) {
			System.out.println("\nSEU LIMITE N�O PERMITE PAGAR ESSA QUANTIDADE!\n");
		}else {
		if (Corrente.listaCorrente.get(conta).getSaldo() < pagamento) {
			System.out.println("\nVOC� N�O TEM DINHEIRO PARA PAGAR!\n");
		} else {
			Corrente.listaCorrente.get(conta).setSaldo(Corrente.listaCorrente.get(conta).getSaldo() - pagamento);
			System.out.println("\nVOC� PAGOU R$" + pagamento + '\n');

		}
		}
	}

	public void deposito(int conta) {
		System.out.print("QUANTO VOC� DESEJA DEPOSITAR? ");
		double quantidade = sc.nextDouble();
		
			Corrente.listaCorrente.get(conta).setSaldo(Corrente.listaCorrente.get(conta).getSaldo() + quantidade);
			System.out.println("\nFOI DEPOSITADO EM SUA CONTA R$" + quantidade + '\n');

	}

	public void transferencia(int conta) {
		System.out.print("PARA QUAL CONTA VOC� DESEJA TRANSFERIR?");
		int contaTransferir = sc.nextInt();

		System.out.print("QUANTO VOC� QUER TRANSFERIR?");
		double quantidade = sc.nextDouble();
		
		if(Corrente.listaCorrente.get(conta).getLimite() < quantidade) {
			System.out.println("\nSEU LIMITE N�O PERMITE TRANSFERIR ESSA QUANTIDADE!\n");
		}else {
		if (Corrente.listaCorrente.get(conta).getSaldo() < quantidade) {
			System.out.println("\nVOC� N�O TEM DINHEIRO PARA TRANSFERIR!\n");
		} else {
			Corrente.listaCorrente.get(conta).setSaldo(Corrente.listaCorrente.get(conta).getSaldo() - quantidade);
			Corrente.listaCorrente.get(contaTransferir).setSaldo(quantidade);
			System.out.println("\nVOC� TRANSFERIU PARA A CONTA " + contaTransferir + " R$" + quantidade + '\n');

		}
		
		}
	}

	public String toString() {
		return super.toString() + "\nLIMITE: " + limite;
	}

	public Corrente() {
		super();
	}

	public Corrente(double saldo, String titular, String senha, boolean status, int numero, double limite) {
		super(saldo, titular, senha, status, numero);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
}