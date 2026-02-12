package exercicios.FrotaTech;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String marca, String modelo, String placa, int eixos){
        super(marca, modelo, placa);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public double calcularPedagio(){
        return eixos * 7.00;
    }

    @Override
    public String toString() {
        return super.toString() + " | Eixos: " + this.eixos;
    }
}
