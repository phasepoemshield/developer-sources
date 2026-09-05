/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00392
 *  minecraft.class00754
 *  minecraft.class01568
 *  minecraft.class01859
 *  minecraft.class01894
 *  minecraft.class06779
 *  minecraft.class06808
 *  minecraft.class06809
 *  minecraft.class07220
 *  minecraft.class07684
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07798
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00754;
import minecraft.class01568;
import minecraft.class01859;
import minecraft.class01894;
import minecraft.class06779;
import minecraft.class06808;
import minecraft.class06809;
import minecraft.class07220;
import minecraft.class07684;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07798;
import minecraft.class08164;

public class class06217 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.schedule.same_tick"));
    private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.schedule.cleared.failure", (Object[])new Object[]{object}));
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.y((String)"commands.schedule.macro", (Object[])new Object[0]));
    private static final SuggestionProvider<class07701> u = (commandContext, suggestionsBuilder) -> class07689.y((Iterable)((class07701)commandContext.getSource()).W().yn().o().b().N(), (SuggestionsBuilder)suggestionsBuilder);

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"schedule").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"function").then(class07686.N((String)"function", (ArgumentType)class06808.N()).suggests(class01568.L).then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"time", (ArgumentType)class07798.N()).executes(commandContext -> class06217.N((class07701)commandContext.getSource(), (Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>>)class06808.y((CommandContext)commandContext, (String)"function"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"), true))).then(class07686.y((String)"append").executes(commandContext -> class06217.N((class07701)commandContext.getSource(), (Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>>)class06808.y((CommandContext)commandContext, (String)"function"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"), false)))).then(class07686.y((String)"replace").executes(commandContext -> class06217.N((class07701)commandContext.getSource(), (Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>>)class06808.y((CommandContext)commandContext, (String)"function"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time"), true))))))).then(class07686.y((String)"clear").then(class07686.N((String)"function", (ArgumentType)StringArgumentType.greedyString()).suggests(u).executes(commandContext -> class06217.N((class07701)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"function"))))));
    }

    private static int N(class07701 class077012, Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> pair, int n, boolean bl) throws CommandSyntaxException {
        if (n == 0) {
            throw N.create();
        }
        long l = class077012.R().N() + (long)n;
        class01894 class018942 = (class01894)pair.getFirst();
        class00754 var7 = class077012.W().yn().o().b();
        Optional optional = ((Either)pair.getSecond()).left();
        if (optional.isPresent()) {
            if (optional.get() instanceof class01859) {
                throw L.create();
            }
            String string = class018942.toString();
            if (bl) {
                var7.N(string);
            }
            var7.N(string, l, (class07220)new class06779(class018942));
            class077012.N(() -> class00392.N((String)"commands.schedule.created.function", (Object[])new Object[]{class00392.N((class01894)class018942), n, l}), true);
        } else {
            String string = "#" + String.valueOf(class018942);
            if (bl) {
                var7.N(string);
            }
            var7.N(string, l, (class07220)new class06809(class018942));
            class077012.N(() -> class00392.N((String)"commands.schedule.created.tag", (Object[])new Object[]{class00392.N((class01894)class018942), n, l}), true);
        }
        return Math.floorMod(l, Integer.MAX_VALUE);
    }

    private static int N(class07701 class077012, String string) throws CommandSyntaxException {
        int n = class077012.W().yn().o().b().N(string);
        if (n == 0) {
            throw y.create((Object)string);
        }
        class077012.N(() -> class00392.N((String)"commands.schedule.cleared.success", (Object[])new Object[]{n, string}), true);
        return n;
    }
}

