package exercicios.StreamMaster;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodios;

    public Serie(String nome, int ano, int temporadas, int episodiosPorTemporada, int minutosPorEpisodios){
        super(nome, ano);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + this.minutosPorEpisodios + " min";
    }
}
