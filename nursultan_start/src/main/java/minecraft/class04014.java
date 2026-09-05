/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class03982
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08036
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class03982;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08036;
import minecraft.class08164;

public class class04014 {
    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"warden_spawn_tracker").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"clear").executes(commandContext -> class04014.N((class07701)commandContext.getSource(), (Collection<? extends class08036>)ImmutableList.of((Object)((class07701)commandContext.getSource()).Z()))))).then(class07686.y((String)"set").then(class07686.N((String)"warning_level", (ArgumentType)IntegerArgumentType.integer((int)0, (int)4)).executes(commandContext -> class04014.N((class07701)commandContext.getSource(), (Collection<? extends class08036>)ImmutableList.of((Object)((class07701)commandContext.getSource()).Z()), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"warning_level"))))));
    }

    private static int N(class07701 class077012, Collection<? extends class08036> collection, int n) {
        Iterator<? extends class08036> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().method_42272().ifPresent(class039822 -> class039822.N(n));
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.warden_spawn_tracker.set.success.single", (Object[])new Object[]{((class08036)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.warden_spawn_tracker.set.success.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, Collection<? extends class08036> collection) {
        Iterator<? extends class08036> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().method_42272().ifPresent(class03982::y);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.warden_spawn_tracker.clear.success.single", (Object[])new Object[]{((class08036)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.warden_spawn_tracker.clear.success.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }
}

