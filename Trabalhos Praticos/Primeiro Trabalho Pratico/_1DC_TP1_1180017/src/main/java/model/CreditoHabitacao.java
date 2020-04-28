/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Pelosi
 */
public class CreditoHabitacao extends Credito {
    
    private float spread;
    
    private static float euribor=0.1f;
    private static int totalHabitacao;
    
    private static final float SPREAD_OMI = 0.0f;
    
    /**
     *Contrutor da classe CreditoHabitacao
     * @param nome nome do cliente
     * @param profissao profissao do cliente
     * @param montante montante do cliente
     * @param prazo prazo a pagar do cliente
     * @param spread spread do cliente
     */
    public CreditoHabitacao(String nome, String profissao, float montante, int prazo, float spread) {
        super(nome, profissao, montante, prazo);
        this.spread = spread;
        CreditoHabitacao.addTotalHab();
    }

    /**
     *Contrutor da classe CreditoHabitacao sem parâmetros
     */
    public CreditoHabitacao() {
        super();
        this.spread = SPREAD_OMI;
        CreditoHabitacao.addTotalHab();
    }

    /**
     *Metodo que retorna o atributo Spread
     * @return float com o valor do spread
     */
    public float getSpread() {
        return spread;
    }


    /**
     *Metodo que retorna o atributo Euribor
     * @return float com a t aax euribor
     */
    public static float getEuribor() {
        return euribor;
    }

    /**
     *Metodo que atualiza o atributo Euribor
     * @param euribor novo valor da taxa euribor
     */
    public static void setEuribor(float euribor) {
        CreditoHabitacao.euribor = euribor;
    }

    /**
     *Metodo que retorna o atributo TotalHabitacao
     * @return int com o valor de instancias dessa classe criadas
     */
    public static int getTotalHabitacao() {
        return totalHabitacao;
    }

    /**
     *Metodo que adiona um valor ao atributo totalHabitacao
     */
    public static void addTotalHab(){
        totalHabitacao++;
    }
    
    @Override
    public String toString() {
       return String.format("CreditoHabitacao: %s spread: %.2f", super.toString() , spread);        
    }

    /**
     *Metodo que calcula todo o montante que o banco irá receber 
     * @return float com o valor a receber
     */
    @Override
    public float calcularMontanteAReceberPorCadaCredito() {
        return calcularMontanteTotalJuros() + super.getMontante();//a espera do e mail
    }

    /**
     *Metodo que calcula somento o montante de juros que o banco irá receber no fim do crédito
     * @return float com o monatante do juros
     */
    @Override
    public float calcularMontanteTotalJuros() {
        int prazo_limite = super.getPrazo();
        float montante_inicial = super.getMontante();
        float total_juros=0;
        float amortizacao = super.getMontante() / super.getPrazo();
        for (int i = 0; i < prazo_limite; i++) {
            float juros = montante_inicial *(((spread /100) /12) + (euribor / 100) /12);
            total_juros +=juros;
            montante_inicial -=amortizacao;//a espera do e mail
        }
        
        return total_juros; // a espera do e mail
    }
    
    
    
}
