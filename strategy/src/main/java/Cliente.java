
public class Cliente {

    public static void main(String[] args) {
        Pedido p1 = new Pedido(2.5, 100.0);

        p1.calcularFrete("PAC");
        p1.calcularFrete("SEDEX");
    }
}
