package Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        // the strategy can now be easily picked at runtime
        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
    }
}
