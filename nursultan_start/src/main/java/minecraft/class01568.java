/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09475
 *  Nursultan.class09477
 *  Nursultan.class09478
 *  Nursultan.class09479
 *  com.mojang.brigadier.Command
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class01711
 *  minecraft.class01724
 *  minecraft.class01744
 *  minecraft.class01747
 *  minecraft.class01878
 *  minecraft.class01894
 *  minecraft.class03102
 *  minecraft.class03126
 *  minecraft.class03144
 *  minecraft.class03800
 *  minecraft.class05598
 *  minecraft.class05616
 *  minecraft.class05622
 *  minecraft.class06808
 *  minecraft.class06984
 *  minecraft.class07001
 *  minecraft.class07667
 *  minecraft.class07684
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07709
 *  minecraft.class07759
 *  minecraft.class07793
 *  minecraft.class08152
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09475;
import Nursultan.class09477;
import Nursultan.class09478;
import Nursultan.class09479;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01562;
import minecraft.class01569;
import minecraft.class01570;
import minecraft.class01711;
import minecraft.class01724;
import minecraft.class01744;
import minecraft.class01747;
import minecraft.class01878;
import minecraft.class01894;
import minecraft.class03102;
import minecraft.class03126;
import minecraft.class03144;
import minecraft.class03800;
import minecraft.class05598;
import minecraft.class05616;
import minecraft.class05622;
import minecraft.class06808;
import minecraft.class06984;
import minecraft.class07001;
import minecraft.class07667;
import minecraft.class07684;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07709;
import minecraft.class07759;
import minecraft.class07793;
import minecraft.class08152;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class01568 {
    private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.function.error.argument_not_compound", (Object[])new Object[]{object}));
    static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.function.scheduled.no_functions", (Object[])new Object[]{object}));
    public static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"commands.function.instantiationFailure", (Object[])new Object[]{object, object2}));
    public static final SuggestionProvider<class07701> L = (commandContext, suggestionsBuilder) -> {
        class03800 class038002 = ((class07701)commandContext.getSource()).W().Nr();
        class07689.N((Iterable)class038002.i(), (SuggestionsBuilder)suggestionsBuilder, (String)"#");
        return class07689.N((Iterable)class038002.u(), (SuggestionsBuilder)suggestionsBuilder);
    };
    static final class01562<class07701> u = new class01570();

    private static <T extends class01711<T>> void y(Collection<class07684<T>> collection, @Nullable class07001 class070012, T t, T t2, class01744<T> class017442, class01562<T> class015622) throws CommandSyntaxException {
        CommandDispatcher commandDispatcher = t.l();
        class01711 class017112 = t2.w();
        class03102 class031022 = t.T();
        if (collection.isEmpty()) {
            return;
        }
        if (collection.size() == 1) {
            class07684<T> class076842 = collection.iterator().next();
            class01894 class018942 = class076842.N();
            class03102 class031023 = class01568.N(t, class015622, class018942, class031022);
            class01568.N(class070012, class017442, commandDispatcher, class017112, class076842, class018942, class031023, false);
        } else if (class031022 == class03102.N) {
            for (class07684<T> class076843 : collection) {
                class01894 class018943 = class076843.N();
                class03102 class031024 = class01568.N(t, class015622, class018943, class031022);
                class01568.N(class070012, class017442, commandDispatcher, class017112, class076843, class018943, class031024, false);
            }
        } else {
            class01569 class015692 = new class01569();
            class03102 class031025 = (bl, n) -> class015692.N(n);
            for (class07684<T> class076844 : collection) {
                class01894 class018944 = class076844.N();
                class03102 class031026 = class01568.N(t, class015622, class018944, class031025);
                class01568.N(class070012, class017442, commandDispatcher, class017112, class076844, class018944, class031026, false);
            }
            class017442.N((class017522, class030992) -> {
                if (class015692.N) {
                    class031022.N(class015692.y);
                }
            });
        }
    }

    private static <T extends class01711<T>> void N(@Nullable class07001 class070012, class01744<T> class017442, CommandDispatcher<T> commandDispatcher, T t, class07684<T> class076842, class01894 class018942, class03102 class031022, boolean bl) throws CommandSyntaxException {
        try {
            class01747 class017472 = class076842.N(class070012, commandDispatcher);
            class017442.N(new class01724(class017472, class031022, bl).N(t));
        }
        catch (class01878 class018782) {
            throw y.create((Object)class018942, (Object)class018782.N());
        }
    }

    public static <T extends class01711<T>> void N(Collection<class07684<T>> collection, @Nullable class07001 class070012, T t, T t2, class01744<T> class017442, class01562<T> class015622, class03126 class031262) throws CommandSyntaxException {
        if (class031262.L()) {
            class01568.N(collection, class070012, t, t2, class017442, class015622);
        } else {
            class01568.y(collection, class070012, t, t2, class017442, class015622);
        }
    }

    public static class07701 N(class07701 class077012) {
        return class077012.y().y((class08152)class06984.L);
    }

    public static class07001 N(class07793 class077932, class05598 class055982) throws CommandSyntaxException {
        class07709 class077092 = class05616.N((class07793)class077932, (class05598)class055982);
        if (class077092 instanceof class07001) {
            return (class07001)class077092;
        }
        throw i.create((Object)class077092.u().N());
    }

    private static <T extends class01711<T>> class03102 N(T t, class01562<T> class015622, class01894 class018942, class03102 class031022) {
        if (t.d()) {
            return class031022;
        }
        return (bl, n) -> {
            class015622.N(t, class018942, n);
            class031022.onResult(bl, n);
        };
    }

    private static <T extends class01711<T>> void N(Collection<class07684<T>> collection, @Nullable class07001 class070012, T t, T t2, class01744<T> class017442, class01562<T> class015622) throws CommandSyntaxException {
        CommandDispatcher commandDispatcher = t.l();
        class01711 class017112 = t2.w();
        class03102 class031022 = class03102.N((class03102)t.T(), (class03102)class017442.y().u());
        for (class07684<T> class076842 : collection) {
            class01894 class018942 = class076842.N();
            class03102 class031023 = class01568.N(t, class015622, class018942, class031022);
            class01568.N(class070012, class017442, commandDispatcher, class017112, class076842, class018942, class031023, true);
        }
        class017442.N(class03144.N());
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        LiteralArgumentBuilder var1 = class07686.y((String)"with");
        for (class05622 class056222 : class05616.L) {
            class056222.N((ArgumentBuilder)var1, (T argumentBuilder) -> argumentBuilder.executes((Command)new class09479(class056222)).then(class07686.N((String)"path", (ArgumentType)class07759.N()).executes((Command)new class09477(class056222))));
        }
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"function").requires((Predicate)class07686.N((class08164)class07686.u))).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"name", (ArgumentType)class06808.N()).suggests(L).executes((Command)new class09478())).then(class07686.N((String)"arguments", (ArgumentType)class07667.N()).executes((Command)new class09475()))).then((ArgumentBuilder)var1)));
    }
}

