package exercicios.RPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Arena {
    public static void main(String[] args) {
        ArrayList<Personagem> personagems = new ArrayList<>();

        Guerreiro g = new Guerreiro("Aron", 100, 10);
        Mago m = new Mago("Grate", 80, 5);
        Dragao d = new Dragao("Dragonites", 200, 20);

        personagems.add(g);
        personagems.add(m);
        personagems.add(d);

        System.out.println("=== COMEÇAR BATALHA ===");


            for (Personagem p : personagems) {
                Personagem alvo;

                if (p instanceof Dragao) {
                    alvo = g;
                } else {
                    alvo = d;
                }
                System.out.println(p.atacar(alvo));

                if (p instanceof Mistico) {
                    Mistico mago = (Mistico) p;
                    mago.lancarMagia(alvo);
                }

            }
        }
}
