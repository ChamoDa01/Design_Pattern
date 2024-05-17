package Decorator;

public class Main {
    public static void main(String[] args) {
        INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier("GeeksforGeeks")
                )
        );
        notifier.send("Like and Subscribe!!");
    }
}
