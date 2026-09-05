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
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06211 {
    private static int N(class07701 class077012, int n) {
        class077012.W().R(n);
        if (n > 0) {
            class077012.N(() -> class00392.N((String)"commands.setidletimeout.success", (Object[])new Object[]{n}), true);
        } else {
            class077012.N(() -> class00392.L((String)"commands.setidletimeout.success.disabled"), true);
        }
        return n;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"setidletimeout").requires((Predicate)class07686.N((class08164)class07686.i))).then(class07686.N((String)"minutes", (ArgumentType)IntegerArgumentType.integer((int)0)).executes(commandContext -> class06211.N((class07701)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"minutes")))));
    }
}

