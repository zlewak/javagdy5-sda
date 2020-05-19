package pl.constructional.factorymethod;

public class Hamburger {

    //informacje o burgerze sa private stad nikt ich nie zmieni poza szefem ktory ma dostep do menu
    private String name;
    private int price;
    private int size;
    private boolean cheese;
    private String sauce;
    private String bun;

    //ukrywamy konstruktor
    private Hamburger() {
    }

    //definiujemy metody statyczne tworzace obiekty
    //przypomina menu dostepnych burgerow
    public static Hamburger vegeBurger(){
        Hamburger burger = new Hamburger();
        burger.price = 10;
        burger.bun = "Pszenna";
        burger.name = "Vege Burger";
        burger.sauce = "Vege";
        burger.cheese = false;
        return burger;
    }

    public static Hamburger veryHotBurger(){
        Hamburger burger = new Hamburger();
        burger.price = 10;
        burger.bun = "Pszenna";
        burger.name = "Mega Ostry burger";
        burger.sauce = "Hot";
        burger.cheese = false;
        return burger;
    }

    public static Hamburger chefsBurger(){
        Hamburger burger = new Hamburger();
        burger.price = 10;
        burger.bun = "Pszenna";
        burger.name = "Burger Szefa";
        burger.sauce = "Lagodny";
        burger.cheese = false;
        return burger;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", cheese=" + cheese +
                ", sauce='" + sauce + '\'' +
                ", bun='" + bun + '\'' +
                '}';
    }
}
