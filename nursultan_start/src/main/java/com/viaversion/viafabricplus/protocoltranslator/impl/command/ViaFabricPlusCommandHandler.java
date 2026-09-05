/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.viaversion.viaversion.commands.ViaCommandHandler
 *  minecraft.class07689
 *  net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.command;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.viaversion.viafabricplus.protocoltranslator.impl.command.SettingsCommand;
import com.viaversion.viafabricplus.protocoltranslator.impl.command.ViaFabricPlusCommandSender;
import com.viaversion.viafabricplus.protocoltranslator.impl.command.classic.ListExtensionsCommand;
import com.viaversion.viafabricplus.protocoltranslator.impl.command.classic.SetTimeCommand;
import com.viaversion.viaversion.commands.ViaCommandHandler;
import java.util.concurrent.CompletableFuture;
import minecraft.class07689;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;

public final class ViaFabricPlusCommandHandler
extends ViaCommandHandler {
    public ViaFabricPlusCommandHandler() {
        super(false);
        this.removeSubCommand("list");
        this.removeSubCommand("player");
        this.removeSubCommand("pps");
        this.registerSubCommand(new ListExtensionsCommand());
        this.registerSubCommand(new SetTimeCommand());
        this.registerSubCommand(new SettingsCommand());
    }

    public int execute(CommandContext<FabricClientCommandSource> commandContext) {
        String[] stringArray = new String[]{};
        try {
            stringArray = StringArgumentType.getString(commandContext, (String)"args").split(" ");
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        this.onCommand(new ViaFabricPlusCommandSender((class07689)commandContext.getSource()), stringArray);
        return 1;
    }

    public CompletableFuture<Suggestions> suggestion(CommandContext<FabricClientCommandSource> commandContext, SuggestionsBuilder suggestionsBuilder) {
        String[] stringArray;
        try {
            stringArray = StringArgumentType.getString(commandContext, (String)"args").split(" ", -1);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            stringArray = new String[]{""};
        }
        CharSequence[] charSequenceArray = (String[])stringArray.clone();
        charSequenceArray[charSequenceArray.length - 1] = "";
        String string = String.join((CharSequence)" ", charSequenceArray);
        this.onTabComplete(new ViaFabricPlusCommandSender((class07689)commandContext.getSource()), stringArray).stream().map(string2 -> {
            SuggestionsBuilder suggestionsBuilder2 = new SuggestionsBuilder(suggestionsBuilder.getInput(), string.length() + suggestionsBuilder.getStart());
            suggestionsBuilder2.suggest(string2);
            return suggestionsBuilder2;
        }).forEach(arg_0 -> ((SuggestionsBuilder)suggestionsBuilder).add(arg_0));
        return suggestionsBuilder.buildFuture();
    }
}

