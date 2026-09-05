/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Helper
 */
package baritone.api.command;

import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.utils.Helper;
import java.util.List;
import java.util.stream.Stream;

public interface ICommand
extends Helper {
    public void execute(String var1, IArgConsumer var2) throws CommandException;

    public List<String> getNames();

    public String getShortDesc();

    default public boolean hiddenFromHelp() {
        return false;
    }

    public List<String> getLongDesc();

    public Stream<String> tabComplete(String var1, IArgConsumer var2) throws CommandException;
}

