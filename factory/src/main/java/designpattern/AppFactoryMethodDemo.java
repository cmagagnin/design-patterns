package designpattern;

import designpattern.factory.EmailNotificationCreator;
import designpattern.factory.NotificationCreator;
import designpattern.factory.SMSNotificationCreator;
import designpattern.service.NotificationService;

public class AppFactoryMethodDemo {
    public static void main(String[] args) {
        NotificationCreator emailCreator = new EmailNotificationCreator();
        NotificationService emailService = new NotificationService(emailCreator);
        emailService.send("aluno@dominio.com", "Olá!");

        System.out.println();

        NotificationCreator smsCreator = new SMSNotificationCreator();
        NotificationService smsService = new NotificationService(smsCreator);
        smsService.send("+5599999999", "Oi!");
    }
}
