package designpattern.factory;

import designpattern.api.Notification;
import designpattern.product.PushNotification;

public class PushNotificationCreator extends NotificationCreator {
    @Override
    protected Notification createNotification() {
        return new PushNotification();
    }
}
