package pl.behavioral.command;

public class LedBulb extends Bulb{

    @Override
    public void turnOn() {
        System.out.println("Jestem zarowka ledowa");
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Jestem zarowka ledowa");
        super.turnOff();
    }
}
