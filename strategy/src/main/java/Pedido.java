public class Pedido {

    private final double pesoKg;

    private final double distanciaKm;

    public Pedido(double pesoKg, double distanciaKm) {
        this.pesoKg = pesoKg;
        this.distanciaKm = distanciaKm;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double calcularFrete(String metodoEnvio) {

        double custoFrete = 0.0;

        switch (metodoEnvio.toUpperCase()) {
            case "PAC":
                custoFrete = 10.0 + (pesoKg * 1.5) + (distanciaKm * 0.10);
                System.out.println("Custo PAC: " + custoFrete);
                break;
            case "SEDEX":
                custoFrete = 25.0 + (pesoKg * 3.0) + (distanciaKm * 0.20);
                System.out.println("Custo SEDEX: " + custoFrete);
                break;
            case "TRANSPORTADORA":
                double taxaBase = 50.0;
                double volume = (pesoKg / 5.0);
                custoFrete = taxaBase + (volume * 10.0) + (distanciaKm * 0.05);
                System.out.println("Custo Transportadora: " + custoFrete);
                break;
            default:
                throw new IllegalArgumentException("Método de envio desconhecido");
        }

        return custoFrete;
    }
}