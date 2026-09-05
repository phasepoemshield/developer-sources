/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00518
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class00518;
import minecraft.class07689;
import minecraft.class07701;

public class class07794
implements ArgumentType<String> {
    private static final Collection<String> N = Arrays.asList("foo", "*", "012");
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.objective.notFound", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.objective.readonly", (Object[])new Object[]{object}));

    public static class00518 y(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        class00518 class005182 = class07794.N(commandContext, string);
        if (class005182.u().L()) {
            throw L.create((Object)class005182.L());
        }
        return class005182;
    }

    public static class07794 N() {
        return new class07794();
    }

    public String parse(StringReader stringReader) throws CommandSyntaxException {
        return stringReader.readUnquotedString();
    }

    public static class00518 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        String string2 = (String)commandContext.getArgument(string, String.class);
        class00518 class005182 = ((class07701)commandContext.getSource()).W().yB().N(string2);
        if (class005182 == null) {
            throw y.create((Object)string2);
        }
        return class005182;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        Object object = commandContext.getSource();
        if (object instanceof class07701) {
            return class07689.y((Iterable)((class07701)object).W().yB().y(), (SuggestionsBuilder)suggestionsBuilder);
        }
        if (object instanceof class07689) {
            return ((class07689)object).N(commandContext);
        }
        return Suggestions.empty();
    }

    public Collection<String> getExamples() {
        return N;
    }
}

