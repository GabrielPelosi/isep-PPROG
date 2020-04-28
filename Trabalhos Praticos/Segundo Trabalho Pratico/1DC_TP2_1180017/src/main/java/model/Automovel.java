/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.ArtigoParaAlugar;
import interfaces.ArtigoParaVenda;

/**
 *
 * @author Pelosi
 */
public class Automovel implements ArtigoParaVenda, ArtigoParaAlugar {
    private String marca;
    private String modelo;
    private double valorDeVenda;
    private double valorDeAluguel;

    /**
     *Construtor da classe automovel
     * @param marca
     * @param modelo
     * @param valorDeVenda
     * @param valorDeAluguel
     */
    public Automovel(String marca, String modelo, double valorDeVenda, double valorDeAluguel) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorDeVenda = valorDeVenda;
        this.valorDeAluguel = valorDeAluguel;
    }

    /**
     *Metodo get da Marca
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *Metodo set da Marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *Metodo get do Modelo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *Metodo set do Modelo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *Metodo get do valor de Venda
     * @return
     */
    public double getValorDeVenda() {
        return valorDeVenda;
    }

    /**
     *Metodo set do valor de Venda
     * @param valorDeVenda
     */
    public void setValorDeVenda(double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    /**
     *Metodo get do valor de aluguel
     * @return
     */
    public double getValorDeAluguel() {
        return valorDeAluguel;
    }

    /**
     *Metodo set do valor de aluguel
     * @param valorDeAluguel
     */
    public void setValorDeAluguel(double valorDeAluguel) {
        this.valorDeAluguel = valorDeAluguel;
    }

    /**
     *Metodo que retorna o valor de venda visivel na olxys
     * @return
     */
    @Override
    public double valorDeVenda() {
        return (valorDeVenda * (1 + (ArtigoParaVenda.TAXA_VENDA / 100)));
    }

    /**
     *Metodo que retorna o valor de aluguel visivel na olxys
     * @return
     */
    @Override
    public double valorDeAluguel() {
        return (valorDeAluguel * (1 + (ArtigoParaAlugar.TAXA_ALUGAR / 100)));
    }

    @Override
    public String toString() {
        return String.format("Automovel-> Marca: %s, Modelo: %s, Valor de Venda: %.2f, Valor de Aluguel: %.2f", marca, modelo, valorDeVenda, valorDeAluguel);
    }
    
    
    
    
}
