/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class01894
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class01894;
import minecraft.class07701;

public class class07778
implements ArgumentType<class01894> {
    private static final Collection<String> N = Arrays.asList("foo", "foo:bar", "012");

    public class01894 parse(StringReader stringReader) throws CommandSyntaxException {
        return class01894.N((StringReader)stringReader);
    }

    public static class07778 N() {
        return new class07778();
    }

    public static class01894 N(CommandContext<class07701> commandContext, String string) {
        return (class01894)commandContext.getArgument(string, class01894.class);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

