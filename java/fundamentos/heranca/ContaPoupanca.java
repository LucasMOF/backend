package fundamentos.heranca;

import java.sql.Struct;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular) {

        super(titular);
    }

    @Override
    public boolean sacar(double valor) {
        if (super.sacar(valor)) {
            double saldoAtual = this.getSaldo();
            this.setSaldo(saldoAtual - 2);
            System.out.println("Taxa de R$ 2,00 aplicada da Poupança.");
            return true;
        } else {
            return false;
        }
    }
}