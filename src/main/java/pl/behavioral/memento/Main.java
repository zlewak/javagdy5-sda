package pl.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Editor mySecretDocument = new Editor("");

        mySecretDocument.addContent("Something secret");
        EditorMemento savedSecretDocument = mySecretDocument.saveDocument();
        mySecretDocument.showContent();

        mySecretDocument.deleteContent();
        mySecretDocument.showContent();

        mySecretDocument.restore(savedSecretDocument);
        mySecretDocument.showContent();

        mySecretDocument.addContent(" nastepna linijka");
        mySecretDocument.showContent();

        mySecretDocument.addContent(" i cos jeszcze");
        mySecretDocument.showContent();

        mySecretDocument.undo();
        mySecretDocument.showContent();
    }
}
