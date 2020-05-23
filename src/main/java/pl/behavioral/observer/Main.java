package pl.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        JobPost newJob = new JobPost("Junior Developer");

        Observer janInformatyk = new ItJobSeeker("Jan Informatyk");

        Observable jobAgency = new EmploymentAgency();
        jobAgency.attach(janInformatyk);

        jobAgency.addJob(newJob);

        jobAgency.attach(new AdvertismentManager());

        Observer bobBudowniczy = new ItJobSeeker("Bob Budowniczy");
        jobAgency.attach(bobBudowniczy);
        JobPost betterJob = new JobPost("Senior Developer");
        jobAgency.addJob(betterJob);



    }
}
