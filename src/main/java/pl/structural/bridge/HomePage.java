package pl.structural.bridge;

public class HomePage extends ThemeablePage{

    public HomePage(Theme theme) {
        super(theme);
    }

    public void showPage(){
        System.out.println("Wyswietlam strone startowa");
        theme.show();
    }

}
