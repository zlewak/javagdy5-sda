package pl.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Bulb myBulb = new Bulb();
        TurnOnBulb turnOn = new TurnOnBulb(myBulb);
        TurnOffBulb turnOff = new TurnOffBulb(myBulb);

        turnOn.execute();
        turnOn.undo();
        turnOn.redo();

        turnOff.execute();

        ServiceCheck check = new ServiceCheck(myBulb);
        check.execute();

        SimpleShop shop = new SimpleShop();
        shop.sell(myBulb);
    }
}
