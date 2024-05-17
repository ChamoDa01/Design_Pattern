package Strategy;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy strategy;

    public void processOrder(){
        strategy.collectPaymentDetails();
        if(strategy.validatePaymentDetails()){
            getCost();
            strategy.pay(getTotal());
        }
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    private void getCost(){
        // get amount
        // this.cost = amount
    }
    private int getTotal(){
        return includeDelivery ? cost+10 : cost;
    }
}
