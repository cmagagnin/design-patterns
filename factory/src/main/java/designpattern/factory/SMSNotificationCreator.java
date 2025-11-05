package designpattern.factory;

import designpattern.api.Notification;
import designpattern.product.SMSNotification;

public class SMSNotificationCreator extends NotificationCreator {
    @Override
    protected Notification createNotification() {
        return new SMSNotification();
    }
}
