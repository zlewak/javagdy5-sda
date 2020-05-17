package pl.constructional.abstractfactory;

public class WoodenDoorFactory implements DoorFactory{
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorExpert hireExpert() {
        return new Carpenter();
    }
}
