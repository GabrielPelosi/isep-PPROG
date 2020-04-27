package pl3;

public class MainTempo {

	public static void main(String args[]){
		
		Tempo t1 = new Tempo(23,59,59);
		
		System.out.println(t1.toString());
		
		t1.addSegundo();
		
		System.out.println(t1.toString());
		
		Tempo t2 = new Tempo(12,12,12);
		
		System.out.println(t1.isMaior(t2));
		
		System.out.println(t1.diferenšaSegundos(t2));
		
		System.out.println(t1.diferenšaTempo(t2));
		
		System.out.println(t1.toStringAMPM());
		
		System.out.println(t2.toStringAMPM());
		
	}
}
