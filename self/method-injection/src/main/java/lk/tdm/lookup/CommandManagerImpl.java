package lk.tdm.lookup;

public class CommandManagerImpl extends CommandManager {
    @Override
    protected Command createCommand() {
        // This can be empty if Spring will inject the bean
        return null;
    }
}
