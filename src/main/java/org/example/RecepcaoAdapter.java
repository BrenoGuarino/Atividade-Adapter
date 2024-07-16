package org.example;

public class RecepcaoAdapter extends RecepcaoNumero {

    private IRecepcao recepcaoConceito;

    public RecepcaoAdapter(IRecepcao recepcaoConceito) {
        this.recepcaoConceito = recepcaoConceito;
    }

    public String recuperarRecepcao() {
        if (this.getNotaNumero() >= 5)
            recepcaoConceito.setRecepcao("Excelente");
        else
        if (this.getNotaNumero() >= 4)
            recepcaoConceito.setRecepcao("Muito Bom");
        else
        if (this.getNotaNumero() >= 3)
            recepcaoConceito.setRecepcao("Bom");
        else
        if (this.getNotaNumero() >= 2)
            recepcaoConceito.setRecepcao("regular");
        else
        if (this.getNotaNumero() >= 2)
            recepcaoConceito.setRecepcao("Ruim");
        else
            recepcaoConceito.setRecepcao("Péssimo");
        return recepcaoConceito.getRecepcao();
    }

    public void salvarRecepcao() {
        if (recepcaoConceito.getRecepcao().equals("Excelente"))
            this.setNotaNumero(5);
        else
        if (recepcaoConceito.getRecepcao().equals("Muito Bom"))
            this.setNotaNumero(4);
        else
        if (recepcaoConceito.getRecepcao().equals("Bom"))
            this.setNotaNumero(3);
        else
        if (recepcaoConceito.getRecepcao().equals("Regular"))
            this.setNotaNumero(2);
        else
        if (recepcaoConceito.getRecepcao().equals("Ruim"))
            this.setNotaNumero(1);
        else
            this.setNotaNumero(0);
    }
}