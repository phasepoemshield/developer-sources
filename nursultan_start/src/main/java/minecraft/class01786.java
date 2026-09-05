/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class00411
 *  minecraft.class01929
 *  minecraft.class04348
 *  minecraft.class07701
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class08520
 *  minecraft.class08530
 *  minecraft.class08876
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Collection;
import java.util.List;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00411;
import minecraft.class01929;
import minecraft.class04348;
import minecraft.class07701;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08520;
import minecraft.class08530;
import minecraft.class08876;

public class class01786
extends class08520<class00405> {
    private static final Collection<String> y = List.of("{bold: true}", "{color: 'red'}", "{}");
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.style.invalid", (Object[])new Object[]{object}));
    private static final DynamicOps<class07709> L = class07713.N;
    private static final class08530<class07709> u = class08876.N(L);

    private class01786(class01929 class019292) {
        super(u.N((DynamicOps)class019292.N(L), u, class00411.y, N));
    }

    public static class00405 N(CommandContext<class07701> commandContext, String string) {
        return (class00405)commandContext.getArgument(string, class00405.class);
    }

    public static class01786 N(class04348 class043482) {
        return new class01786((class01929)class043482);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

