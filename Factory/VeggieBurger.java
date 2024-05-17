package Factory;

public class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing VeggieBurger..");
    }
}
