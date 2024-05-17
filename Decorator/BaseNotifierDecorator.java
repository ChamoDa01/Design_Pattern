package Decorator;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapped;
    protected final DatabaseService databaseService;

    protected BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        this.databaseService = new DatabaseService();
    }

    public void send(String msg){
        wrapped.send(msg);
    }
    public String getUsername(){
        return wrapped.getUsername();
    }
}
