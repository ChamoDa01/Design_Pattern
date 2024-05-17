package Strategy;

public class PaymentByPayPal implements PaymentStrategy{
    // private PaypalAcc acc;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect account details..
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate credit account..
        return true;
    }

    public void pay(int amount){
        System.out.println("Paying "+ amount + " using Paypal");
        // acc.setAmount(acc.getAmount() - amount);
    }
}
