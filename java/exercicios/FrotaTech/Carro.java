package exercicios.FrotaTech;

public class Carro extends Veiculo implements Tributavel{

    public Carro(String marca, String modelo, String placa){
        super(marca, modelo, placa);
    }

    @Override
    public double calcularPedagio(){
        return 7.00;
    }
    @Override
    public double calcularIPVA() {
        return 1000.0;
    }
}
