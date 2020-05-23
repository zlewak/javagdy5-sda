package pl.structural.bridge;

//jeden z konkretnych stylow
public class RedTheme implements Theme {
    @Override
    public void show() {
        System.out.println("Styl czerwony");
    }
}
