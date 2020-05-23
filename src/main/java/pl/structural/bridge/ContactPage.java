package pl.structural.bridge;

public class ContactPage extends ThemeablePage{

    public ContactPage(Theme theme) {
        super(theme);
    }

    public void showPage(){
        System.out.println("Wyswietlam strone kontaktowa");
        theme.show();
    }
}
