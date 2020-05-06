package main;

import model.*;

public class Main {
	
	public static void main (String args[]){
		
		TrabalhadorPeca tPeca = new TrabalhadorPeca("Jorge Sila",53,62);
		TrabalhadorHora tHora = new TrabalhadorHora("Carlos Miguel", 168, 4.50f);
		TrabalhadorComissao tComissao = new TrabalhadorComissao("Susana Ferreira",650.00f,4.25f, 2731.50f);
		
		Trabalhador[] arra = new Trabalhador[10];
		
		arra[0] = tPeca;
		arra[1] = tHora;
		arra[2] = tComissao;
		
		//6.1
		for(int i = 0; i< 3; i++)
			System.out.println(arra[i].toString() + "\n");
		
		
		//6.2
		for(int i = 0; i< 3; i++)
			if(arra[i] instanceof TrabalhadorHora) 
				System.out.println(arra[i].toString() + "\n ");
		
		
		//6.3
		for(int i = 0; i< 3; i++)
			System.out.println(arra[i].getNome() + " " +arra[i].calcularVencimento() +"\n ");
		
		
		
		
	}
}
