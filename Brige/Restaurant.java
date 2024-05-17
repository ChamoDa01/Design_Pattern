package Brige;

public abstract class Restaurant {
    protected Pizza pizza;
    protected Restaurant(Pizza pizza){
        this.pizza=pizza;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();

    public void deliver(){
        System.out.println("Order in progress..");
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
    }
}
