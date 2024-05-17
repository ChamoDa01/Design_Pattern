package Prototype;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String color;

    public Vehicle(){}
    public Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'';
    }
}
