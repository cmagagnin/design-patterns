package designpattern;

import designpattern.factory.NotificationCreator;
import designpattern.factory.NotificationCreatorRegistry;
import designpattern.factory.NotificationType;
import designpattern.service.NotificationService;

public class AppFactoryRegistryDemo {
    public static void main(String[] args) {
        NotificationCreatorRegistry registry = new NotificationCreatorRegistry();

        NotificationCreator email = registry.get(NotificationType.EMAIL);
        new NotificationService(email).send("aluno@dominio.com", "Olá!");

        System.out.println();

        NotificationCreator sms = registry.get(NotificationType.SMS);
        new NotificationService(sms).send("+5599999999", "Oi!");
    }
}
