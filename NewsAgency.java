import java.util.*;

public class NewsAgency implements NewsSource {
    private String headline;
    private List<Subscriber> subscriberRegistry;

    // Retrieve the latest headline
    public String getHeadline() {
        return headline;
    }

    // Publish a new headline
    public void broadcastNews(String news) {
        this.headline = news;
    }

    // Retrieve the subscriber registry
    public List<Subscriber> getSubscriberRegistry() {
        return subscriberRegistry;
    }

    // Set the subscriber registry
    public void setSubscriberRegistry(List<Subscriber> subscriberRegistry) {
        this.subscriberRegistry = subscriberRegistry;
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscriberRegistry.add(subscriber);
        System.out.println(subscriber.getFullName() + " has joined the broadcast!");
    }

    @Override
    public void unregisterSubscriber(Subscriber subscriber) {
        subscriberRegistry.remove(subscriber);
        System.out.println(subscriber.getFullName() + " has left the broadcast.");
    }

    @Override
    public String notifyAllSubscribers() {
        StringBuilder notificationMessage = new StringBuilder();
        for (Subscriber subscriber : subscriberRegistry) {
            notificationMessage.append("Greetings, ").append(subscriber.getFullName()).append("!\n");
            notificationMessage.append("HEADLINE: ").append(headline).append("\n\n");
        }
        return notificationMessage.toString();
    }
}