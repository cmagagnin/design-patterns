package designpattern.product;

import designpattern.api.Notification;

public class WhatsAppNotification implements Notification {
    private String number;
    @Override public void configure(String target) {
        this.number = target;
        System.out.println("Configurando WhatsApp para: " + number);
    }
    @Override public void send(String message) {
        System.out.println("Enviando WhatsApp para " + number + ": " + message);
    }
}
