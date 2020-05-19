package pl.constructional.prototype;

//interfejs cloneable mowiacy o tym czy klasa moze byc klonowana
public class Pizza implements Cloneable{

    private String name;
    private int size;

    private boolean salami;
    private boolean cheese;
    private boolean tomato;
    private boolean onions;
    private boolean mozarella;
    private boolean chorizo;

    //konstruktor klonujacy - posiada wszystkie pola przepisane z orginalnego obiektu
    public Pizza(Pizza other) {
        this.name = other.name;
        this.size = other.size;
        this.salami = other.salami;
        this.cheese = other.cheese;
        this.tomato = other.tomato;
        this.onions = other.onions;
        this.mozarella = other.mozarella;
        this.chorizo = other.chorizo;
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSalami() {
        return salami;
    }

    public void setSalami(boolean salami) {
        this.salami = salami;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isOnions() {
        return onions;
    }

    public void setOnions(boolean onions) {
        this.onions = onions;
    }

    public boolean isMozarella() {
        return mozarella;
    }

    public void setMozarella(boolean mozarella) {
        this.mozarella = mozarella;
    }

    public boolean isChorizo() {
        return chorizo;
    }

    public void setChorizo(boolean chorizo) {
        this.chorizo = chorizo;
    }

    //metoda ktora sklonuje nam orginalna klase
    @Override
    protected Pizza clone() {
        Pizza clone = new Pizza(this);
        return clone;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", salami=" + salami +
                ", cheese=" + cheese +
                ", tomato=" + tomato +
                ", onions=" + onions +
                ", mozarella=" + mozarella +
                ", chorizo=" + chorizo +
                '}';
    }
}
