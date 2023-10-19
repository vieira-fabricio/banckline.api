package com.dio.santander.bankline.api.model;

import javax.persistence.Embeddable;

@Embeddable
public class Novidades {
    private String icone;
    private String descricao;

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
