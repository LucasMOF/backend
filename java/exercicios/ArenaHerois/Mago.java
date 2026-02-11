package exercicios.ArenaHerois;

public class Mago extends Personagem{
    int mana = 100;

    public Mago(String nome, int vida) {
        super(nome, vida);
    }

   public int atacar(){
       System.out.println("Mago lançou Bola de Fogo!");
       mana -= 35;
       return 35;
   }
}
