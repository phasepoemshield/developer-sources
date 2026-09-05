/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00392
 *  minecraft.class02796
 *  minecraft.class04131
 *  minecraft.class07282
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class02796;
import minecraft.class04131;
import minecraft.class07282;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06406 {
    private static int N(class07701 class077012, class07282 class072822) {
        class02796 class027962 = class077012.W();
        class027962.N(class072822);
        int n = class027962.L(class027962.v());
        class077012.N(() -> class00392.N((String)"commands.defaultgamemode.success", (Object[])new Object[]{class072822.L()}), true);
        return n;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"defaultgamemode").requires((Predicate)class07686.N((class08164)class07686.u))).then(class07686.N((String)"gamemode", (ArgumentType)class04131.N()).executes(commandContext -> class06406.N((class07701)commandContext.getSource(), class04131.N((CommandContext)commandContext, (String)"gamemode")))));
    }
}

