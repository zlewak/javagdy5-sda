package pl.behavioral.observer;

public class AdvertismentManager implements Observer {
    @Override
    public void onJobPosted(JobPost job) {
        System.out.println("Publikuje to na facebooku" + job.getTitle());
    }
}
