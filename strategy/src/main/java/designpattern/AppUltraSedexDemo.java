package designpattern;

import designpattern.model.Pedido;
import designpattern.registry.FreteStrategyRegistry;
import designpattern.service.FreteCalculator;
import designpattern.strategy.FreteTipo;

public class AppUltraSedexDemo {
    public static void main(String[] args) {
        var pedido = new Pedido(2.5, 100.0);
        var calc = new FreteCalculator(new FreteStrategyRegistry().get(FreteTipo.ULTRASEDEX));
        calc.calcular(pedido);
    }
}
