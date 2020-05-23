package pl.structural.bridge;

//przyklad klasy bez styli - czyli bezposrednio implementujaca
public class MobilePage implements Page{
    @Override
    public void showPage() {
        System.out.println("Jestem strona mobilna - nie mam styli :(");
    }
}
