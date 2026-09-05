/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.IDatatype
 *  baritone.api.command.datatypes.IDatatypePost
 *  baritone.api.command.datatypes.RelativeBlockPos
 *  baritone.api.command.datatypes.RelativeFile
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.utils.BetterBlockPos
 *  baritone.utils.schematic.SchematicSystem
 *  minecraft.class00753
 *  org.apache.commons.io.FilenameUtils
 */
package baritone.command.defaults;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeBlockPos;
import baritone.api.command.datatypes.RelativeFile;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.utils.BetterBlockPos;
import baritone.utils.schematic.SchematicSystem;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;
import minecraft.class00753;
import org.apache.commons.io.FilenameUtils;

public class BuildCommand
extends Command {
    private final File schematicsDir;

    public BuildCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"build"});
        this.schematicsDir = new File((File)iBaritone.getPlayerContext().minecraft().l_1, "schematics");
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        BetterBlockPos betterBlockPos;
        File file = ((File)iArgConsumer.getDatatypePost((IDatatypePost)RelativeFile.INSTANCE, (Object)this.schematicsDir)).getAbsoluteFile();
        File file2 = file;
        if (FilenameUtils.getExtension((String)file2.getAbsolutePath()).isEmpty()) {
            file2 = new File(file2.getAbsolutePath() + "." + (String)Baritone.settings().schematicFallbackExtension.value);
        }
        if (!file2.exists()) {
            if (file.exists()) {
                throw new CommandInvalidStateException(String.format("Cannot load %s because I do not know which schematic format that is. Please rename the file to include the correct file extension.", file2));
            }
            throw new CommandInvalidStateException("Cannot find " + String.valueOf(file2));
        }
        if (!SchematicSystem.INSTANCE.getByFile(file2).isPresent()) {
            StringJoiner stringJoiner = new StringJoiner(", ");
            SchematicSystem.INSTANCE.getFileExtensions().forEach(stringJoiner::add);
            throw new CommandInvalidStateException(String.format("Unsupported schematic format. Reckognized file extensions are: %s", stringJoiner));
        }
        BetterBlockPos betterBlockPos2 = this.ctx.playerFeet();
        if (iArgConsumer.hasAny()) {
            iArgConsumer.requireMax(3);
            betterBlockPos = (BetterBlockPos)iArgConsumer.getDatatypePost((IDatatypePost)RelativeBlockPos.INSTANCE, (Object)betterBlockPos2);
        } else {
            iArgConsumer.requireMax(0);
            betterBlockPos = betterBlockPos2;
        }
        boolean bl = this.baritone.getBuilderProcess().build(file2.getName(), file2, (class00753)betterBlockPos);
        if (!bl) {
            throw new CommandInvalidStateException("Couldn't load the schematic. Either your schematic is corrupt or this is a bug.");
        }
        this.logDirect(String.format("Successfully loaded schematic for building\nOrigin: %s", betterBlockPos));
    }

    public String getShortDesc() {
        return "Build a schematic";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Build a schematic from a file.", "", "Usage:", "> build <filename> - Loads and builds '<filename>.schematic'", "> build <filename> <x> <y> <z> - Custom position");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        if (iArgConsumer.hasExactlyOne()) {
            return RelativeFile.tabComplete((IArgConsumer)iArgConsumer, (File)this.schematicsDir);
        }
        if (iArgConsumer.has(2)) {
            iArgConsumer.get();
            return iArgConsumer.tabCompleteDatatype((IDatatype)RelativeBlockPos.INSTANCE);
        }
        return Stream.empty();
    }
}

