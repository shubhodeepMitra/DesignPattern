public class Main {
    public static void main(String[] args) {
        // Create a newsletter manager
        NewsletterManager manager = new NewsletterManager();

        // Create newsletters
        manager.createNewsletter("Tech Newsletter");
        manager.createNewsletter("Sports Newsletter");

        // Create subscribers
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        // Subscribe to newsletters
        manager.subscribe("Tech Newsletter", alice);
        manager.subscribe("Tech Newsletter", bob);
        manager.subscribe("Sports Newsletter", bob);
        manager.subscribe("Sports Newsletter", charlie);

        // Publish new issues
        manager.publishIssue("Tech Newsletter", "Issue 1: Java 17 Features");
        manager.publishIssue("Sports Newsletter", "Issue 1: Olympics 2024 Highlights");

        // Unsubscribe Bob from Tech Newsletter
        manager.unsubscribe("Tech Newsletter", bob);

        // Publish another issue
        manager.publishIssue("Tech Newsletter", "Issue 2: Python 3.10 Features");
    }
}
