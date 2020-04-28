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
public class CreditoEducacao extends Credito{

    private int periodoCarencia;
    
    private static float taxaJuroAnual = 2f;
    private static int totalEducacao;
    
    private static final int PERIODO_OMI =0;

    /**
     *
     * @param nome
     * @param profissao
     * @param montante
     * @param prazo
     * @param periodoCarencia
     */
    public CreditoEducacao( String nome, String profissao, float montante, int prazo ,int periodoCarencia) {
        super(nome, profissao, montante, prazo);
        this.periodoCarencia = periodoCarencia;
        CreditoEducacao.addTotalEdu();
    }

    /**
     *Construtor da classe CreditoEducacao
     */
    public CreditoEducacao() {
        super();
        this.periodoCarencia = PERIODO_OMI;
        CreditoEducacao.addTotalEdu();
    }

    /**
     *Metodo que retorna o period de carencia do credito
     * @return
     */
    public int getPeriodoCarencia() {
        return periodoCarencia;
    }


    /**
     *Metodo que busca a taxa de juros anual
     * @return float com o valor da taxa
     */
    public static float getTaxaJuroAnual() {
        return taxaJuroAnual;
    }

    /**
     *Metodo que  atualiza o atributo taxaJuroAnual
     * @param taxaJuroAnual nova taxaJuroAnual
     */
    public static void setTaxaJuroAnual(float taxaJuroAnual) {
        CreditoEducacao.taxaJuroAnual = taxaJuroAnual;
    }

    /**
     *Metodo que retorna o atributo totalEducacao
     * @return int com o numero total de instancias dessa classe criada
     */
    public static int getTotalEducacao() {
        return totalEducacao;
    }

    /**
     *Metodo que adiciona um valor a totalEducacao
     */
    public static void addTotalEdu(){
        totalEducacao++;
    }
    
    @Override
    public String toString() {
        return String.format("CreditoHabitacao: %s Periodo de Carencia: %d", super.toString() , periodoCarencia);
    }
    
    /**
     *Metodo que calcula todo o montante que o banco irá receber 
     * @return float com o valor a receber
     */
    @Override
    public float calcularMontanteAReceberPorCadaCredito() {
        return super.getMontante() + calcularMontanteTotalJuros();
    }

    /**
     *Metodo que calcula somento o montante de juros que o banco irá receber no fim do crédito
     * @return float com o monatante do juros
     */
    @Override
    public float calcularMontanteTotalJuros() {
        float juros, total_juros = 0;
        float montante_inicial = super.getMontante();
        float amortizacao = super.getMontante() / (super.getPrazo() - periodoCarencia);
        int prazo_limite = super.getPrazo();
        
        for (int i = 0; i < periodoCarencia; i++) {
            juros = montante_inicial * ((taxaJuroAnual / 100) / 12);
            total_juros += juros;
        }
        for (int i = periodoCarencia; i < prazo_limite; i++) {
            juros = montante_inicial * ((taxaJuroAnual / 100) / 12);
            total_juros += juros;
            montante_inicial -= amortizacao;//email
        } 
        return total_juros;
    }
    
}
