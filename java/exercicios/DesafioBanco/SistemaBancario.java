package exercicios.DesafioBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<ContaBancaria> listaconta = new ArrayList<>();

        System.out.println("=== BEM-VINDO AO BANCO CENTRAL ===");

        int opcaoPrincipal = 0;
        while (opcaoPrincipal != 3) {
            System.out.println("\n=== GERENCIADOR DE CONTA ===");
            System.out.println("1. Cadastrar Nova Conta");
            System.out.println("2. Listar Contas e Escolher uma");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");
            opcaoPrincipal = leitor.nextInt();
            leitor.nextLine();

            if (opcaoPrincipal == 1) {
                System.out.println("Digite o número da conta: ");
                int numeroConta = leitor.nextInt();
                leitor.nextLine(); // <-- limpa o buffer

                System.out.println("Digite o nome do Titular: ");
                String titular = leitor.nextLine();

                ContaBancaria novo = new ContaBancaria(numeroConta, titular);
                listaconta.add(novo);

            }
            if (opcaoPrincipal == 2) {
                if (listaconta.isEmpty()) {
                    System.out.println("Não há contas cadastradas");
                } else {
                    System.out.println("Abrindo conta... \n");
                    for (int i = 0; i < listaconta.size(); i++) {
                        System.out.println(i + "- " + listaconta.get(i).titular + " Número1: " + listaconta.get(i).numeroConta);
                    }
                    System.out.println("Escolha uma conta para prosseguir: ");
                    int escolha = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Abrindo Menu... \n");

                    if (escolha >= 0 && escolha < listaconta.size()) {
                        ContaBancaria minhaConta = listaconta.get(escolha);
                        int opcao = 0;
                        while (opcao != 4) {
                            System.out.println("1- DEPOSITAR  | 2- SACAR | 3- VER SALDO | 4- VOLTAR: ");
                            opcao = leitor.nextInt();
                            switch (opcao) {
                                case 1:
                                    System.out.println("Digite um valor para depositar: ");
                                    double valorDeposito = leitor.nextDouble();
                                    minhaConta.depositar(valorDeposito);
                                    System.out.println("Feito! ");
                                    break;

                                case 2:
                                    System.out.println("Digite um valor para sacar: ");
                                    double valorSaque = leitor.nextDouble();
                                    minhaConta.sacar(valorSaque);
                                    System.out.println("Feito! ");
                                    break;

                                case 3:
                                    System.out.println("Saldo atual: " + minhaConta.getSaldo());
                                    break;
                                case 4:
                                    System.out.println("Voltando ao menu principal...");
                                    break;

                                default:
                                    System.out.println("Opção inválida!");
                            }
                        }
                    }
                }
            }

        }
    }
}
