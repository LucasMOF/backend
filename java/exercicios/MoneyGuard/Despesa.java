package exercicios.MoneyGuard;

public class Despesa {
    private String descricao;
    private double valor;

    public Despesa(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    public void exibirDetalhes(){
        System.out.printf("A despesa: %s | Valor R$ %.2f %n", this.descricao, this.valor);
    }

    public String toString(){
        return "Despesa: " + this.descricao + " | Valor R$ " + this.valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
