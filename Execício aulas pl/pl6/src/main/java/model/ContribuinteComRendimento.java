package model;

public abstract class ContribuinteComRendimento extends Contribuinte{
	
	private float or;
	private float rt;
	public ContribuinteComRendimento(String nome, String morada, float or, float rt) {
		super(nome, morada);
		this.or = or;
		this.rt = rt;
	}
	public float getOr() {
		return or;
	}
	public void setOr(float or) {
		this.or = or;
	}
	public float getRt() {
		return rt;
	}
	public void setRt(float rt) {
		this.rt = rt;
	}
	
	

}
