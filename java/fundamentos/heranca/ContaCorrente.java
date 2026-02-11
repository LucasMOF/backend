package fundamentos.heranca;

public class ContaCorrente extends Conta{

    public ContaCorrente(String titular){
        super(titular);
    }

    @Override
    public boolean sacar(double valor) {
        if (super.sacar(valor)) {
            double saldoAtual = this.getSaldo();
            this.setSaldo(saldoAtual - 5);
            System.out.println("Taxa de R$ 5,00 aplicada da Poupança.");
            return true;
        } else {
            return false;
        }
    }
}
