package pl.constructional.abstractfactory;

public class Main {
    public static void main(String[] args) {
        //tutaj dodajemy drzwi po staremu tzn konstruktorem
        Door woodenDoor = new WoodenDoor();
        woodenDoor.getDescription();

        Door ironDoor = new IronDoor();
        ironDoor.getDescription();

        //Tutaj dodajemy drzwi fabryka tzn AbstrctFactory
        DoorFactory woodenDoorFactory = new WoodenDoorFactory();
        DoorFactory ironDoorFactory = new IronDoorFactory();

        Door door = woodenDoorFactory.makeDoor();
        door.getDescription(); //tutaj wypisujemy drzwi drewniane

        //Tutaj najwiekszy plus fabryk abstrakcyjnych
        DoorFactory unknownFactory = null;
        boolean shouldBeIron = false; //wystarczy tylko tu przelaczyc
        if( shouldBeIron){
            unknownFactory = new IronDoorFactory();
        } else {
            unknownFactory = new WoodenDoorFactory();
        }

        Door unknownDoor = unknownFactory.makeDoor();
        DoorExpert unknownExpert = unknownFactory.hireExpert();
        unknownDoor.getDescription();
        unknownExpert.getDescription();
    }
}
