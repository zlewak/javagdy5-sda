package pl.constructional.factorymethod;

public class Main {
    public static void main(String[] args) {
        //sposob wywolania factoryMethod

        Hamburger burgerChefs = Hamburger.chefsBurger();
        System.out.println(burgerChefs);

        Hamburger hotBurger = Hamburger.veryHotBurger();
        System.out.println(hotBurger);

        Hamburger vegeBurger = Hamburger.vegeBurger();
        System.out.println(vegeBurger);
        //kontrole nad tworzeniem i obiektami ma tylko klasa Hamburgera
        //nie wolno wywolac Hamburger burge = new Hamburger() - poniewaz konstruktor jest ukryty
        //nie wolno tez vegeBurger.setSauce("ostry") - poniewaz pola sa niedostepne
    }
}
