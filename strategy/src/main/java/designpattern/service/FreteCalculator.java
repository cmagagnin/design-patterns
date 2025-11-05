package designpattern.service;

import designpattern.model.Pedido;
import designpattern.strategy.FreteStrategy;

public class FreteCalculator {

    private FreteStrategy strategy;

    public FreteCalculator(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FreteStrategy strategy) {
        this.strategy = strategy;
    }

    public double calcular(Pedido pedido) {
        if (strategy == null) throw new IllegalStateException("Strategy não definida");
        double custo = strategy.calcular(pedido);
        System.out.println("Custo " + strategy.nome() + ": " + custo);
        return custo;
    }
}
