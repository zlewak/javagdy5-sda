package pl.behavioral.templatemethod;

public abstract class HouseBuilding implements HouseBuildingTemplate{

    //template method
    public void buildHouse(){
        buildFoundation();
        buildWalls();
        attachRoof();
        addCellar();
    }

    protected abstract void addCellar();

    protected abstract void attachRoof();

    protected abstract void buildWalls();

    protected abstract void buildFoundation();
}
