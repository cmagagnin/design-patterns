package designpattern.service;

import designpattern.factory.NotificationCreator;
public class NotificationService {

    private final NotificationCreator creator;

    public NotificationService(NotificationCreator creator) {
        this.creator = creator;
    }

    public void send(String target, String message) {
        creator.notify(target, message);
    }
}
