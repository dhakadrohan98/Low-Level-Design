package org.round2;

//    import java.util.Map;
import java.util.Map;
import java.util.function.Supplier;
public class AnotherEexample {

    class NotificationMakerDemo {

        interface NotificationService {
            void send(String message);
        }


        static NotificationService createSlack() {
            return new NotificationService() {
                @Override
                public void send(String message) {

                }
            };
        }

        static NotificationService createEmail() {
            return new NotificationService() {
                @Override
                public void send(String message) {

                }
            };
        }

        static NotificationService createSms() {
            return new NotificationService() {
                @Override
                public void send(String message) {

                }
            };
        }


        static final Map<String, Supplier<NotificationService>> REGISTRY = Map.of(
                "slack", NotificationMakerDemo::createSlack,
                "email", NotificationMakerDemo::createEmail,
                "sms", NotificationMakerDemo::createSms
        );

        static NotificationService notificationMaker(String type) {
            Supplier<NotificationService> creator = REGISTRY.get(type.toLowerCase());
            if (creator == null) {
                throw new IllegalArgumentException("Unknown notification type: " + type);
            }
            return creator.get();
        }


        public static void main(String[] args) {
            NotificationService notifier = notificationMaker("email");
            notifier.send("Hello Trainer!");
        }
    }

}
