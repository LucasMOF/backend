package exercicios.CineJava;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluir(Titulo t) {
        System.out.println("Adicionando a duração de: " + t.getNome());
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
