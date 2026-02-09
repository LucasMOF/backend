package exercicios.Loja;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLoja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Produto> listaloja = new ArrayList<>();

        System.out.println("=== BEM-VINDO AO MENU DA LOJA ===");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n=== GERENCIADOR DE CONTA ===");
            System.out.println("1. Cadastrar Novo Produto");
            System.out.println("2. Listar Produtos (Menu de produtos)");
            System.out.println("3. Adicionar Estoque");
            System.out.println("4. Patrimônio em R$: ");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("Nome do produto: ");
                String nome = leitor.nextLine();

                System.out.println("Preço R$: ");
                double preco = leitor.nextDouble();
                leitor.nextLine();

                System.out.println("Quantidade do produto: ");
                int quantidade = leitor.nextInt();
                leitor.nextLine();

                Produto novo = new Produto(nome, preco, quantidade);
                listaloja.add(novo);

            } else if (opcao == 2) {
                if (listaloja.isEmpty()) {
                    System.out.println("Não há produtos no estoque!");
                } else {
                    System.out.println("Abrindo Estoque... \n");
                    for (int i = 0; i < listaloja.size(); i++) {
                        Produto meuProduto = listaloja.get(i);
                        System.out.println(i + ":");
                        meuProduto.exibirInformacoes();
                    }
                    System.out.println("Deseja abrir uma venda? S/N: ");
                    String opcaoVenda = leitor.nextLine();
                    if (opcaoVenda.equalsIgnoreCase("S")) {

                        System.out.println("Digite o indice do produto que deseja vender: ");
                        int numeroProduto = leitor.nextInt();

                        if (numeroProduto >= 0 && numeroProduto < listaloja.size()) {
                            Produto vendaProduto = listaloja.get(numeroProduto);

                            System.out.println("Digite a quantidade de produtos que deseja: ");
                            int numeroQuantidade = leitor.nextInt();

                            if (vendaProduto.vender(numeroQuantidade)) {
                                double Total = numeroQuantidade * vendaProduto.getPreco();
                                System.out.println("Venda realizada com sucesso! Valor Total!");

                                System.out.println("Valor total da venda: " + Total);

                            } else {
                                System.out.println("Quantidade insuficiente em estoque.");
                            }
                        } else {
                            System.out.println("Não existe esse indice na lista!");
                        }
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Escolha um indice de produto para adicionar estoque: ");
                int estoque = leitor.nextInt();
                if (estoque >= 0 && estoque < listaloja.size()) {
                    Produto reEstoque = listaloja.get(estoque);

                    System.out.println("Quanto quer adicionar no estoque? ");
                    int qtdAdicionar = leitor.nextInt();
                    reEstoque.adicionarEstoque(qtdAdicionar);
                    System.out.println("Estoque abastecido");
                }
            } else if (opcao == 4) {
                double totalPatrimonio = 0;
                for (int i = 0; i < listaloja.size(); i++) {
                    Produto patrimonio = listaloja.get(i);
                    totalPatrimonio += patrimonio.getValorTotalEstoque();
                }
                System.out.println("Patrimônio Total: " + totalPatrimonio);


            } else if (opcao == 5) {
                System.out.println("Finalizando sistema!");

            } else {
                System.out.println("Opção errada, tente novamente");
            }
        }
    }
}
