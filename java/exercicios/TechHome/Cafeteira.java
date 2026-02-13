package exercicios.TechHome;

public class Cafeteira extends Dispositivo{

    public Cafeteira(String nome){
        super(nome);
    }

    @Override
    public String status() {
        if (this.isLigado()) {
            return "Cafeteira " + this.getNome() + ": Fazendo café... ☕";
        } else {
            return "Cafeteira " + this.getNome() + ": Aguardando comando.";
        }
    }

}
