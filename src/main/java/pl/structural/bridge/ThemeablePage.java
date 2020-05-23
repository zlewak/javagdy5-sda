package pl.structural.bridge;

public abstract class ThemeablePage implements Page{

    protected Theme theme;

    public ThemeablePage(Theme theme) {
        this.theme = theme;
    }

    public abstract void showPage();
}
