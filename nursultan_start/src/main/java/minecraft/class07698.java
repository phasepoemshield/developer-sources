/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01929
 *  minecraft.class03748
 *  minecraft.class04348
 *  minecraft.class07049
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class08520
 *  minecraft.class08530
 *  minecraft.class08876
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.DynamicOps;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01929;
import minecraft.class03748;
import minecraft.class04348;
import minecraft.class07049;
import minecraft.class07701;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class08520;
import minecraft.class08530;
import minecraft.class08876;
import org.jspecify.annotations.Nullable;

public class class07698
extends class08520<class00392> {
    private static final Collection<String> y = Arrays.asList("\"hello world\"", "'hello world'", "\"\"", "{text:\"hello world\"}", "[\"\"]");
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.component.invalid", (Object[])new Object[]{object}));
    private static final DynamicOps<class07709> L = class07713.N;
    private static final class08530<class07709> u = class08876.N(L);

    private class07698(class01929 class019292) {
        super(u.N((DynamicOps)class019292.N(L), u, class03748.N, N));
    }

    public static class00392 y(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return class07698.N(commandContext, string, ((class07701)commandContext.getSource()).M());
    }

    public static class07698 N(class04348 class043482) {
        return new class07698((class01929)class043482);
    }

    public static class00392 N(CommandContext<class07701> commandContext, String string) {
        return (class00392)commandContext.getArgument(string, class00392.class);
    }

    public static class00392 N(CommandContext<class07701> commandContext, String string, @Nullable class07049 class070492) throws CommandSyntaxException {
        return class00390.N((class07701)((class07701)commandContext.getSource()), (class00392)class07698.N(commandContext, string), (class07049)class070492, (int)0);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

