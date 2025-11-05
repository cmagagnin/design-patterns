package designpattern.adapters;

import designpattern.api.PaymentGateway;
import designpattern.model.PaymentRequest;
import gohorse.aplicacaomoderna.INovoGatewayPagamento;

public class ModernPaymentAdapter implements PaymentGateway {
    private final INovoGatewayPagamento modern;

    public ModernPaymentAdapter(INovoGatewayPagamento modern) {
        this.modern = modern;
    }

    @Override
    public boolean pay(PaymentRequest request) {
        return modern.processarPagamento(request.getCardNumber(), request.getAmount());
    }
}
