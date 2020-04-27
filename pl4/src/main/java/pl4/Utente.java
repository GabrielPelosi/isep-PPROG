package pl4;

public class Utente {

	private String nome;
	private String genero;
	private int idade;
	private double altura;
	private double peso;
	
	private static final String NOME_OMISSAO = " Utente sem Nome";
	private static final String GENERO_OMISSAO = " Utente sem Nome";
	private static final int IDADE_OMISSAO = 0;
	private static final double ALTURA_OMISSAO = 0.0;
	private static final double PESO_OMISSAO = 0.0;
	
	
	public Utente() {
		this.nome = NOME_OMISSAO;
		this.genero= GENERO_OMISSAO;
		this.idade = IDADE_OMISSAO;
		this.altura= ALTURA_OMISSAO;
		this.peso = PESO_OMISSAO;
	}
	
	public Utente(String nome, int idade) {

		this.nome = nome;
		this.genero= GENERO_OMISSAO;
		this.idade = idade;
		this.altura= ALTURA_OMISSAO;
		this.peso = PESO_OMISSAO;
	}
	
	public Utente(String nome, String genero, int idade, double altura, double peso) {

		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public int diferencaIdade(Utente outroUtente) {
		return Math.abs(this.idade - outroUtente.idade);
	}
}
