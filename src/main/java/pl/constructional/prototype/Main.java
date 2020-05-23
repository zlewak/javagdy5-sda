package pl.constructional.prototype;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //przyklad uzycia prototype
        //tworzymy sobie skomplikowana pizze

        Pizza originalPizza = new Pizza();
        originalPizza.setCheese(true);
        originalPizza.setSize(20);
        originalPizza.setChorizo(true);
        originalPizza.setOnions(true);
        originalPizza.setMozarella(true);
        originalPizza.setName("Orginalna pizza");

        System.out.println(originalPizza);

        //pierwsza forma klonowania
        Pizza clonePizza = originalPizza.clone();
        //druga forma klonowania
        Pizza newClone = new Pizza(originalPizza);

        clonePizza.setName("Sklonowana pizza");

        System.out.println(clonePizza);

    }
}
