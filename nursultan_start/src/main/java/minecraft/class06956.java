/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.brigadier.suggestion.SuggestionProvider
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07778
 *  minecraft.class08164
 *  minecraft.class08170
 *  minecraft.class08192
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07778;
import minecraft.class08164;
import minecraft.class08170;
import minecraft.class08192;

public class class06956 {
    private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.stopwatch.already_exists", (Object[])new Object[]{object}));
    public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"commands.stopwatch.does_not_exist", (Object[])new Object[]{object}));
    public static final SuggestionProvider<class07701> y = (commandContext, suggestionsBuilder) -> class07689.N((Iterable)((class07701)commandContext.getSource()).W().yz().N(), (SuggestionsBuilder)suggestionsBuilder);

    private static int L(class07701 class077012, class01894 class018942) throws CommandSyntaxException {
        if (!class077012.W().yz().y(class018942)) {
            throw N.create((Object)class018942);
        }
        class077012.N(() -> class00392.N((String)"commands.stopwatch.remove.success", (Object[])new Object[]{class00392.N((class01894)class018942)}), true);
        return 1;
    }

    private static int y(class07701 class077012, class01894 class018942) throws CommandSyntaxException {
        if (!class077012.W().yz().N(class018942, class081922 -> new class08192(class08170.y()))) {
            throw N.create((Object)class018942);
        }
        class077012.N(() -> class00392.N((String)"commands.stopwatch.restart.success", (Object[])new Object[]{class00392.N((class01894)class018942)}), true);
        return 1;
    }

    private static int N(class07701 class077012, class01894 class018942) throws CommandSyntaxException {
        class08192 class081922;
        class08170 class081702 = class077012.W().yz();
        if (!class081702.N(class018942, class081922 = new class08192(class08170.y()))) {
            throw L.create((Object)class018942);
        }
        class077012.N(() -> class00392.N((String)"commands.stopwatch.create.success", (Object[])new Object[]{class00392.N((class01894)class018942)}), true);
        return 1;
    }

    private static int N(class07701 class077012, class01894 class018942, double d) throws CommandSyntaxException {
        class08192 class081922 = class077012.W().yz().N(class018942);
        if (class081922 == null) {
            throw N.create((Object)class018942);
        }
        long l = class08170.y();
        double d2 = class081922.y(l);
        class077012.N(() -> class00392.N((String)"commands.stopwatch.query", (Object[])new Object[]{class00392.N((class01894)class018942), d2}), true);
        return (int)(d2 * d);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"stopwatch").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"create").then(class07686.N((String)"id", (ArgumentType)class07778.N()).executes(commandContext -> class06956.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id")))))).then(class07686.y((String)"query").then(((RequiredArgumentBuilder)class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(y).then(class07686.N((String)"scale", (ArgumentType)DoubleArgumentType.doubleArg()).executes(commandContext -> class06956.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id"), DoubleArgumentType.getDouble((CommandContext)commandContext, (String)"scale"))))).executes(commandContext -> class06956.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id"), 1.0))))).then(class07686.y((String)"restart").then(class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(y).executes(commandContext -> class06956.y((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id")))))).then(class07686.y((String)"remove").then(class07686.N((String)"id", (ArgumentType)class07778.N()).suggests(y).executes(commandContext -> class06956.L((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"id"))))));
    }
}

