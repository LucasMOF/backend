package exercicios.FrotaTech;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo, String placa) {
        super(marca, modelo, placa);
    }
    @Override
    public double calcularPedagio(){
        return 7.00 / 2;
    }
}
