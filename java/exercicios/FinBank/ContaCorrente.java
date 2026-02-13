package exercicios.FinBank;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int numero){
        super(numero);
    }

    @Override
    public String toString() {
        return "A conta: " + this.getNumero() + " | Saldo" + getSaldo();
    }

    @Override
    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
