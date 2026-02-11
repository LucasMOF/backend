package exercicios.ArenaHerois;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida) {
        super(nome, vida);
    }
    @Override
    public int atacar(){
        System.out.println("Guerreiro atacou com Espada!");
        return 20;

    }

}
