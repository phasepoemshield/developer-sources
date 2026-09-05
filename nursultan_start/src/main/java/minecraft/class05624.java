/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  minecraft.class00392
 *  minecraft.class00518
 *  minecraft.class01765
 *  minecraft.class01766
 *  minecraft.class01788
 *  minecraft.class04770
 *  minecraft.class06394
 *  minecraft.class06675
 *  minecraft.class06683
 *  minecraft.class07049
 *  minecraft.class07686
 *  minecraft.class07689
 *  minecraft.class07701
 *  minecraft.class07794
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
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
import minecraft.class00392;
import minecraft.class00518;
import minecraft.class01765;
import minecraft.class01766;
import minecraft.class01788;
import minecraft.class04770;
import minecraft.class06394;
import minecraft.class06675;
import minecraft.class06683;
import minecraft.class07049;
import minecraft.class07686;
import minecraft.class07689;
import minecraft.class07701;
import minecraft.class07794;

public class class05624 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.trigger.failed.unprimed"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.trigger.failed.invalid"));

    private static int y(class07701 class077012, class04770 class047702, class00518 class005182, int n) throws CommandSyntaxException {
        class05624.N((class06683)class077012.W().yB(), (class01766)class047702, class005182).N(n);
        class077012.N(() -> class00392.N((String)"commands.trigger.set.success", (Object[])new Object[]{class005182.B(), n}), true);
        return n;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)class07686.y((String)"trigger").then(((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N((String)"objective", (ArgumentType)class07794.N()).suggests((commandContext, suggestionsBuilder) -> class05624.N((class07701)commandContext.getSource(), suggestionsBuilder)).executes(commandContext -> class05624.N((class07701)commandContext.getSource(), ((class07701)commandContext.getSource()).Z(), class07794.N((CommandContext)commandContext, (String)"objective")))).then(class07686.y((String)"add").then(class07686.N((String)"value", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05624.N((class07701)commandContext.getSource(), ((class07701)commandContext.getSource()).Z(), class07794.N((CommandContext)commandContext, (String)"objective"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"value")))))).then(class07686.y((String)"set").then(class07686.N((String)"value", (ArgumentType)IntegerArgumentType.integer()).executes(commandContext -> class05624.y((class07701)commandContext.getSource(), ((class07701)commandContext.getSource()).Z(), class07794.N((CommandContext)commandContext, (String)"objective"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"value")))))));
    }

    private static int N(class07701 class077012, class04770 class047702, class00518 class005182) throws CommandSyntaxException {
        int n = class05624.N((class06683)class077012.W().yB(), (class01766)class047702, class005182).y(1);
        class077012.N(() -> class00392.N((String)"commands.trigger.simple.success", (Object[])new Object[]{class005182.B()}), true);
        return n;
    }

    private static class01765 N(class06683 class066832, class01766 class017662, class00518 class005182) throws CommandSyntaxException {
        if (class005182.u() != class06675.L) {
            throw y.create();
        }
        class01788 class017882 = class066832.y(class017662, class005182);
        if (class017882 == null || class017882.L()) {
            throw N.create();
        }
        class01765 class017652 = class066832.N(class017662, class005182);
        class017652.i();
        return class017652;
    }

    public static CompletableFuture<Suggestions> N(class07701 class077012, SuggestionsBuilder suggestionsBuilder) {
        class07049 class070492 = class077012.M();
        ArrayList arrayList = Lists.newArrayList();
        if (class070492 != null) {
            class06394 class063942 = class077012.W().yB();
            for (class00518 class005182 : class063942.N()) {
                class01788 class017882;
                if (class005182.u() != class06675.L || (class017882 = class063942.y((class01766)class070492, class005182)) == null || class017882.L()) continue;
                arrayList.add(class005182.L());
            }
        }
        return class07689.y((Iterable)arrayList, (SuggestionsBuilder)suggestionsBuilder);
    }

    private static int N(class07701 class077012, class04770 class047702, class00518 class005182, int n) throws CommandSyntaxException {
        int n2 = class05624.N((class06683)class077012.W().yB(), (class01766)class047702, class005182).y(n);
        class077012.N(() -> class00392.N((String)"commands.trigger.add.success", (Object[])new Object[]{class005182.B(), n}), true);
        return n2;
    }
}

