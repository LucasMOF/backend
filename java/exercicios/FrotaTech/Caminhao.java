package exercicios.FrotaTech;

public class Caminhao extends Veiculo implements Tributavel{
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
    @Override
    public double calcularIPVA() {
        return this.getEixos() * 500.0;
    }
}
