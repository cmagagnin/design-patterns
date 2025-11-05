package designpattern.factory;

import designpattern.api.Notification;
import designpattern.product.WhatsAppNotification;

public class WhatsAppNotificationCreator extends NotificationCreator {
    @Override protected Notification createNotification() {
        return new WhatsAppNotification();
    }
}
