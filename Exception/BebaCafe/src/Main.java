import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static Pessoa pessoa = new Pessoa(false);
	static Caneca caneca = new Caneca(false, false);
	static Cafe cafe = new Cafe(-1);

	public static void main(String[] args) throws ErroCanecaVazia, ErroCafeFrio, ErroCafeQuente {
		if(caneca.getPegouCaneca() == false) {
		System.out.println("Bem-vindo(a), pegue a sua caneca e beba o seu caf� :)");
		}
		try {
			pegarCaneca();
		} catch (Exception exception) {
			System.out.println(exception.getMessage() + "\n");
		}finally {
			main(args);
		}
	}

	public static void pegarCaneca() throws ErroCanecaVazia, ErroCafeFrio, ErroCafeQuente, ErroSemCaneca {
		if (caneca.getPegouCaneca() == false) {
			caneca.setPegouCaneca(true);
			System.out.println("\nVoc� pegou a caneca!");
		}
		escolha();
	}
	
	public static void escolha() throws ErroCanecaVazia, ErroCafeFrio, ErroCafeQuente, ErroSemCaneca{
		System.out.println("(1) Beber (2) Encher de caf� (3) Deixar o Caf� na mesa");
		int opcao = sc.nextInt();
		System.out.println(Pessoa.escolheracao(opcao));
	}
}