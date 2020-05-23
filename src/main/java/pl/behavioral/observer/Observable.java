package pl.behavioral.observer;

public interface Observable {

    void notify(JobPost post);

    void attach(Observer observer);

    void addJob(JobPost post);
}
