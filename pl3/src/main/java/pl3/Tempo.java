package pl3;

public class Tempo {

	private int hora;
	private int minuto;
	private int segundo;
	
	
	
	public Tempo(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	
	public void addSegundo(){
		int segundosTotal = (hora*3600) + (minuto*60) + segundo + 1;
		
		this.hora= (segundosTotal/ 3600);
		segundosTotal = segundosTotal/ 3600;
		this.minuto = segundosTotal/60;
		segundosTotal = segundosTotal/60;
		this.segundo = segundosTotal;
		
	}
	
	public boolean isMaior(Tempo outroTempo){
		int segundosTotal = (hora*3600) + (minuto*60) + segundo;
		int segundosTotalOutroTempo = (outroTempo.hora*3600) + (outroTempo.minuto*60) + outroTempo.segundo;
		return segundosTotal > segundosTotalOutroTempo;
		
	}
	
	public int diferençaSegundos(Tempo outroTempo) {
		int segundosTotal = (hora*3600) + (minuto*60) + segundo;
		int segundosTotalOutroTempo = (outroTempo.hora*3600) + (outroTempo.minuto*60) + outroTempo.segundo;
		return Math.abs(segundosTotal - segundosTotalOutroTempo);
	}

	public String diferençaTempo(Tempo outroTempo) {
		int segundosTotal = (hora*3600) + (minuto*60) + segundo;
		int segundosTotalOutroTempo = (outroTempo.hora*3600) + (outroTempo.minuto*60) + outroTempo.segundo;
		int diferenca = Math.abs(segundosTotal - segundosTotalOutroTempo);
		
		int hora =diferenca/ 3600;
		diferenca = diferenca/ 3600;
		int min = diferenca/60;
		diferenca = diferenca/60;
		int seg = diferenca;
		
		return hora + ":" + min + ":"+seg ;
	}
	
	public String toStringAMPM() {
		if (this.hora < 12){
			return  hora + ":" + minuto + ":" + segundo + "AM";
		}else if (this.hora == 12){
			return  hora + ":" + minuto + ":" + segundo + "PM";
		}else{
			int horaPM = hora - 12;
			return  horaPM + ":" + minuto + ":" + segundo + "PM";
		}
		
	}
	@Override
	public String toString() {
		return  hora + ":" + minuto + ":" + segundo;
	}
	
	
	
}
