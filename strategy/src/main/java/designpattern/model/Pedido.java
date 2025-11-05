package designpattern.model;

public class Pedido {
    private final double pesoKg;
    private final double distanciaKm;

    public Pedido(double pesoKg, double distanciaKm) {
        if (pesoKg <= 0) throw new IllegalArgumentException("pesoKg deve ser > 0");
        if (distanciaKm < 0) throw new IllegalArgumentException("distanciaKm não pode ser negativo");
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
    }

    public double getPesoKg() { return pesoKg; }
    public double getDistanciaKm() { return distanciaKm; }
}
