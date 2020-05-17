package pl.constructional.abstractfactory;

public class IronDoorFactory implements DoorFactory{
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorExpert hireExpert() {
        return new Welder();
    }
}
