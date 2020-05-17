package pl.structural.decorator;

public class VanillaCoffee implements Coffee{
    private Coffee baseCoffee;

    public VanillaCoffee(Coffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost() + 6;
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription() + ", z wanilia";
    }
}
