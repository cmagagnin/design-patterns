package designpattern.strategy;

import designpattern.model.Pedido;

public class PACFrete implements FreteStrategy {
    @Override
    public double calcular(Pedido p) {
        return 10.0 + (p.getPesoKg() * 1.5) + (p.getDistanciaKm() * 0.10);
    }
    @Override public String nome() { return "PAC"; }
}
