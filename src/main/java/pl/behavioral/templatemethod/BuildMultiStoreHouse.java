package pl.behavioral.templatemethod;

public abstract class BuildMultiStoreHouse implements HouseBuildingTemplate {
    @Override
    public void buildHouse() {
        buildFoundation();
        addWalls();
        addFirstFloor();
        addSecondFloor();
    }

    protected abstract void addSecondFloor();

    protected abstract void addFirstFloor();

    protected abstract void addWalls();

    protected abstract void buildFoundation();
}

