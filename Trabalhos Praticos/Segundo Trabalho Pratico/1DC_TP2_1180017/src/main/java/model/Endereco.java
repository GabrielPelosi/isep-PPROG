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
public class Endereco {

    private String rua;
    private String codPostal;
    private String localidade;
    
    public static final String RUA_OMISSAO = "";
    public static final String CODPOSTAL_OMISSAO = "";
    public static final String LOCALIDADE_OMISSAO = "";

    /**
     *Construtor da classe endereco 
     * @param rua
     * @param codPostal
     * @param localidade
     */
    public Endereco(String rua, String codPostal, String localidade) {
        this.rua = rua;
        this.codPostal = codPostal;
        this.localidade = localidade;
    }

    /**
     *Construtor da classe endereco 
     * @param end
     */
    public Endereco(Endereco end) {
        this.rua = end.getRua();
        this.codPostal = end.getCodPostal();
        this.localidade = end.getLocalidade();
    }

    /**
     *Construtor da classe endereco 
     */
    public Endereco() {
        this.rua = RUA_OMISSAO;
        this.codPostal = CODPOSTAL_OMISSAO;
        this.localidade = LOCALIDADE_OMISSAO;
    }

    /**
     *Metodo get da rua do endereco
     * @return
     */
    public String getRua() {
        return rua;
    }

    /**
     *Metodo set da rua do endereco
     * @param rua
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     *Metodo get do codPostal do endereco
     * @return
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     *Metodo set do codPostal do endereco
     * @param codPostal
     */
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    /**
     *Metodo get da localidade do endereco
     * @return
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     *Metodo set da localidade do endereco
     * @param localidade
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return String.format("Rua: %s, CodigoPostal: %s, Localidade: %s", rua, codPostal, localidade);
    }

}
