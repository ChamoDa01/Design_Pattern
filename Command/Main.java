package Command;

public class Main {
    public static void main(String[] args) {
        Room livingRoom = new Room();
        livingRoom.setCommand(new SwitchLightCommand(new Light()));

        Room kitchen = new Room();
        kitchen.setCommand(new SwitchLightCommand(new Light()));

        kitchen.executeCommand();
        livingRoom.executeCommand();
    }
}
