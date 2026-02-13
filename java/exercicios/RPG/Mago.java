package exercicios.RPG;

public class Mago extends Personagem implements Mistico{
    int danoMagico = 35;
    public Mago(String nome, int vida, int danoBase) {
        super(nome, vida, danoBase);
    }

    @Override
    public String atacar(Personagem alvo) {
        alvo.receberDano(getDanoBase());

        return "O " + this.getNome() + " bateu com cajado e deu: "
                + this.getDanoBase() + " de dano ao alvo " + alvo.getNome();
    }

    @Override
    public void lancarMagia(Personagem alvo) {
        alvo.receberDano(danoMagico);
        System.out.println("O " + this.getNome() + " lançou uma bola de fogo e deu: "
                + danoMagico + " de dano ao alvo " + alvo.getNome());
    }
}