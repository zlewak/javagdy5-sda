package pl.constructional.builder;

//klasa skladajaca pizze
public class PizzaBuilder {
    private int size;
    private boolean cheese;
    private boolean salami;
    private boolean tomato;
    private String name;
    private boolean ananas;

    public Pizza build(){
        return new Pizza(size, cheese, salami, tomato, name, ananas);
    }

    public PizzaBuilder withSize(int size){
        this.size = size;
        return this;
    }

    public PizzaBuilder addCheese(){
        this.cheese = true;
        return this;
    }

    public PizzaBuilder addSalami(){
        this.salami = true;
        return this;
    }

    public PizzaBuilder addTomato(){
        this.tomato = true;
        return this;
    }

    public PizzaBuilder withName(String name){
        this.name = name;
        return this;
    }

    public PizzaBuilder addAnanas(){
        this.ananas = true;
        return this;
    }
}
