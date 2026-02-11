package exercicios.ArenaHerois;

import java.util.ArrayList;

public class Arena {
    public static void main(String[] args) {
        ArrayList<Personagem> listaPersonagem = new ArrayList<>();

        Guerreiro p1 = new Guerreiro("Aron", 120);
        Mago p2 = new Mago("Joses", 100);

        listaPersonagem.add(p1);
        listaPersonagem.add(p2);

        while (p1.getVida() > 0 && p2.getVida() > 0) {
            int danoGuerreiro = p1.atacar();
            p2.receberDano(danoGuerreiro);


            if (p2.getVida() <= 0) {
                System.out.println("O Mago foi derrotado!");
                break;
            }
            if (p2.mana >= 35) {
                int danoMago = p2.atacar();
                p1.receberDano(danoMago);
            } else {
                System.out.println("Mago sem mana, impossivel atacar");
            }
            if (p1.getVida() <= 0) {
                System.out.println("O Guerreiro foi derrotado!");
                break;
            }

        }
    }
}

