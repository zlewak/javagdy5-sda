package pl.constructional.abstractfactory;

public class IronDoor implements Door{
    @Override
    public void getDescription() {
        System.out.println("To sa drzwi metalowe");
    }
}
