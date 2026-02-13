package exercicios.StreamMaster;

public abstract class Titulo implements Classificavel {
    private String nome;
    private int ano;
    private int totalDeAvaliacoes;
    private double somadasNotas;

    public Titulo(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public double getSomadasNotas() {
        return somadasNotas;
    }

    public void setSomadasNotas(double somadasNotas) {
        this.somadasNotas = somadasNotas;
    }

    public String toString() {
        return "Titulo: " + this.nome + " | Ano: " + this.ano;
    }

    @Override
    public void avaliar(double nota) {
        this.somadasNotas += nota;
        this.totalDeAvaliacoes++;
    }

    public double getMedia() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        } else {
            return somadasNotas / totalDeAvaliacoes;
        }
    }
}