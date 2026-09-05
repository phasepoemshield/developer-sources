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

public class IntegerRangeArgumentType
implements ArgumentType<Object> {
    private static final SimpleCommandExceptionType INVALID_INTEGER_RANGE_EXCEPTION = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid integer range"));

    private int readInt(StringReader reader) throws CommandSyntaxException {
        int start = reader.getCursor();
        while (reader.canRead() && this.isAllowedNumber(reader.peek())) {
            reader.skip();
        }
        String number = reader.getString().substring(start, reader.getCursor());
        if (number.isEmpty()) {
            throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerExpectedInt().createWithContext((ImmutableStringReader)reader);
        }
        try {
            return Integer.parseInt(number);
        }
        catch (NumberFormatException e) {
            reader.setCursor(start);
            throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext((ImmutableStringReader)reader, (Object)number);
        }
    }

    public Object parse(StringReader reader) throws CommandSyntaxException {
        if (!reader.canRead() || reader.peek() == ' ') {
            throw INVALID_INTEGER_RANGE_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        if (reader.peek() == '!') {
            reader.skip();
        }
        if (reader.canRead(2) && reader.peek() == '.' && reader.peek(1) == '.') {
            reader.skip();
            reader.skip();
        } else {
            this.readInt(reader);
            if (!reader.canRead() || reader.peek() == ' ') {
                return null;
            }
            if (!reader.canRead(2)) {
                throw INVALID_INTEGER_RANGE_EXCEPTION.createWithContext((ImmutableStringReader)reader);
            }
            for (int i = 0; i < 2; ++i) {
                if (reader.read() == '.') continue;
                throw INVALID_INTEGER_RANGE_EXCEPTION.createWithContext((ImmutableStringReader)reader);
            }
        }
        if (!reader.canRead() || reader.peek() == ' ') {
            return null;
        }
        this.readInt(reader);
        return null;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        StringReader reader = new StringReader(builder.getInput());
        reader.setCursor(builder.getStart());
        if (!reader.canRead()) {
            builder.suggest("!");
        }
        return builder.buildFuture();
    }

    public static IntegerRangeArgumentType integerRange() {
        return new IntegerRangeArgumentType();
    }

    private boolean isAllowedNumber(char c) {
        return c >= '0' && c <= '9' || c == '-' || c == '+';
    }
}

