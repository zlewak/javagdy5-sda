package pl.structural.decorator;


public class Main {
    public static void main(String[] args) {
        //rozpoczynam tworzac bazowa kawe - bez tego nie zaserwuje kawy z mlekiem
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getCost());
        System.out.println(myCoffee.getDescription());

        //dodaje mleko
        Coffee milkCoffee = new MilkCoffee(myCoffee);
        System.out.println(milkCoffee.getCost());
        System.out.println(milkCoffee.getDescription());

        //dodajemy bita smietane
        Coffee withCream = new WhippedCreamCoffee(milkCoffee);
        System.out.println(withCream.getCost());
        System.out.println(withCream.getDescription());

        //dodajemy wanilie - mamy super kawe ze wszystkim
        Coffee superCoffee = new VanillaCoffee(withCream);
        System.out.println(superCoffee.getCost());
        System.out.println(superCoffee.getDescription());

        //uproszczony format
        Coffee vanillaCoffee = new VanillaCoffee(new SimpleCoffee());
        System.out.println(vanillaCoffee.getCost());
        System.out.println(vanillaCoffee.getDescription());

        Coffee coffee = dodajDodatek(superCoffee);
        System.out.println(vanillaCoffee.getCost());
        System.out.println(vanillaCoffee.getDescription());
    }

    private static Coffee dodajDodatek(Coffee previousVersion){
        return new VanillaCoffee(previousVersion);
    }
}
