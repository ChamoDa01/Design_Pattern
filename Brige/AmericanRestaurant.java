package Brige;

public class AmericanRestaurant extends Restaurant{
    protected AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.addSauce("Secret recipe");
    }

    @Override
    void addToppings() {
        pizza.addToppings("All");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
