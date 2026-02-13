package exercicios.FinBank;

import exercicios.MoneyGuard.GerenciadorDeDespesas;

public class GerenciadorDeImposto {
    private double totalImposto;

    public double getTotalImposto() {
        return totalImposto;
    }

    public void setTotalImposto(double totalImposto) {
        this.totalImposto = totalImposto;
    }

    public void adiciona(Tributavel t){
        System.out.println("Adicionando imposto de: " + t.getValorImposto());
        this.totalImposto += t.getValorImposto();
    }

}
