package exercicios.BiblioTech;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Livro> listaLivro = new ArrayList<>();

        System.out.println("=== BEM-VINDO A BIBLIOTECA ===");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n=== GERENCIADOR DE LIVRO ===");
            System.out.println("1. Cadastrar Novo Livro");
            System.out.println("2. Listar Livro");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("Nome do livro: ");
                String titulo = leitor.nextLine();

                System.out.println("Autor do livro: ");
                String autor = leitor.nextLine();

                Livro novo = new Livro(titulo, autor);
                listaLivro.add(novo);

            } else if (opcao == 2) {
                if (listaLivro.isEmpty()) {
                    System.out.println("Não há livros no sistema!");
                } else {
                    System.out.println("Abrindo lista...");

                    for (int i = 0; i < listaLivro.size(); i++) {
                        Livro listagemLivro = listaLivro.get(i);
                        System.out.println(i + ":");
                        listagemLivro.exibirDados();
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Digite o titulo do livro que deseja pegar: ");
                String buscar = leitor.nextLine();
                boolean encontrar = false;

                for (int i = 0; i < listaLivro.size(); i++) {
                    Livro livraria = listaLivro.get(i);
                    if (livraria.getTitulo().equalsIgnoreCase(buscar)) {
                        encontrar = true;
                        if (livraria.emprestar()) {
                            System.out.println("Livro emprestado com sucesso: " + livraria.getTitulo());
                        } else {
                            System.out.println("O livro: " + "'" + livraria.getTitulo() + "'" + " já está emprestado");
                        }
                        break;
                    }
                }
                if (!encontrar) {
                    System.out.println("Livro não encontrado!");
                }

            } else if (opcao == 4) {
                System.out.println("Digite o nome do livro que deseja devolver: ");
                String devolucao = leitor.nextLine();
                boolean encontrar = false;

                for (int i = 0; i < listaLivro.size(); i++) {
                    Livro controleLivro = listaLivro.get(i);
                    if (controleLivro.getTitulo().equalsIgnoreCase(devolucao)) {
                        encontrar = true;
                        System.out.println("Livro encontrado: " + controleLivro.getTitulo());
                        controleLivro.devolver();
                        break;
                    }
                }
                if (!encontrar) {
                    System.out.println("Livro não encontrado!");
                }

            } else if (opcao == 5) {
                System.out.println("Fechando sistema!");

            } else {
                System.out.println("Opção inválidad!");
            }
        }
    }
}

