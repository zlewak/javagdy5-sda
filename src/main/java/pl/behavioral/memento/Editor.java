package pl.behavioral.memento;

public class Editor {

    private String content;

    private EditorMemento lastStep;

    public Editor(String content) {
        this.content = content;
    }

    public void addContent(String newContent){
        lastStep = new EditorMemento(this.content);
        this.content = this.content + newContent;
    }

    public void showContent(){
        System.out.println(content);
    }

    public void deleteContent(){
        lastStep = new EditorMemento(this.content);
        this.content = "";
    }

    public EditorMemento saveDocument() {
        return new EditorMemento(this.content);
    }

    public void restore(EditorMemento memento){
        this.content = memento.getContent();
    }

    public void undo(){
        this.content = lastStep.getContent();
    }
}
