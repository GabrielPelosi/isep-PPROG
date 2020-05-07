package org.isep.dei.pl18.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarefa implements Comparable<Tarefa> {

    private String descricao;
    private LocalDateTime instanteRegisto;
    private Prioridade prioridade;

    public Tarefa(String descricao, Prioridade prioridade) {
        setDescricao(descricao);
        setPrioridade(prioridade);
        instanteRegisto = LocalDateTime.now();
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public LocalDateTime getInstanteRegisto() {
        return instanteRegisto;
    }

    public final void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição é inválida!");
        }
        this.descricao = descricao;
    }

    public final void setPrioridade(Prioridade prioridade) {
        if (prioridade == null) {
            throw new IllegalArgumentException("Prioridade é inválida!");
        }
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoInstante = 
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM:SS.SSS");
        String instanteRegisto = this.instanteRegisto.format(formatoInstante);
        return String.format("%s - %s - %s", descricao, prioridade, 
                instanteRegisto);
    }

    @Override
    public int compareTo(Tarefa outraTarefa) {
        if(prioridade.equals(outraTarefa.prioridade)) {
            return instanteRegisto.compareTo(outraTarefa.instanteRegisto);
        }
        
        return prioridade.compareTo(outraTarefa.prioridade);
    }

}
