package pl.behavioral.observer;

public class ItJobSeeker implements Observer {
    private String name;

    public ItJobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void onJobPosted(JobPost job) {
        System.out.println("Witam " + name );
        System.out.println("Mamy nowa oferte " + job.getTitle());
    }
}
