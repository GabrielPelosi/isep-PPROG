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
public abstract class Credito {
    private String nome;
    private String profissao;
    private float montante;
    private int prazo;
    
    private static final String NOME_OMI = "Sem nome"; 
    private static final String PROF_OMI = "Desempregado"; 
    private static final float MONTANTE_OMI = 0.0f; 
    private static final int PRAZO_OMI = 0;

    /**
     *Construtor da classe Credito
     * @param nome
     * @param profissao
     * @param montante
     * @param prazo
     */
    public Credito(String nome, String profissao, float montante, int prazo) {
        this.nome = nome;
        this.profissao = profissao;
        this.montante = montante;
        this.prazo = prazo;
    }

    /**
     *Construtor sem parâmetros da classe Credito
     */
    public Credito() {
        this.nome = NOME_OMI;
        this.profissao = PROF_OMI;
        this.montante =MONTANTE_OMI;
        this.prazo = PRAZO_OMI;
    }
    
    /**
     *Metodo que retorna o atributo Nome
     * @return Uma String com o nome
     */
    public String getNome() {
        return nome;
    }

    /**
     *Metodo que troca o atributo Nome
     * @param nome o nome que será atribuido a instnacia
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *Metodo que retorna o atributo Profissao
     * @return Uma String com a profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     *Metodo que troca o atributo Nome
     * @param profissao a nova profissao que será guardada na instancia
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     *Metodo que retorna o atributo Prazo
     * @return Um int com o prazo
     */
    public int getPrazo() {
        return prazo;
    }

    /**
     *Metodo que retorna o atributo Montante
     * @return Um float com o montante
     */
    public float getMontante() {
        return montante;
    }


    @Override
    public String toString() {
        return  String.format("Nome: %s, Profissão: %s, Prazo: %d, Montante: %.2f",nome, profissao, prazo, montante);
    }
    
    /**
     *
     * @return
     */
    public abstract float calcularMontanteAReceberPorCadaCredito();
    
    /**
     *
     * @return
     */
    public abstract float calcularMontanteTotalJuros();
    
    
}
