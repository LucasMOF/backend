package exercicios.CineStream;

import java.util.ArrayList;

public class Plataforma {
    public static void main(String[] args) {
        ArrayList<Conteudo> catalogo = new ArrayList<>();

        Filme f = new Filme("Matrix", "ação", 180);
        Serie s = new Serie("Breaking Bad", "Suspense", 5);
        Live l = new Live("Show metallic", "Musical", "Metallic");

        catalogo.add(f);
        catalogo.add(s);
        catalogo.add(l);

        for (Conteudo c : catalogo) {
            System.out.println(c.descricaoDetalhada());

            if (c instanceof Baixavel) {
                Baixavel b = (Baixavel) c;
                b.baixar();
                System.out.println("-----------------------");
            } else {
                System.out.println("Conteúdo não disponível offline");
            }
        }
    }
}
