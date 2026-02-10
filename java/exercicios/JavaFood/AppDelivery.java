package exercicios.JavaFood;

import java.util.ArrayList;
import java.util.Scanner;

public class AppDelivery {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Restaurante> listaRestaurante = new ArrayList<>();

        System.out.println("=== BEM-VINDO AO JAVAFOOD ===");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n=== GERENCIADOR DE RESTAURANTES ===");
            System.out.println("1. Cadastrar Novo Restaurante");
            System.out.println("2. Listar Restaurantes");
            System.out.println("3. Adicionar Cardápio ao Restaurante");
            System.out.println("4. Exibir Cardápio de um Restaurante");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("Nome do restaurante: ");
                String nome = leitor.nextLine();

                double avaliacao = 11;
                while (avaliacao < 0 || avaliacao > 10) {
                    System.out.println("Avaliação do restaurante: 0-10");
                    avaliacao = leitor.nextDouble();

                }
                leitor.nextLine();
                Restaurante novo = new Restaurante(nome, avaliacao);
                listaRestaurante.add(novo);

            } else if (opcao == 2) {
                if (listaRestaurante.isEmpty()) {
                    System.out.println("Não há restaurantes no sistema");
                } else {
                    for (int i = 0; i < listaRestaurante.size(); i++) {
                        Restaurante listagemRestaurante = listaRestaurante.get(i);
                        System.out.println(i + "- " + listagemRestaurante.getNome() +
                                "\n" + listagemRestaurante.getAvaliacao());
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Selecione o restaurante: ");
                int escolhaRestaurante = leitor.nextInt();
                leitor.nextLine();
                if (escolhaRestaurante >= 0 && escolhaRestaurante < listaRestaurante.size()) {
                    Restaurante novoCardapio = listaRestaurante.get(escolhaRestaurante);

                    System.out.println("Digite o nome do novo prato: ");
                    String novoPrato = leitor.nextLine();
                    System.out.println("Digite o preço do novo prato R$ ");
                    double novoPreco = leitor.nextDouble();
                    leitor.nextLine();
                    novoCardapio.adicionarCardapio(novoPrato, novoPreco);

                }

            } else if (opcao == 4) {
                System.out.println("Selecione um restaurante para vizualizar seu cardápio: ");
                int escolhaRestaurante = leitor.nextInt();
                leitor.nextLine();
                if (escolhaRestaurante >= 0 && escolhaRestaurante < listaRestaurante.size()) {
                    Restaurante verCardapio = listaRestaurante.get(escolhaRestaurante);
                    verCardapio.exibirCardapio();
                }

            } else if (opcao == 5) {
                System.out.println("Finalizando sistema!");
                break;

            } else {
                System.out.println("Opção invalida!");
            }
        }
    }
}
