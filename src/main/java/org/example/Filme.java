package org.example;

public class Filme {

    IRecepcao recepcao;
    RecepcaoAdapter persistencia;

    public Filme() {
        recepcao = new RecepcaoConceito();
        persistencia = new RecepcaoAdapter(recepcao);
    }

    public void setRecepcao(String conceito) {
        recepcao.setRecepcao(conceito);
        persistencia.salvarRecepcao();
    }

    public String getRecepcao() {
        return persistencia.recuperarRecepcao();
    }

    public float getNotaNumero() {
        return persistencia.getNotaNumero();
    }

}