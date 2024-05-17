package Strategy;

public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect card details..
        card = new CreditCard(234861533,"01/27",233);
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate credit card..
        return true;
    }

    public void pay(int amount){
        System.out.println("Paying "+ amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }
}
