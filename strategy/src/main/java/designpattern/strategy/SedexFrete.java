package designpattern.strategy;

import designpattern.model.Pedido;

public class SedexFrete implements FreteStrategy {
    @Override
    public double calcular(Pedido p) {
        return 25.0 + (p.getPesoKg() * 3.0) + (p.getDistanciaKm() * 0.20);
    }
    @Override public String nome() { return "SEDEX"; }
}
