package pl.constructional.builder;

public class Main {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza(12, true, false, true, "Serowa", false);

        Pizza prettyPizza = new PizzaBuilder()
                .addCheese()
                .withName("serowa 2")
                .addSalami()
                .withSize(12)
                .build();

        PizzaBuilder newPizzaBuilder = new PizzaBuilder();
        newPizzaBuilder.addSalami();
        newPizzaBuilder.addCheese();
        newPizzaBuilder.addTomato();
        Pizza newPizzaFromBuilder = newPizzaBuilder.build();
        //wypisanie wszystkich danych o pizzy
        System.out.println(prettyPizza);

        Pizza mojaPizza = new PizzaBuilder()
                .addCheese()
                .withName("serowa 2")
                .addSalami()
                .withSize(12)
                .build();
    }
}
