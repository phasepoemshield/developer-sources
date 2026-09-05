/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00392
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02509
 *  minecraft.class02678
 *  minecraft.class02695
 *  minecraft.class02713
 *  minecraft.class03519
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07709
 *  minecraft.class07713
 *  minecraft.class07755
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DynamicOps;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02509;
import minecraft.class02678;
import minecraft.class02695;
import minecraft.class02713;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06773;
import minecraft.class06777;
import minecraft.class06780;
import minecraft.class06796;
import minecraft.class06802;
import minecraft.class07709;
import minecraft.class07713;
import minecraft.class07755;
import org.apache.commons.lang3.mutable.MutableObject;

public class class06762 {
    static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.item.id.invalid", (Object[])new Object[]{object}));
    static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.item.component.unknown", (Object[])new Object[]{object}));
    static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"arguments.item.component.malformed", (Object[])new Object[]{object, object2}));
    static final SimpleCommandExceptionType u = new SimpleCommandExceptionType((Message)class00392.L((String)"arguments.item.component.expected"));
    static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.item.component.repeated", (Object[])new Object[]{object}));
    private static final DynamicCommandExceptionType P = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.item.malformed", (Object[])new Object[]{object}));
    public static final char R = '[';
    public static final char M = ']';
    public static final char B = ',';
    public static final char Z = '=';
    public static final char z = '!';
    static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> U = SuggestionsBuilder::buildFuture;
    final class01921<class06581> E;
    final class03519<class07709> W;
    final class07755<class07709> m;

    public class06762(class01929 class019292) {
        this.E = class019292.y(class04227.F);
        this.W = class019292.N((DynamicOps)class07713.N);
        this.m = class07755.N(this.W);
    }

    public class06796 N(StringReader stringReader) throws CommandSyntaxException {
        MutableObject mutableObject = new MutableObject();
        class02713 class027132 = class02678.N();
        this.N(stringReader, new class06780(this, mutableObject, class027132));
        class03556 class035562 = Objects.requireNonNull((class03556)mutableObject.get(), "Parser gave no item");
        class02678 class026782 = class027132.N();
        class06762.N(stringReader, (class03556<class06581>)class035562, class026782);
        return new class06796((class03556<class06581>)class035562, class026782);
    }

    public CompletableFuture<Suggestions> N(SuggestionsBuilder suggestionsBuilder) {
        StringReader stringReader = new StringReader(suggestionsBuilder.getInput());
        stringReader.setCursor(suggestionsBuilder.getStart());
        class06802 class068022 = new class06802();
        class06773 class067732 = new class06773(this, stringReader, class068022);
        try {
            class067732.N();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
        return class068022.N(suggestionsBuilder, stringReader);
    }

    private static void N(StringReader stringReader, class03556<class06581> class035562, class02678 class026782) throws CommandSyntaxException {
        class06584.N((class02695)class02509.N((class02695)((class06581)class035562.N()).R(), (class02678)class026782)).getOrThrow(string -> P.createWithContext((ImmutableStringReader)stringReader, string));
    }

    public void N(StringReader stringReader, class06777 class067772) throws CommandSyntaxException {
        int n = stringReader.getCursor();
        try {
            new class06773(this, stringReader, class067772).N();
        }
        catch (CommandSyntaxException commandSyntaxException) {
            stringReader.setCursor(n);
            throw commandSyntaxException;
        }
    }
}

