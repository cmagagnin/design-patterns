package designpattern.product;

import designpattern.api.Notification;

public class SMSNotification implements Notification {
    private String phone;

    @Override
    public void configure(String target) {
        this.phone = target;
        System.out.println("Configurando SMS para: " + phone);
    }

    @Override
    public void send(String message) {
        System.out.println("Enviando SMS para " + phone + ": " + message);
    }
}
