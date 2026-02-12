package exercicios.FrotaTech;

import java.util.ArrayList;
import java.util.Scanner;

public class Frota {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Veiculo> frota = new ArrayList<>();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("=== MENU FROTA ===");
            System.out.println("1. Adicionar carro");
            System.out.println("2. Adicionar caminão");
            System.out.println("3. Adicionar Moto");
            System.out.println("4. Lista de veiculos no pedagio");
            System.out.println("5. Sair");
            System.out.println("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("Adicionar marca do carro: ");
                String marcaCarro = leitor.nextLine();

                System.out.println("Adicionar modelo do carro: ");
                String modeloCarro = leitor.nextLine();

                System.out.println("Adicionar placa do carro: ");
                String placaCarro = leitor.nextLine();

                Carro carro = new Carro(marcaCarro, modeloCarro, placaCarro);
                frota.add(carro);

            } else if (opcao == 2) {
                System.out.println("Adicionar marca do caminhão: ");
                String marcaCaminao = leitor.nextLine();

                System.out.println("Adicionar modelo do caminhão: ");
                String modeloCaminao = leitor.nextLine();

                System.out.println("Adicionar placa do caminhão: ");
                String placaCaminao = leitor.nextLine();

                System.out.println("Adicionar eixos do caminhão: ");
                int eixos = leitor.nextInt();
                leitor.nextLine();

                Caminhao caminhao = new Caminhao(marcaCaminao, modeloCaminao, placaCaminao, eixos);
                frota.add(caminhao);

            } else if (opcao == 3) {
                System.out.println("Adicionar marca da moto: ");
                String marcaMoto = leitor.nextLine();

                System.out.println("Adicionar modelo da moto: ");
                String modeloMoto = leitor.nextLine();

                System.out.println("Adicionar placa da moto: ");
                String placaMoto = leitor.nextLine();

                Moto moto = new Moto(marcaMoto, modeloMoto, placaMoto);
                frota.add(moto);

            } else if (opcao == 4) {
                if (frota.isEmpty()) {
                    System.out.println("Sem veiculos no pedagio!");
                } else {
                    double totalIndividual = 0;
                    double totalArrecadado = 0;

                    for (int i = 0; i < frota.size(); i++) {
                        Veiculo veiculo = frota.get(i);
                        totalIndividual = veiculo.calcularPedagio();
                        totalArrecadado += totalIndividual;

                        System.out.println((i + 1) + "- " + veiculo);
                        System.out.println("---------------------");
                    }
                    System.out.printf("Valor Total acumulado no pegagio: %.2f \n\n"
                            , totalArrecadado);
                }
            } else if (opcao == 5) {
                System.out.println("Fechando sistema!");

            } else {
                System.out.println("Opção invalida!");
            }
        }
    }
}
