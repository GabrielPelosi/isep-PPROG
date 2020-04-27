package model;

/**
 * Representa um trabalhador � hora atrav�s do seu nome, do n�mero de horas de
 * trabalho e do valor pago por hora de trabalho.
 *
 * @author ISEP-DEI-PPROG
 */
public class TrabalhadorHora extends Trabalhador {

    /**
     * O n�mero de horas de trabalho do trabalhador � hora.
     */
    private int numeroHoras;

    /**
     * O pagamento por hora de trabalho do trabalhador � hora.
     */
    private float pagamentoHora;

    /**
     * O valor por omiss�o do n�mero de horas de trabalho do trabalhador � hora.
     */
    private static final int NUMERO_HORAS_POR_OMISSAO = 0;
    
    /**
     * O valor por omiss�o do pagamento por hora de trabalho do trabalhador 
     * � hora.
     */
    private static final float PAGAMENTO_HORA_POR_OMISSAO = 10.0f;

    /**
     * Constr�i uma inst�ncia de TrabalhadorHora recebendo o nome, o n�mero de  
     * horas de trabalho e o valor do pagamento por hora.
     *
     * @param nome o nome do trabalhador � hora
     * @param numeroHoras o n�mero de horas de trabalho do trabalhador � hora
     * @param pagamentoHora o pagamento por hora do trabalhador � hora
     */
    public TrabalhadorHora(String nome, int numeroHoras, float pagamentoHora) {
        super(nome);
        this.numeroHoras = numeroHoras;
        this.pagamentoHora = pagamentoHora;
    }

    /**
     * Constr�i uma inst�ncia de TrabalhadorHora recebendo o nome e atribuindo o 
     * n�mero de horas por omiss�o e o pagamento hora por omiss�o.
     *
     * @param nome o nome do trabalhador � hora
     */
    public TrabalhadorHora(String nome) {
        super(nome);
        numeroHoras = NUMERO_HORAS_POR_OMISSAO;
        pagamentoHora = PAGAMENTO_HORA_POR_OMISSAO;
    }

    /**
     * Constr�i uma inst�ncia de TrabalhadorHora atribuindo o nome por omiss�o,
     * o n�mero de horas por omiss�o e o pagamento hora por omiss�o.
     */
    public TrabalhadorHora() {
        super();
        numeroHoras = NUMERO_HORAS_POR_OMISSAO;
        pagamentoHora = PAGAMENTO_HORA_POR_OMISSAO;
    }

    /**
     * Devolve o n�mero de horas de trabalho do trabalhador � hora.
     *
     * @return n�mero de horas de trabalho do trabalhador � hora
     */
    public int getNumeroHoras() {
        return numeroHoras;
    }

    /**
     * Devolve o pagamento por hora de trabalho do trabalhador � hora.
     *
     * @return pagamento por hora de trabalho do trabalhador � hora
     */
    public float getPagamentoHora() {
        return pagamentoHora;
    }

    /**
     * Modifica o n�mero de horas de trabalho do trabalhador � hora.
     *
     * @param numeroHoras o novo n�mero de horas de trabalho do trabalhador � hora
     */
    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    /**
     * Modifica o pagamento por hora de trabalho do trabalhador � hora.
     *
     * @param pagamentoHora o novo pagamento por hora de trabalho do trabalhador 
     *                      � hora
     */
    public void setPagamentoHora(float pagamentoHora) {
        this.pagamentoHora = pagamentoHora;
    }

    /**
     * Devolve a descri��o textual do trabalhador � hora.
     *
     * @return carater�sticas do trabalhador � hora
     */
    @Override
    public String toString() {
        return String.format("Trabalhador � Hora: %s %nN� de Horas de Trabalho: "
                + "%d %nPagamento por Hora: %.2f �",
                super.toString(), numeroHoras, pagamentoHora);
    }

    /**
     * Devolve o vencimento do trabalhador � hora.
     *
     * @return vencimento do trabalhador � hora
     */
    @Override
    public float calcularVencimento() {
        return numeroHoras * pagamentoHora;
    }
}