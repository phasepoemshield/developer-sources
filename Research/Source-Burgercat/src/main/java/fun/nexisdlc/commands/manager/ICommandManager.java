package fun.nexisdlc.commands.manager;

import net.minecraft.util.Pair;
import fun.nexisdlc.commands.ICommand;
import fun.nexisdlc.commands.argument.ICommandArgument;
import fun.nexisdlc.commands.registry.Registry;

import java.util.List;
import java.util.stream.Stream;

public interface ICommandManager {
    Registry<ICommand> getRegistry();

    ICommand getCommand(String name);

    boolean execute(String string);

    boolean execute(Pair<String, List<ICommandArgument>> expanded);

    Stream<String> tabComplete(Pair<String, List<ICommandArgument>> expanded);

    Stream<String> tabComplete(String prefix);
}
