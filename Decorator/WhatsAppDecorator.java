package Decorator;

public class WhatsAppDecorator extends BaseNotifierDecorator{

    protected WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public void send(String msg){
        super.send(msg);
        String phoneNumber = databaseService.getPhoneNumber(getUsername());
        System.out.println("Sending "+msg+" on Whatsapp to "+ phoneNumber);
    }
}
