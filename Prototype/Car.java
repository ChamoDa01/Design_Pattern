package Prototype;

public class Car extends Vehicle implements Prototype{
    private int topSpeed;
    public Car(){}
    public Car(Car car){
        super(car);
        this.topSpeed = car.topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                ", topSpeed=" + topSpeed +
                "} ";
    }
}
