import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
    Subject subject = new ConcreteSubject();
    Observer observer1 = new ConcreteObserver1();
    Observer observer2 = new ConcreteObserver2();
    subject.attach(observer1);
    subject.attach(observer2);
    }

    class Subject {
    public ArrayList<Observer> observers;
    Subject() {
    observers = new ArrayList<Observer>();
    }
    public void attach(Observer observer) {
    observers.add(observer);
    }
    public void detach(Observer observer) {
    observers.remove(observer);
    }
    public void notify() {
    for (Observer observer: observers) {
    observer.update(this);
    }
    }
    }
    

    class ConcreteSubject extends Subject {
    int subjectState;
    public int getState() {
    return subjectState;
    }
    }
    

    interface Observer {
    public void update(Subject s);
    }
    

    class ConcreteObserver implements Observer {
    public void update(Subject s) {
    
    }
    
    }
}
    