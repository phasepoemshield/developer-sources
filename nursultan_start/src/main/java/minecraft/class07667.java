/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class07001
 *  minecraft.class07755
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class07001;
import minecraft.class07755;

public class class07667
implements ArgumentType<class07001> {
    private static final Collection<String> N = Arrays.asList("{}", "{foo=bar}");

    private class07667() {
    }

    public class07001 parse(StringReader stringReader) throws CommandSyntaxException {
        return class07755.L((StringReader)stringReader);
    }

    public static class07667 N() {
        return new class07667();
    }

    public static <S> class07001 N(CommandContext<S> commandContext, String string) {
        return (class07001)commandContext.getArgument(string, class07001.class);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

