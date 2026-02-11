package exercicios.CineJava;

public abstract class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeVisualizacoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getAvaliacao() {
        return somaDasAvaliacoes;
    }

    public void setAvaliacao(double avaliacao) {
        this.somaDasAvaliacoes = avaliacao;
    }

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    public void exibirFichaTecnica() {
        System.out.println("Titulo: " + this.nome + " | ano de lançamento: " + this.anoDeLancamento
               + " | Tempo assistido: " + getDuracaoEmMinutos());
    }

    public void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDeVisualizacoes++;
    }

    public double pegaMedia() {
        if (totalDeVisualizacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / totalDeVisualizacoes;
    }
    public abstract int getDuracaoEmMinutos();

    public String toString() {
        return "Nome: " + this.nome + " (" + this.anoDeLancamento + ")";
    }

}
