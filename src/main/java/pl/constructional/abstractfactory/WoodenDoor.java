package pl.constructional.abstractfactory;

public class WoodenDoor implements Door{
    @Override
    public void getDescription() {
        System.out.println("To sa drzwi drewniane");
    }
}
