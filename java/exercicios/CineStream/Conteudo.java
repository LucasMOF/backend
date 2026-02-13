package exercicios.CineStream;

public abstract class Conteudo {
    private String titulo;
    private String genero;

    public Conteudo(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void assistir(){
        System.out.println("Dando play em: " + this.titulo);
    }

    public abstract String descricaoDetalhada();
}
