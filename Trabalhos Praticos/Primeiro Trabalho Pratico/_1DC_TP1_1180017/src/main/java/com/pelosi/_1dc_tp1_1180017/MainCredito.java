/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pelosi._1dc_tp1_1180017;

import model.*;

/**
 *
 * @author Pelosi
 */
public class MainCredito {
    public static void main(String[] args) {
        //Criação das instancias
        CreditoHabitacao credHab1 = new CreditoHabitacao("Jose","Pedreiro",120000,240,1f);
        CreditoHabitacao credHab2 = new CreditoHabitacao("Miguel","Malabarista",25900,60,15f);
        
        CreditoEducacao credEd1 = new CreditoEducacao("Gabriel", "Arquiteto",18000,60,24);
        CreditoEducacao credEd2 = new CreditoEducacao("João", "Jardineiro",250000,240,60);
        
        CreditoAutomovel credAut1 = new CreditoAutomovel("Julia", "Professora", 12000, 24);
        CreditoAutomovel credAut2 = new CreditoAutomovel("Milena", "Ministra", 500000, 500);
        
        //Armazenamento das instnacias em um array do tipo Credito
        Credito array[] = new Credito[6];
        array[0]= credHab1;
        array[1]= credHab2;
        array[2]= credEd1;
        array[3]= credEd2;
        array[4]= credAut1;
        array[5]= credAut2;
        
        
        //Nome e valor que o banco irá receber no fim de cada crédito
        for (Credito aa: array) {
            System.out.println("Nome do cliente: " + aa.getNome() + " Montante total a receber no fim do crédito: " + aa.calcularMontanteAReceberPorCadaCredito());
            System.out.println(" ");
        }
        //Nome e valor total de juros que o banco irá receber
        for (Credito credito: array) {
            System.out.println("Nome do cliente: " + credito.getNome() + " Juros total a receber no fim do crédito: " + credito.calcularMontanteTotalJuros());
            System.out.println(" ");
        }
        
        //Out put dos números de instnacias craidas
        System.out.println("Totais de instancias criadas...");
        System.out.println("\nTotal de instancias de creditos de Habitação " + CreditoHabitacao.getTotalHabitacao());
        System.out.println("\nTotal de instnacias de creditod de Educação " + CreditoEducacao.getTotalEducacao());
        System.out.println("\nTotal de instnacias de creditod de Automóvel " + CreditoAutomovel.getTotalAutomovel());
        
        
        //total de juros a receber e total e créditos a receber de todos os clientes
        float total_juros=0;
        float total_montante = 0;
        for (Credito credito: array) {
            total_juros += credito.calcularMontanteTotalJuros();
            total_montante+= credito.calcularMontanteAReceberPorCadaCredito();
        }
        System.out.println(total_juros);
        System.out.println(total_montante);
    }
    
}
