package lk.tdm.lookup;

public abstract class CommandManager {
    public void process() {
        Command command = createCommand();
        command.execute();
    }

    // This method will be overridden by Spring with a lookup method
    protected abstract Command createCommand();
}