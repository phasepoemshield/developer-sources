/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class02198
 *  minecraft.class03556
 *  minecraft.class04348
 *  minecraft.class04770
 *  minecraft.class07680
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 *  minecraft.class09037
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class02198;
import minecraft.class03556;
import minecraft.class04348;
import minecraft.class04770;
import minecraft.class07680;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;
import minecraft.class09014;
import minecraft.class09037;

public class class09012 {
    public static void N(CommandDispatcher<class07701> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"dialog").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.y((String)"show").then(class07686.N((String)"targets", (ArgumentType)class07680.u()).then(class07686.N((String)"dialog", (ArgumentType)class02198.u((class04348)class043482)).executes(commandContext -> class09012.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"), (class03556<class09037>)class02198.u((CommandContext)commandContext, (String)"dialog"))))))).then(class07686.y((String)"clear").then(class07686.N((String)"targets", (ArgumentType)class07680.u()).executes(commandContext -> class09012.N((class07701)commandContext.getSource(), class07680.R((CommandContext)commandContext, (String)"targets"))))));
    }

    private static int N(class07701 class077012, Collection<class04770> collection, class03556<class09037> class035562) {
        Iterator<class04770> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().method_71753(class035562);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.dialog.show.single", (Object[])new Object[]{((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.dialog.show.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }

    private static int N(class07701 class077012, Collection<class04770> collection) {
        Iterator<class04770> iterator = collection.iterator();
        while (iterator.hasNext()) {
            iterator.next().field_13987.method_14364((class00381)class09014.N);
        }
        if (collection.size() == 1) {
            class077012.N(() -> class00392.N((String)"commands.dialog.clear.single", (Object[])new Object[]{((class04770)collection.iterator().next()).method_5476()}), true);
        } else {
            class077012.N(() -> class00392.N((String)"commands.dialog.clear.multiple", (Object[])new Object[]{collection.size()}), true);
        }
        return collection.size();
    }
}

