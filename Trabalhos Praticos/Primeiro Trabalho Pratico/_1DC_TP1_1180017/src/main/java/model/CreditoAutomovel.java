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
public class CreditoAutomovel extends Credito {

    private static float taxaJuroAnual = 6f;
    private static int prazoMinimoParaDesconto = 24;
    private static int totalAutomovel;
    private static float desconto = 1f;

    /**
     * Contrutor da classe CreditoAutomovel
     *
     * @param nome nome do cliente
     * @param profissao profissao do cliente
     * @param montante montante do cliente
     * @param prazo prazo a pagar do cliente
     */
    public CreditoAutomovel(String nome, String profissao, float montante, int prazo) {
        super(nome, profissao, montante, prazo);
        CreditoAutomovel.addTotalAuto();
    }

    /**
     * Contrutor da classe CreditoHabitacao sem parâmetros
     */
    public CreditoAutomovel() {
        super();
        CreditoAutomovel.addTotalAuto();
    }

    /**
     * Metodo que retorna o atributo desconto
     *
     * @return float com o valor do desconto
     */
    public float getDesconto() {
        return CreditoAutomovel.desconto;
    }

    /**
     * Metodo que atualiza o atributo desconto
     *
     * @param desconto novo valor do desconto
     */
    public void setDesconto(float desconto) {
        CreditoAutomovel.desconto = desconto;
    }

    /**
     * Metodo que retorna o atributo TaxaJuroAnual
     *
     * @return valor da taxaJuroAnual
     */
    public static float getTaxaJuroAnual() {
        return taxaJuroAnual;
    }

    /**
     * Metodo que atualiza o atributo taxaJuroAnuaç
     *
     * @param taxaJuroAnual nova taxaJuroAnual
     */
    public static void setTaxaJuroAnual(float taxaJuroAnual) {
        CreditoAutomovel.taxaJuroAnual = taxaJuroAnual;
    }

    /**
     * Metodo que retorna o atributo prazoMinimoParaDesconto
     *
     * @return int com o prazo minimo
     */
    public static int getPrazoMinimoParaDesconto() {
        return prazoMinimoParaDesconto;
    }

    /**
     * Metodo que atualiza o atributoprazoMinimoParaDesconto
     *
     * @param prazoMinimoParaDesconto novo prazo minimo
     */
    public static void setPrazoMinimoParaDesconto(int prazoMinimoParaDesconto) {
        CreditoAutomovel.prazoMinimoParaDesconto = prazoMinimoParaDesconto;
    }

    /**
     * Metodo que retorna o atributo totalAutomovel
     *
     * @return int com o numero total de instancias dessa classe criadas
     */
    public static int getTotalAutomovel() {
        return totalAutomovel;
    }

    /**
     * Adiciona um valor ao atributo totalAutomovel
     */
    public static void addTotalAuto() {
        totalAutomovel++;
    }

    @Override
    public String toString() {
        return String.format("CreditoHAutomovel: %s desconto: %.4f", super.toString(), desconto);
    }

    /**
     * Metodo que calcula todo o montante que o banco irá receber
     *
     * @return float com o valor a receber
     */
    @Override
    public float calcularMontanteAReceberPorCadaCredito() {
        float juros;
        float valor_mensal;
        int limite = super.getPrazo();
        float montante_inicial = super.getMontante();
        float amortizacao = montante_inicial / limite;
        float montante_a_receber = 0;
        for (int i = 0; i < limite; i++) {
            juros = montante_inicial * ((taxaJuroAnual / 100) / 12);
            valor_mensal = limite <= prazoMinimoParaDesconto ? (juros + amortizacao) * ((1 - (taxaJuroAnual / 100)) / 12) : (juros + amortizacao);
            montante_inicial -= amortizacao;
            montante_a_receber +=valor_mensal;
        }
        return montante_a_receber;
    }

    /**
     * Metodo que calcula somento o montante de juros que o banco irá receber no
     * fim do crédito
     *
     * @return float com o monatante do juros
     */
    @Override
    public float calcularMontanteTotalJuros() {
        int limite = super.getPrazo();
        float juros;
        float total_juros = 0;
        float montante_inicial = super.getMontante();
        for (int i = 0; i < limite; i++) {
            juros = montante_inicial * ((taxaJuroAnual / 100) / 12);
            total_juros += juros;
        }
        return total_juros;
    }
}
