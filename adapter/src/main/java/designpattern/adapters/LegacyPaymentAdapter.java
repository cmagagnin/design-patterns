package designpattern.adapters;

import designpattern.api.PaymentGateway;
import designpattern.model.PaymentRequest;
import gohorse.aplicacaolegada.ApiPagamentoLegado;

public class LegacyPaymentAdapter implements PaymentGateway {
    private final ApiPagamentoLegado legacy;

    public LegacyPaymentAdapter(ApiPagamentoLegado legacy) {
        this.legacy = legacy;
    }

    @Override
    public boolean pay(PaymentRequest request) {
        String cvv = request.getCvv();
        if (cvv == null || cvv.isBlank()) {
            throw new IllegalArgumentException("CVV é obrigatório para o gateway legado.");
        }
        legacy.realizarCobranca(request.getAmount(), request.getCardNumber(), cvv);
        return true; // a API legada não retorna boolean; assumimos sucesso
    }
}
