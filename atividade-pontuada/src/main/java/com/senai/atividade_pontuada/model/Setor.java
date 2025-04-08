package com.senai.atividade_pontuada.model;

public enum Setor {

    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico");

    private String texto;

    Setor(String texto) {
        this.texto = texto;
    }

}
