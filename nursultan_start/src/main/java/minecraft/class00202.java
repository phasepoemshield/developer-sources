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
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class03529
 *  minecraft.class04348
 *  minecraft.class05946
 *  minecraft.class07666
 *  minecraft.class07689
 *  minecraft.class07701
 *  org.apache.commons.io.FilenameUtils
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class03529;
import minecraft.class04348;
import minecraft.class05946;
import minecraft.class07666;
import minecraft.class07689;
import minecraft.class07701;
import org.apache.commons.io.FilenameUtils;

public class class00202<T>
implements ArgumentType<Collection<class03529<T>>> {
    private static final Collection<String> L = List.of("minecraft:*", "*:asset", "*");
    public static final Dynamic2CommandExceptionType N = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"argument.resource_selector.not_found", (Object[])new Object[]{object, object2}));
    public final class05946<? extends class00751<T>> y;
    private final class01905<T> u;

    public class00202(class04348 class043482, class05946<? extends class00751<T>> class059462) {
        this.y = class059462;
        this.u = class043482.y(class059462);
    }

    private static String y(StringReader stringReader) {
        int n = stringReader.getCursor();
        while (stringReader.canRead() && class00202.N(stringReader.peek())) {
            stringReader.skip();
        }
        return stringReader.getString().substring(n, stringReader.getCursor());
    }

    public static <T> Collection<class03529<T>> N(CommandContext<class07701> commandContext, String string) {
        return (Collection)commandContext.getArgument(string, Collection.class);
    }

    public Collection<class03529<T>> parse(StringReader stringReader) throws CommandSyntaxException {
        String string = class00202.N(class00202.y(stringReader));
        List list = this.u.z().filter(class035292 -> class00202.N(string, class035292.B().N())).toList();
        if (list.isEmpty()) {
            throw N.createWithContext((ImmutableStringReader)stringReader, (Object)string, (Object)this.y.N());
        }
        return list;
    }

    public static <T> Collection<class03529<T>> N(StringReader stringReader, class01905<T> class019052) {
        String string = class00202.N(class00202.y(stringReader));
        return class019052.z().filter(class035292 -> class00202.N(string, class035292.B().N())).toList();
    }

    private static boolean N(char c) {
        return class01894.N((char)c) || c == '*' || c == '?';
    }

    private static String N(String string) {
        if (!string.contains(":")) {
            return "minecraft:" + string;
        }
        return string;
    }

    public static <T> class00202<T> N(class04348 class043482, class05946<? extends class00751<T>> class059462) {
        return new class00202<T>(class043482, class059462);
    }

    private static boolean N(String string, class01894 class018942) {
        return FilenameUtils.wildcardMatch((String)class018942.toString(), (String)string);
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandContext, SuggestionsBuilder suggestionsBuilder) {
        return class07689.N(commandContext, (SuggestionsBuilder)suggestionsBuilder, this.y, (class07666)class07666.field_37263);
    }

    public Collection<String> getExamples() {
        return L;
    }
}

