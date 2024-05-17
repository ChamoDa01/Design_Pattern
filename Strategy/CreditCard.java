package Strategy;

public class CreditCard {
    private int amount = 1000;
    private final int id;
    private final String expDate;
    private final int cvv;

    public CreditCard(int id, String expDate, int cvv) {

        this.id = id;
        this.expDate = expDate;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

