package Factory;

public class Main {
    public static void main(String[] args) {
        Restaurant beefRes = new BeefBurgerRestaurant();
        Burger beefBurger = beefRes.orderBurger();

        Restaurant veggieRes = new VeggieBurgerRestaurant();
        Burger veggieBurger = veggieRes.orderBurger();
    }
}
