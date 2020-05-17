package pl.constructional.abstractfactory;

public class Carpenter implements DoorExpert{
    @Override
    public void getDescription() {
        System.out.println("Potrafie montowac drzwi drewniane");
    }
}
