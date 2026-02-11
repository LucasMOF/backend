package exercicios.CineJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Titulo> listaAssistidos = new ArrayList<>();

        System.out.println("Titulo do filme: ");
        String nomeFilme = leitor.nextLine();

        System.out.println("Ano de lançamento do filme: ");
        int anoFilme = leitor.nextInt();

        System.out.println("Duração do filme em minutos: ");
        int duracaoFilme = leitor.nextInt();
        leitor.nextLine();

        Filme f = new Filme(nomeFilme, anoFilme);
        f.setDuracaoEmMinutos(duracaoFilme);
        System.out.println("Que nota você dá para este filme (0 a 10)? ");
        double notaFilme = leitor.nextDouble();
        f.avalia(notaFilme);
        leitor.nextLine();

        listaAssistidos.add(f);

        System.out.println("Titulo da serie: ");
        String nomeSerie = leitor.nextLine();

        System.out.println("Ano de lançamento da serie: ");
        int anoSerie = leitor.nextInt();

        System.out.println("Quantidade de temporadas: ");
        int temporadas = leitor.nextInt();

        System.out.println("Quantidade de episodios por temporada: ");
        int qtdEpisodio = leitor.nextInt();

        System.out.println("Duração de cada episodio em minutos: ");
        int duracaoEp = leitor.nextInt();
        leitor.nextLine();

        Serie s = new Serie(nomeSerie, anoSerie);
        s.setTemporadas(temporadas);
        s.setEpisodiosPorTemporada(qtdEpisodio);
        s.setMinutosPorEpisodio(duracaoEp);

        System.out.println("Que nota você dá para este filme (0 a 10)? ");
        double notaSerie = leitor.nextDouble();
        s.avalia(notaSerie);
        leitor.nextLine();

        listaAssistidos.add(s);

        f.exibirFichaTecnica();
        System.out.println("Média de avaliações do filme: " + f.pegaMedia());
        System.out.println("Total de votos: " + f.getTotalDeVisualizacoes());

        s.exibirFichaTecnica();
        System.out.println("Média de avaliações da serie: " + s.pegaMedia());
        System.out.println("Total de votos: " + s.getTotalDeVisualizacoes());

        CalculadoraDeTempo calc = new CalculadoraDeTempo();

        calc.incluir(f);
        calc.incluir(s);

        System.out.println("Parabéns, você atingiu um tempo total de tela: "
                + calc.getTempoTotal() + " min");

        System.out.println("Tamanho da lista: " + listaAssistidos.size());
        
        System.out.println(listaAssistidos);
    }
}
