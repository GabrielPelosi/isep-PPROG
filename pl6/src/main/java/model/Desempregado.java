package model;

public class Desempregado extends ContribuinteSemRendimento{
	
	

	private int mesesParagem;
	
	private static float taxaOR = 0.01f;
	
	
	public Desempregado(String nome, String morada, int mesesParagem, float or) {
		super(nome, morada, or);
		this.mesesParagem = mesesParagem;
	}


	public int getMesesParagem() {
		return mesesParagem;
	}


	public void setMesesParagem(int mesesParagem) {
		this.mesesParagem = mesesParagem;
	}


	public static float getTaxaOR() {
		return taxaOR;
	}


	public static void setTaxaOR(float taxaOR) {
		Desempregado.taxaOR = taxaOR;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Meses de Paragem: " + this.mesesParagem;
	}


	@Override
	public float calcularImposto() {
		// TODO Auto-generated method stub
		return (taxaOR * super.getOr());
	}
	
}
