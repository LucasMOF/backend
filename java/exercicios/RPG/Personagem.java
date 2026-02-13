package exercicios.RPG;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int danoBase;

    public Personagem(String nome, int vida, int danoBase){
        this.nome = nome;
        this.vida = vida;
        this.danoBase = danoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }

    public void receberDano(int dano){
       this.vida -= dano;
       if (this.vida <= 0){
           System.out.println("O " + this.nome + " morreu");
       }
    }

    public abstract String atacar(Personagem alvo);
}
