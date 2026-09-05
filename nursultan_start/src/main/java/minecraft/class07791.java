/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class08520
 *  minecraft.class08530
 *  minecraft.class08876
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08520;
import minecraft.class08530;
import minecraft.class08876;

public class class07791
extends class08520<class07709> {
    private static final Collection<String> N = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");
    private static final class08530<class07709> y = class08876.N((DynamicOps)class07713.N);

    private class07791() {
        super(y);
    }

    public static class07791 N() {
        return new class07791();
    }

    public static <S> class07709 N(CommandContext<S> commandContext, String string) {
        return (class07709)commandContext.getArgument(string, class07709.class);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

