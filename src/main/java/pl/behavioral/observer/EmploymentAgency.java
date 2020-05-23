package pl.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EmploymentAgency implements Observable {

    private List<Observer> jobSeekers = new ArrayList<>();

    @Override
    public void notify(JobPost post) {
        for (Observer jobSeeker : jobSeekers) {
            jobSeeker.onJobPosted(post);
        }
    }

    @Override
    public void attach(Observer observer) {
        this.jobSeekers.add(observer);
    }

    @Override
    public void addJob(JobPost post) {
        notify(post);
    }
}
