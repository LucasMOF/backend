package exercicios.TechHome;

public abstract class Dispositivo {
    private String nome;
    private boolean ligado;

    public Dispositivo(String nome) {
        this.nome = nome;
        this.ligado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Dispositivo ligado");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Dispositivo desligado");
    }
    public abstract String status();
}
