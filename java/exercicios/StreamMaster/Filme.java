package exercicios.StreamMaster;

public class Filme extends Titulo{
    private int duracaoEmMinutos;

    public Filme(String nome, int ano, int duracaoEmMinutos){
        super(nome, ano);
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + this.duracaoEmMinutos + " min";
    }
}
