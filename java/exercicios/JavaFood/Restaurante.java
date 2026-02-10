package exercicios.JavaFood;

import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private double avaliacao;
    private ArrayList<Prato> cardapio;

    Restaurante(String nome, double avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.cardapio = new ArrayList<>();
    }

    void adicionarCardapio(String nomePrato, double precoPrato) {
        Prato novoPrato = new Prato(nomePrato, precoPrato);
        cardapio.add(novoPrato);
    }

    void exibirCardapio() {
        System.out.println("--- Cárdapio do " + this.nome + " ---");

        if (cardapio.isEmpty()) {
            System.out.println("Não há pratos nesses restaurante!");
        } else {
            for (int i = 0; i < cardapio.size(); i++) {
                Prato cardapioPrato = cardapio.get(i);
                System.out.println(i + ": ");
                cardapioPrato.exibirPrato();
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public double getAvaliacao() {
        return avaliacao;
    }
}
