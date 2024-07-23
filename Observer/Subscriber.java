public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String newsletterName, String issue) {
        System.out.println("Hello " + name + ", there's a new issue of " + newsletterName + ": " + issue);
    }
}
