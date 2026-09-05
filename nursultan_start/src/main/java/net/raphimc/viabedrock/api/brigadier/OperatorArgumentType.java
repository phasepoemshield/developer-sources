/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
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

import com.google.common.collect.Lists;
import com.mojang.brigadier.LiteralMessage;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.raphimc.viabedrock.api.brigadier.SuggestionsUtil;

public class OperatorArgumentType
implements ArgumentType<Object> {
    private static final List<String> OPERATORS = Lists.newArrayList((Object[])new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"});
    private static final SimpleCommandExceptionType INVALID_OPERATOR = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid operator"));

    public Object parse(StringReader reader) throws CommandSyntaxException {
        int start = reader.getCursor();
        while (reader.canRead() && reader.peek() != ' ') {
            reader.skip();
        }
        String operator = reader.getString().substring(start, reader.getCursor());
        if (!OPERATORS.contains(operator)) {
            throw INVALID_OPERATOR.create();
        }
        return null;
    }

    public static OperatorArgumentType operator() {
        return new OperatorArgumentType();
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        return SuggestionsUtil.suggestMatching(OPERATORS, (SuggestionsBuilder)builder);
    }
}

