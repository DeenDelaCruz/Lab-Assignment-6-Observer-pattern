import java.util.*;

public class Main {
    public static void main(String[] args) {

        Subscriber user1 = new Subscriber();
        user1.setFullName("Robi");

        Subscriber user2 = new Subscriber();
        user2.setFullName("Chino");

        Subscriber user3 = new Subscriber();
        user3.setFullName("Ced");


        List<Subscriber> registeredSubscribers = new ArrayList<>();


        NewsAgency broadcaster = new NewsAgency();
        broadcaster.setSubscriberRegistry(registeredSubscribers);
        broadcaster.registerSubscriber(user1);
        broadcaster.registerSubscriber(user2);
        broadcaster.registerSubscriber(user3);


        broadcaster.broadcastNews("Typhoon Leon has reached Signal #1!");

        System.out.println("\n--- First News Broadcast ---");
        System.out.println(broadcaster.notifyAllSubscribers());


        broadcaster.unregisterSubscriber(user3);

        Subscriber newUser = new Subscriber();
        newUser.setFullName("Elmo");
        broadcaster.registerSubscriber(newUser);

        System.out.println("\n--- Updated News Broadcast ---");
        System.out.println(broadcaster.notifyAllSubscribers());


        newUser.receiveNotification(broadcaster);
    }
}