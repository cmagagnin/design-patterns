package designpattern.product;

import designpattern.api.Notification;

public class PushNotification implements Notification {
    private String deviceId;

    @Override
    public void configure(String target) {
        this.deviceId = target;
        System.out.println("Configurando Push para: " + deviceId);
    }

    @Override
    public void send(String message) {
        System.out.println("Enviando Push para " + deviceId + ": " + message);
    }
}
