package exercicios.CineStream;

public class Serie extends Conteudo implements Baixavel {
    private int temporadas;

    public Serie(String titulo, String genero, int temporadas) {
        super(titulo, genero);
        this.temporadas = temporadas;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando " + this.getTitulo()
                + " para memória interna");
    }

    @Override
    public String descricaoDetalhada() {
        return "Serie " + this.getTitulo() + " com " + this.temporadas + " temporadas";
    }
}
