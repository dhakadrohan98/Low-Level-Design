package org.round2;

interface Notification {
    void send(String message);
}

class Email implements Notification {

    @Override
    public void send(String message) {
        //email specific
        System.out.println("sending email: " + message);
    }

}

class SMS implements Notification {
    public void send(String message) {
        //sms specific
        System.out.println("sending sms: " + message);
    }
}

class Slack implements Notification {
    public void send(String message) {
        //email specific
        System.out.println("sending slack notification: " + message);
    }
}

class NotificationFactory {

    public static Notification getInstance(String type) {
        switch (type) {
            case "Email" : return new Email();

            case "SMS": return new SMS();

            case "Slack": return new Slack();

            default: throw new IllegalStateException("notification type is invalid");

        }
    }
}

//Drive code
public class Client {

    public static void main(String[] args) {
        //Email
        Notification notification = NotificationFactory.getInstance("Email");
        notification.send("sending code: UHJ878Z");
    }
}

