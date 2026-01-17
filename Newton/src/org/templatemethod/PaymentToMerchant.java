package org.templatemethod;

public class PaymentToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Valildating request from and to accounts for Merchant");
    }

    @Override
    public void calculateFess() {
        System.out.println("2% transfer fees for terminal");
    }

    @Override
    public void debitAmount() {
        System.out.println("Amount is debited from customer account:");
    }

    @Override
    public void creditAmount() {
        System.out.println("Amount is credited to merchant account:");
    }
}
