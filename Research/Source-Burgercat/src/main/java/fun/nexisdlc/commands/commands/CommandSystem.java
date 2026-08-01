package fun.nexisdlc.commands.commands;

import fun.nexisdlc.commands.ICommandSystem;
import fun.nexisdlc.commands.argparser.IArgParserManager;
import fun.nexisdlc.commands.commands.argparser.ArgParserManager;

public enum CommandSystem implements ICommandSystem {
    INSTANCE;

    @Override
    public IArgParserManager getParserManager() {
        return ArgParserManager.INSTANCE;
    }
}
