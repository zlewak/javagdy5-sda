package pl.structural.bridge;

public class Main {

    public static void main(String[] args) {
        Theme blue = new BlueTheme();
        Theme red = new RedTheme();
        WebPage bluePage = new WebPage(blue);
        WebPage redPage = new WebPage(red);

        WebPage ourPage = new WebPage(blue);
        ourPage.getContactPage().showPage();
        ourPage.getHomePage().showPage();

        ourPage = new WebPage(red);
        ourPage.getContactPage().showPage();
        ourPage.getHomePage().showPage();

        ourPage = new WebPage(new GreenTheme());
        ourPage.getContactPage().showPage();
        ourPage.getHomePage().showPage();
        ourPage.getShopPage().showPage();
        ourPage.getMobilePage().showPage();
    }
}
