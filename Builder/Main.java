package Builder;

public class Main {
    public static void main(String[] args) {
        CharacterBuilder builder = new CharacterBuilder();

        Character ninja = builder.type("Ninja").health(100).attackPoint(5).build();
        Character devil = builder.type("Devil").health(150).attackPoint(10).isArmour(false).build();

        System.out.println(ninja);
        System.out.println(devil);
    }
}
