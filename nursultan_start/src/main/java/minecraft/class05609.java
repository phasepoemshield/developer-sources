/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class04782
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class07798
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Iterator;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class04782;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class07798;
import minecraft.class08164;

public class class05609 {
    private static int L(class07701 class077012, int n) {
        class077012.N(() -> class00392.N((String)"commands.time.query", (Object[])new Object[]{n}), false);
        return n;
    }

    public static int y(class07701 class077012, int n) {
        for (class04782 class047822 : class077012.W().NO()) {
            class047822.method_29199(class047822.method_8532() + (long)n);
        }
        class077012.W().Nw();
        int n2 = class05609.N(class077012.R());
        class077012.N(() -> class00392.N((String)"commands.time.set", (Object[])new Object[]{n2}), true);
        return n2;
    }

    private static int N(class04782 class047822) {
        return (int)(class047822.method_8532() % 24000L);
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"time").requires((Predicate)class07686.N((class08164)class07686.u))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"set").then(class07686.y((String)"day").executes(commandContext -> class05609.N((class07701)commandContext.getSource(), 1000)))).then(class07686.y((String)"noon").executes(commandContext -> class05609.N((class07701)commandContext.getSource(), 6000)))).then(class07686.y((String)"night").executes(commandContext -> class05609.N((class07701)commandContext.getSource(), 13000)))).then(class07686.y((String)"midnight").executes(commandContext -> class05609.N((class07701)commandContext.getSource(), 18000)))).then(class07686.N((String)"time", (ArgumentType)class07798.N()).executes(commandContext -> class05609.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time")))))).then(class07686.y((String)"add").then(class07686.N((String)"time", (ArgumentType)class07798.N()).executes(commandContext -> class05609.y((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"time")))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"query").then(class07686.y((String)"daytime").executes(commandContext -> class05609.L((class07701)commandContext.getSource(), class05609.N(((class07701)commandContext.getSource()).R()))))).then(class07686.y((String)"gametime").executes(commandContext -> class05609.L((class07701)commandContext.getSource(), (int)(((class07701)commandContext.getSource()).R().N() % Integer.MAX_VALUE))))).then(class07686.y((String)"day").executes(commandContext -> class05609.L((class07701)commandContext.getSource(), (int)(((class07701)commandContext.getSource()).R().method_75003() % Integer.MAX_VALUE))))));
    }

    public static int N(class07701 class077012, int n) {
        Iterator var2 = class077012.W().NO().iterator();
        while (var2.hasNext()) {
            ((class04782)var2.next()).method_29199((long)n);
        }
        class077012.W().Nw();
        class077012.N(() -> class00392.N((String)"commands.time.set", (Object[])new Object[]{n}), true);
        return class05609.N(class077012.R());
    }
}

