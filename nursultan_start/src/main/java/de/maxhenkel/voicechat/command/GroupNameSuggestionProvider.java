/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.voice.server.Group
 *  de.maxhenkel.voicechat.voice.server.Server
 *  minecraft.class07701
 */
package de.maxhenkel.voicechat.command;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.voice.server.Group;
import de.maxhenkel.voicechat.voice.server.Server;
import java.util.concurrent.CompletableFuture;
import minecraft.class07701;

public class GroupNameSuggestionProvider
implements SuggestionProvider<class07701> {
    public static final GroupNameSuggestionProvider INSTANCE = new GroupNameSuggestionProvider();

    public CompletableFuture<Suggestions> getSuggestions(CommandContext<class07701> commandContext, SuggestionsBuilder suggestionsBuilder) {
        Server server = Voicechat.SERVER.getServer();
        if (server == null) {
            return suggestionsBuilder.buildFuture();
        }
        server.getGroupManager().getGroups().values().stream().map(Group::getName).distinct().map(string -> {
            if (string.contains(" ")) {
                return String.format("\"%s\"", string);
            }
            return string;
        }).forEach(arg_0 -> ((SuggestionsBuilder)suggestionsBuilder).suggest(arg_0));
        return suggestionsBuilder.buildFuture();
    }
}

