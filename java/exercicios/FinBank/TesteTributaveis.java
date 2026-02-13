package exercicios.FinBank;

public class TesteTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(0001);
        cc.depositar(100.00);

        SeguroDeVida seguro = new SeguroDeVida();

        ContaPoupanca cp = new ContaPoupanca(0002);
        cp.depositar(100.00);

        GerenciadorDeImposto calc = new GerenciadorDeImposto();

        calc.adiciona(cc);
        calc.adiciona(seguro);

        System.out.println(calc.getTotalImposto());


    }
}
