package exercicios.Loja;

public class Produto {
    String nome;
    private double preco;
    private int quantidade;

    public Produto(String nomeInput, double precoInput, int quantidadeInput) {
        this.nome = nomeInput;
        this.preco = precoInput;
        this.quantidade = quantidadeInput;
    }

    void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Preço: R$ " + preco + " | Estoque: " + quantidade);
    }

    void adicionarEstoque(int qtd) {
        quantidade += qtd;
    }

    boolean vender(int qtdDesejada) {
        if (qtdDesejada <= quantidade) {
            quantidade -= qtdDesejada;
            return true;
        } else {
            return false;
        }
    }

    double getValorTotalEstoque() {
        return preco * quantidade;

    }

    public double getPreco() {
        return this.preco;
    }
}
