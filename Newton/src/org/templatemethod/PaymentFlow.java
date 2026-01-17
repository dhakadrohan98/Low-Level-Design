package org.templatemethod;

public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void calculateFess();
    public abstract void debitAmount();
    public abstract void creditAmount();

    public final void sendMoney() {
        //step1
        validateRequest();

        //step2
        calculateFess();

        //step3
        debitAmount();

        //setp4
        creditAmount();
    }
}
