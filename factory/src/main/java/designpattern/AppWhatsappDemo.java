package designpattern;

import designpattern.factory.*;
import designpattern.service.NotificationService;

public class AppWhatsappDemo {
    public static void main(String[] args) {
        NotificationCreatorRegistry registry = new NotificationCreatorRegistry();
        NotificationCreator wa = registry.get(NotificationType.WHATSAPP);
        new NotificationService(wa).send("+55 99 99999-9999", "Mensagem via WhatsApp!");
    }
}
