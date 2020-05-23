package pl.behavioral.command;

public class TurnOnBulb implements BulbCommand {

    private Bulb bulb;

    public TurnOnBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOn();
    }

    @Override
    public void undo() {
        bulb.turnOff();
    }

    @Override
    public void redo() {
        execute();
    }
}
