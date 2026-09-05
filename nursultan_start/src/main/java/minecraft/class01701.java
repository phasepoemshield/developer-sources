/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00803
 *  minecraft.class00894
 *  minecraft.class04782
 *  minecraft.class07209
 *  minecraft.class07428
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
import minecraft.class00803;
import minecraft.class00894;
import minecraft.class04782;
import minecraft.class07209;
import minecraft.class07428;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class01701 {
    private static int N(class07701 class077012, class07428 class074282, class07209 class072092) {
        class00803.N((class07428)class074282, (class04782)class077012.R(), (class07209)class072092);
        return 1;
    }

    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)class07686.y((String)"debugmobspawning").requires((Predicate)class07686.N((class08164)class07686.u));
        for (class07428 class074282 : class07428.values()) {
            var1.then(class07686.y((String)class074282.N()).then(class07686.N((String)"at", (ArgumentType)class00894.N()).executes(commandContext -> class01701.N((class07701)commandContext.getSource(), class074282, class00894.N((CommandContext)commandContext, (String)"at")))));
        }
        commandDispatcher.register(var1);
    }
}

