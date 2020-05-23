package pl.behavioral.command;

public class TurnOffBulb implements BulbCommand {

    private Bulb bulb;

    public TurnOffBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOff();
    }

    @Override
    public void undo() {
        bulb.turnOn();
    }

    @Override
    public void redo() {
        execute();
    }
}
