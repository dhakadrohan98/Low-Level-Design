package org.factoryProblem;

public class Email {
    String message;

    public Email(String message) {
        this.message = message;
    }

    public void send() {
        System.out.println("sending a email: " + message);
    }
}
