package exercicios.Semana2;

public class Carro {
    String modelo;
    int idade;
    private String cor;
    private int velocidade;

    public Carro(String modeloInput, int idadeInput, String corInput) {
        this.modelo = modeloInput;
        this.idade = idadeInput;
        this.cor = corInput;
        this.velocidade = 0; // Todo carro novo começa parado
    }

    void ligar() {
        System.out.println("O carro modelo: " + modelo + " está ligado");
    }

    void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade);
    }

    void frear() {
        if (velocidade >= 10) {
            velocidade -= 10;
            System.out.println("Freando... Velocidade atual: " + velocidade);
        } else {
            System.out.println("Seu carro está muito devagar para frear");
        }

    }

    int getVelocidade() {
        return velocidade;
    }

    void pintar(String novaCor) {
        if (novaCor.equals("Invisivel")) {
            System.out.println("Erro: Cor inválida!");
        } else {
            this.cor = novaCor;
            System.out.println("Carro pintado de " + this.cor);
        }
    }
    public String getCor() {
        return cor;
    }
}
