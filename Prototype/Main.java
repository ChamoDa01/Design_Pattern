package Prototype;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1.clone(); // Deep copy?

        car1.setTopSpeed(150);

        System.out.println(car1);
        System.out.println(car2);
    }
}
