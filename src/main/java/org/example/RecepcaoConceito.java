package org.example;

public class RecepcaoConceito implements IRecepcao {

    private String conceito;

    @Override
    public String getRecepcao() {
        return this.conceito;
    }

    @Override
    public void setRecepcao(String conceito) {
        this.conceito = conceito;
    }
}