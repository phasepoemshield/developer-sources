/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  minecraft.class00816
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class00816;
import minecraft.class07701;
import minecraft.class07788;

public class class07766
implements class07788<class00816> {
    private static final Collection<String> N = Arrays.asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

    public class00816 parse(StringReader stringReader) throws CommandSyntaxException {
        return class00816.N((StringReader)stringReader);
    }

    public static class00816 N(CommandContext<class07701> commandContext, String string) {
        return (class00816)commandContext.getArgument(string, class00816.class);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

