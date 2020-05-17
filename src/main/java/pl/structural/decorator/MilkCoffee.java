package pl.structural.decorator;

//rozszerzona kawa, ktora dodaje mleko
public class MilkCoffee implements Coffee{
    private Coffee baseCoffee;

    public MilkCoffee(Coffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription() + ", z mlekiem";
    }
}
