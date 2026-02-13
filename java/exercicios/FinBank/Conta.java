package exercicios.FinBank;

public abstract class Conta {
    private double saldo;
    private int numero;

    public Conta(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado na conta " + numero);
        } else {
            System.out.println("Valor de deposito invalido");
        }
    }
    public void sacar(double valor){
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numero);
        } else {
            throw new IllegalArgumentException("Saldo insuficiente! Saldo atual: " + this.saldo);        }
    }

    public abstract String toString();
}
