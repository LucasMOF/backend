public class SistemaPagamento {
    public static void main(String[] args) {
        double limiteDisponivel = 500.00;
        double[] compras = {100.0, 250.0, 150.0, 60.0, -20.0};

        System.out.println("--- Início do Processamento ---");

        for (double valor : compras) {

            boolean aprovado = autorizarCompra(valor, limiteDisponivel);

            if (aprovado) {
                limiteDisponivel -= valor;
                System.out.println("Compra de R$" + valor + " APROVADA. Limite restante: R$" + limiteDisponivel);
            } else {
                System.out.println("Compra de R$" + valor + " NEGADA. Limite insuficiente ou valor inválido.");
            }
        }

        System.out.println("--- Fim das operações ---");
    }

    public static boolean autorizarCompra(double valor, double AtualLimite){
        return (valor > 0 && valor <= AtualLimite);
    }
}
