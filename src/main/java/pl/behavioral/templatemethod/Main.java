package pl.behavioral.templatemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseBuildingTemplate houseBuilding = new WoodenHouse();
        HouseBuildingTemplate concreteHouse = new ConcreteHouse();
        HouseBuildingTemplate multistoreHouse = new WoodenMultiStoreHouse();

        List<HouseBuildingTemplate> allToDo = new ArrayList<>();
        allToDo.add(houseBuilding);
        allToDo.add(concreteHouse);
        allToDo.add(multistoreHouse);
        allToDo.add(multistoreHouse);

        for (HouseBuildingTemplate houseBuildingTemplate : allToDo) {
            houseBuilding.buildHouse();
        }

    }


}
