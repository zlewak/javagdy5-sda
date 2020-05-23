package pl.behavioral.command;

public class ServiceCheck implements BulbCommand {
    private Bulb bulb;

    public ServiceCheck(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        System.out.println("Sprawdzam czy zarowka dziala");
        bulb.turnOn();
        bulb.turnOff();
    }

    @Override
    public void undo() {
        System.out.println("Cofam sprwadzenie");
    }

    @Override
    public void redo() {
        execute();
    }
}
