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
 *  net.raphimc.viabedrock.api.brigadier.SuggestionsUtil
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
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import net.raphimc.viabedrock.api.brigadier.SuggestionsUtil;

public class EnumArgumentType
implements ArgumentType<Object> {
    private static final SimpleCommandExceptionType INVALID_ENUM_EXCEPTION = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid enum"));
    private final Set<String> values;
    private final Set<String> completions;

    public EnumArgumentType(Set<String> values, Set<String> completions) {
        this.values = values;
        this.completions = completions;
    }

    public static EnumArgumentType values(Set<String> values) {
        return new EnumArgumentType(values, values);
    }

    public Object parse(StringReader reader) throws CommandSyntaxException {
        String s = reader.readUnquotedString();
        if (!this.values.contains(s)) {
            throw INVALID_ENUM_EXCEPTION.createWithContext((ImmutableStringReader)reader);
        }
        return null;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        return SuggestionsUtil.suggestMatching(this.completions, (SuggestionsBuilder)builder);
    }

    public static EnumArgumentType valuesAndCompletions(Set<String> values, Set<String> completions) {
        return new EnumArgumentType(values, completions);
    }
}

