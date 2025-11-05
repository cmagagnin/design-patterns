package designpattern.service;

import designpattern.api.PaymentGateway;
import designpattern.model.PaymentRequest;

public class PaymentService {
    private final PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean charge(PaymentRequest request) {
        System.out.println("Iniciando cobrança: " + request);
        boolean ok = gateway.pay(request);
        System.out.println("Pagamento finalizado: " + ok);
        return ok;
    }
}
