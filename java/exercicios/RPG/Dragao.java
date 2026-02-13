package exercicios.RPG;

public class Dragao extends Personagem{
    public Dragao(String nome, int vida, int danoBase) {
        super(nome, vida, danoBase);
    }

    @Override
    public String atacar(Personagem alvo) {
        alvo.receberDano(getDanoBase());
        return "O " + this.getNome() + " deu uma mordida e deu: "
                + this.getDanoBase() + " de dano ao alvo " + alvo.getNome();
    }
}
