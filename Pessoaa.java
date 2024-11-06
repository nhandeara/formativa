package avFormativa.desafios;

public class Pessoaa {
	private String nome;
	private Coracao coracao;
	
	public Pessoaa(String nome, int coracao) {
		this.nome = nome;
		this.coracao = new Coracao(coracao);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public int getCoracao() {
		this.coracao.getBatimentos();
	}
}
