package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.math.BigDecimal;
@Embeddable
public class Cartao {
    @Column(name="cartao_numero", unique = true)
    private String numero;
    @Column(name="cartao_limite", scale = 11, precision = 2)
    private BigDecimal limite;


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}
