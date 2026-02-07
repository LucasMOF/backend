package exercicios.Semana2;

public class Montadora {
    public static void main(String[] args) {

        Carro c1 = new Carro("Civic", 2025, "Azul");
        c1.ligar();
        c1.acelerar();
        System.out.println("Cor do carro: " + c1.getCor());

    }
}