package model;

public abstract class ContribuinteSemRendimento extends Contribuinte {
	
	private float or;

	public ContribuinteSemRendimento(String nome, String morada, float or) {
		super(nome, morada);
		this.or = or;
	}

	public float getOr() {
		return or;
	}

	public void setOr(float or) {
		this.or = or;
	}
	
	

}
