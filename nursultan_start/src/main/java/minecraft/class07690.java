/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  minecraft.class00392
 *  minecraft.class02796
 *  minecraft.class03926
 *  minecraft.class04458
 *  minecraft.class04770
 *  minecraft.class06068
 *  minecraft.class06790
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02796;
import minecraft.class03926;
import minecraft.class04458;
import minecraft.class04770;
import minecraft.class06068;
import minecraft.class06790;
import minecraft.class07699;
import minecraft.class07701;
import org.jspecify.annotations.Nullable;

public class class07690
implements class04458<class07699> {
    private static final Collection<String> y = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");
    static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.message.too_long", (Object[])new Object[]{object, object2}));

    private static void y(Consumer<class03926> consumer, class07701 class077012, class03926 class039262) {
        class00392 class003922 = class077012.W().yg().decorate(class077012.z(), class039262.u());
        consumer.accept(class039262.N(class003922));
    }

    public <S> class07699 parse(StringReader stringReader, @Nullable S s) throws CommandSyntaxException {
        return class07699.N(stringReader, class06790.N(s));
    }

    public class07699 parse(StringReader stringReader) throws CommandSyntaxException {
        return class07699.N(stringReader, true);
    }

    public static void N(CommandContext<class07701> commandContext, String string, Consumer<class03926> consumer) throws CommandSyntaxException {
        class07699 class076992 = (class07699)((Object)commandContext.getArgument(string, class07699.class));
        class07701 class077012 = (class07701)commandContext.getSource();
        class00392 class003922 = class076992.N(class077012);
        class03926 class039262 = class077012.P().N(string);
        if (class039262 != null) {
            class07690.N(consumer, class077012, class039262.N(class003922));
        } else {
            class07690.y(consumer, class077012, class03926.N((String)class076992.N()).N(class003922));
        }
    }

    public static class00392 N(CommandContext<class07701> commandContext, String string) throws CommandSyntaxException {
        return ((class07699)((Object)commandContext.getArgument(string, class07699.class))).N((class07701)commandContext.getSource());
    }

    private static CompletableFuture<class06068> N(class07701 class077012, class03926 class039262) {
        class04770 class047702 = class077012.z();
        if (class047702 != null && class039262.N(class047702.method_5667())) {
            return class047702.method_31273().N(class039262.L());
        }
        return CompletableFuture.completedFuture(class06068.N((String)class039262.L()));
    }

    public static class07690 N() {
        return new class07690();
    }

    private static void N(Consumer<class03926> consumer, class07701 class077012, class03926 class039262) {
        class02796 class027962 = class077012.W();
        CompletableFuture<class06068> var4 = class07690.N(class077012, class039262);
        class00392 class003922 = class027962.yg().decorate(class077012.z(), class039262.u());
        class077012.s().N(var4, (T class060682) -> {
            class03926 class039263 = class039262.N(class003922).N(class060682.i());
            consumer.accept(class039263);
        });
    }

    public Collection<String> getExamples() {
        return y;
    }
}

