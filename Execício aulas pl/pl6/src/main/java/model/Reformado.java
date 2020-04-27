package model;



public class Reformado extends ContribuinteComRendimento {
	
	
	
	
	private static float taxaRT = 0.01f;
	private static float taxaOR = 0.03f;
	
	
	public Reformado(String nome, String morada, float or, float rt) {
		super(nome, morada, or, rt);
	}
	
	
	public static float getTaxaRT() {
		return taxaRT;
	}
	public static void setTaxaRT(int taxaRT) {
		Reformado.taxaRT = taxaRT;
	}
	
	
	public static float getTaxaOR() {
		return taxaOR;
	}
	public static void setTaxaOR(int taxaOR) {
		Reformado.taxaOR = taxaOR;
	}


	@Override
	public String toString() {
		return super.toString();
	}


	@Override
	public float calcularImposto() {
		return ((taxaRT * super.getRt())  + (taxaOR * super.getOr()));
	}

	
	
	

}
