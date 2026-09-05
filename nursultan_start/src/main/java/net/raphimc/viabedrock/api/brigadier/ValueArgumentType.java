/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.LiteralMessage
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 */
package net.raphimc.viabedrock.api.brigadier;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.LiteralMessage;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class ValueArgumentType
implements ArgumentType<Object> {
    private static final SimpleCommandExceptionType INVALID_VALUE_EXCEPTION = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid value"));

    public static ValueArgumentType value() {
        return new ValueArgumentType();
    }

    public Object parse(StringReader reader) throws CommandSyntaxException {
        float f;
        if (!reader.canRead()) {
            throw INVALID_VALUE_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        if (reader.peek() == '~') {
            reader.skip();
        }
        float f2 = f = reader.canRead() && reader.peek() != ' ' ? reader.readFloat() : 0.0f;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            throw INVALID_VALUE_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        return null;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        StringReader reader = new StringReader(builder.getInput());
        reader.setCursor(builder.getStart());
        if (!reader.canRead()) {
            builder.suggest("~");
        }
        return builder.buildFuture();
    }
}

