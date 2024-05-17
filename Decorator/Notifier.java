package Decorator;

public class Notifier implements INotifier{
    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }

    public void send(String msg){
        String mail = databaseService.getMail(username);
        System.out.println("Sending " + msg + " by mail to " + mail);
    }

    public String getUsername(){
        return username;
    }
}
