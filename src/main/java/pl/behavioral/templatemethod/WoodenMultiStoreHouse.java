package pl.behavioral.templatemethod;

public class WoodenMultiStoreHouse extends BuildMultiStoreHouse {
    @Override
    protected void addSecondFloor() {
        System.out.println("Stawiam pierwsze pietro");
    }

    @Override
    protected void addFirstFloor() {
        System.out.println("Stawiam parter");
    }

    @Override
    protected void addWalls() {
        System.out.println("Dodaje sciany");
    }

    @Override
    protected void buildFoundation() {
        System.out.println("Dodaje fundamenty");
    }
}
