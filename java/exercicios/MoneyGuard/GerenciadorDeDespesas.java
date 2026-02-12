package exercicios.MoneyGuard;

public class GerenciadorDeDespesas {
    private double totalDespesas;

    public double getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public void registrarDespesa(Despesa d) {
        double valor = d.getValor();
        this.totalDespesas += valor;

        System.out.println("Registrando despesa: " + d.getDescricao());
        System.out.printf("Valor atual acumulado: %.2f \n\n", this.totalDespesas );
    }
}


