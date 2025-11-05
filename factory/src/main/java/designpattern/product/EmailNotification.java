package designpattern.product;

import designpattern.api.Notification;

public class EmailNotification implements Notification {
    private String email;

    @Override
    public void configure(String target) {
        this.email = target;
        System.out.println("Configurando E-mail para: " + email);
    }

    @Override
    public void send(String message) {
        System.out.println("Enviando E-mail para " + email + ": " + message);
    }
}
