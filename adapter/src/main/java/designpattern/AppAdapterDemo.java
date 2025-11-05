package designpattern;

import designpattern.adapters.LegacyPaymentAdapter;
import designpattern.adapters.ModernPaymentAdapter;
import designpattern.model.PaymentRequest;
import designpattern.service.PaymentService;
import gohorse.aplicacaolegada.ApiPagamentoLegado;
import gohorse.aplicacaomoderna.GatewayPagamentoModerno;
import gohorse.aplicacaomoderna.INovoGatewayPagamento;

public class AppAdapterDemo {
    public static void main(String[] args) {
        // Moderno
        INovoGatewayPagamento moderno = new GatewayPagamentoModerno();
        PaymentService serviceModern = new PaymentService(new ModernPaymentAdapter(moderno));
        serviceModern.charge(new PaymentRequest("1111", null, 100.0));

        System.out.println();

        // Legado
        ApiPagamentoLegado legado = new ApiPagamentoLegado();
        PaymentService serviceLegacy = new PaymentService(new LegacyPaymentAdapter(legado));
        serviceLegacy.charge(new PaymentRequest("2222", "456", 200.0));
    }
}
