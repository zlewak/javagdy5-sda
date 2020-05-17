package pl.constructional.builder;

//klasa posiadajaca informacje o pizzy
public class Pizza {
    private int size;
    private boolean cheese;
    private boolean salami;
    private boolean tomato;
    private String name;
    private boolean ananas;

    public Pizza(int size, boolean cheese, boolean salami, boolean tomato, String name, boolean ananas) {
        this.size = size;
        this.cheese = cheese;
        this.salami = salami;
        this.tomato = tomato;
        this.name = name;
        this.ananas = ananas;
    }
    //ToString sluzacy wyswietleniu wszystkich danych o pizzy
    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese=" + cheese +
                ", salami=" + salami +
                ", tomato=" + tomato +
                ", name='" + name + '\'' +
                ", ananas=" + ananas +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isSalami() {
        return salami;
    }

    public void setSalami(boolean salami) {
        this.salami = salami;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
