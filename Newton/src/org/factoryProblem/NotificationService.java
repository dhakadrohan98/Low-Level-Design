package org.factoryProblem;

public class NotificationService {

    public String send(String type, String message) {
        String ans = "";
        switch (type) {
            case "Email": {
                Email email = new Email(message);
                email.send();
                break;
            }

            case "SMS": {
                SMS sms = new SMS(message);
                sms.send();
                break;
            }

            //any new case addition violates single responsibility and open closed principle
            //like whatsapp, slack, discord, Teams, push etc notifications cases handling

            default: throw new IllegalArgumentException("Notification type is invalid " + type);
        }
        return ans;
    }
}
