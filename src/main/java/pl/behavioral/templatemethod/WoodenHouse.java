package pl.behavioral.templatemethod;

public class WoodenHouse extends HouseBuilding {
    @Override
    protected void addCellar() {
        System.out.println("Niestety nie mozna miec piwnicy");
    }

    @Override
    protected void attachRoof() {
        System.out.println("Dodaje drewnany dach");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Dodaje drewniane sciany");
    }

    @Override
    protected void buildFoundation() {
        System.out.println("Stawiamy drewniane fundamenty");
    }
}
