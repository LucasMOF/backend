public class CalculadoraBackend {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            boolean Par = verificarPar(i);

            if (Par) {
                System.out.println(i + " -> O método disse que é PAR.");
            } else {
                System.out.println(i + " -> O método disse que é ÍMPAR.");
            }

        }
    }

    public static boolean verificarPar(int num) {
        return (num % 2 == 0);

    }
}
