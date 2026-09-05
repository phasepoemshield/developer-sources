/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SchematicaCommand
extends Command {
    public SchematicaCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"schematica"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(0);
        this.baritone.getBuilderProcess().buildOpenSchematic();
    }

    public String getShortDesc() {
        return "Builds the loaded schematic";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Builds the schematic currently open in Schematica.", "", "Usage:", "> schematica");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }
}

