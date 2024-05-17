package Brige;

public class ItalianRestaurant extends Restaurant{
    protected ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.addSauce("Tomato");
    }

    @Override
    void addToppings() {
        pizza.addToppings("Cheese");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thin");
    }
}
