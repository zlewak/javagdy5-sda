package pl.constructional.abstractfactory;

public class Welder implements DoorExpert{
    @Override
    public void getDescription() {
        System.out.println("Potrafie spawac drzwi metalowe");
    }
}
