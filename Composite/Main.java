package Composite;
public class Main {
    public static void main(String[] args) {
        Component hdd = new Leaf("HDD", 7000);
        Component mouse = new Leaf("Mouse", 2000);
        Component cpu = new Leaf("CPU", 10000);
        Component ram = new Leaf("Ram", 8000);
        Component monitor = new Leaf("Moniter", 15000);

        Composite casing = new Composite("Casing");
        Composite motherBoard = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");
        Composite ioDevice = new Composite("I/O Device");

        computer.addComponent(casing);
        computer.addComponent(ioDevice);

        casing.addComponent(motherBoard);
        casing.addComponent(hdd);
        ioDevice.addComponent(monitor);
        ioDevice.addComponent(mouse);

        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        computer.showPrice();
    }

}