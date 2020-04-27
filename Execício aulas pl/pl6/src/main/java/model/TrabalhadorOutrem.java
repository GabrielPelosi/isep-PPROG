package model;

public class TrabalhadorOutrem extends ContribuinteComRendimento {
	
	private String nomeEmpresa;
	
	
	private static float taxaRTInferior = 0.01f;
	private static float taxaRTSuperior = 0.02f;
	private static float taxaOR = 0.02f;

	public TrabalhadorOutrem(String nome, String morada, String nomeEmpresa, float or, float rt) {
		super(nome, morada, or, rt);
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public static float getTaxaRTInferior() {
		return taxaRTInferior;
	}

	public static void setTaxaRTInferior(float taxaRTInferior) {
		TrabalhadorOutrem.taxaRTInferior = taxaRTInferior;
	}

	public static float getTaxaRTSuperior() {
		return taxaRTSuperior;
	}

	public static void setTaxaRTSuperior(float taxaRTSuperior) {
		TrabalhadorOutrem.taxaRTSuperior = taxaRTSuperior;
	}

	public static float getTaxaOR() {
		return taxaOR;
	}

	public static void setTaxaOR(float taxaOR) {
		TrabalhadorOutrem.taxaOR = taxaOR;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Nome da Empresa: " + this.nomeEmpresa;
	}

	@Override
	public float calcularImposto() {
		// TODO Auto-generated method stub
		if(super.getRt() <= 30000){
			return ((taxaRTInferior * super.getRt()) + (taxaOR * super.getOr()));
		}else{
			return ((taxaRTSuperior * super.getRt()) + (taxaOR * super.getOr()));
		}
	}

}
