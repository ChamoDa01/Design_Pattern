package Prototype;

public class Bus extends Vehicle implements Prototype{
    private int numOfSeats;

    public Bus(){}
    public Bus(Bus bus) {
        super(bus);
        this.numOfSeats = bus.numOfSeats;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" + super.toString() +
                ", numOfSeats=" + numOfSeats +
                "} ";
    }
}
