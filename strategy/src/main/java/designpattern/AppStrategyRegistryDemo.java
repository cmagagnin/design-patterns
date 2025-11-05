package designpattern;

import designpattern.model.Pedido;
import designpattern.registry.FreteStrategyRegistry;
import designpattern.service.FreteCalculator;
import designpattern.strategy.FreteTipo;

public class AppStrategyRegistryDemo {
    public static void main(String[] args) {
        var pedido = new Pedido(2.5, 100.0);
        var registry = new FreteStrategyRegistry();
        var calc = new FreteCalculator(registry.get("PAC")); 
        calc.calcular(pedido);

        calc.setStrategy(registry.get(FreteTipo.SEDEX));
        calc.calcular(pedido); 

        calc.setStrategy(registry.get("TRANSPORTADORA"));
        calc.calcular(pedido); 
    }
}
