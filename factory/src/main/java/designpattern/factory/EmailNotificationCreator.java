package designpattern.factory;

import designpattern.api.Notification;
import designpattern.product.EmailNotification;

public class EmailNotificationCreator extends NotificationCreator {
    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
