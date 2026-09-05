/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class07049
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class07049;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class01563 {
    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"kill").requires((Predicate)class07686.N((class08164)class07686.u))).executes(commandContext -> class01563.N((class07701)commandContext.getSource(), (Collection<? extends class07049>)ImmutableList.of((Object)((class07701)commandContext.getSource()).B())))).then(class07686.N((String)"targets", (ArgumentType)class07680.y()).executes(commandContext -> class01563.N((class07701)commandContext.getSource(), class07680.y((CommandContext)commandContext, (String)"targets")))));
    }

    private static int N(class07701 class077012, Collection<? extends class07049> collection) {
        Iterator<? extends class07049> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().method_5768(class077012.R());
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.kill.success.single", (Object[])new Object[]{((class07049)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.kill.success.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }
}

