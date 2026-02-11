package exercicios.CineJava;

public class Serie extends Titulo {
    int temporadas;
    int episodiosPorTemporada;
    int minutosPorEpisodio;

    public Serie(String nome, int ano) {
        super(nome, ano);
    }
    public int getDuracaoEmMinutos(){
        int totalCalculado = temporadas * episodiosPorTemporada * minutosPorEpisodio;
        return totalCalculado;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
