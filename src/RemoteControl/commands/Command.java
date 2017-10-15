package RemoteControl.commands;

public interface Command {
    void execute();
    void undo();
}
