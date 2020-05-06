package model;

public abstract class Contribuinte {
	
	private String nome;
	private String morada;
	
	
	
	private static final String NOME_OMISSAO = "Sem nome";
	private static final String MORADA_OMISSAO = "Sem morada";

	public Contribuinte(String nome, String morada) {
		super();
		this.nome = nome;
		this.morada = morada;
	}



	public Contribuinte() {
		this.nome = NOME_OMISSAO;
		this.morada	= MORADA_OMISSAO;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMorada() {
		return morada;
	}


	public void setMorada(String morada) {
		this.morada = morada;
	}


	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", morada=" + morada + "]";
	}
	
	
	public abstract float calcularImposto();

}
