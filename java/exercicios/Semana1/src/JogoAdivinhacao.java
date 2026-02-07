import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();

        int numeroSecreto = gerador.nextInt(101);

        int tentativas = 0;
        int palpites = -1;

        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");
        System.out.println("Tente adivinhar o número entre 0 e 100.");

        while (palpites != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpites = leitor.nextInt();
            tentativas++;


            if (palpites == numeroSecreto) {
                System.out.println("Parabens, Voçê acertou o número em " + tentativas + " tentativas!");
                break;
            } else {
                if (palpites > numeroSecreto) {
                    System.out.println("Número errado, o seu palpite foi maior que o numero");
                } else {
                    System.out.println("Número errado, o seu palpite foi menor que o numero");
                }

            }

        }
    }
}
