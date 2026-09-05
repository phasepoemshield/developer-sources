/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class07689
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class07689;

final class class06801
extends Record
implements SuggestionProvider<class07689> {
    final class01894 name;
    private final SuggestionProvider<class07689> delegate;

    class06801(class01894 class018942, SuggestionProvider<class07689> suggestionProvider) {
        this.name = class018942;
        this.delegate = suggestionProvider;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06801.class, "name;delegate", "name", "delegate"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06801.class, "name;delegate", "name", "delegate"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06801.class, "name;delegate", "name", "delegate"}, this);
    }

    public SuggestionProvider<class07689> y() {
        return this.delegate;
    }

    public class01894 N() {
        return this.name;
    }

    public CompletableFuture<Suggestions> getSuggestions(CommandContext<class07689> commandContext, SuggestionsBuilder suggestionsBuilder) throws CommandSyntaxException {
        return this.delegate.getSuggestions(commandContext, suggestionsBuilder);
    }
}

