package Factory;

public abstract class Restaurant {
    public abstract Burger createBurger();
    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }
}
