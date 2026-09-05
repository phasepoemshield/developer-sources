/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package net.raphimc.viabedrock.api.brigadier;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class WildcardIntegerArgumentType
implements ArgumentType<Object> {
    public Object parse(StringReader reader) throws CommandSyntaxException {
        if (!reader.canRead()) {
            throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedInt().createWithContext((ImmutableStringReader)reader);
        }
        if (reader.peek() == '*') {
            reader.skip();
        } else {
            reader.readInt();
        }
        return null;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        StringReader reader = new StringReader(builder.getInput());
        reader.setCursor(builder.getStart());
        if (!reader.canRead()) {
            builder.suggest("*");
        }
        return builder.buildFuture();
    }

    public static WildcardIntegerArgumentType wildcardInteger() {
        return new WildcardIntegerArgumentType();
    }
}

