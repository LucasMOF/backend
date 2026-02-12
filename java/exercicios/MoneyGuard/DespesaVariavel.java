package exercicios.MoneyGuard;

public class DespesaVariavel extends Despesa {
    private String data;

    public DespesaVariavel(String descricao, double valor, String data) {
        super(descricao, valor);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String toString(){
        return super.toString() + " | Data: " + this.data;
    }
}
