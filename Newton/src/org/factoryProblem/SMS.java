package org.factoryProblem;

public class SMS {
    String message;

    public SMS(String message) {
        this.message = message;
    }

    public void send() {
        System.out.println("sending a sms: " + message);
    }
}
