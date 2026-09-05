/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.IDatatypePost
 *  baritone.api.command.datatypes.RelativeFile
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.command.exception.CommandInvalidTypeException
 *  com.google.gson.JsonSyntaxException
 *  minecraft.class06202
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.IDatatypePost;
import baritone.api.command.datatypes.RelativeFile;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.command.exception.CommandInvalidTypeException;
import com.google.gson.JsonSyntaxException;
import java.io.File;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import minecraft.class06202;

public class ExploreFilterCommand
extends Command {
    public ExploreFilterCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"explorefilter"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(2);
        File file = (File)iArgConsumer.getDatatypePost((IDatatypePost)RelativeFile.INSTANCE, (Object)((File)this.ctx.minecraft().l_1).getAbsoluteFile().getParentFile());
        boolean bl = false;
        if (iArgConsumer.hasAny()) {
            if (iArgConsumer.getString().equalsIgnoreCase("invert")) {
                bl = true;
            } else {
                throw new CommandInvalidTypeException(iArgConsumer.consumed(), "either \"invert\" or nothing");
            }
        }
        try {
            this.baritone.getExploreProcess().applyJsonFilter(file.toPath().toAbsolutePath(), bl);
        }
        catch (NoSuchFileException noSuchFileException) {
            throw new CommandInvalidStateException("File not found");
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            throw new CommandInvalidStateException("Invalid JSON syntax");
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
        this.logDirect(String.format("Explore filter applied. Inverted: %s", Boolean.toString(bl)));
    }

    public String getShortDesc() {
        return "Explore chunks from a json";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Apply an explore filter before using explore, which tells the explore process which chunks have been explored/not explored.", "", "The JSON file will follow this format: [{\"x\":0,\"z\":0},...]", "", "If 'invert' is specified, the chunks listed will be considered NOT explored, rather than explored.", "", "Usage:", "> explorefilter <path> [invert] - Load the JSON file referenced by the specified path. If invert is specified, it must be the literal word 'invert'.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        if (iArgConsumer.hasExactlyOne()) {
            return RelativeFile.tabComplete((IArgConsumer)iArgConsumer, (File)RelativeFile.gameDir((class06202)this.ctx.minecraft()));
        }
        return Stream.empty();
    }
}

