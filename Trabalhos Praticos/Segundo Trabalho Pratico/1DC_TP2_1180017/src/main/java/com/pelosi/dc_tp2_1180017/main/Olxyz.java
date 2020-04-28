/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pelosi.dc_tp2_1180017.main;

import interfaces.ArtigoParaAlugar;
import java.util.List;
import model.*;

/**
 *
 * @author Pelosi
 */
public class Olxyz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. Criac o contentor
        Anunciante array[] = new Anunciante[5];

        //2. 3. .4 criar as instancias
        //anunciante 1 e seus artigos
        Endereco end1 = new Endereco("rua abc", "4800-001", "porto");
        Anunciante anunciante1 = new Anunciante("gabriel", end1);
        Telemovel tel_anunciante1 = new Telemovel("iPhone", 999);
        Apartamento ap_anunciante1 = new Apartamento(end1, 0, 0);
        Automovel carro_anunciante1 = new Automovel("bmw", "x6", 1234, 423);
        anunciante1.addArtigoParaAlugar(ap_anunciante1);
        anunciante1.addArtigoParaAlugar(carro_anunciante1);
        anunciante1.addArtigoParaVender(tel_anunciante1);

        //artigos do anunciante 2
        Endereco end2 = new Endereco("rua def", "4800-001", "maia");
        Anunciante anunciante2 = new Anunciante("jhon", end2);
        Automovel carro_anunciante2 = new Automovel("jeep", "jeep_123", 123, 123);
        Telemovel tel_anunciante2 = new Telemovel("Xiaomi", 123);
        Endereco end_ap_anunciante2 = new Endereco("rua mmmmmmm", "4800-001", "Rio de Janeiro");
        Apartamento ap_anunciante2 = new Apartamento(end_ap_anunciante2, 1233, 1456);
        anunciante2.addArtigoParaVender(tel_anunciante2);
        anunciante2.addArtigoParaVender(carro_anunciante2);
        anunciante2.addArtigoParaAlugar(ap_anunciante2);

        //anuncainte 3
        Endereco end3 = new Endereco("rua ghi", "4800-001", "povoa");
        Anunciante anunciante3 = new Anunciante("jose", end3);
        Apartamento ap_anunciante3 = new Apartamento(end3, 12333, 14564);
        Endereco end_ap2_anunciante3 = new Endereco("rua jkl", "4800-001", "vila do conde");
        Apartamento ap2_anunciante3 = new Apartamento(end_ap2_anunciante3, 12333, 14564);
        anunciante3.addArtigoParaAlugar(ap_anunciante3);
        anunciante3.addArtigoParaAlugar(ap2_anunciante3);

        array[0] = anunciante1;
        array[1] = anunciante2;
        array[2] = anunciante3;

        //5. quantidade de artigos para alugar na plataforma
        System.out.println("\n\n### QUESTÃO 5 ###");
        int total_artigos_aluguel = 0;
        for (int i = 0; i < 3; i++) {
            total_artigos_aluguel += array[i].getQuantidadeProdutosParaAlugar();
        }
        System.out.println("### Total de artigos para alugar no site -> " + total_artigos_aluguel);

        //6. toString e total de vendas de cada anunciante
        System.out.println("\n\n### QUESTÃO 6 ###");
        for (int i = 0; i < 3; i++) {
            if (!array[i].getArtigosParaVender().isEmpty()) {
                System.out.println(String.format("Anunciante: %s , Total de possíveis vendas: %.2f", array[i].toString(), array[i].getTotalDeVendas()));
            } else {
                System.out.println("O anunciante: " + array[i].getNome() + " não possui artigos de venda.");
            }
        }
        
        //7. qual alugavel pode vai gerar mais lucro de cada anunciante
        System.out.println("\n\n### QUESTÃO 7 ###");
        ArtigoParaAlugar artigoLucro = null;
        for (int i = 0; i < 3; i++) {
            artigoLucro = array[i].getAlugavelMaisCaro();
            if (artigoLucro != null) {
                System.out.println(String.format("O alugavel que mais poderá gerar lucro a Olxyz é o -> %s"
                        + "Do anunciante-> %s ", artigoLucro.toString(),array[i].getNome()));
                if (artigoLucro instanceof Apartamento) {
                    System.out.println(String.format("Gerando um lucro de-> %.2f\n", artigoLucro.valorDeAluguel() - ((Apartamento) artigoLucro).getValorDeAluguel()));
                }else if(artigoLucro instanceof Automovel){
                    System.out.println(String.format("Gerando um lucro de-> %,2f\n", artigoLucro.valorDeAluguel() - ((Automovel) artigoLucro).getValorDeAluguel()));
                }
            }else{
                System.out.println(String.format("O anunciante-> %s não possui artigos para alugar\n", array[i].getNome()));
            }
        }
    }
}
