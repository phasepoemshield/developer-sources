/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.command.ICommand
 *  baritone.api.command.argument.ICommandArgument
 *  baritone.api.command.helpers.TabCompleteHelper
 *  baritone.api.command.manager.ICommandManager
 *  baritone.api.command.registry.Registry
 *  minecraft.class05034
 */
package baritone.command.manager;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.command.ICommand;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.command.manager.ICommandManager;
import baritone.api.command.registry.Registry;
import baritone.command.argument.ArgConsumer;
import baritone.command.argument.CommandArguments;
import baritone.command.defaults.DefaultCommands;
import baritone.command.manager.CommandManager$ExecutionWrapper;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import minecraft.class05034;

public class CommandManager
implements ICommandManager {
    private final Registry<ICommand> registry = new Registry();
    private final Baritone baritone;

    public CommandManager(Baritone baritone) {
        this.baritone = baritone;
        DefaultCommands.createAll((IBaritone)baritone).forEach(arg_0 -> this.registry.register(arg_0));
    }

    private static class05034<String, List<ICommandArgument>> expand(String string, boolean bl) {
        String string2 = string.split("\\s", 2)[0];
        List<ICommandArgument> list = CommandArguments.from(string.substring(string2.length()), bl);
        return new class05034((Object)string2, list);
    }

    public static class05034<String, List<ICommandArgument>> expand(String string) {
        return CommandManager.expand(string, false);
    }

    private CommandManager$ExecutionWrapper from(class05034<String, List<ICommandArgument>> class050342) {
        String string = (String)class050342.N();
        ArgConsumer argConsumer = new ArgConsumer(this, (List)class050342.y());
        ICommand iCommand = this.getCommand(string);
        return iCommand == null ? null : new CommandManager$ExecutionWrapper(iCommand, string, argConsumer);
    }

    public boolean execute(class05034<String, List<ICommandArgument>> class050342) {
        CommandManager$ExecutionWrapper commandManager$ExecutionWrapper = this.from(class050342);
        if (commandManager$ExecutionWrapper != null) {
            commandManager$ExecutionWrapper.execute();
        }
        return commandManager$ExecutionWrapper != null;
    }

    public boolean execute(String string) {
        return this.execute(CommandManager.expand(string));
    }

    public Registry<ICommand> getRegistry() {
        return this.registry;
    }

    public IBaritone getBaritone() {
        return this.baritone;
    }

    public ICommand getCommand(String string) {
        for (ICommand iCommand : this.registry.entries) {
            if (!iCommand.getNames().contains(string.toLowerCase(Locale.US))) continue;
            return iCommand;
        }
        return null;
    }

    public Stream<String> tabComplete(class05034<String, List<ICommandArgument>> class050342) {
        CommandManager$ExecutionWrapper commandManager$ExecutionWrapper = this.from(class050342);
        return commandManager$ExecutionWrapper == null ? Stream.empty() : commandManager$ExecutionWrapper.tabComplete();
    }

    public Stream<String> tabComplete(String string) {
        class05034<String, List<ICommandArgument>> class050342 = CommandManager.expand(string, true);
        String string2 = (String)class050342.N();
        List list = (List)class050342.y();
        if (list.isEmpty()) {
            return new TabCompleteHelper().addCommands((ICommandManager)this.baritone.getCommandManager()).filterPrefix(string2).stream();
        }
        return this.tabComplete(class050342);
    }
}

