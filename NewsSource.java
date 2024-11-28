public interface NewsSource {
    void registerSubscriber(Subscriber subscriber);
    void unregisterSubscriber(Subscriber subscriber);
    String notifyAllSubscribers();
}