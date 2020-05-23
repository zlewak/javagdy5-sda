package pl.behavioral.templatemethod;

public class ConcreteHouse extends HouseBuilding {
    @Override
    protected void addCellar() {
        System.out.println("Kopiemy piwnice");
    }

    @Override
    protected void attachRoof() {
        System.out.println("Dodaje dach na betonowy dom");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Dodaje betonowe sciany");
    }

    @Override
    protected void buildFoundation() {
        System.out.println("Stawiam fundament");
    }
}
