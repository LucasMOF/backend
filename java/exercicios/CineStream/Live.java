package exercicios.CineStream;

import exercicios.BiblioTech.Livro;

public class Live extends Conteudo {
    private String apresentador;

    public Live(String titulo, String genero, String apresentador) {
        super(titulo, genero);
        this.apresentador = apresentador;
    }

    @Override
    public String descricaoDetalhada() {
        return "Live " + this.getTitulo()+ " está apresentando " + this.apresentador;
    }
}
