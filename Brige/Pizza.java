package Brige;

public abstract class Pizza {
    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void addSauce(String sauce) {
        this.sauce = sauce;
    }

    public void addToppings(String toppings) {
        this.toppings = toppings;
    }
}
