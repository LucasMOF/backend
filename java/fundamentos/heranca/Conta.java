package fundamentos.heranca;

public abstract class Conta {
    protected String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("💰 Depósito de R$ " + valor + " realizado na conta de " + this.titular);
        } else {
            System.out.println("❌ Valor inválido para depósito.");
        }
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }

    }

    public double getSaldo() {

        return saldo;
    }

    protected void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}

