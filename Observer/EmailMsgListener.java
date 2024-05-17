package Observer;

public class EmailMsgListener implements EventListener {
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    public void update(Event eventType){
        System.out.println(eventType + " : Sending email > > " + email);
    }
}
