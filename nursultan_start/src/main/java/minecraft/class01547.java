/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  minecraft.class00629
 *  minecraft.class05946
 *  minecraft.class07686
 *  minecraft.class07690
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import minecraft.class00629;
import minecraft.class05946;
import minecraft.class07686;
import minecraft.class07690;
import minecraft.class07701;

public class class01547 {
    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)class07686.y((String)"me").then(class07686.N((String)"action", (ArgumentType)class07690.N()).executes(commandContext -> {
            class07690.N((CommandContext)commandContext, (String)"action", class039262 -> {
                class07701 class077012 = (class07701)commandContext.getSource();
                class077012.W().Nm().N(class039262, class077012, class00629.N((class05946)class00629.U, (class07701)class077012));
            });
            return 1;
        })));
    }
}

