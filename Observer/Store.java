package Observer;

public class Store {
    private final NotificationService notificationService;

    public Store(){
        notificationService = new NotificationService();
    }
    public void newItemPromotion(Event eventType){
        notificationService.notifyCustomers(eventType);
    }
    public NotificationService getNotificationService(){
        return notificationService;
    }
}
