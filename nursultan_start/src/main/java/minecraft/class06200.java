/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01623
 *  minecraft.class02796
 *  minecraft.class05081
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class01623;
import minecraft.class02796;
import minecraft.class05081;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import org.slf4j.Logger;

public class class06200 {
    private static final Logger N = LogUtils.getLogger();

    public static void N(Collection<String> collection, class07701 class077012) {
        class077012.W().N(collection).exceptionally(throwable -> {
            N.warn("Failed to execute reload", throwable);
            class077012.y((class00392)class00392.L((String)"commands.reload.failure"));
            return null;
        });
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"reload").requires((Predicate)class07686.N((class08164)class07686.u))).executes(commandContext -> {
            class07701 class077012 = (class07701)commandContext.getSource();
            class02796 class027962 = class077012.W();
            class01623 class016232 = class027962.yy();
            class05081 class050812 = class027962.yn();
            Collection var5 = class016232.i();
            Collection<String> var6 = class06200.N(class016232, class050812, var5);
            class077012.N(() -> class00392.L((String)"commands.reload.success"), true);
            class06200.N(var6, class077012);
            return 0;
        }));
    }

    private static Collection<String> N(class01623 class016232, class05081 class050812, Collection<String> collection) {
        class016232.N();
        ArrayList arrayList = Lists.newArrayList(collection);
        List var4 = class050812.Q().N().y();
        for (String string : class016232.L()) {
            if (var4.contains(string) || arrayList.contains(string)) continue;
            arrayList.add(string);
        }
        return arrayList;
    }
}

