/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  minecraft.class00392
 *  minecraft.class07686
 *  minecraft.class07701
 *  minecraft.class08164
 */
package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class07686;
import minecraft.class07701;
import minecraft.class08164;

public class class06188 {
    public static void N(CommandDispatcher<class07701> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y((String)"stop").requires((Predicate)class07686.N((class08164)class07686.R))).executes(commandContext -> {
            ((class07701)commandContext.getSource()).N(() -> class00392.L((String)"commands.stop.stopping"), true);
            ((class07701)commandContext.getSource()).W().y(false);
            return 1;
        }));
    }
}

