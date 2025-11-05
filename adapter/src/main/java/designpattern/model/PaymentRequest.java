package designpattern.model;

import java.util.Objects;

public class PaymentRequest {
    private final String cardNumber;
    private final String cvv;   // pode ser null para o moderno
    private final double amount;

    public PaymentRequest(String cardNumber, String cvv, double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        this.cardNumber = Objects.requireNonNull(cardNumber, "cardNumber");
        this.cvv = cvv;
        this.amount = amount;
    }

    public String getCardNumber() { return cardNumber; }
    public String getCvv() { return cvv; }
    public double getAmount() { return amount; }

    @Override
    public String toString() {
        String last4 = cardNumber.length() >= 4 ? cardNumber.substring(cardNumber.length()-4) : cardNumber;
        return "PaymentRequest{amount=R$" + amount + ", card=****" + last4 + "}";
    }
}
