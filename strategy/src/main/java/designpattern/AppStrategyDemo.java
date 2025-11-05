package designpattern;

import designpattern.model.Pedido;
import designpattern.service.FreteCalculator;
import designpattern.strategy.*;

public class AppStrategyDemo {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(2.5, 100.0);

        FreteCalculator calc = new FreteCalculator(new PACFrete());
        calc.calcular(p1); 

        calc.setStrategy(new SedexFrete());
        calc.calcular(p1); 

        calc.setStrategy(new TransportadoraFrete());
        calc.calcular(p1); 
    }
}
