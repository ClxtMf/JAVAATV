import java.util.ArrayList;

public class Revisor extends Pessoa {

	private ArrayList<Livro> listaLivrosRevisor = new ArrayList<>();
	

	public Revisor(String nome, String cpf, String sobrenome, String email, String genero, String senha) {
		super(nome, cpf, sobrenome, email, genero, senha);
	}

	public String listarLivros() {
		int vezes = 0;
		String livros = "", erro = "N�o h� nenhum livro Aguardando Revis�o";
		for (int i = 0; i < Livro.listaLivro.size(); i++) {
			if (Livro.listaLivro.get(i).getStatus().equals("Aguardando Revis�o")) {
				vezes += 1;
				livros += Livro.listaLivro.get(i).toString();
			}
		}
		if (vezes == 0) {
			return erro;
		} else {
			return livros;
		}
	}

	public void editarLivro() {
		int indiceLivro = Main.verificarLivro();
		if (indiceLivro != -1) {
			Livro.listaLivro.get(indiceLivro).setStatus("Em Revis�o");
		}
		if (Livro.listaLivro.get(indiceLivro).getStatus() == "Em Revis�o") {
			int status = Main.selecionaEdicao(indiceLivro);
			this.listaLivrosRevisor.add(Livro.listaLivro.get(indiceLivro));
			switch (status) {
			case 1:
				Livro.listaLivro.get(indiceLivro).setStatus("Reprovado");
				this.listaLivrosRevisor.remove(indiceLivro);
				break;
			case 2:
				if (Livro.listaLivro.get(indiceLivro).getQtdPaginas() == Livro.listaLivro.get(indiceLivro).getPaginaRevisao()) {
					Livro.listaLivro.get(indiceLivro).setStatus("Aprovado");
					this.listaLivrosRevisor.remove(indiceLivro);
				}
				break;
			case 3:
				Livro.listaLivro.get(indiceLivro).setStatus("Aguardando Revis�o");
				break;
			case 4:
				Livro.listaLivro.get(indiceLivro).setStatus("Aguardando Edi��o");
				this.listaLivrosRevisor.remove(indiceLivro);
				break;
			}
		}
	}

	@Override
	public String[] opcoes() {
		return new String[] { "(1) Listar Atividades", "(2) Listar seus Livros", "(3) Voltar" };
	}

	@Override
	public String toString() {
		return super.toString() + "Revisor []";
	}
	
	
	
	public ArrayList<Livro> getListaLivrosRevisor() {
		return listaLivrosRevisor;
	}

	public void setListaLivrosRevisor(ArrayList<Livro> listaLivrosRevisor) {
		this.listaLivrosRevisor = listaLivrosRevisor;
	}

	@Override
	public String listarAtividades() {
		String livros = "";
		for (int i = 0; i < this.listaLivrosRevisor.size(); i++) {
			livros += listaLivrosRevisor.get(i).toString();
		}
		return livros;
	}
}