package exercicios.StreamMaster;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamApp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Titulo> catalogo = new ArrayList<>();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n=== 🎬 STREAM MASTER 🍿 ===");
            System.out.println("1. Adicionar Filme");
            System.out.println("2. Adicionar Série");
            System.out.println("3. Mostrar Catálogo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = leitor.nextInt();
                leitor.nextLine();
            } catch (Exception e) {
                System.out.println("⚠ Erro: Digite apenas números!");
                leitor.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("=== NOVO FILME ===");
                    System.out.println("Adicionar nome do filme: ");
                    String nomeFilme = leitor.nextLine();

                    System.out.println("Ano de lançamento do filme: ");
                    int anoFilme = leitor.nextInt();

                    System.out.println("Duração do filme em minutos: ");
                    int duracaoFilme = leitor.nextInt();
                    leitor.nextLine();

                    Filme f = new Filme(nomeFilme, anoFilme, duracaoFilme);

                    boolean erro = false;
                    while (!erro) {
                        try {
                            System.out.println("Que nota você dá para este filme (0 a 10)? ");
                            double notaFilme = leitor.nextDouble();
                            leitor.nextLine();

                            if (notaFilme <= 10) {
                                f.avaliar(notaFilme);
                                catalogo.add(f);
                                erro = true;
                            } else {
                                System.out.println("Digite um número de 0 a 10");
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Erro: " + e + " . Digite o número corretamente");
                            leitor.nextLine();
                        }
                    }
                    break;

                case 2:
                    System.out.println("=== NOVA SERIE ===");
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

                    Serie s = new Serie(nomeSerie, anoSerie, temporadas, qtdEpisodio, duracaoEp);

                    boolean erroSerie = false;
                    while (!erroSerie) {
                        try {
                            System.out.println("Que nota você dá para esta serie (0 a 10)? ");
                            double notaSerie = leitor.nextDouble();
                            leitor.nextLine();

                            if (notaSerie <= 10) {
                                s.avaliar(notaSerie);
                                catalogo.add(s);
                                erroSerie = true;
                            } else {
                                System.out.println("Digite um número de 0 a 10");
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Erro: " + e + " . Digite o número corretamente");
                            leitor.nextLine();
                        }
                    }
                    break;

                case 3:
                    int i = 0;
                    for (Titulo t : catalogo) {
                        i++;
                        System.out.println(i + "- " + t.toString() + " | Avaliação: " + t.getMedia());

                        if (t instanceof Filme) {
                            System.out.println("   >>> É um filme! Prepare a pipoca.");

                        } else if (t instanceof Serie) {
                            System.out.println("   >>> É uma série! Prepare o café para maratona.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Fechando Sistema!");
                    break;

                default:
                    System.out.println("Opçãoa inválida!");
            }
        }
        leitor.close();
    }
}

