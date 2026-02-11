package exercicios.CineJava;

public class Filme extends Titulo{
    int duracaoEmMinutos;

    public Filme(String nome, int ano){
        super(nome, ano);
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
