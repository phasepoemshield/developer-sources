/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class03529
 *  minecraft.class03530
 *  minecraft.class03552
 *  minecraft.class04348
 *  minecraft.class05946
 *  minecraft.class07666
 *  minecraft.class07689
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class03529;
import minecraft.class03530;
import minecraft.class03552;
import minecraft.class03765;
import minecraft.class03775;
import minecraft.class03782;
import minecraft.class03784;
import minecraft.class04348;
import minecraft.class05946;
import minecraft.class07666;
import minecraft.class07689;
import minecraft.class07701;

public class class03789<T>
implements ArgumentType<class03782<T>> {
    private static final Collection<String> y = Arrays.asList("foo", "foo:bar", "012", "#skeletons", "#minecraft:skeletons");
    private static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.resource_tag.not_found", (Object[])new Object[]{object, object2}));
    private static final Dynamic3CommandExceptionType u = new Dynamic3CommandExceptionType((object, object2, object3) -> class00392.y((String)"argument.resource_tag.invalid_type", (Object[])new Object[]{object, object2, object3}));
    private final class01905<T> i;
    public final class05946<? extends class00751<T>> N;

    public class03789(class04348 class043482, class05946<? extends class00751<T>> class059462) {
        this.N = class059462;
        this.i = class043482.y(class059462);
    }

    public class03782<T> parse(StringReader stringReader) throws CommandSyntaxException {
        if (stringReader.canRead() && stringReader.peek() == '#') {
            int n = stringReader.getCursor();
            try {
                stringReader.skip();
                class01894 class018942 = class01894.N((StringReader)stringReader);
                class03530 class035302 = class03530.N(this.N, (class01894)class018942);
                class03552 class035522 = (class03552)this.i.N(class035302).orElseThrow(() -> L.createWithContext((ImmutableStringReader)stringReader, (Object)class018942, (Object)this.N.N()));
                return new class03765(class035522);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                stringReader.setCursor(n);
                throw commandSyntaxException;
            }
        }
        class01894 class018943 = class01894.N((StringReader)stringReader);
        class05946 class059462 = class05946.N(this.N, (class01894)class018943);
        class03529 class035292 = (class03529)this.i.N(class059462).orElseThrow(() -> class03784.N.createWithContext((ImmutableStringReader)stringReader, (Object)class018943, (Object)this.N.N()));
        return new class03775(class035292);
    }

    public static <T> class03789<T> N(class04348 class043482, class05946<? extends class00751<T>> class059462) {
        return new class03789<T>(class043482, class059462);
    }

    public static <T> class03782<T> N(CommandContext<class07701> commandContext, String string, class05946<class00751<T>> class059462) throws CommandSyntaxException {
        class03782 class037822 = (class03782)commandContext.getArgument(string, class03782.class);
        return class037822.N(class059462).orElseThrow(() -> (CommandSyntaxException)((Object)((Object)class037822.N().map(class035292 -> {
            class05946 class059463 = class035292.B();
            return class03784.y.create((Object)class059463.N(), (Object)class059463.y(), (Object)class059462.N());
        }, class035522 -> {
            class03530 class035302 = class035522.B();
            return u.create((Object)class035302.y(), (Object)class035302.N(), (Object)class059462.N());
        }))));
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(commandContext, (SuggestionsBuilder)suggestionsBuilder, this.N, (class07666)class07666.field_37264);
    }

    public Collection<String> getExamples() {
        return y;
    }
}

