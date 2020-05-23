package pl.behavioral.command;

public class SimpleShop implements BuySellCommand {

    private int number = 20;

    @Override
    public void sell(Bulb bulb) {
        System.out.println("Sprzedaje");
        ServiceCheck serviceCheck = new ServiceCheck(bulb);
        serviceCheck.execute();
        number--;
        System.out.println("Zostalo" + number);
    }

    @Override
    public void buy() {
        System.out.println("Kupuje");
        number++;
        System.out.println("Zostalo" + number);
    }
}
