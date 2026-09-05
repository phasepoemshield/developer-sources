/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class07684
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class06769;
import minecraft.class06792;
import minecraft.class06804;
import minecraft.class07684;
import minecraft.class07701;

public class class06808
implements ArgumentType<class06792> {
    private static final Collection<String> N = Arrays.asList("foo", "foo:bar", "#foo");
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.function.tag.unknown", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.function.unknown", (Object[])new Object[]{object}));

    public static Pair<class01894, Collection<class07684<class07701>>> L(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class06792)commandContext.getArgument(string, class06792.class)).L(commandContext);
    }

    public static Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> y(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class06792)commandContext.getArgument(string, class06792.class)).y(commandContext);
    }

    static Collection<class07684<class07701>> y(CommandContext<class07701> commandContext, class01894 class018942) throws CommandSyntaxException {
        List var2 = ((class07701)commandContext.getSource()).W().Nr().y(class018942);
        if (var2 == null) {
            throw y.create((Object)class018942.toString());
        }
        return var2;
    }

    static class07684<class07701> N(CommandContext<class07701> commandContext, class01894 class018942) throws CommandSyntaxException {
        return (class07684)((class07701)commandContext.getSource()).W().Nr().N(class018942).orElseThrow(() -> L.create((Object)class018942.toString()));
    }

    public static Collection<class07684<class07701>> N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class06792)commandContext.getArgument(string, class06792.class)).N(commandContext);
    }

    public static class06808 N() {
        return new class06808();
    }

    public class06792 parse(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '#') {
            stringReader.skip();
            class01894 class018942 = class01894.N((StringReader)stringReader);
            return new class06769(this, class018942);
        }
        class01894 class018943 = class01894.N((StringReader)stringReader);
        return new class06804(this, class018943);
    }

    public Collection<String> getExamples() {
        return N;
    }
}

