package exercicios.RPG;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int vida, int danoBase){
        super(nome, vida, danoBase);
    }

    @Override
    public String atacar(Personagem alvo) {
        alvo.receberDano(getDanoBase());
        return "O " + this.getNome() + " lançou um golpe de espada e deu: "
                + this.getDanoBase() + " de dano ao alvo " + alvo.getNome();
    }
}
