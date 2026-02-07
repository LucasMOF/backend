package exercicios.DesafioBanco;

public class ContaBancaria {
    int numeroConta;
    String titular;
    private double saldo = 0;

    public ContaBancaria(int numeroContaInput, String titularInput) {
        this.numeroConta = numeroContaInput;
        this.titular = titularInput;

    }

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;

        }else {
            System.out.println("saldo insuficiente");
        }
    }
    double getSaldo(){
        return saldo;
    }
}
