/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  minecraft.class00392
 *  minecraft.class01060
 *  minecraft.class01062
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01060;
import minecraft.class01062;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06399 {
    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"banlist").requires((Predicate)class07686.N((class08164)class07686.i))).executes(commandContext -> {
            class01062 class010622 = ((class07701)commandContext.getSource()).W().Nm();
            return class06399.N((class07701)commandContext.getSource(), Lists.newArrayList((Iterable)Iterables.concat((Iterable)class010622.M().i(), (Iterable)class010622.B().i())));
        })).then(class07686.y((String)"ips").executes(commandContext -> class06399.N((class07701)commandContext.getSource(), ((class07701)commandContext.getSource()).W().Nm().B().i())))).then(class07686.y((String)"players").executes(commandContext -> class06399.N((class07701)commandContext.getSource(), ((class07701)commandContext.getSource()).W().Nm().M().i()))));
    }

    private static int N(class07701 class077012, Collection<? extends class01060<?>> collection) {
        if (collection.isEmpty()) {
            class077012.N(() -> class00392.L((String)"commands.banlist.none"), false);
        } else {
            class077012.N(() -> class00392.N((String)"commands.banlist.list", (Object[])new Object[]{collection.size()}), false);
            for (class01060<?> class010602 : collection) {
                class077012.N(() -> class00392.N((String)"commands.banlist.entry", (Object[])new Object[]{class010602.R(), class010602.y(), class010602.i()}), false);
            }
        }
        return collection.size();
    }
}

