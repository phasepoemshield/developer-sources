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

public class PositionArgumentType
implements ArgumentType<Object> {
    private static final SimpleCommandExceptionType INVALID_BLOCK_POSITION_EXCEPTION = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid block position"));

    public static PositionArgumentType position() {
        return new PositionArgumentType();
    }

    public Object parse(StringReader reader) throws CommandSyntaxException {
        boolean hasHat3;
        boolean hasHat2;
        boolean hasHat = this.readCoordinate(reader, false);
        if (reader.canRead()) {
            reader.skip();
        }
        if (hasHat != (hasHat2 = this.readCoordinate(reader, hasHat))) {
            throw INVALID_BLOCK_POSITION_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        if (reader.canRead()) {
            reader.skip();
        }
        if (hasHat2 != (hasHat3 = this.readCoordinate(reader, hasHat))) {
            throw INVALID_BLOCK_POSITION_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        return null;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        StringReader reader = new StringReader(builder.getInput());
        reader.setCursor(builder.getStart());
        if (!reader.canRead()) {
            builder.suggest("~ ~ ~");
            builder.suggest("^ ^ ^");
        }
        return builder.buildFuture();
    }

    private boolean readCoordinate(StringReader reader, boolean requiresHat) throws CommandSyntaxException {
        if (!reader.canRead()) {
            throw INVALID_BLOCK_POSITION_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        boolean hasHat = false;
        boolean hasWave = false;
        if (reader.peek() == '^') {
            reader.skip();
            hasHat = true;
        } else {
            if (requiresHat) {
                throw INVALID_BLOCK_POSITION_EXCEPTION.createWithContext((ImmutableStringReader)reader);
            }
            if (reader.peek() == '~') {
                reader.skip();
                hasWave = true;
            }
        }
        if (hasWave && (!reader.canRead() || reader.peek() == ' ')) {
            return hasHat;
        }
        reader.readDouble();
        if (reader.canRead() && reader.peek() != ' ') {
            throw INVALID_BLOCK_POSITION_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        return hasHat;
    }
}

