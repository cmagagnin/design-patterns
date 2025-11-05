package designpattern.strategy;

import designpattern.model.Pedido;

public interface FreteStrategy {
    double calcular(Pedido pedido);
    default String nome() { return getClass().getSimpleName(); }
}
