package Command;

public class Room {
    Command command;

    public void setCommand(Command command){
        this.command=command;
    }
    public void executeCommand(){
        command.execute();
    }
}
