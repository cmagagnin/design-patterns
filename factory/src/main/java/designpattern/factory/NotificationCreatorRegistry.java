package designpattern.factory;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationCreatorRegistry {

    private final Map<NotificationType, Supplier<NotificationCreator>> registry = new EnumMap<>(NotificationType.class);

    public NotificationCreatorRegistry() {
        registry.put(NotificationType.EMAIL, EmailNotificationCreator::new);
        registry.put(NotificationType.SMS, SMSNotificationCreator::new);
        registry.put(NotificationType.PUSH, PushNotificationCreator::new);
        registry.put(NotificationType.WHATSAPP, WhatsAppNotificationCreator::new);
    }

    public NotificationCreator get(NotificationType type) {
        Supplier<NotificationCreator> sup = registry.get(type);
        if (sup == null) {
            throw new IllegalArgumentException("Tipo de notificação não suportado: " + type);
        }
        return sup.get();
    }
}
