/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.ArtigoParaAlugar;

/**
 *
 * @author Pelosi
 */
public class Apartamento implements ArtigoParaAlugar{
    private Endereco endereco;
    private double area;
    private double valorDeAluguel;

    /**
     *Construtor da classe apartamento
     * @param endereco
     * @param area
     * @param valorDeAluguel
     */
    public Apartamento(Endereco endereco, double area, double valorDeAluguel) {
        this.endereco = new Endereco(endereco);
        this.area = area;
        this.valorDeAluguel = valorDeAluguel;
    }

    /**
     *Metodo get do endereco
     * @return
     */
    public Endereco getEndereco() {
        return new Endereco(endereco);
    }

    /**
     *Metodo set do endereco
     * @param endereco
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = new Endereco(endereco);
    }

    /**
     *Metodo get da area
     * @return
     */
    public double getArea() {
        return area;
    }

    /**
     *Metodo set da area
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
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
     *Metodo que retorna o valor de aluguel visivel na olxys
     * @return
     */
    @Override
    public double valorDeAluguel() {
        return (valorDeAluguel * (1 + (ArtigoParaAlugar.TAXA_ALUGAR)));
    }

    @Override
    public String toString() {
        return String.format("Apartamento-> Endereco: %s ,Area: %.2f ,Valor de Aluguel: %.2f", endereco.toString(), area, valorDeAluguel);
    }
    
    
}
