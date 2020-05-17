package pl.constructional.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Krola");
        System.out.println(King.NAME);
        King king = King.getInstance();
        king.setGoldAmount(100);
        System.out.println(king.getGoldAmount());

        King newKing = King.getInstance();
        System.out.println("Nowy król");
        System.out.println(newKing.getGoldAmount());
        newKing.setGoldAmount(200);
        System.out.println("Nowy król");
        System.out.println(newKing.getGoldAmount());
        //ten sam krol jest dla calej javy - stad maja zwsze tyle samo zlota
        System.out.println(King.NAME);
        System.out.println(king.getGoldAmount());

        KingEnum kingEnum = KingEnum.INSTANCE;
    }
}
