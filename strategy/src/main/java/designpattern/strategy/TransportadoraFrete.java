package designpattern.strategy;

import designpattern.model.Pedido;

public class TransportadoraFrete implements FreteStrategy {
    @Override
    public double calcular(Pedido p) {
        double taxaBase = 50.0;
        double volume = (p.getPesoKg() / 5.0);
        return taxaBase + (volume * 10.0) + (p.getDistanciaKm() * 0.05);
    }
    @Override public String nome() { return "TRANSPORTADORA"; }
}
