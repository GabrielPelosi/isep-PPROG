package pl2.pl2;

import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Data data3 = new Data(1999,07,27);
    	System.out.println(data3.toString());
    	
    	Calendar hoje = Calendar.getInstance();
    	
        Data data1 = new Data(hoje.get(Calendar.YEAR),
        		hoje.get(Calendar.MONTH),hoje.get(Calendar.DAY_OF_MONTH));
        System.out.println("data1 :" + data1.toString());
        
        Data data2 = new Data(1974,04,25);
        System.out.println("data2: " + data2.toAnoMesDiaString());
        
        if (data1.isMaior(data2)){
        	System.out.println("A data " + data1.toAnoMesDiaString() + " é maior");
        }else{
        	System.out.println("A data " + data2.toAnoMesDiaString() + " é maior");
        }
        
        System.out.println("Há " 
        + data1.calcularDiferenca(data2) 
        +" entre data1 e data2");
        
        System.out.println("Faltam " + data1.calcularDiferenca(2020, 12, 25)+ " para o Natal");
        
        if(data2.isAnoBissexto(1974)){
        	System.out.println("1974 é ano bissexto");
        }else {
        	System.out.println("1974 não é ano bissexto");
        }
        
        if(Data.isAnoBissexto(1974)){
        	System.out.println("1974 é ano bissexto");
        }else {
        	System.out.println("1974 não é ano bissexto");
        }
        
        System.out.println(data1.isMaior(data2, data3));
        
        System.out.println("eu vivi " + data1.calcularDiferenca(data3) + " dias");
    }
}
