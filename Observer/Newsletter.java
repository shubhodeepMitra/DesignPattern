import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject {
    private List<Observer> observers;
    private String name;
    private String latestIssue;

    public Newsletter(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void publishNewIssue(String issue) {
        this.latestIssue = issue;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, latestIssue);
        }
    }
}
