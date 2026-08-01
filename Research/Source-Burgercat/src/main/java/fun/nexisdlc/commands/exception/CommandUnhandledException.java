package fun.nexisdlc.commands.exception;

import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.commands.ICommand;
import fun.nexisdlc.commands.argument.ICommandArgument;

import java.util.List;

public class CommandUnhandledException extends RuntimeException implements ICommandException, ILogger {

    public CommandUnhandledException(String message) {
        super(message);
    }

    public CommandUnhandledException(Throwable cause) {
        super(cause);
    }

    @Override
    public void handle(ICommand command, List<ICommandArgument> args) {
    }
}
