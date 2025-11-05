package designpattern.factory;

import designpattern.api.Notification;
public abstract class NotificationCreator {

    public final void notify(String target, String message) {
        Notification n = createNotification();
        n.configure(target);
        n.send(message);
    }

    protected abstract Notification createNotification();
}
