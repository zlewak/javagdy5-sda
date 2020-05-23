package pl.behavioral.memento;

//przechowujemy wszystko co chcemy miec zapisane
public class EditorMemento {
    private String content;

    //private int healthPoint;
    //private int gold;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
