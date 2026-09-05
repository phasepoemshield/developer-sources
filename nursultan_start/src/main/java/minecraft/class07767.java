/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class00836
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class00836;
import minecraft.class07701;
import minecraft.class07788;

public class class07767
implements class07788<class00836> {
    private static final Collection<String> N = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

    public class00836 parse(StringReader stringReader) throws CommandSyntaxException {
        return class00836.N((StringReader)stringReader);
    }

    public static class00836 N(CommandContext<class07701> commandContext, String string) {
        return (class00836)commandContext.getArgument(string, class00836.class);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

