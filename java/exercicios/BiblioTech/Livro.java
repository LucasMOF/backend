package exercicios.BiblioTech;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    boolean emprestar() {
        if (this.disponivel == true) {
            this.disponivel = false;
            System.out.println("Livro disponivel");
            return true;
        } else {
            System.out.println("Livro indisponivel");
            return false;
        }
    }

    void devolver() {
        this.disponivel = true;
        System.out.println("Livro devolvido");
    }

    void exibirDados() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Condição: "
                + (disponivel ? "✅ Disponível" : "❌ Emprestado"));
    }

    public String getTitulo() {
        return titulo;
    }
}
