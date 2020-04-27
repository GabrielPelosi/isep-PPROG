package main;

import model.*;

public class Main {

	public static void main(String args[]) {

		Reformado reformado = new Reformado("Jose", "123",1200,15000);
		Reformado reformado2 = new Reformado("Carlos", "1233",10000,50000);

		TrabalhadorOutrem outrem = new TrabalhadorOutrem("Miguel", "123123", "Apple",123123,1231238);
		TrabalhadorOutrem outrem2 = new TrabalhadorOutrem("Rafael", "123123123", "Google",999,99999);

		TrabalhadorProprio proprio = new TrabalhadorProprio("Abraao", "123", "Encanador",98769,987988);
		TrabalhadorProprio proprio2 = new TrabalhadorProprio("Gabriel", "113423", "Atletar",989789,978978978);

		Desempregado desempregado = new Desempregado("Luis", "123", 12,123);
		Desempregado desempregado2 = new Desempregado("Olavo", "1321323", 8,12343);

		Contribuinte array[] = new Contribuinte[15];
		
		array[0] = reformado;
		array[1] = reformado2;
		array[2] = outrem;
		array[3] = outrem2;
		array[4] = proprio;
		array[5] = proprio2;
		array[6] = desempregado;
		array[7] = desempregado2;
		
		for(Contribuinte a : array){
			if( a != null)
				System.out.println("Imposto: " + a.calcularImposto());
		}
		
		System.out.print("\n");
		
		for(Contribuinte a : array){
			if( a != null)
				System.out.println("Nome: " + a.getNome()+" Imposto: " + a.calcularImposto());
		}
	}
}
