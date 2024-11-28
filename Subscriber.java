public class Subscriber implements NewsObserver {
    private String fullName;


    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public void receiveNotification(NewsAgency broadcaster) {
        System.out.println("Hello, " + fullName + "!");
        System.out.println("LATEST HEADLINE: " + broadcaster.getHeadline());
    }
}