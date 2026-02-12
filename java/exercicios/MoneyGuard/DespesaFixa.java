package exercicios.MoneyGuard;

public class DespesaFixa extends Despesa {
    private String categoria;

    public DespesaFixa(String descricao, double valor, String categoria) {
        super(descricao, valor);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String toString(){
        return super.toString() + " | Categoria: " + this.categoria;
    }



}
