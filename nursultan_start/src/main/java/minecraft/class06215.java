/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  minecraft.class00392
 *  minecraft.class03729
 *  minecraft.class04227
 *  minecraft.class04403
 *  minecraft.class04770
 *  minecraft.class05946
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class03729;
import minecraft.class04227;
import minecraft.class04403;
import minecraft.class04770;
import minecraft.class05946;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06215 {
    private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.recipe.give.failed"));
    private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.recipe.take.failed"));

    private static int y(class07701 class077012, Collection<class04770> collection, Collection<class03729<?>> collection2) throws CommandSyntaxException {
        int n = 0;
        for (class04770 class047702 : collection) {
            n += class047702.method_7333(collection2);
        }
        if (n == 0) {
            throw y.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.recipe.take.success.single", (Object[])new Object[]{collection2.size(), ((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.recipe.take.success.multiple", (Object[])new Object[]{collection2.size(), collection.size()}), true);
        }
        return n;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"recipe").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"give").then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).then(class07686.N((String)"recipe", (ArgumentType)class04403.N((class05946)class04227.yV)).executes(commandContext -> class06215.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), Collections.singleton(class04403.u((CommandContext)commandContext, (String)"recipe")))))).then(class07686.y((String)"*").executes(commandContext -> class06215.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), ((class07701)commandContext.getSource()).W().yM().u())))))).then(class07686.y((String)"take").then(((RequiredArgumentBuilder)class07686.N((String)"targets", (ArgumentType)class07680.u()).then(class07686.N((String)"recipe", (ArgumentType)class04403.N((class05946)class04227.yV)).executes(commandContext -> class06215.y((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), Collections.singleton(class04403.u((CommandContext)commandContext, (String)"recipe")))))).then(class07686.y((String)"*").executes(commandContext -> class06215.y((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), ((class07701)commandContext.getSource()).W().yM().u()))))));
    }

    private static int N(class07701 class077012, Collection<class04770> collection, Collection<class03729<?>> collection2) throws CommandSyntaxException {
        int n = 0;
        for (class04770 class047702 : collection) {
            n += class047702.method_7254(collection2);
        }
        if (n == 0) {
            throw N.create();
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.recipe.give.success.single", (Object[])new Object[]{collection2.size(), ((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.recipe.give.success.multiple", (Object[])new Object[]{collection2.size(), collection.size()}), true);
        }
        return n;
    }
}

