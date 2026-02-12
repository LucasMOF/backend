package exercicios.FrotaTech;

public class Carro extends Veiculo{

    public Carro(String marca, String modelo, String placa){
        super(marca, modelo, placa);
    }

    @Override
    public double calcularPedagio(){
        return 7.00;
    }
}
