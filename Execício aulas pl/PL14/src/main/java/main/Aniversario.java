package main;

public class Aniversario {

    private String nome;
    private int anoAniversario;
    private int mesAniversario;
    private int diaAniversario;

    public Aniversario(String nome, int anoAniversario, int mesAniversario, int diaAniversario) {
        this.nome = nome;
        this.anoAniversario = anoAniversario;
        this.mesAniversario = mesAniversario;
        this.diaAniversario = diaAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoAniversario() {
        return anoAniversario;
    }

    public void setAnoAniversario(int anoAniversario) {
        this.anoAniversario = anoAniversario;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
}
