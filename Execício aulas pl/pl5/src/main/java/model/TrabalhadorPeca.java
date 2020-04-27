package model;

/**
* Representa um trabalhador � pe�a atrav�s do seu nome e dos n�meros de pe�as
* produzidas do tipo 1 e do tipo 2.
*
* @author ISEP-DEI-PPROG
*/
public class TrabalhadorPeca extends Trabalhador {

   /**
    * O n�mero de pe�as do tipo 1 do trabalhador � pe�a.
    */
   private int numeroPecasTipo1;

   /**
    * O n�mero de pe�as do tipo 2 do trabalhador � pe�a.
    */
   private int numeroPecasTipo2;

   /**
    * O n�mero de pe�as por omiss�o do tipo 1 do trabalhador � pe�a.
    */
   private static final int NUMERO_PECAS_TIPO1_POR_OMISSAO = 0;

   /**
    * O n�mero de pe�as por omiss�o do tipo 2 do trabalhador � pe�a.
    */
   private static final int NUMERO_PECAS_TIPO2_POR_OMISSAO = 0;

   /**
    * O pagamento por uma pe�a do tipo 1 aplicado a todos os trabalhadores �
    * pe�a.
    */
   private static float pagamentoPecaTipo1 = 6.5f;

   /**
    * O pagamento por uma pe�a do tipo 2 aplicado a todos os trabalhadores �
    * pe�a.
    */
   private static float pagamentoPecaTipo2 = 9.5f;

   /**
    * Constr�i uma inst�ncia de TrabalhadorPeca recebendo o nome, o n�mero de
    * pe�as do tipo 1 e o n�mero de pe�as do tipo 2.
    *
    * @param nome o nome do trabalhador � pe�a
    * @param numeroPecasTipo1 o n�mero de pe�as 1 do trabalhador � pe�a
    * @param numeroPecasTipo2 o n�mero de pe�as 2 do trabalhador � pe�a
    */
   public TrabalhadorPeca(String nome, int numeroPecasTipo1, int numeroPecasTipo2) {
       super(nome);
       this.numeroPecasTipo1 = numeroPecasTipo1;
       this.numeroPecasTipo2 = numeroPecasTipo2;
   }

   /**
    * Constr�i uma inst�ncia de TrabalhadorPeca recebendo o nome e atribuindo
    * zero aos n�meros de pe�as do tipo 1 e do tipo 2.
    *
    * @param nome o nome do trabalhador � pe�a
    */
   public TrabalhadorPeca(String nome) {
       super(nome);
       numeroPecasTipo1 = NUMERO_PECAS_TIPO1_POR_OMISSAO;
       numeroPecasTipo2 = NUMERO_PECAS_TIPO2_POR_OMISSAO;
   }

   /**
    * Constr�i uma inst�ncia de TrabalhadorPeca atribuindo o nome por omiss�o e
    * os n�meros de pe�as por omiss�o do tipo 1 e do tipo 2.
    */
   public TrabalhadorPeca() {
       super();
       numeroPecasTipo1 = NUMERO_PECAS_TIPO1_POR_OMISSAO;
       numeroPecasTipo2 = NUMERO_PECAS_TIPO2_POR_OMISSAO;
   }

   /**
    * Devolve o n�mero de pe�as do tipo 1 do trabalhador � pe�a.
    *
    * @return n�mero de pe�as do tipo 1 do trabalhador � pe�a
    */
   public int getNumeroPecasTipo1() {
       return numeroPecasTipo1;
   }

   /**
    * Devolve o n�mero de pe�as do tipo 2 do trabalhador � pe�a.
    *
    * @return n�mero de pe�as do tipo 2 do trabalhador � pe�a
    */
   public int getNumeroPecasTipo2() {
       return numeroPecasTipo2;
   }

   /**
    * Modifica o n�mero de pe�as do tipo 1 do trabalhador � pe�a.
    *
    * @param numeroPecasTipo1 o novo n�mero de pe�as do tipo 1 do trabalhador �
    * pe�a
    */
   public void setNumeroPecasTipo1(int numeroPecasTipo1) {
       this.numeroPecasTipo1 = numeroPecasTipo1;
   }

   /**
    * Modifica o n�mero de pe�as do tipo 2 do trabalhador � pe�a.
    *
    * @param numeroPecasTipo2 o novo n�mero de pe�as do tipo 2 do trabalhador �
    * pe�a
    */
   public void setNumeroPecasTipo2(int numeroPecasTipo2) {
       this.numeroPecasTipo2 = numeroPecasTipo2;
   }

   /**
    * Devolve a descri��o textual do trabalhador � pe�a.
    *
    * @return carater�sticas do trabalhador � pe�a
    */
   @Override
   public String toString() {
       return String.format("Trabalhador � Pe�a: %s %nN� de Pe�as do Tipo 1: "
               + "%d %nN� de Pe�as do Tipo 2: %d",
               super.toString(), numeroPecasTipo1, numeroPecasTipo2);
   }

   /**
    * Devolve o vencimento do trabalhador � pe�a.
    *
    * @return vencimento do trabalhador � pe�a
    */
   @Override
   public float calcularVencimento() {
       return numeroPecasTipo1 * pagamentoPecaTipo1
               + numeroPecasTipo2 * pagamentoPecaTipo2;
   }

   /**
    * Devolve o pagamento de uma pe�a do tipo 1.
    *
    * @return pagamento de uma pe�a do tipo 1
    */
   public static float getPagamentoPecaTipo1() {
       return pagamentoPecaTipo1;
   }

   /**
    * Devolve o pagamento de uma pe�a do tipo 2.
    *
    * @return pagamento de uma pe�a do tipo 2
    */
   public static float getPagamentoPeca2() {
       return pagamentoPecaTipo2;
   }

   /**
    * Modifica o pagamento de uma pe�a do tipo 1.
    *
    * @param pagamentoPecaTipo1 o novo pagamento de uma pe�a do tipo 1
    */
   public static void setPagamentoPecaTipo1(float pagamentoPecaTipo1) {
       TrabalhadorPeca.pagamentoPecaTipo1 = pagamentoPecaTipo1;
   }

   /**
    * Modifica o pagamento de uma pe�a do tipo 2.
    *
    * @param pagamentoPecaTipo2 o novo pagamento de uma pe�a do tipo 2
    */
   public static void setPagamentoPeca2(float pagamentoPecaTipo2) {
       TrabalhadorPeca.pagamentoPecaTipo2 = pagamentoPecaTipo2;
   }
}

