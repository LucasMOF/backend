package fundamentos.heranca;

import java.util.ArrayList;

public class ContaTeste {
    public static void main(String[] args) {
        ArrayList<Conta> listaBancaria = new ArrayList<>();

        ContaCorrente c1 = new ContaCorrente("Batman");
        ContaPoupanca c2 = new ContaPoupanca("Peter park");

        c1.depositar(200);
        c2.depositar(200);

        listaBancaria.add(c1);
        listaBancaria.add(c2);


        for (Conta c : listaBancaria){
            c.sacar(100);

            System.out.println("Saldo final: " + c.getSaldo());
        }


    }
}
