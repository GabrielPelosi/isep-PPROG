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
public interface ArtigoParaVenda {
    /*
    *Taxa para aplicar no valor de venda visivel
    */
    public static final double TAXA_VENDA = 0.05;

    /**
     *Metodo abstrato que calcula o valor de venda
     * @return
     */
    double valorDeVenda();
    
}
