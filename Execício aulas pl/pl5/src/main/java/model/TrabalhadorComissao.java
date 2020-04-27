package model;

/**
 * Representa um trabalhador � comiss�o atrav�s do seu nome, sal�rio base,
 * montante de vendas e percentagem da comiss�o de vendas.
 *
 * @author ISEP-DEI-PPROG
 */
public class TrabalhadorComissao extends Trabalhador {
 
    /**
     * O sal�rio base do trabalhador � comiss�o.
     */
    private float salarioBase;
 
    /**
     * O montante de vendas realizadas pelo trabalhador � comiss�o.
     */
    private float vendas;
 
    /**
     * A percentagem da comiss�o de vendas do trabalhador � comiss�o.
     */
    private float comissao;
 
    /**
     * O valor por omiss�o do sal�rio base do trabalhador � comiss�o.
     */
    private static final float SALARIO_BASE_POR_OMISSAO = 635.0f;
   
    /**
     * O montante por omiss�o das vendas do trabalhador � comiss�o.
     */
    private static final int VENDAS_POR_OMISSAO = 0;
    
    /**
     * A percentagem por omiss�o da comiss�o de vendas do trabalhador � comiss�o.
     */
    private static final int COMISSAO_POR_OMISSAO = 0;
 
    /**
     * Constr�i uma inst�ncia de TrabalhadorComissao recebendo o nome, o sal�rio 
     * base, o montante de vendas e a percentagem da comiss�o de vendas do 
     * trabalhador � comiss�o.
     *
     * @param nome o nome do trabalhador � comiss�o
     * @param salarioBase o sal�rio base do trabalhador � comiss�o
     * @param vendas o montante de vendas do trabalhador � comiss�o
     * @param comissao a percentagem da comiss�o de vendas do trabalhador �
     * comiss�o
     */
    public TrabalhadorComissao(String nome, float salarioBase, float vendas, float comissao) {
        super(nome);
        this.salarioBase = salarioBase;
        this.vendas = vendas;
        this.comissao = comissao;
    }
 
    /**
     * Constr�i uma inst�ncia de TrabalhadorComissao recebendo o nome e 
     * atribuindo o sal�rio base por omiss�o, o montante das vendas por omiss�o  
     * e a percentagem por omiss�o da comiss�o de vendas do trabalhador � 
     * comiss�o.
     *
     * @param nome o nome do trabalhador � comiss�o
     */
    public TrabalhadorComissao(String nome) {
        super(nome);
        salarioBase = SALARIO_BASE_POR_OMISSAO;
        vendas = VENDAS_POR_OMISSAO;
        comissao = COMISSAO_POR_OMISSAO;
    }
 
    /**
     * Constr�i uma inst�ncia de TrabalhadorComissao atribuindo o nome por 
     * omiss�o, o sal�rio base por omiss�o, o montante por omiss�o das vendas e 
     * a percentagem por omiss�o da comiss�o de vendas do trabalhador � comiss�o.
     */
    public TrabalhadorComissao() {
        super();
        salarioBase = SALARIO_BASE_POR_OMISSAO;
        vendas = VENDAS_POR_OMISSAO;
        comissao = COMISSAO_POR_OMISSAO;
    }
 
    /**
     * Devolve o sal�rio base do trabalhador � comiss�o.
     *
     * @return sal�rio base do trabalhador � comiss�o.
     */
    public float getSalarioBase() {
        return salarioBase;
    }
 
    /**
     * Devolve o montante de vendas do trabalhador � comiss�o.     
     *
     * @return montante das vendas do trabalhador � comiss�o
     */
    public float getVendas() {
        return vendas;
    }
 
    /**
     * Devolve a percentagem da comiss�o de vendas do trabalhador � comiss�o.
     *
     * @return percentagem da comiss�o de vendas do trabalhador � comiss�o
     */
    public float getComissao() {
        return comissao;
    }
 
    /**
     * Modifica o sal�rio base do trabalhador � comiss�o.
     *
     * @param salarioBase o novo sal�rio base do trabalhador � comiss�o
     */
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
 
    /**
     * Modifica o montante de vendas do trabalhador � comiss�o.
     *
     * @param vendas o novo montante de vendas do trabalhador � comiss�o
     */
    public void setVendas(float vendas) {
        this.vendas = vendas;
    }
 
    /**
     * Modifica a percentagem da comiss�o de vendas do trabalhador � comiss�o.
     *
     * @param comissao a nova percentagem da comiss�o de vendas do trabalhador 
     * � comiss�o
     */
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
 
    /**
     * Devolve a descri��o textual do trabalhador � comiss�o.
     *
     * @return carater�sticas do trabalhador � comiss�o
     */
    @Override
    public String toString() {
        return String.format("Trabalhador � Comiss�o: %s "
                + "%nSal�rio Base: %.2f Euros "
                + "%nVendas: %.2f Euros "
                + "%nComiss�o: %.2f%%",
                super.toString(), salarioBase, vendas, comissao);
    }
 
    /**
     * Devolve o vencimento do trabalhador � comiss�o.
     *
     * @return vencimento do trabalhador � comiss�o
     */
    @Override
    public float calcularVencimento() {
        return salarioBase + vendas * (comissao / 100);
    }
 
}
 
