package exercicios.FinBank;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero){
        super(numero);
    }

    @Override
    public String toString() {
        return "A conta: " + this.getNumero() + " | Saldo: " + getSaldo();
    }
}
