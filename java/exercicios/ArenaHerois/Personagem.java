package exercicios.ArenaHerois;

public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    protected void setVida(int vida) {
        this.vida = vida;
    }

    public void receberDano(int dano) {
        this.vida -= dano;

        if (this.vida < 0) {
            this.vida = 0;
        }
        System.out.println("O heroi: " + this.nome + " recebeu " + dano + " de dano");
        System.out.println("Vida restante: " + this.vida);
    }

    public abstract int atacar();
}
