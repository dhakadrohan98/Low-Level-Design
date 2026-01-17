package org.templatemethod;

public class Client {

    public static void main(String[] args) {
        System.out.println("Bank transfer payment processing");
        PaymentFlow paymentFlow = new PaymentToFriend();
        paymentFlow.sendMoney();
        System.out.println();
        System.out.println("Merchant payment processing");
        paymentFlow = new PaymentToMerchant();
        paymentFlow.sendMoney();
    }
}
