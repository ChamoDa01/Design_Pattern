package Observer;

public class MobileAppListener implements EventListener{
    private final String email;

    public MobileAppListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Event eventType) {
        System.out.println(eventType + " : Push Notification > > " + email);
    }
}
