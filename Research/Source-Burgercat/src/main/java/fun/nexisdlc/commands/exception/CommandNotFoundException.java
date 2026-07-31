package fun.nexisdlc.commands.exception;

import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.commands.ICommand;
import fun.nexisdlc.commands.argument.ICommandArgument;

import java.util.List;

public class CommandNotFoundException extends CommandException implements ILogger {

    public final String command;

    public CommandNotFoundException(String command) {
        super(String.format("Команда не найдена: %s", command));
        this.command = command;
    }

    @Override
    public void handle(ICommand command, List<ICommandArgument> args) {
       logDirect(getMessage());
    }
}
