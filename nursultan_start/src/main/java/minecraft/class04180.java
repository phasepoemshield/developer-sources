/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00836
 *  minecraft.class01894
 *  minecraft.class03470
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07767
 *  minecraft.class07778
 *  minecraft.class07788
 *  minecraft.class08164
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00836;
import minecraft.class01894;
import minecraft.class03470;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07767;
import minecraft.class07778;
import minecraft.class07788;
import minecraft.class08164;
import org.jspecify.annotations.Nullable;

public class class04180 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.random.error.range_too_large"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.random.error.range_too_small"));

    private static int N(class07701 class077012, class00836 class008362, @Nullable class01894 class018942, boolean bl) throws CommandSyntaxException {
        class06069 class060692 = class018942 != null ? class077012.R().method_51836(class018942) : class077012.R().method_8409();
        int n = class008362.y().orElse(Integer.MIN_VALUE);
        int n2 = class008362.L().orElse(Integer.MAX_VALUE);
        long l = (long)n2 - (long)n;
        if (l == 0L) {
            throw y.create();
        }
        if (l >= Integer.MAX_VALUE) {
            throw N.create();
        }
        int n3 = class04995.y((class06069)class060692, (int)n, (int)n2);
        if (bl) {
            class077012.W().Nm().N((class00392)class00392.N((String)"commands.random.roll", (Object[])new Object[]{class077012.L(), n3, n, n2}), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.random.sample.success", (Object[])new Object[]{n3}), false);
        }
        return n3;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"random").then(class04180.N("value", false))).then(class04180.N("roll", true))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"reset").requires((Predicate)class07686.N((class08164)class07686.u))).then(((LiteralArgumentBuilder)class07686.y((String)"*").executes(commandContext -> class04180.N((class07701)commandContext.getSource()))).then(((RequiredArgumentBuilder)class07686.N((String)"seed", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seed"), true, true))).then(((RequiredArgumentBuilder)class07686.N((String)"includeWorldSeed", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seed"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"includeWorldSeed"), true))).then(class07686.N((String)"includeSequenceId", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seed"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"includeWorldSeed"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"includeSequenceId")))))))).then(((RequiredArgumentBuilder)class07686.N((String)"sequence", (ArgumentType)class07778.N()).suggests(class04180::N).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"sequence")))).then(((RequiredArgumentBuilder)class07686.N((String)"seed", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"sequence"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seed"), true, true))).then(((RequiredArgumentBuilder)class07686.N((String)"includeWorldSeed", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"sequence"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seed"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"includeWorldSeed"), true))).then(class07686.N((String)"includeSequenceId", (ArgumentType)BoolArgumentType.bool()).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), class07778.N((CommandContext)commandContext, (String)"sequence"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"seed"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"includeWorldSeed"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"includeSequenceId")))))))));
    }

    private static LiteralArgumentBuilder<class07701> N(String string, boolean bl) {
        return (LiteralArgumentBuilder)class07686.y((String)string).then(((RequiredArgumentBuilder)class07686.N((String)"range", (ArgumentType)class07788.N()).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), class07767.N((CommandContext)commandContext, (String)"range"), null, bl))).then(((RequiredArgumentBuilder)class07686.N((String)"sequence", (ArgumentType)class07778.N()).suggests(class04180::N).requires((Predicate)class07686.N((class08164)class07686.u))).executes(commandContext -> class04180.N((class07701)commandContext.getSource(), class07767.N((CommandContext)commandContext, (String)"range"), class07778.N((CommandContext)commandContext, (String)"sequence"), bl))));
    }

    private static int N(class07701 class077012, int n, boolean bl, boolean bl2) {
        class03470 class034702 = class077012.R().method_52168();
        class034702.N(n, bl, bl2);
        int n2 = class034702.N();
        class077012.N(() -> class00392.N((String)"commands.random.reset.all.success", (Object[])new Object[]{n2}), false);
        return n2;
    }

    private static int N(class07701 class077012) {
        int n = class077012.R().method_52168().N();
        class077012.N(() -> class00392.N((String)"commands.random.reset.all.success", (Object[])new Object[]{n}), false);
        return n;
    }

    private static int N(class07701 class077012, class01894 class018942, int n, boolean bl, boolean bl2) throws CommandSyntaxException {
        class04782 class047822 = class077012.R();
        class047822.method_52168().N(class018942, class047822.method_8412(), n, bl, bl2);
        class077012.N(() -> class00392.N((String)"commands.random.reset.success", (Object[])new Object[]{class00392.N((class01894)class018942)}), false);
        return 1;
    }

    private static int N(class07701 class077012, class01894 class018942) throws CommandSyntaxException {
        class04782 class047822 = class077012.R();
        class047822.method_52168().y(class018942, class047822.method_8412());
        class077012.N(() -> class00392.N((String)"commands.random.reset.success", (Object[])new Object[]{class00392.N((class01894)class018942)}), false);
        return 1;
    }

    private static CompletableFuture<Suggestions> N(CommandContext<class07701> commandContext, SuggestionsBuilder suggestionsBuilder) {
        ArrayList arrayList = Lists.newArrayList();
        ((class07701)commandContext.getSource()).R().method_52168().N((T class018942, U class035122) -> arrayList.add(class018942.toString()));
        return class07689.y((Iterable)arrayList, (SuggestionsBuilder)suggestionsBuilder);
    }
}

