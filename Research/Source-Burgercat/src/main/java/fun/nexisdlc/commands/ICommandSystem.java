package fun.nexisdlc.commands;

import fun.nexisdlc.commands.argparser.IArgParserManager;

public interface ICommandSystem {
    IArgParserManager getParserManager();
}
