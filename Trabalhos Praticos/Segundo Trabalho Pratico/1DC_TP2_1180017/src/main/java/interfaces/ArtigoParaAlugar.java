/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


/**
 *
 * @author Pelosi
 */
public interface ArtigoParaAlugar {

    /*
    *Taxa para aplicar no valor de aluguel visivel
    */
    public static final double TAXA_ALUGAR = 0.03;
    
    /**
     *Metodo abstrato que calcula o valor do aluguel
     * @return
     */
    public double valorDeAluguel();
    
}
