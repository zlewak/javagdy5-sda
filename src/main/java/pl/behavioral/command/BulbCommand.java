package pl.behavioral.command;

public interface BulbCommand {
    void execute();
    void undo();
    void redo();
}
