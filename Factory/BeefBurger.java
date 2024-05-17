package Factory;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing BeefBurger..");
    }
}
