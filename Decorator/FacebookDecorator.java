package Decorator;

public class FacebookDecorator extends BaseNotifierDecorator {
    protected FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String msg){
        super.send(msg);
        String fbName = databaseService.getFBName(getUsername());
        System.out.println("Sending "+msg+" on Facebook to "+fbName);
    }
}
