package exercicios.MoneyGuard;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Despesa> listaDespesas = new ArrayList<>();
        GerenciadorDeDespesas gerenciar = new GerenciadorDeDespesas();


        System.out.println("=== BEM-VINDO AO SEU MENU DE DESPESAS");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("MENU DE DESPESAS");
            System.out.println("1. Adicionar uma despesa fixa");
            System.out.println("2. Adicionar uma despesa variavel");
            System.out.println("3. Exibir todas as despesas");
            System.out.println("4. Ver valor total em despesas");
            System.out.println("5. Sair");
            System.out.println("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                System.out.println("Adicionar descricao: ");
                String descricaoFixa = leitor.nextLine();

                System.out.println("Adicionar valor: ");
                double valorFixa = leitor.nextInt();
                leitor.nextLine();

                System.out.println("Adicionar categoria: ");
                String categoriaFixa = leitor.nextLine();

                DespesaFixa df = new DespesaFixa(descricaoFixa, valorFixa, categoriaFixa);
                listaDespesas.add(df);
                df.exibirDetalhes();
                gerenciar.registrarDespesa(df);
            } else if (opcao == 2) {
                System.out.println("Adicionar descricao: ");
                String descricaoVariavel = leitor.nextLine();

                System.out.println("Adicionar valor: ");
                double valorVariavel = leitor.nextInt();
                leitor.nextLine();

                System.out.println("Adicionar data da despesa: ");
                String dataVariavel = leitor.nextLine();

                DespesaVariavel dv = new DespesaVariavel(descricaoVariavel, valorVariavel, dataVariavel);
                listaDespesas.add(dv);
                dv.exibirDetalhes();
                gerenciar.registrarDespesa(dv);

            } else if (opcao == 3) {
                if (listaDespesas.isEmpty()) {
                    System.out.println("Não há despesas");
                } else {
                    for (int i = 0; i < listaDespesas.size(); i++) {
                        Despesa despesa = listaDespesas.get(i);
                        System.out.println((i + 1) + "- " + despesa);
                    }
                }
            } else if (opcao == 4) {
                System.out.printf("Valor total em despesas, R$ %.2f \n\n", gerenciar.getTotalDespesas());
            }
        }
    }
}
