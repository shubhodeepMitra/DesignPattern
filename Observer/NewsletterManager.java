import java.util.HashMap;
import java.util.Map;

public class NewsletterManager {
    private Map<String, Newsletter> newsletters;

    public NewsletterManager() {
        this.newsletters = new HashMap<>();
    }

    public void createNewsletter(String name) {
        newsletters.put(name, new Newsletter(name));
    }

    public void subscribe(String newsletterName, Subscriber subscriber) {
        Newsletter newsletter = newsletters.get(newsletterName);
        if (newsletter != null) {
            newsletter.addObserver(subscriber);
        } else {
            System.out.println("Newsletter " + newsletterName + " does not exist.");
        }
    }

    public void unsubscribe(String newsletterName, Subscriber subscriber) {
        Newsletter newsletter = newsletters.get(newsletterName);
        if (newsletter != null) {
            newsletter.removeObserver(subscriber);
        } else {
            System.out.println("Newsletter " + newsletterName + " does not exist.");
        }
    }

    public void publishIssue(String newsletterName, String issue) {
        Newsletter newsletter = newsletters.get(newsletterName);
        if (newsletter != null) {
            newsletter.publishNewIssue(issue);
        } else {
            System.out.println("Newsletter " + newsletterName + " does not exist.");
        }
    }
}
