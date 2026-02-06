import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Diga o seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Diga a sua altura: ");
        double altura = leitor.nextDouble();

        double IMC = CalcularIMC(peso, altura);

        System.out.printf("Seu IMC é: %.2f \n", IMC);

        if (IMC < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (IMC >= 18.5 && IMC < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (IMC >= 25 && IMC < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

    }

    public static double CalcularIMC(double kilos, double tamanho) {
        return (kilos / (tamanho * tamanho));

    }
}
