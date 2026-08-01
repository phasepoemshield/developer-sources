package fun.nexisdlc.commands.exception;

import fun.nexisdlc.client.utils.client.ILogger;
import fun.nexisdlc.commands.ICommand;
import fun.nexisdlc.commands.argument.ICommandArgument;
import net.minecraft.util.Formatting;

import java.util.List;

public interface ICommandException extends ILogger {

    String getMessage();

    default void handle(ICommand command, List<ICommandArgument> args) {
        logDirect(
                this.getMessage(),
                Formatting.RED
        );
    }
}
