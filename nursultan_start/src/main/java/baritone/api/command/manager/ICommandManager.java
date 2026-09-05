/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05034
 */
package baritone.api.command.manager;

import baritone.api.IBaritone;
import baritone.api.command.ICommand;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.registry.Registry;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class05034;

public interface ICommandManager {
    public boolean execute(class05034<String, List<ICommandArgument>> var1);

    public boolean execute(String var1);

    public Registry<ICommand> getRegistry();

    public IBaritone getBaritone();

    public ICommand getCommand(String var1);

    public Stream<String> tabComplete(class05034<String, List<ICommandArgument>> var1);

    public Stream<String> tabComplete(String var1);
}

