package Observer;

public class Main {
    public static void main(String[] args) {
        Store st = new Store();
        st.getNotificationService().subscribe(Event.New_Item,new MobileAppListener("notification_1"));
        st.getNotificationService().subscribe(Event.New_Item,new EmailMsgListener("email_1"));

        st.getNotificationService().subscribe(Event.Sale,new EmailMsgListener("email_2"));
        st.getNotificationService().subscribe(Event.Sale,new MobileAppListener("notification_2"));

        st.newItemPromotion(Event.New_Item);

        st.newItemPromotion(Event.Sale);

    }
}
