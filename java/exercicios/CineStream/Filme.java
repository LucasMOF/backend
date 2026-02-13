package exercicios.CineStream;

public class Filme extends Conteudo implements Baixavel{
    private int duracao;

    public Filme(String titulo, String genero, int duracao){
        super(titulo, genero);
        this.duracao = duracao;
    }
    @Override
    public void baixar() {
        System.out.println("Baixando " + this.getTitulo()
                + " para memória interna");
    }
    @Override
    public String descricaoDetalhada() {
        return "Filme " + this.getTitulo()+ " de " + this.duracao + " minutos";
    }
}
