package pl.structural.bridge;

public class WebPage {
    private Page homePage;

    private Page contactPage;

    private Page shopPage;

    private Page mobilePage;

    private Theme theme;

    public Page getShopPage() {
        return new ShopPage(theme);
    }

    public WebPage(Theme theme) {
        this.theme = theme;
    }

    public Page getHomePage() {
        return new HomePage(theme);
    }

    public Page getContactPage() {
        return new ContactPage(theme);
    }

    public Page getMobilePage() {
        return new MobilePage();
    }
}
