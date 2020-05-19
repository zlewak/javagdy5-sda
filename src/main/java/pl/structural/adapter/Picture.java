package pl.structural.adapter;

//definicja nszego zdjecia
public class Picture {
    private int id;
    private String title;

    public Picture(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
