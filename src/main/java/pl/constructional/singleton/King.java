package pl.constructional.singleton;

import java.util.ArrayList;
import java.util.List;

//jednostkowa klasa krola -istnieje tylko jedna na cala jave
public class King {
    public static String NAME = "Mieszko";
    private static King INSTANCE = null; // tutaj mieszka krol
    private int goldAmount = 0;
    private List<String> children = new ArrayList<>();

    private King() {
    }

    //to jedyna metoda ktora mozna wywolac krola
    public static King getInstance(){
        if (INSTANCE == null){
            INSTANCE = new King();
        }
        return INSTANCE;
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(int goldAmount) {
        this.goldAmount = goldAmount;
    }
}
