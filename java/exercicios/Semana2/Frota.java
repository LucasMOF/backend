package exercicios.Semana2;

import java.util.Scanner;
import java.util.ArrayList;

public class Frota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        System.out.println("=== Bem-vindo ao Sistema de Frota ===");

        int opcaoPrincipal = 0;
        while (opcaoPrincipal != 3) {
            System.out.println("\n=== GERENCIADOR DE FROTA ===");
            System.out.println("1. Cadastrar Novo Carro");
            System.out.println("2. Listar Carros e Escolher um");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            opcaoPrincipal = teclado.nextInt();
            teclado.nextLine(); // Limpa buffer

            if (opcaoPrincipal == 1) {
                System.out.print("Digite o modelo: ");
                String modelo = teclado.nextLine();

                System.out.print("Digite a cor: ");
                String cor = teclado.nextLine();

                System.out.print("Digite o ano: ");
                int ano = teclado.nextInt();
                teclado.nextLine();

                Carro novo = new Carro(modelo, ano, cor);
                listaDeCarros.add(novo);
                System.out.println("Carro guardado com sucesso!");

            } else if (opcaoPrincipal == 2) {
                if (listaDeCarros.isEmpty()) {
                    System.out.println("A garagem está vazia! Cadastre um carro primeiro.");
                } else {
                    // Lista todos os carros
                    for (int i = 0; i < listaDeCarros.size(); i++) {
                        System.out.println(i + " - " + listaDeCarros.get(i).modelo);
                    }

                    System.out.print("Digite o número do carro para dirigir: ");
                    int escolha = teclado.nextInt();

                    // Verifica se o número digitado é válido
                    if (escolha >= 0 && escolha < listaDeCarros.size()) {
                        Carro meuCarro = listaDeCarros.get(escolha);
                        int opcaoAcao = 0;

                        while (opcaoAcao != 4) {
                            System.out.println("\n--- DIRIGINDO: " + meuCarro.modelo + " ---");
                            System.out.println("1. Acelerar | 2. Frear | 3. Status | 4. Voltar");
                            opcaoAcao = teclado.nextInt();

                            switch (opcaoAcao) {
                                case 1: meuCarro.acelerar(); break;
                                case 2: meuCarro.frear(); break;
                                case 3:
                                    System.out.println("Velocidade: " + meuCarro.getVelocidade() + " km/h");
                                    System.out.println("Cor: " + meuCarro.getCor());
                                    break;
                                case 4: System.out.println("Voltando para a garagem..."); break;
                                default: System.out.println("Opção inválida!");
                            }
                        }
                    } else {
                        System.out.println("Vaga inválida!");
                    }
                }
            } else if (opcaoPrincipal == 3) {
                System.out.println("Encerrando o sistema. Até logo!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        teclado.close();
    }
}