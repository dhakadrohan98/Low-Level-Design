package org.templatemethod;

public class PaymentToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Valildating request from and to accounts for Friend");
    }

    @Override
    public void calculateFess() {
        System.out.println("0% transafer fees");
    }

    @Override
    public void debitAmount() {
        System.out.println("Amount is debited from Friend account:");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount is credited to Friend account:");
    }
}
