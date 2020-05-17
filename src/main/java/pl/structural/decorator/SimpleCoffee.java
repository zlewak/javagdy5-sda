package pl.structural.decorator;

//bazowa kawa, ktora jest podstawa wszystkich kaw
public class SimpleCoffee implements Coffee{
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Zwykla kawa";
    }
}
