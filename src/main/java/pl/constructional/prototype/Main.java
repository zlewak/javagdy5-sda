package pl.constructional.prototype;

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

        Pizza clonePizza = originalPizza.clone();
        clonePizza.setName("Sklonowana pizza");

        System.out.println(clonePizza);
    }
}
