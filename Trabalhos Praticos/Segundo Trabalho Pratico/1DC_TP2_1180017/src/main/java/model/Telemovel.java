/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.ArtigoParaVenda;

/**
 *
 * @author Pelosi
 */
public class Telemovel implements ArtigoParaVenda{
    private String designacao;
    private double valorDeVenda;

    /**
     *Construtor da classe Telemovel
     * @param designacao
     * @param valorDeVenda
     */
    public Telemovel(String designacao, double valorDeVenda) {
        this.designacao = designacao;
        this.valorDeVenda = valorDeVenda;
    }

    /**
     *Metodo get da Designacao
     * @return
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     *Metodo set da Designacao
     * @param designacao
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     *Metodo get do valor de venda
     * @return
     */
    public double getValorDeVenda() {
        return valorDeVenda;
    }

    /**
     *Metodo set do valor de venda
     * @param valorDeVenda
     */
    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    /**
     *Metodo que retorna o valor de venda visivel na olxys
     * @return
     */
    @Override
    public double valorDeVenda() {
        return (valorDeVenda * (1 + (ArtigoParaVenda.TAXA_VENDA / 100)));
    } 

    @Override
    public String toString() {
        return String.format("Telemovel-> Designação: %s, Valor de Venda: %.2f", designacao,valorDeVenda);
    }
    
    
}
