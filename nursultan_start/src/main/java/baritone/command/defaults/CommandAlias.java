/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CommandAlias
extends Command {
    private final String shortDesc;
    public final String target;

    public CommandAlias(IBaritone iBaritone, List<String> list, String string, String string2) {
        super(iBaritone, list.toArray(new String[0]));
        this.shortDesc = string;
        this.target = string2;
    }

    public CommandAlias(IBaritone iBaritone, String string, String string2, String string3) {
        super(iBaritone, new String[]{string});
        this.shortDesc = string2;
        this.target = string3;
    }

    public void execute(String string, IArgConsumer iArgConsumer) {
        this.baritone.getCommandManager().execute(String.format("%s %s", this.target, iArgConsumer.rawRest()));
    }

    public String getShortDesc() {
        return this.shortDesc;
    }

    public List<String> getLongDesc() {
        return Collections.singletonList(String.format("This command is an alias, for: %s ...", this.target));
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return this.baritone.getCommandManager().tabComplete(String.format("%s %s", this.target, iArgConsumer.rawRest()));
    }
}

