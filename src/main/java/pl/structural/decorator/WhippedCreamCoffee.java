package pl.structural.decorator;

public class WhippedCreamCoffee implements Coffee{
    private Coffee baseCoffee;

    public WhippedCreamCoffee(Coffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost() + 4;
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription() + ", z bita smietana";
    }
}
