package model;

public class TrabalhadorProprio extends ContribuinteComRendimento {
	
	
	private String profissao;
	
	private static float taxaRT = 0.03f;
	private static float taxaORInferior = 0.02f;
	private static float taxaORSuperior = 0.05f;
	
	
	public TrabalhadorProprio(String nome, String morada, String profissao, float or, float rt) {
		super(nome, morada, or, rt);
		this.profissao = profissao;
	}


	public String getProfissao() {
		return profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public static float getTaxaRT() {
		return taxaRT;
	}


	public static void setTaxaRT(float taxaRT) {
		TrabalhadorProprio.taxaRT = taxaRT;
	}


	public static float getTaxaORInferior() {
		return taxaORInferior;
	}


	public static void setTaxaORInferior(float taxaORInferior) {
		TrabalhadorProprio.taxaORInferior = taxaORInferior;
	}


	public static float getTaxaORSuperior() {
		return taxaORSuperior;
	}


	public static void setTaxaORSuperior(float taxaORSuperior) {
		TrabalhadorProprio.taxaORSuperior = taxaORSuperior;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Profissao: " + this.profissao;
	}


	@Override
	public float calcularImposto() {
		// TODO Auto-generated method stub
		if(super.getOr() <= 50000){
			return ((taxaORInferior * super.getOr()) + (taxaRT * super.getRt()));
		}else{
			return ((taxaORSuperior * super.getOr()) + (taxaRT * super.getRt()));
		}
	}
}
