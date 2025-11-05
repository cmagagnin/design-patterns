package designpattern.strategy;

import designpattern.model.Pedido;

public class UltraSedexFrete implements FreteStrategy {
    @Override
    public double calcular(Pedido p) {
        return 40.0 + (p.getPesoKg() * 4.0) + (p.getDistanciaKm() * 0.30);
    }
    @Override public String nome() { return "ULTRASEDEX"; }
}
