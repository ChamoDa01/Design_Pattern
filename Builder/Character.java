package Builder;

public class Character {
    private final String name;
    private final String type;
    private final int health;
    private final int attackPoint;
    private final boolean armour;

    public Character(String name, String type, int health, int attackPoint, boolean armour) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attackPoint = attackPoint;
        this.armour = armour;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", attackPoint=" + attackPoint +
                ", armour=" + armour +
                '}';
    }
}
