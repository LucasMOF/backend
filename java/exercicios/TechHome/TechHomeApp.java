package exercicios.TechHome;

import java.util.ArrayList;
import java.util.List;

public class TechHomeApp {
    public static void main(String[] args) {
        List<Dispositivo> minhaCasa = new ArrayList<>();

        SmartTV tvSala = new SmartTV("LG Oled", 55);
        LampadaSmart lampadaQuarto = new LampadaSmart("Philips Hue", "Azul");
        Cafeteira cafeteira = new Cafeteira("Oster Velha de Guerra");

        minhaCasa.add(tvSala);
        minhaCasa.add(lampadaQuarto);
        minhaCasa.add(cafeteira);

        System.out.println("=== 🏠 INICIANDO SISTEMA TECH HOME 🏠 ===\n");

        for (Dispositivo d : minhaCasa) {

            d.ligar();

            System.out.println("   Status: " + d.status());

            if (d instanceof Conectavel) {
                System.out.println("Este dispositivo é Smart!");

                Conectavel aparelhoSmart = (Conectavel) d;
                aparelhoSmart.conectarRede("Wifi_Casa_5G");

            } else {
                // Se não assinou (caso da Cafeteira)
                System.out.println("   ❌ Este dispositivo é Offline (Não conecta).");
            }

            System.out.println("-------------------------------------------------");
        }
    }
}

