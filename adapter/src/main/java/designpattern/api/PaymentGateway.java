package designpattern.api;

import designpattern.model.PaymentRequest;

public interface PaymentGateway {
    boolean pay(PaymentRequest request);
}
