/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.ArtigoParaAlugar;
import interfaces.ArtigoParaVenda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pelosi
 */
public class Anunciante {

    private String nome;
    private Endereco endereco;
    private List<ArtigoParaVenda> artigosParaVender;
    private List<ArtigoParaAlugar> artigosParaAlugar;

    private static final String NOME_OMISSAO = "";

    /**
     *Construtor da classe Anunciante
     * @param nome
     * @param endereco
     */
    public Anunciante(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = new Endereco(endereco);
        this.artigosParaVender = new ArrayList<>(2);
        this.artigosParaAlugar = new ArrayList<>(3);
    }

    /**
     *Construtor da classe Anunciante
     * @param nome
     * @param rua
     * @param codPostal
     * @param localidade
     */
    public Anunciante(String nome, String rua, String codPostal, String localidade) {
        this.nome = nome;
        this.endereco = new Endereco(rua, codPostal, localidade);
        this.artigosParaVender = new ArrayList<>(2);
        this.artigosParaAlugar = new ArrayList<>(3);
    }

    /**
     *Construtor da classe Anunciante
     */
    public Anunciante() {
        this.nome = NOME_OMISSAO;
        this.endereco = new Endereco();
        this.artigosParaVender = new ArrayList<>(2);
        this.artigosParaAlugar = new ArrayList<>(3);
    }

    /**
     *Metodo get do endereco do anunciante
     * @return
     */
    public Endereco getEndereco() {
        return new Endereco(endereco);
    }


    /**
     *Metodo set do endereco do anunciante
     * @param endereco
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = new Endereco(endereco);
    }

    /**
     *Metodo get do nome do anunciante
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *Metodo get da lista de artigos vendaveis do anunciante
     * @return
     */
    public List<ArtigoParaVenda> getArtigosParaVender() {
        return artigosParaVender;
    }

    /**
     *Metodo get da lista de artigos alugaveis do anunciante
     * @return
     */
    public List<ArtigoParaAlugar> getArtigosParaAlugar() {
        return artigosParaAlugar;
    }

    /**
     *Metodo set do nome do anunciante
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *Metodo que adiciona um artigo a lista de vendaveis
     * @param artigoVenda
     * @return
     */
    public boolean addArtigoParaVender(ArtigoParaVenda artigoVenda) {

        if (artigosParaVender.size() == 2) {
            return false;
        } else {
            return artigosParaVender.add(artigoVenda);
        }
    }

    /**
     *Metodo que adiciona um artigo a lista de alugaveis
     * @param artigoAluguel
     * @return
     */
    public boolean addArtigoParaAlugar(ArtigoParaAlugar artigoAluguel) {
        if (artigosParaAlugar.size() == 3) {
            return false;
        } else {
            return artigosParaAlugar.add(artigoAluguel);
        }
    }

    /**
     *Metodo get para a quantidades de artigos alugaveis
     * @return
     */
    public int getQuantidadeProdutosParaAlugar() {
        return artigosParaAlugar.size();
    }

    /**
     *Metodo que retorna o alugavel mais caro do anunciante
     * @return
     */
    public ArtigoParaAlugar getAlugavelMaisCaro() {
        double maxAluguel = 0;
        ArtigoParaAlugar artigoMaisCaro = null;
        for (ArtigoParaAlugar a : artigosParaAlugar) {
            if (a instanceof Apartamento) {
                if (maxAluguel < ((Apartamento) a).getValorDeAluguel()) {
                    maxAluguel = ((Apartamento) a).getValorDeAluguel();
                    artigoMaisCaro = a;
                }
            }
            if (a instanceof Automovel) {
                if (maxAluguel < ((Automovel) a).getValorDeAluguel()) {
                    maxAluguel = ((Automovel) a).getValorDeAluguel();
                    artigoMaisCaro = a;
                }
            }

        }
        return artigoMaisCaro;
    }

    /**
     *Metodo que retorna o total de vendas possiveis 
     * @return
     */
    public double getTotalDeVendas() {
        double total_preco = 0;
        for (ArtigoParaVenda a : artigosParaVender) {
            if (a instanceof Telemovel) {
                total_preco += ((Telemovel) a).getValorDeVenda();
            }else if(a instanceof Automovel){
                total_preco += ((Automovel) a).getValorDeVenda();
            }
        }
        return total_preco;
    }

    @Override
    public String toString() {
        return String.format("Anunciante-> Nome: %s, Endereco: %s", nome, endereco.toString());
    }

}
