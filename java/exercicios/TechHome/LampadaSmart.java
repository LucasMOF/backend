package exercicios.TechHome;

public class LampadaSmart extends Dispositivo implements Conectavel{
    private String cor;

    public LampadaSmart(String nome, String cor){
        super(nome);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String status() {
        String estado = this.isLigado() ? "ACESSA" : "APAGADA"; // Ternário chique
        return "Lâmpada: " + this.getNome() + " | Estado: "
                + estado + " | Cor atual: " + this.cor;
    }

    @Override
    public boolean conectarRede(String nomeRede) {
        System.out.println(this.getNome() + " sincronizada com o App na rede " + nomeRede);
        return true;
    }
}
