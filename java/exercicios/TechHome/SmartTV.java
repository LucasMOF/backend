package exercicios.TechHome;

public class SmartTV extends Dispositivo implements Conectavel{
    private int canal;

    public SmartTV(String nome, int canal){
        super(nome);
        this.canal = canal;
    }
    @Override
    public boolean conectarRede(String nomeRede){
        System.out.println("Conectando: " + this.getNome() + " ao WI-FI: " + nomeRede);
        System.out.println("Conexão foi um sucesso!");
        return true;

    }
    @Override
    public String status(){
        String estado = this.isLigado() ? "LIGADO" : "DESLIGADO";
        return "TV " + this.getNome() + " | Estado: " + estado + " | Canal: " + this.canal;

    }
}
